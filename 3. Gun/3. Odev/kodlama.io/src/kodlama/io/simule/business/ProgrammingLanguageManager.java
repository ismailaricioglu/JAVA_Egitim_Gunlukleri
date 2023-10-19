package kodlama.io.simule.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.simule.dataAccess.Dao.ProgrammingLanguageDao;
import kodlama.io.simule.entities.ProgrammingLanguage;

public class ProgrammingLanguageManager {
	private ProgrammingLanguageDao programmingLanguageDao;

	// yapılandırıcı
	public ProgrammingLanguageManager(ProgrammingLanguageDao programmingLanguageDao) {
		super();
		this.programmingLanguageDao = programmingLanguageDao;
	}

	// tümünü getir, listele
	public List<ProgrammingLanguage> getAll() throws Exception {
		List<ProgrammingLanguage> programmingLanguage = new ArrayList<>();
		programmingLanguage.add(new ProgrammingLanguage(1, "Tümü"));
		programmingLanguage.add(new ProgrammingLanguage(2, "Programlama"));
		return programmingLanguage;
	}

	// id ile getir
	public ProgrammingLanguage getWithId(int id) throws Exception {
		ProgrammingLanguage programmingLanguage = null;
		for (ProgrammingLanguage pL : getAll()) {
			if (pL.getId() == id)
				programmingLanguage = pL;
		}
		return programmingLanguage;
	}

	// ekle
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {

		List<ProgrammingLanguage> programmingLanguages = getAll();
		for (ProgrammingLanguage pL : programmingLanguages) {
			if (pL.getName() == programmingLanguage.getName())
				throw new Exception(programmingLanguage.getName() + " için Kategori ismi tekrar edemez");
		}

		programmingLanguageDao.add(programmingLanguage);
	}

	// güncelle

	// sil
}
