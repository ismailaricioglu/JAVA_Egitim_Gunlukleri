package codebydb.io.odevProje.business.rules;

import org.springframework.stereotype.Service;

import codebydb.io.odevProje.core.utilities.exception.BusinessException;
import codebydb.io.odevProje.dataAccess.abstracts.ProgrammingLanguageRepository;
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
