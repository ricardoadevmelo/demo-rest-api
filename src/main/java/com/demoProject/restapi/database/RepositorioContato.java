package com.demoProject.restapi.database;


import com.demoProject.restapi.entidade.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository <Contato, Long>{
}
