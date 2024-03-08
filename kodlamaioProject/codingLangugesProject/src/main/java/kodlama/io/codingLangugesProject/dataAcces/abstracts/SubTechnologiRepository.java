package kodlama.io.codingLangugesProject.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.codingLangugesProject.entities.concretes.SubTechnologi;

public interface SubTechnologiRepository extends JpaRepository<SubTechnologi, Integer>{
List<SubTechnologi>getAll();
}
