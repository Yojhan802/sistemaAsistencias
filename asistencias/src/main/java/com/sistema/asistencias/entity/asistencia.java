package com.sistema.asistencias.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private LocalTime hora;

    @Enumerated(EnumType.STRING)
    private EstadoAsistencia estado;

    @ManyToOne
    @JoinColumn(name = "alumno_id")
    private alumno alumno;
}
