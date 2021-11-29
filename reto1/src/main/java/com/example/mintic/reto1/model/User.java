package com.example.mintic.reto1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data /// Hace los getters y setters LOMBOK
@NoArgsConstructor //// Coloca un constructor sin argumentos LOMBOK
@AllArgsConstructor /// Coloca un constructor con todos los argumentos LOMBOK
@Entity ///Es un modelo que se implementa a nivel de Base de Datos ligado a Table
@Table (name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String name;
}
