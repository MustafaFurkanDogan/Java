package kodlama.io.codingLangugesProject.webApiControllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.codingLangugesProject.business.abstracts.SubTechnologiService;
import kodlama.io.codingLangugesProject.entities.concretes.SubTechnologi;
@RestController
@RequestMapping("/api/subTechnologi")
public class SubTechnologies {
	private SubTechnologiService subTechnologiService;
	@GetMapping("/getall")
	public List<SubTechnologi> getAll(){
		
		return subTechnologiService.getAll();
		
	}
	

}
