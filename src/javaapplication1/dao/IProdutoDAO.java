package javaapplication1.dao;


import java.util.List;
import javaapplication1.domain.Cliente;
import javaapplication1.domain.Produto;

public interface IProdutoDAO {
    List<Produto> listarProdutos();
    Produto buscarProdutoPorId(int id);
    void adicionarProduto(Produto produto);
    void atualizarProduto(Produto produto);
    void excluirProduto(int id);
    
    
    
}