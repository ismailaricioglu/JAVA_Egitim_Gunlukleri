package kodlama.io.kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.devs.business.dtos.requests.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.devs.business.dtos.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguagesResponse> getAll();

	GetByIdProgrammingLanguageResponse getById(int id);

	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);

	void delete(int id);
}
