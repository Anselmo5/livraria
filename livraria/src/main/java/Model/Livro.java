package Model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
@Entity
@Getter
@Setter

@SpringBootApplication
public class Livro {

    @Id
    private String placa;
    private String modelo;
    private int ano;
    private String cor;


    @ManyToOne
    private Autor autor;


    @ManyToOne
    private Genêro genêro;


}
