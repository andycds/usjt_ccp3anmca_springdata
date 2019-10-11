package br.usjt.usjt_ccp3anmca_springdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.usjt_ccp3anmca_springdata.repository.AlunoRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class AlunoDeleteCountTest {
	@Autowired
	private AlunoRepository alunoRepo;
	
	@Test
	public void deleteTest() {
		System.out.println(alunoRepo.deleteByFone("11223344"));
	}
	public void countTest() {
		System.out.println(alunoRepo.countByEmail("ana@usjt.br"));
	}
}