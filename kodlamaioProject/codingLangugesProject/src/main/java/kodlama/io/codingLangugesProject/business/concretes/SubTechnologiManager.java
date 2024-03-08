package kodlama.io.codingLangugesProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.codingLangugesProject.business.abstracts.SubTechnologiService;
import kodlama.io.codingLangugesProject.dataAcces.abstracts.SubTechnologiRepository;
import kodlama.io.codingLangugesProject.entities.concretes.SubTechnologi;
@Service
public class SubTechnologiManager implements SubTechnologiService {
	private SubTechnologiRepository subTechnologiRepository;
	@Autowired
	public SubTechnologiManager(SubTechnologiRepository subTechnologiRepository) {
		this.subTechnologiRepository = subTechnologiRepository;
	}

	@Override
	public List<SubTechnologi> getAll() {
		// TODO Auto-generated method stub
		return subTechnologiRepository.findAll();
	}

	@Override
	public void add(SubTechnologi subTechnologi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(SubTechnologi subTechnologi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SubTechnologi subTechnologi) {
		// TODO Auto-generated method stub
		
	}

}
