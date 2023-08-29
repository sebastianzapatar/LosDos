package com.euforia.vainillahotchocolate.controller;

import com.euforia.vainillahotchocolate.models.Helado;
import com.euforia.vainillahotchocolate.service.IHeladoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/helado")
public class HeladoController {
    @Autowired
    private IHeladoService hs;

    @GetMapping("/listar")
    public List<Helado> listar(){
        return hs.findAll();
    }
    @PostMapping("/save")
    public Helado guadar(@RequestBody Helado e){
        return hs.save(e);
    }

    @GetMapping("/listar/{id}")
    public Helado findById(@PathVariable Long id){
        return hs.findById(id);
    }

}
