
package javaapplication1.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javaapplication1.domain.Produto;

public class ProdutoMapDAO implements IProdutoDAO {
    private Map<Integer, Produto> produtos;

    public ProdutoMapDAO() {
        this.produtos = new HashMap<>();
    }
     @Override
        public List<Produto> listarProdutos() {
        return produtos.values().stream().collect(Collectors.toList());
    }

    @Override
    public Produto buscarProdutoPorId(int id) {
        return produtos.get(id);
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getId(), produto);
    }

    @Override
    public void atualizarProduto(Produto produto) {
        produtos.replace(produto.getId(), produto);
    }

    @Override
    public void excluirProduto(int id) {
        produtos.remove(id);
    }
}