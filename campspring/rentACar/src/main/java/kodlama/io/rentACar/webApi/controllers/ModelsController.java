package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstrats.ModelService;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelResponse;
import lombok.AllArgsConstructor;

@RestController//annotation
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
	
	private ModelService modelService;
	
	@GetMapping()
	public List<GetAllModelResponse> getAll(){
		return modelService.getAll();
		}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() @Valid CreateModelRequest createModelRequest) {
		this.modelService.add(createModelRequest);
	}

}
