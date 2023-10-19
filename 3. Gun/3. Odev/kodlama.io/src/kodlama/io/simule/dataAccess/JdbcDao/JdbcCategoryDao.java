package kodlama.io.simule.dataAccess.JdbcDao;

import kodlama.io.simule.dataAccess.Dao.CategoryDao;
import kodlama.io.simule.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
