package kodlama.io.codingLangugesProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.codingLangugesProject.business.abstracts.CodingLanguageService;
import kodlama.io.codingLangugesProject.dataAcces.abstracts.CodingLanguageRepository;
import kodlama.io.codingLangugesProject.entities.concretes.CodingLanguage;
@Service
public class CodeLanguageManager implements CodingLanguageService {
	private CodingLanguageRepository codingLanguageRepository;
	@Autowired
	public CodeLanguageManager(CodingLanguageRepository codingLanguageRepository) {
		this.codingLanguageRepository = codingLanguageRepository;
	}
	

	@Override
	public List<CodingLanguage> getAll() {
		// TODO Auto-generated method stub
		return codingLanguageRepository.findAll();
	}


	@Override
	public void add(CodingLanguage codingLanguage) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(CodingLanguage codingLanguage) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(CodingLanguage codingLanguage) {
		// TODO Auto-generated method stub
		
	}

}
