package com.euforia.vainillahotchocolate.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.*;
@Entity
public class IceCream implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long iceCreamId;
    @Column
    @Getter
    @Setter
    private String name;

    @OneToMany(mappedBy = "iceCream", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Flavor> flavors = new ArrayList<>();

    // Constructors, getters, setters...
}


