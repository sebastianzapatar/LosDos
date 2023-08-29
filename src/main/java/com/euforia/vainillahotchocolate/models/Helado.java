package com.euforia.vainillahotchocolate.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="helados")
public class Helado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Column
    @Getter
    @Setter
    private Double precio;

    @Column
    @Getter
    @Setter
    private String nombre;

    @OneToMany()
    private Set<Ingrediente> ingredientes = new HashSet<>();
}
