package com.StokTakip.Repository;

import java.util.List;

import com.StokTakip.Model.Item;

public interface ItemDataRepository {
	
	public void createItem(Item item);
	public Item getItemById(int id);
	public void updateItem(Item item);
	public void deleteItem(int id);
	public List<Item> getAllItems();
	public long getItemCount();
	
}
