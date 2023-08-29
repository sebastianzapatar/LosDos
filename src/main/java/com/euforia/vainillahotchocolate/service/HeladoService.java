package com.euforia.vainillahotchocolate.service;

import com.euforia.vainillahotchocolate.dao.IHeladoRepository;
import com.euforia.vainillahotchocolate.models.Helado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeladoService implements IHeladoService{
    @Autowired
    private IHeladoRepository hr;

    @Override
    public List<Helado> findAll() {
        return hr.findAll();
    }

    @Override
    public Helado findById(Long id) {
        return hr.findById(id).orElse(null);
    }

    @Override
    public Helado save(Helado e) {
        return hr.save(e);
    }
}
