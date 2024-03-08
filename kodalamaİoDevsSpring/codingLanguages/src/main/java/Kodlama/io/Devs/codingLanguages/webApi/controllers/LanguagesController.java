package Kodlama.io.Devs.codingLanguages.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.codingLanguages.business.abstrats.LanguageService;
import Kodlama.io.Devs.codingLanguages.entities.concrets.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
private LanguageService languageService;
@Autowired
public LanguagesController(LanguageService languageService) {

	this.languageService = languageService;
}
@GetMapping("/getall")
public List<Language> getAll(){
	return languageService.getAll();
	
}

}
