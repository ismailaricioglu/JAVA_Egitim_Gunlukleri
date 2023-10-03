package codebydb.io.odevProje.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
	ModelMapper forRequest();

	ModelMapper forResponse();
}
