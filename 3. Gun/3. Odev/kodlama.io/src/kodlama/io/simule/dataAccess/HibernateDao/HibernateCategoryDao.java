package kodlama.io.simule.dataAccess.HibernateDao;

import kodlama.io.simule.dataAccess.Dao.CategoryDao;
import kodlama.io.simule.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}
}
