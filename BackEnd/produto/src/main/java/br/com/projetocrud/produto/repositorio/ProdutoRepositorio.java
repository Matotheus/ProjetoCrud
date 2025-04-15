package br.com.projetocrud.produto.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projetocrud.produto.modelo.ProdutoModelo;

@Repository
public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long> {
    
}