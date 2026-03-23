package com.atv.ex06.Service;

import com.atv.ex06.Model.Cliente;
import com.atv.ex06.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> litaClientes() {
        return repository.findAll();
    }

    public Optional<Cliente> exibeCliente(Long id) {
        return repository.findById(id);
    }

    public Cliente criarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public void deletarCliente(Long id) {
        repository.deleteById(id);
    }
}
