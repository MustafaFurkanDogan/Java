package kodlama.io.codingLangugesProject.business.abstracts;

import java.util.List;

import kodlama.io.codingLangugesProject.entities.concretes.CodingLanguage;

public interface CodingLanguageService {
	List<CodingLanguage> getAll();
	
	void add (CodingLanguage codingLanguage);
	void delete (CodingLanguage codingLanguage);
	void update (CodingLanguage codingLanguage);

}
