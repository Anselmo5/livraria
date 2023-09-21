package com.example.livraria.Repository;
import com.example.livraria.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface livrorepository extends JpaRepository<Livro, String> {
}
