package kodlama.io.simule.dataAccess.Dao;

import kodlama.io.simule.entities.ProgrammingLanguage;

public interface ProgrammingLanguageDao extends Dao {
	void add(ProgrammingLanguage programmingLanguage);
}