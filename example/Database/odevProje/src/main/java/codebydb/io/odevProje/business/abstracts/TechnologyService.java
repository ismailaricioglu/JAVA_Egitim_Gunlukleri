package codebydb.io.odevProje.business.abstracts;

import java.util.List;

import codebydb.io.odevProje.business.dtos.requests.CreateTechnologyRequest;
import codebydb.io.odevProje.business.dtos.requests.UpdateTechnologyRequest;
import codebydb.io.odevProje.business.dtos.responses.GetAllTechnologiesResponse;
import codebydb.io.odevProje.business.dtos.responses.GetByIdTechnologyResponse;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();

	GetByIdTechnologyResponse getById(int id);

	void add(CreateTechnologyRequest createTechnologyRequest);

	void update(UpdateTechnologyRequest updateTechnologyRequest);

	void delete(int id);
}
