
package javaapplication1.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javaapplication1.domain.Cliente;
public class ClienteMapDAO implements IClienteDAO {
    
    
    private Map<Long, Cliente> map;
    private Map<Long, Cliente> clientes;

    public ClienteMapDAO() {
        map = new TreeMap<>();
    }
   
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }
        
        map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTel(cliente.getTel());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setEnd(cliente.getEnd());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEstado(cliente.getEstado());
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }
     @Override
    public List<Cliente> listarClientes() {
        return new ArrayList<>(map.values());
    }

   
    

    
}
