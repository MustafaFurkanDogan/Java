package kodlama.io.codingLangugesProject.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.codingLangugesProject.entities.concretes.CodingLanguage;

public interface CodingLanguageRepository extends JpaRepository<CodingLanguage,Integer> {
 List<CodingLanguage>getAll();
}
