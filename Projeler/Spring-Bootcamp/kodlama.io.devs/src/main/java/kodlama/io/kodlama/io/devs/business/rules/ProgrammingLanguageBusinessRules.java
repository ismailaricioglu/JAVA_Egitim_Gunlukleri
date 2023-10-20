package kodlama.io.kodlama.io.devs.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.devs.core.utilities.exception.BusinessException;
import kodlama.io.kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProgrammingLanguageBusinessRules {
	private ProgrammingLanguageRepository programmingLanguageRepository;

	public void checkIfProgrammingLanguageNameExists(String name) {
		if (this.programmingLanguageRepository.existsByName(name)) {
			throw new BusinessException("Programming Language name already exists.");
		}
	}
}
