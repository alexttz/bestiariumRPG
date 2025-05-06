package com.example.bestiarium.model;

// Importações necessárias para a entidade funcionar
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jarkarta.persistence.Entity;
import  jarkarta.persistence.Table;
import jarkarta.persistence.Id;
import jarkarta.persistence.GeneratedValue;
import jarkarta.persistence.GenerationType;
import jarkarta.persistence.Column;

@Entity //Declara que essa entidade é uma entidade JPA
@Table (name = "Criatura") //Define o nome da tabela no banco de dados

public class Criatura {
    @Id //Define o campo id como chave primária
    @GeneratedValue (strategy = GenerationType.IDENTITY) //Define a estratégia de geração de ID
    private long id;

    @Column(name = "nome_criatura", nullable = false, length = 100)
    private String nome_criatura;

    @Column(name = "tipo_criatura", nullable = false, length = 50)
    private String tipo_criatura;

    @Column(name = "habitat_criatura", nullable = false, length = 50)
    private String habitat_criatura;

    @Column(name = "ameaca", nullable = false)
    private Integer ameaca;

    @Column(name = "descricao")
    private String descricao;

    //Getters e Setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_criatura() {
        return nome_criatura;
    }
    public void setNome_criatura(String nome_criatura) {
        this.nome_criatura = nome_criatura;
    }
    public String getTipo_criatura() {
        return tipo_criatura;
    }
    public void setTipo_criatura(String tipo_criatura) {
        this.tipo_criatura = tipo_criatura;
    }
    public String getHabitat_criatura() {
        return habitat_criatura;
    }
    public void setHabitat_criatura(String habitat_criatura) {
        this.habitat_criatura = habitat_criatura;
    }
    public Integer getAmeaca() {
        return ameaca;
    }
    public void setAmeaca(Integer ameaca) {
        this.ameaca = ameaca;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



}
