package com.example.livraria.controller;
import com.example.livraria.Model.livrariao;
import com.example.livraria.Repository.livrariaroepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "http://localhost:5173") // Endereço do front
@RestController

@RequestMapping("/livros")
public class livrcontroller {

    @Autowired
    private VeiculoRepository veiculoRepository;
    @GetMapping
    public List<Veiculo> listarlivros() {
        return livrorepository.findAll();
    }
    @PostMapping
    public Veiculo criarVeiculo(@RequestBody Veiculo veiculo) {
        return livrorepository.save(veiculo);
    }
    @DeleteMapping("/{placa}")
    public ResponseEntity<String> deletarVeiculo(@PathVariable String placa) {
        try {
            livrorepository.deleteById(placa);
            return ResponseEntity.ok("Veiculo deletado com sucesso.");
        } catch (EmptyResultDataAccessException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/{placa}")
    public ResponseEntity<Veiculo> atualizarVeiculo(@PathVariable String placa, @RequestBody Veiculo veiculoAtualizado) {
        if (livrorepository.existsById(placa)) {
            Livro livro = livrorepository.findById(placa).get();
            livro.setPlaca(veiculoAtualizado.getPlaca());
            livro.setCor(veiculoAtualizado.getCor());
            livro.setFabricante(veiculoAtualizado.getFabricante());
            livro.setModelo(veiculoAtualizado.getModelo());
            livro.setCategoria(veiculoAtualizado.getCategoria());
            livro.setAno(veiculoAtualizado.getAno());
            livro veiculoAtualizadoBD = veiculoRepository.save(veiculo);
            return ResponseEntity.ok(veiculoAtualizadoBD);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
