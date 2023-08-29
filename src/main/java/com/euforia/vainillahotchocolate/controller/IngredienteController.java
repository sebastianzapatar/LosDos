package com.euforia.vainillahotchocolate.controller;

import com.euforia.vainillahotchocolate.models.Ingrediente;
import com.euforia.vainillahotchocolate.service.IIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {
    @Autowired
    private IIngredienteService is;

    @GetMapping("/listar/{id}")
    public List<Ingrediente> list(){
        return is.findAll();
    }
    @GetMapping("/listar/helado/{id}")
    public List<Ingrediente> listIngre(@PathVariable Long id){
        return is.findByHeladoId(id);
    }
    @PostMapping("/list")
    public Ingrediente save(@RequestBody Ingrediente e){
        return is.save(e);
    }

}
