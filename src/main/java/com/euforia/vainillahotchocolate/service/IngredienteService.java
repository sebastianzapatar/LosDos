package com.euforia.vainillahotchocolate.service;

import com.euforia.vainillahotchocolate.models.Ingrediente;
import com.euforia.vainillahotchocolate.repository.IIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService implements IIngredienteService{
    @Autowired
    private IIngredienteRepository ingredienteRepository;
    @Override
    public List<Ingrediente> findAll() {
        return ingredienteRepository.findAll();
    }

    @Override
    public Ingrediente findById(Long id) {
        return ingredienteRepository.findById(id).orElse(null);
    }

    @Override
    public Ingrediente save(Ingrediente e) {
        return ingredienteRepository.save(e);
    }
}
