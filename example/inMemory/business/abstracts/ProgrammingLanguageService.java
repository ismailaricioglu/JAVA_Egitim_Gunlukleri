package inMemory.business.abstracts;

import java.util.List;

import inMemory.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	boolean update(ProgrammingLanguage programmingLanguage) throws Exception;
	boolean delete(int id);
}
