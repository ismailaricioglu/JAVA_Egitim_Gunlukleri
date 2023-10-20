package dataAccess.JdbcDao;

import dataAccess.Dao.ProgrammingLanguageDao;
import entities.ProgrammingLanguage;

public class JdbcProgrammingLanguageDao implements ProgrammingLanguageDao {

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		System.out.println("JDBC ile veri tabanına eklendi");

	}

}
