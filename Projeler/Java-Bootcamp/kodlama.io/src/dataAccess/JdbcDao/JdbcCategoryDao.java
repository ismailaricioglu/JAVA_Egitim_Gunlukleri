package dataAccess.JdbcDao;

import dataAccess.Dao.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
