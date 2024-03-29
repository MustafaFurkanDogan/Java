package kodlama.io.rentACar.business.abstrats;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelResponse;

public interface ModelService {
	List<GetAllModelResponse> getAll();
	void add(CreateModelRequest createModelRequest);
}
