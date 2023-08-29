package com.euforia.vainillahotchocolate.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="ingredientes")
public class Ingrediente implements Serializable {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @Getter
    @Setter
    private String nombre;

    @Column
    @Getter
    @Setter
    private Double precio;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="helado_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @Setter
    @Getter
    private Helado helado;

}
