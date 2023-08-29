package com.euforia.vainillahotchocolate.controller;


import com.euforia.vainillahotchocolate.models.Helado;
import com.euforia.vainillahotchocolate.models.Ingrediente;
import com.euforia.vainillahotchocolate.repository.IIngredienteRepository;
import com.euforia.vainillahotchocolate.service.IIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {
    @Autowired
    private IIngredienteService ingredienteService;
    @Autowired
    private IIngredienteRepository ingredienteRepository;
    @GetMapping("/ingrediente")
    public List<Ingrediente> listaIngredientes(){
        return ingredienteService.findAll();
    }
    @GetMapping("/ingrediente/{id}")
    public Ingrediente uno(@PathVariable Long id){
        return ingredienteService.findById(id);
    }
    @PostMapping("/ingrediente/")
    public Ingrediente guardar(@RequestBody Ingrediente e){
        return ingredienteService.save(e);
    }
    @GetMapping("/ingrediente/helado/{id}")
    public List <Ingrediente> listaIngredientesHelado(@PathVariable Long id){
        return ingredienteRepository.findByHeladoId(id);
    }
}
