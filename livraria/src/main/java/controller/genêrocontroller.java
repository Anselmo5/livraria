package com.example.livraria.controller;
import com.example.livraria.Model.Genêro;
import com.example.livraria.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "http://localhost:5173") // Endereço do front
@RestController

@RequestMapping("/categorias")
public class genêrocontroller {
 @Autowired
    private CategoriaRepository categoriaRepository;
 @GetMapping
    public List<Genêro> listarGenêros() {
        return genêrorepository.findAll();
    }
   @PostMapping
    public Categoria criarCategoria(@RequestBody Categoria categoria) {
        return genêrorepository.save(genêro);
    }

}
