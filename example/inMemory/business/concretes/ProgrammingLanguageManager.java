package inMemory.business.concretes;

import java.util.List;

import inMemory.business.abstracts.ProgrammingLanguageService;
import inMemory.dataAccess.abstracts.ProgrammingLanguageRepository;
import inMemory.entities.concretes.ProgrammingLanguage;

public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	// LİSTELEME
	@Override
	public List<ProgrammingLanguage> getAll() {
		// iş kuralları
		return programmingLanguageRepository.getAll();
	}

	// ID İLE GETİRME
	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return programmingLanguageRepository.getById(id);
	}

	// EKLEME
	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (programmingLanguage.getName() == null || programmingLanguage.getName() == "")
			throw new Exception("Programlama dili boş geçilemez");

		List<ProgrammingLanguage> programmingLanguages = getAll();
		for (ProgrammingLanguage pL : programmingLanguages) {
			if (pL.getName() == programmingLanguage.getName())
				throw new Exception(programmingLanguage.getName() + " için İsimler tekrar edemez");
		}

		programmingLanguageRepository.add(programmingLanguage);
	}

	// GÜNCELLEME
	@Override
	public boolean update(ProgrammingLanguage programmingLanguage) throws Exception {
		if (programmingLanguage.getName() == null || programmingLanguage.getName() == "")
			throw new Exception("Programlama dili boş geçilemez");
		return programmingLanguageRepository.update(programmingLanguage);
	}

	// SİLME
	@Override
	public boolean delete(int id) {
		return programmingLanguageRepository.delete(id);
	}
}
