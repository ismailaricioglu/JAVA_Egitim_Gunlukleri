package dataAccess.HibernateDao;

import dataAccess.Dao.ProgrammingLanguageDao;
import entities.ProgrammingLanguage;

public class HibernateProgrammingLanguageDao implements ProgrammingLanguageDao {

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		System.out.println("Hibernate ile veri tabanına eklendi");

	}

}
