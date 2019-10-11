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
public class AlunoOperatorTest {
	@Autowired
	private AlunoRepository alunoRepo;

	@Test
	public void alunoOperatorTest() {
		List<Aluno> alunos = alunoRepo.findByFoneAndNome("11223344", "Ana");
		imprimirLista(alunos);
		alunos = alunoRepo.findByFoneOrNome("11223344", "Ana");
		imprimirLista(alunos);
	}
	
	void imprimirLista(List<Aluno> alunos) {
		alunos.forEach(System.out::println);
	}
}
