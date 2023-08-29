package com.euforia.vainillahotchocolate.service;

import com.euforia.vainillahotchocolate.dao.IIngredienteRepository;
import com.euforia.vainillahotchocolate.models.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService implements IIngredienteService{
    @Autowired
    private IIngredienteRepository ir;

    @Override
    public List<Ingrediente> findAll() {
        return ir.findAll();
    }

    @Override
    public List<Ingrediente> findByHeladoId(Long heladoId) {
        return ir.findByHeladoId(heladoId);
    }

    @Override
    public Ingrediente save(Ingrediente e) {
        return ir.save(e);
    }

    @Override
    public Ingrediente findById(Long id) {
        return ir.findById(id).orElse(null);
    }
}
