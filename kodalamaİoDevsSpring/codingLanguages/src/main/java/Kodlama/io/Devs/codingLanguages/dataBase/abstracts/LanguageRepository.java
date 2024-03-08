package Kodlama.io.Devs.codingLanguages.dataBase.abstracts;

import java.util.List;

import Kodlama.io.Devs.codingLanguages.entities.concrets.Language;

public interface LanguageRepository {
	List<Language> getAll();
}
