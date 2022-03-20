package com.StokTakip.Service;

import java.util.List;

import com.StokTakip.Model.Item;

public interface ItemService {

	public void createItem(Item item);
	public Item getItemById(int id);
	public void updateItem(Item item);
	public void deleteItem(int id);
	public List<Item> getAllItems();
	public long getItemCount();

}
