package com.sistema.asistencias.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String dni;

    @Column(unique = true)
    private String codigoQr; // UUID

    private Boolean activo = true;

    // relaciones
    @OneToMany(mappedBy = "alumno")
    private List<asistencia> asistencias;
}