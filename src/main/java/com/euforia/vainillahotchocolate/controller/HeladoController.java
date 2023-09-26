package com.euforia.vainillahotchocolate.controller;

import com.euforia.vainillahotchocolate.models.Helado;
import com.euforia.vainillahotchocolate.models.Ingrediente;
import com.euforia.vainillahotchocolate.service.IHeladoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/helado")
public class HeladoController {
    @Autowired
    private IHeladoService heladoService;

    @GetMapping("/helado")
    public List<Helado> findAll(){
        return heladoService.getAllHelados();
    }
    @GetMapping("/helado/{id}")
    public Helado findByid(@PathVariable Long id){
        return heladoService.getById(id);
    }
    @PostMapping("/helado")
    public Helado guardar(@RequestBody Helado e){
        return heladoService.save(e);
    }
    @PutMapping("/helado/{id}")
    public Helado editar(@PathVariable Long id, @RequestBody Helado e){
        Helado actual=heladoService.getById(id);
        if(actual!=null){
            actual.setNombre(e.getNombre());
            actual.setPrecio(e.getPrecio());
        }
        return heladoService.save(actual);
    }

}
