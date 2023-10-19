package kodlama.io.simule.dataAccess.JdbcDao;

import kodlama.io.simule.dataAccess.Dao.ProgrammingLanguageDao;
import kodlama.io.simule.entities.ProgrammingLanguage;

public class JdbcProgrammingLanguageDao implements ProgrammingLanguageDao {

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		System.out.println("JDBC ile veri tabanına eklendi");

	}

}
