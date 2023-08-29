package com.euforia.vainillahotchocolate.service;

import com.euforia.vainillahotchocolate.models.Helado;
import com.euforia.vainillahotchocolate.models.Ingrediente;

import java.util.List;
public interface IHeladoService {
    public List<Helado> getAllHelados();
    public Helado getById(Long id);
    public Helado save(Helado e);

}
