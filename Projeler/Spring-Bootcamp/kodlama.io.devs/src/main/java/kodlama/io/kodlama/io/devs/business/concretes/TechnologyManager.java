package kodlama.io.kodlama.io.devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.devs.business.abstracts.TechnologyService;
import kodlama.io.kodlama.io.devs.business.dtos.requests.CreateTechnologyRequest;
import kodlama.io.kodlama.io.devs.business.dtos.requests.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetAllTechnologiesResponse;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetByIdTechnologyResponse;
import kodlama.io.kodlama.io.devs.core.utilities.mappers.ModelMapperService;
import kodlama.io.kodlama.io.devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.kodlama.io.devs.entities.concretes.Technology;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService {
	private TechnologyRepository technologyRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();

		List<GetAllTechnologiesResponse> technologiesResponse = technologies.stream().map(
				technology -> this.modelMapperService.forResponse().map(technology, GetAllTechnologiesResponse.class))
				.collect(Collectors.toList());

		return technologiesResponse;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		Technology technology = this.modelMapperService.forRequest().map(createTechnologyRequest, Technology.class);
		// update etmesini önlemek için : 1. yöntem de id'sini 0 ile set ederiz.
		technology.setId(0);
		this.technologyRepository.save(technology);

		// update etmesini önlemek için : 2. yöntem de ise yeni bir nesne oluşturup id'sini set etmeyiz 
//		Technology technologyAddItem = new Technology();
//		technologyAddItem.setName(technology.getName());
//		technologyAddItem.setProgrammingLanguage(technology.getProgrammingLanguage());
//
//		this.technologyRepository.save(technologyAddItem);

	}

	@Override
	public GetByIdTechnologyResponse getById(int id) {
		Technology technology = this.technologyRepository.findById(id).orElseThrow();
		GetByIdTechnologyResponse response = this.modelMapperService.forResponse().map(technology,
				GetByIdTechnologyResponse.class);
		return response;
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
		Technology technology = this.modelMapperService.forRequest().map(updateTechnologyRequest, Technology.class);
		this.technologyRepository.save(technology);

	}

	@Override
	public void delete(int id) {
		this.technologyRepository.deleteById(id);

	}

}
