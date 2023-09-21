package com.example.livraria.Repository;
import com.example.livraria.Model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface autorrepository extends JpaRepository<Autor, Long> {
}
