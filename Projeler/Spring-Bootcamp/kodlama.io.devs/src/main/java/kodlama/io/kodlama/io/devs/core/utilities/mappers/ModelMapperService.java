package kodlama.io.kodlama.io.devs.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
	ModelMapper forRequest();

	ModelMapper forResponse();
}
