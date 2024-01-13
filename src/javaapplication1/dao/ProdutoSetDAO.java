package javaapplication1.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javaapplication1.domain.Produto;

public class ProdutoSetDAO implements IProdutoDAO {
    private Set<Produto> produtos;
    

    public ProdutoSetDAO() {
        this.produtos = new HashSet<>();
    }
    @Override
        public List<Produto> listarProdutos() {
        return produtos.stream().collect(Collectors.toList());
    }

    @Override
    public Produto buscarProdutoPorId(int id) {
        return produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void atualizarProduto(Produto produto) {
        excluirProduto(produto.getId());
        adicionarProduto(produto);
    }

    @Override
    public void excluirProduto(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }
    
}