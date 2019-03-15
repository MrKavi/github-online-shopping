package net.kavi.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.kavi.shoppingbackend.dao.CategoryDAO;
import net.kavi.shoppingbackend.dto.Category;

import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{

	private static List<Category> categories=new ArrayList<>();
	
	static {
		
		Category category=new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is description for television");
		category.setImageURL("CAT_1.png");
	categories.add(category); 
	
	
	//second cotegory
	 category=new Category();
	category.setId(2);
	category.setName("mobile");
	category.setDescription("this is description for mobile");
	category.setImageURL("CAT_2.png");
categories.add(category); 
	
//second cotegory
	 category=new Category();
	category.setId(3);
	category.setName("Laptop");
	category.setDescription("this is description for Laptop");
	category.setImageURL("CAT_3.png");
categories.add(category); 
	
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {

		//enhanced for loop
		
		for(Category category : categories){

     if(category.getId()==id) return category;			
		}
	return null;
	}
 
}
