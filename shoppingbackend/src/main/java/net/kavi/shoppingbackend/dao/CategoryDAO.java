package net.kavi.shoppingbackend.dao;

import java.util.List;

import net.kavi.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);
}
