package dataAccess.abstracts;

import java.util.List;

import entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	void add(ProgrammingLanguage programmingLanguage);
	boolean update(ProgrammingLanguage programmingLanguage);
	boolean delete(int id);
	
}
