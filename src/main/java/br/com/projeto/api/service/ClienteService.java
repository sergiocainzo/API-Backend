package br.com.projeto.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository cr;


}
