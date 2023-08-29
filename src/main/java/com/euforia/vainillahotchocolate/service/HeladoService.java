package com.euforia.vainillahotchocolate.service;

import com.euforia.vainillahotchocolate.models.Helado;
import com.euforia.vainillahotchocolate.models.Ingrediente;
import com.euforia.vainillahotchocolate.repository.IHeladoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeladoService implements IHeladoService{
    @Autowired
    private IHeladoRepository heladoRepository;
    @Override
    public List<Helado> getAllHelados() {
        return heladoRepository.findAll();
    }

    @Override
    public Helado getById(Long id) {
        return heladoRepository.findById(id).orElse(null);
    }

    @Override
    public Helado save(Helado e) {
        return heladoRepository.save(e);
    }


}
