package kodlama.io.kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.devs.business.dtos.requests.CreateTechnologyRequest;
import kodlama.io.kodlama.io.devs.business.dtos.requests.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetAllTechnologiesResponse;
import kodlama.io.kodlama.io.devs.business.dtos.responses.GetByIdTechnologyResponse;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();

	GetByIdTechnologyResponse getById(int id);

	void add(CreateTechnologyRequest createTechnologyRequest);

	void update(UpdateTechnologyRequest updateTechnologyRequest);

	void delete(int id);
}
