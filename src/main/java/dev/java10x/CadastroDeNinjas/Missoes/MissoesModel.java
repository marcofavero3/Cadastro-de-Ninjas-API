package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDaMissao;

    private String dificuldade;

    // o @ faz que uma missão tem vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
