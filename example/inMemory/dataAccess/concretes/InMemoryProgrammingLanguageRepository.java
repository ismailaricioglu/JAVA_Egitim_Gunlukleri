package inMemory.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import inMemory.dataAccess.abstracts.ProgrammingLanguageRepository;
import inMemory.entities.concretes.ProgrammingLanguage;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	List<ProgrammingLanguage> programmingLanguage;

	// yapılandırıcı
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguage = new ArrayList<ProgrammingLanguage>();
		programmingLanguage.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguage.add(new ProgrammingLanguage(2, "Java"));
		programmingLanguage.add(new ProgrammingLanguage(3, "Python"));
	}

	// listeleyici
	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguage;
	}

	// id ile geitrici
	@Override
	public ProgrammingLanguage getById(int id) {
		ProgrammingLanguage programmingLanguageById = null;
		for (ProgrammingLanguage pl : programmingLanguage) {
			if (pl.getId() == id) {
				programmingLanguageById = pl;
			}
		}
		return programmingLanguageById;
	}

	// ekleyici
	@Override
	public void add(ProgrammingLanguage programmingLanguageObject) {
		programmingLanguage.add(programmingLanguageObject);

	}

	// güncelleyici
	@Override
	public boolean update(ProgrammingLanguage programmingLanguageObject) {
		for (ProgrammingLanguage pl : programmingLanguage) {
			if (pl.getId() == programmingLanguageObject.getId()) {
				programmingLanguage.remove(pl);
				programmingLanguage.add(programmingLanguageObject);
				return true;
			}
		}
		return false;
	}

	// silici
	@Override
	public boolean delete(int id) {
		for (ProgrammingLanguage pl : programmingLanguage) {
			if (pl.getId() == id) {
				programmingLanguage.remove(pl);
				return true;
			}
		}
		return false;
	}

}
