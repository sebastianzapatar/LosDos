package com.euforia.vainillahotchocolate.models;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;




@Entity
public class Flavor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Column
    @Getter
    @Setter
    private String name;

    @ManyToOne
    @JoinColumn(name = "ice_cream_id")
    @Getter
    @Setter
    private IceCream iceCream;

    // Constructors, getters, setters...
}