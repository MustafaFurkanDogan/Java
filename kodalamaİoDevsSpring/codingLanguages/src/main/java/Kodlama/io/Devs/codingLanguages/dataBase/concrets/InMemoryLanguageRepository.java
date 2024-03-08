package Kodlama.io.Devs.codingLanguages.dataBase.concrets;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.codingLanguages.dataBase.abstracts.LanguageRepository;
import Kodlama.io.Devs.codingLanguages.entities.concrets.Language;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

		List<Language> languages;
		
	public InMemoryLanguageRepository() {
	languages = new ArrayList<Language>();
	languages.add(new Language(1, "Java"));
	languages.add(new Language(2, "C#"));
	languages.add(new Language(3, "Pyton"));
		}



	@Override
	public List<Language> getAll() {
		
		return languages;
	}

}
