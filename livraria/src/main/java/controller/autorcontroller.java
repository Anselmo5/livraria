package com.example.livraria.controller;
import com.example.livraria.Model.Autor;
import com.example.livraria.Repository.autorrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "http://localhost:5173") // Endereço do front
@RestController

@RequestMapping("/autores")
public class autorcontroller {
    @Autowired
    private autorrepository autorrepository;
    @GetMapping
    public List<Autor> listasAutor() {
        return fabricanteRepository.findAll();
    }
    @PostMapping
    public Fabricante criarFabricante(@RequestBody Fabricante fabricante) {
        return fabricanteRepository.save(fabricante);
    }

}
