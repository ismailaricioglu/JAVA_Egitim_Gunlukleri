package codebydb.io.odevProje.webApi.controllers;

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

import codebydb.io.odevProje.business.abstracts.TechnologyService;
import codebydb.io.odevProje.business.dtos.requests.CreateTechnologyRequest;
import codebydb.io.odevProje.business.dtos.requests.UpdateTechnologyRequest;
import codebydb.io.odevProje.business.dtos.responses.GetAllTechnologiesResponse;
import codebydb.io.odevProje.business.dtos.responses.GetByIdTechnologyResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/technologies")
@AllArgsConstructor
public class TechnologiesController {
	private TechnologyService technologyService;

	@GetMapping()
	public List<GetAllTechnologiesResponse> getAll() {
		return technologyService.getAll();
	}

	@GetMapping("/{id}")
	public GetByIdTechnologyResponse getById(@PathVariable int id) {
		return technologyService.getById(id);
	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		this.technologyService.add(createTechnologyRequest);
	}

	@PutMapping
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
		this.technologyService.update(updateTechnologyRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.technologyService.delete(id);
	}
}
