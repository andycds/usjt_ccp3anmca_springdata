package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.usjt_ccp3anmca_springdata.model.Aluno;
import br.usjt.usjt_ccp3anmca_springdata.repository.AlunoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlunoQueryTest {
	@Autowired
	private AlunoRepository alunoRepo;
	
	@Test
	public void findOneTest() {
		Aluno a = alunoRepo.findByEmail("ana@usjt.br");
		System.out.println(a);
	}
	
	@Test
	public void findManyTest() {
		List<Aluno> alunos = alunoRepo.queryByNome("Ana");
		System.out.println(alunos);
	}
}
