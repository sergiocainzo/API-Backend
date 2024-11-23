package br.com.projeto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
