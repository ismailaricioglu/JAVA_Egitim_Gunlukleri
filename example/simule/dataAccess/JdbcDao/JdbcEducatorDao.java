package kodlama.io.simule.dataAccess.JdbcDao;

import kodlama.io.simule.dataAccess.Dao.EducatorDao;
import kodlama.io.simule.entities.Educator;

public class JdbcEducatorDao implements EducatorDao {
	public void add(Educator Educator) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}
