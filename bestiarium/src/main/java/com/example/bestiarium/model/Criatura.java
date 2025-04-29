package com.example.bestiarium.model;

// Importações necessárias para a entidade funcionar
import jakarta.persistence.*;
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

    @jakarta.persistence.Column
    @Column (name = "NOME_CRIATURA", nullable = false, lenght = 50)
}
