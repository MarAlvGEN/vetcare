package com.generation.vetcare.model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mascotas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Long ID por lo general
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String especie;

    private String raza;

    private Integer edad;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dueno_id", nullable = false)
    private Dueno dueno;
}
