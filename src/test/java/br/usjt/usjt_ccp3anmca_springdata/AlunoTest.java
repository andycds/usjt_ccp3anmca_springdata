package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.usjt_ccp3anmca_springdata.model.Aluno;
import br.usjt.usjt_ccp3anmca_springdata.repository.AlunoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlunoTest {
	@Autowired
	private AlunoRepository alunoRepository;

	@Test
	public void testInsertAluno() {
		Aluno a = new Aluno();
		a.setNome("Ana");
		a.setFone("11223344");
		a.setEmail("ana@usjt.br");
		a = alunoRepository.save(a);
		System.out.println(a.getId());
	}

	@Test
	public void testBuscaPorId() {
		Optional<Aluno> a = alunoRepository.findById(2L);
		System.out.println(a.get());
	}

	@Test
	public void testBuscaTodos() {
		List<Aluno> list = alunoRepository.findAll();
		System.out.println(list);
	}

	@Test
	public void testQuantidade() {
		System.out.println(alunoRepository.count());
	}

	@Test
	public void testDeletePorId() {
		Aluno a = new Aluno();
		a.setId(1L);
		alunoRepository.delete(a);
	}
}