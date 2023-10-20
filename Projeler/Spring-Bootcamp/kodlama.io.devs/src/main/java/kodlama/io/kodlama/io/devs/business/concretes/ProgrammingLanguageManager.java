package kodlama.io.kodlama.io.devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.devs.business.dtos.requests.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.devs.business.dtos.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetByIdProgrammingLanguageResponse;
import kodlama.io.kodlama.io.devs.business.rules.ProgrammingLanguageBusinessRules;
import kodlama.io.kodlama.io.devs.core.utilities.mappers.ModelMapperService;
import kodlama.io.kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	private ModelMapperService modelMapperService;
	private ProgrammingLanguageBusinessRules programmingLanguageBusinessRules;

	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		List<ProgrammingLanguage> languages = programmingLanguageRepository.findAll();

		List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponse = languages.stream()
				.map(language -> this.modelMapperService.forResponse().map(language,
						GetAllProgrammingLanguagesResponse.class))
				.collect(Collectors.toList());

		return programmingLanguagesResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		this.programmingLanguageBusinessRules
				.checkIfProgrammingLanguageNameExists(createProgrammingLanguageRequest.getName());

		ProgrammingLanguage language = this.modelMapperService.forRequest().map(createProgrammingLanguageRequest,
				ProgrammingLanguage.class);

		this.programmingLanguageRepository.save(language);
	}

	@Override
	public GetByIdProgrammingLanguageResponse getById(int id) {
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(id).orElseThrow();
		GetByIdProgrammingLanguageResponse response = this.modelMapperService.forResponse().map(programmingLanguage,
				GetByIdProgrammingLanguageResponse.class);
		return response;
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		ProgrammingLanguage language = this.modelMapperService.forRequest().map(updateProgrammingLanguageRequest,
				ProgrammingLanguage.class);
		this.programmingLanguageRepository.save(language);
	}

	@Override
	public void delete(int id) {
		this.programmingLanguageRepository.deleteById(id);
	}
}
