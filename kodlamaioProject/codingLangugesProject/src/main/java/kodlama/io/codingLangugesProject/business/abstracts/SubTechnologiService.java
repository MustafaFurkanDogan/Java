package kodlama.io.codingLangugesProject.business.abstracts;

import java.util.List;

import kodlama.io.codingLangugesProject.entities.concretes.SubTechnologi;

public interface SubTechnologiService {
	List<SubTechnologi> getAll();
	void add (SubTechnologi subTechnologi);
	void delete(SubTechnologi subTechnologi);
	void update (SubTechnologi subTechnologi);
}
