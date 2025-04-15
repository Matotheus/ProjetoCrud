package br.com.projetocrud.produto.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetocrud.produto.modelo.ProdutoModelo;
import br.com.projetocrud.produto.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
     @Autowired
    private ProdutoRepositorio pr;

    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
    }
}
