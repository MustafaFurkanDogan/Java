package Kodlama.io.Devs.codingLanguages.business.concrets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.codingLanguages.business.abstrats.LanguageService;
import Kodlama.io.Devs.codingLanguages.dataBase.abstracts.LanguageRepository;
import Kodlama.io.Devs.codingLanguages.entities.concrets.Language;
@Service
public class LanguageManager implements LanguageService  {
private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {

	this.languageRepository = languageRepository;
}


	@Override
	public List<Language> getAll() {
		
		
		return languageRepository.getAll();
	}


	@Override
	public Language getById(int id) {
		// TODO Auto-generated method stub
		return (Language) languageRepository.getAll();
	}


	@Override
	public void add(Language language) throws Exception {
		if(language.getName()==null) {
			throw new Exception("Kurs bölümü boş olamaz");
			}
		for(Language currentLanguage : languageRepository.getAll()) {
		if(currentLanguage.equals(language)) {
		throw new Exception("Kurs ismi aynı olamaz.");	
		}	
		}
	add(language);
	}

	@Override
	public void delete(int id) {
		delete(id);
		
	}


	@Override
	public void upgrade(Language language) {
		upgrade(language);
		
	}

}
