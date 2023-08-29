package com.euforia.vainillahotchocolate.repository;

import com.euforia.vainillahotchocolate.models.Helado;
import com.euforia.vainillahotchocolate.models.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface IHeladoRepository extends JpaRepository<Helado,Long> {


}
