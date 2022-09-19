package br.edu.universidadedevassouras.SCP.Model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Data
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpessoa;


    @Column(nullable = false, unique = true)
    private String CPF;


    @Column(nullable = false)
    private String nome;


    @Column(nullable = false, unique = true)
    private int matricula;


    @Column(nullable = true)
    private Date nascimento;


    @Column(nullable = true)
    private char genero;


    @Column(nullable = true)
    private String foto;


    @Column(nullable = false, unique = true)
    private String username;


    @Column(nullable = false)
    private String senha;
}



