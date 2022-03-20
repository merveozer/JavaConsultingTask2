package com.StokTakip.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.StokTakip.Model.Item;
import com.StokTakip.Repository.ItemDataRepository;

@Service
public class ItemServiceImpl implements ItemService {

	
	private ItemDataRepository itemDataRepository;
	
	@Autowired
	public ItemServiceImpl(ItemDataRepository itemDataRepository) {
		this.itemDataRepository = itemDataRepository;
	}

	@Override
	@Transactional
	public void createItem(Item item) {
		this.itemDataRepository.createItem(item);
		
	}

	@Override
	@Transactional
	public Item getItemById(int id) {
	
		return this.itemDataRepository.getItemById(id);
	}

	@Override
	@Transactional
	public void updateItem(Item item) {
	
		this.itemDataRepository.updateItem(item);
	}

	@Override
	@Transactional
	public void deleteItem(int id) {
		this.itemDataRepository.deleteItem(id);		
	}
	
	@Override	
	@Transactional
	public List<Item> getAllItems() {
		
		return this.itemDataRepository.getAllItems();
	}

	@Override
	@Transactional
	public long getItemCount() {
		
		return itemDataRepository.getItemCount();
	}

}

