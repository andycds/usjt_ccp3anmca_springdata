package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.usjt_ccp3anmca_springdata.model.Aluno;
import br.usjt.usjt_ccp3anmca_springdata.repository.AlunoRepository;

@SpringBootTest
@RunWith (SpringRunner.class)
public class QueryExplicitaTest {
	@Autowired
	private AlunoRepository alunoRepo;

	@Test
	public void testQueryExplicita() throws InterruptedException, ExecutionException {
		List<Aluno> alunos1 = alunoRepo.buscarPeloEmail("ana@usjt.br");
		alunos1.forEach(System.out::println);
		List<Aluno> alunos2 = alunoRepo.buscarPorLetraInicialDoNome("b");
		alunos2.forEach(System.out::println);
		List<Aluno> alunos3 = alunoRepo.buscarPorTelefone("123456");
		alunos3.forEach(System.out::println);
	}
}
