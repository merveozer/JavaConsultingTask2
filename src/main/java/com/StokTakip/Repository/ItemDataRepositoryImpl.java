package com.StokTakip.Repository;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.StokTakip.Model.Item;

@Repository
public class ItemDataRepositoryImpl implements ItemDataRepository{

	private EntityManager entityManager;
	
	@Autowired
	public ItemDataRepositoryImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void createItem(Item item) {
		Session session = entityManager.unwrap(Session.class);
		session.save(item);		
	}

	@Override
	public Item getItemById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Item item = session.get(Item.class, id);
		return item;
	}

	@Override
	public void updateItem(Item item) {
		Session session = entityManager.unwrap(Session.class);
		session.update(item);
		
	}

	@Override
	public void deleteItem(int id) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(id);		
	}

	@Override
	@Transactional
	public List<Item> getAllItems() {
		Session session = entityManager.unwrap(Session.class);
		List<Item> items = session.createQuery("from Item", Item.class).getResultList();
	    return items;
	}

	@Override
	public long getItemCount() {
		long number = this.getItemCount();
		return number;
	}



}
