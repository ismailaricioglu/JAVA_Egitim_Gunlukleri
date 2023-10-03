package codebydb.io.odevProje.business.abstracts;

import java.util.List;

import codebydb.io.odevProje.business.dtos.requests.CreateProgrammingLanguageRequest;
import codebydb.io.odevProje.business.dtos.requests.UpdateProgrammingLanguageRequest;
import codebydb.io.odevProje.business.dtos.responses.GetAllProgrammingLanguagesResponse;
import codebydb.io.odevProje.business.dtos.responses.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguagesResponse> getAll();

	GetByIdProgrammingLanguageResponse getById(int id);

	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);

	void delete(int id);
}
