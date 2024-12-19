package br.edu.ifg.numbers.carroapi.repository;

import br.edu.ifg.numbers.carroapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
}