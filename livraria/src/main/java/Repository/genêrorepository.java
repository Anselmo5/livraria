package com.example.livraria.Repository;
import com.example.livraria.Model.Genêro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface genêrorepository extends JpaRepository<Genêro, Long> {
}
