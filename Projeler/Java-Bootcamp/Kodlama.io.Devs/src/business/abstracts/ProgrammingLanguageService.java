package business.abstracts;

import java.util.List;

import entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	boolean update(ProgrammingLanguage programmingLanguage) throws Exception;
	boolean delete(int id);
}
