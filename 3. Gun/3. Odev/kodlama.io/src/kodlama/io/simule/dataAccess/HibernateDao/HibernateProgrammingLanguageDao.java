package kodlama.io.simule.dataAccess.HibernateDao;

import kodlama.io.simule.dataAccess.Dao.ProgrammingLanguageDao;
import kodlama.io.simule.entities.ProgrammingLanguage;

public class HibernateProgrammingLanguageDao implements ProgrammingLanguageDao {

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		System.out.println("Hibernate ile veri tabanına eklendi");

	}

}
