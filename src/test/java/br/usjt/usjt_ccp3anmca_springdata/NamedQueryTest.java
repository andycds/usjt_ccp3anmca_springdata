package br.usjt.usjt_ccp3anmca_springdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.usjt_ccp3anmca_springdata.model.Aluno;
import br.usjt.usjt_ccp3anmca_springdata.repository.AlunoRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NamedQueryTest {
	@Autowired
	private AlunoRepository alunoRepo;
	
	@Test
	public void test() {
		Aluno a = alunoRepo.buscarPeloNomeEPeloEmail("ana", "ana@usjt.br");
		System.out.println(a);
	}
}
