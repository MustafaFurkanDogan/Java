package Kodlama.io.Devs.codingLanguages.business.abstrats;

import java.util.List;

import Kodlama.io.Devs.codingLanguages.entities.concrets.Language;

public interface LanguageService{
	 List<Language> getAll();
	 Language getById(int ıd);
	 void add(Language language)throws Exception;
	void delete(int id);
	void upgrade(Language language);
	

}
