package kodlama.io.codingLangugesProject.webApiControllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.codingLangugesProject.business.abstracts.CodingLanguageService;
import kodlama.io.codingLangugesProject.entities.concretes.CodingLanguage;

@RestController
@RequestMapping("/api/codeingLanguages")
public class CodingLanguages {
	
	private CodingLanguageService codingLanguageService;
	
	@GetMapping("/getall")
	public List<CodingLanguage> getAll(){
		return codingLanguageService.getAll();
	}

}
