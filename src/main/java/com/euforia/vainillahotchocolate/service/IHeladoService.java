package com.euforia.vainillahotchocolate.service;

import com.euforia.vainillahotchocolate.models.Helado;

import java.util.List;

public interface IHeladoService {
    public List<Helado> findAll();
    public Helado findById(Long id);
    public Helado save(Helado e);
}
