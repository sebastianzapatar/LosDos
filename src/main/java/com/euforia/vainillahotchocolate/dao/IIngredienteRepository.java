package com.euforia.vainillahotchocolate.dao;


import com.euforia.vainillahotchocolate.models.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IIngredienteRepository extends JpaRepository<Ingrediente,Long> {

    List<Ingrediente> findByHeladoId(Long heladoId);
}
