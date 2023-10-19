package kodlama.io.simule.dataAccess.HibernateDao;

import kodlama.io.simule.dataAccess.Dao.EducatorDao;
import kodlama.io.simule.entities.Educator;

public class HibernateEducatorDao implements EducatorDao {
	public void add(Educator Educator) {
		System.out.println("Hibernate ile veri tabanına eklendi");
	}
}
