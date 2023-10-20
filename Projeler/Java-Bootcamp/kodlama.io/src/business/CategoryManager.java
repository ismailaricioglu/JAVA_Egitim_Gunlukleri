package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.Dao.CategoryDao;
import entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public List<Category> getAll() throws Exception {
		List<Category> category = new ArrayList<>();
		category.add(new Category(1, "Tümü"));
		category.add(new Category(2, "Programlama"));
		return category;
	}

	public void add(Category category) throws Exception {

		List<Category> categories = getAll();
		for (Category ctgry : categories) {
			if (ctgry.getName() == category.getName())
				throw new Exception(category.getName() + " için Kategori ismi tekrar edemez");
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
