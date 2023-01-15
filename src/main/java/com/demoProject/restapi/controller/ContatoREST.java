package com.demoProject.restapi.controller;

import com.demoProject.restapi.database.RepositorioContato;
import com.demoProject.restapi.entidade.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoREST {

    @Autowired
    private RepositorioContato repositorio;

    @GetMapping
    private List<Contato> listar (){
        return repositorio.findAll();
    }

    @PostMapping
    private void salvar(@RequestBody Contato contato){
        repositorio.save(contato);
    }

    @PutMapping
    private void alterar(@RequestBody Contato contato){
        if (contato.getId() > 0) {
            repositorio.save(contato);
        }
    }

    @DeleteMapping
    private void deletar(@RequestBody Contato contato){
        repositorio.delete(contato);
    }
}
