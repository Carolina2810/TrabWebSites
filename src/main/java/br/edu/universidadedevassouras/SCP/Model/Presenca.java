package br.edu.universidadedevassouras.SCP.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_presenca;


    @Column(nullable = false)
    private Date data;


    @Column(nullable = false)
    private Boolean situacao;


    @ManyToOne
    @JoinColumn(name = "pessoa.idpessoa")
    private Pessoa pessoa;
}
