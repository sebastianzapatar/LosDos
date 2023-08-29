package com.euforia.vainillahotchocolate.service;

import com.euforia.vainillahotchocolate.models.Ingrediente;

import java.util.List;

public interface IIngredienteService {
    public List<Ingrediente> findAll();
    public List<Ingrediente> findByHeladoId(Long heladoId);

    public Ingrediente save(Ingrediente e);

    public Ingrediente findById(Long id);
}
