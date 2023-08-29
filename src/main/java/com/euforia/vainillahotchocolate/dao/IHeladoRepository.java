package com.euforia.vainillahotchocolate.dao;

import com.euforia.vainillahotchocolate.models.Helado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHeladoRepository extends JpaRepository<Helado,Long> {
}
