package com.euforia.vainillahotchocolate.service;

import com.euforia.vainillahotchocolate.models.Ingrediente;
import java.util.*;
public interface IIngredienteService {
    public List<Ingrediente> findAll();
    public Ingrediente findById(Long id);
    public Ingrediente save(Ingrediente e);
}
