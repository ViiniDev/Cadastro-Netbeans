package javaapplication1.dao;

import java.util.List;
import javaapplication1.domain.Cliente;

public interface IClienteDAO {
    
    public Boolean cadastrar(Cliente cliente);
    
    public void excluir(Long cpf);
    
    public void alterar(Cliente cliente);
    
    public Cliente consultar(Long cpf);
    
    List<Cliente> listarClientes();

    
   
}
