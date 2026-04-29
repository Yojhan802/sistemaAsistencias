package com.sistema.asistencias.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "fecha"))
public class diaEscolar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private Boolean esFeriado = false;

    private String descripcion;
}
