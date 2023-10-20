package kodlama.io.kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.devs.business.dtos.requests.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.devs.business.dtos.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetByIdProgrammingLanguageResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/programmingLanguages")
@AllArgsConstructor
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@GetMapping()
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		return programmingLanguageService.getAll();
	}

	@GetMapping("/{id}")
	public GetByIdProgrammingLanguageResponse getById(@PathVariable int id) {
		return programmingLanguageService.getById(id);
	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		this.programmingLanguageService.add(createProgrammingLanguageRequest);
	}

	@PutMapping
	public void update(UpdateProgrammingLanguageRequest updateProgramminglanguageRequest) {
		this.programmingLanguageService.update(updateProgramminglanguageRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.programmingLanguageService.delete(id);
	}

}
