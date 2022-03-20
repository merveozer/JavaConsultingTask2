package com.StokTakip.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.StokTakip.Model.Item;
import com.StokTakip.Service.ItemService;

@RestController
@RequestMapping("products")
public class ProductController {

	private ItemService itemService;

	@Autowired
	public ProductController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@GetMapping("item")
	public List<Item> get(){
		return itemService.getAllItems();
	}
	
	@PostMapping("create")
	public void createItem(@RequestBody Item item) {
		itemService.createItem(item);
	}
	
	@PostMapping("update")
	public void updateItem(@RequestBody Item item) {
		itemService.updateItem(item);
	}
	
	@DeleteMapping("delete")
	public void deleteItem(@RequestBody int id) {
		itemService.deleteItem(id);
	}
	
	@GetMapping("get")
	public Item getItemById( int id) {
		return itemService. getItemById(id);	
	}
	
	@GetMapping("count")
	public long getItemCount() {
		return itemService.getItemCount();
		
	}


}
