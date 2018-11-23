package com.niit.dao;
import java.util.List;

import com.niit.model.Category;

public interface CategoryDao
{
	public boolean add(Category category);
	public boolean delete(Category category);
	public boolean update(Category category);
	public List<Category> listCategories();
	public Category getCategory(int categoryId);
}