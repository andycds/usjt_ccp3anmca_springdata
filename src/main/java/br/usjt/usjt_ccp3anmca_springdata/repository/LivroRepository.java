package br.usjt.usjt_ccp3anmca_springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.usjt_ccp3anmca_springdata.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}