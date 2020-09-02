// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.data.database.dao;

import java.util.Collection;
import org.l2j.gameserver.data.database.data.ItemData;
import org.l2j.gameserver.data.database.data.ItemVariationData;
import org.l2j.gameserver.data.database.data.ItemOnGroundData;
import java.util.List;
import org.l2j.commons.database.annotation.Query;
import org.l2j.commons.database.DAO;

public interface ItemDAO extends DAO<Object>
{
    @Query("DELETE FROM items WHERE items.owner_id NOT IN (SELECT charId FROM characters) AND items.owner_id NOT IN (SELECT clan_id FROM clan_data) AND items.owner_id != -1")
    int deleteWithoutOwner();
    
    @Query("DELETE FROM items WHERE items.owner_id = -1 AND loc LIKE 'MAIL' AND loc_data NOT IN (SELECT id FROM mail WHERE sender = -1)")
    int deleteFromEmailWithoutMessage();
    
    @Query("UPDATE items SET loc='INVENTORY' WHERE owner_id=:owner:")
    void updateToInventory(final int owner);
    
    @Query("DELETE FROM items WHERE item_id= :itemId:")
    void deleteAllItemsById(final int itemId);
    
    @Query("DELETE FROM items WHERE item_id = :itemId: AND  owner_id = :owner:")
    void deleteByIdAndOwner(final int itemId, final int owner);
    
    @Query("UPDATE itemsonground SET drop_time = :dropTime: WHERE drop_time = -1")
    void updateDropTimeByNonDestroyable(final long dropTime);
    
    @Query("UPDATE itemsonground SET drop_time = :dropTime: WHERE drop_time = -1 AND equipable = 0")
    void updateNonEquipDropTimeByNonDestroyable(final long dropTime);
    
    @Query("TRUNCATE  itemsonground")
    void deleteItemsOnGround();
    
    @Query("SELECT * FROM itemsonground")
    List<ItemOnGroundData> findAllItemsOnGround();
    
    @Query("SELECT mineralId,option1,option2 FROM item_variations WHERE itemId = :itemId:")
    ItemVariationData findItemVariationByItemId(final int itemId);
    
    @Query("SELECT object_id,item_id,loc_data,enchant_level FROM items WHERE owner_id = :objectId: AND loc='PAPERDOLL'")
    List<ItemData> findAllPaperDollItemsByObjectId(final int objectId);
    
    void save(final Collection<ItemOnGroundData> datas);
    
    @Query("DELETE FROM item_variations WHERE itemId IN (SELECT object_id FROM items WHERE items.owner_id=:playerId:)")
    void deleteVariationsByOwner(final int playerId);
    
    @Query("DELETE FROM item_special_abilities WHERE objectId IN (SELECT object_id FROM items WHERE items.owner_id=:playerId:)")
    void deleteSpecialAbilitiesByOwner(final int playerId);
    
    @Query("DELETE FROM items WHERE owner_id=:playerId:")
    void deleteByOwner(final int playerId);
}
