package dataAccess.Dao;

import entities.ProgrammingLanguage;

public interface ProgrammingLanguageDao extends Dao {
	void add(ProgrammingLanguage programmingLanguage);
}