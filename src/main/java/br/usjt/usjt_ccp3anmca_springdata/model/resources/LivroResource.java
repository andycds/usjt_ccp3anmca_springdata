package br.usjt.usjt_ccp3anmca_springdata.model.resources;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.usjt_ccp3anmca_springdata.model.Livro;
import br.usjt.usjt_ccp3anmca_springdata.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivroResource {
	@Autowired
	private LivroRepository livroRepo;

	@GetMapping("/{id}")
	public Livro buscarPeloId(@PathVariable Long id) {
		return livroRepo.getOne(id);
	}

	@GetMapping("/lista")
	public List<Livro> todosOsLivros() {
		return livroRepo.findAll();
	}

	@PostMapping ("/salvar")
	//@ResponseStatus (HttpStatus.CREATED) agora desnecessária
	public ResponseEntity<Livro> salvar(@RequestBody Livro livro, HttpServletResponse response) {
		Livro l = livroRepo.save(livro);
		URI uri = ServletUriComponentsBuilder.
				fromCurrentServletMapping().path("/livros/{id}"). //na apostila faltou /livros
				buildAndExpand(l.getId()).
				toUri();
		//desnecessário também
		//response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(l);
	}
}