package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.repository.ClienteRepository;

@RestController
@RequestMapping("")
public class ClienteController {
    
    @Autowired
    private ClienteRepository acao;



    @GetMapping("/helloworld")
    public String teste(){
        return "Hello World!!!";
    }

}
