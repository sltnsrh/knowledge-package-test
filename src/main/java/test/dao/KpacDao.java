package test.dao;

import java.util.List;
import java.util.Optional;
import test.model.Kpac;

public interface KpacDao {
    Kpac add(Kpac kpac);

    Optional<Kpac> get(Long id);

    List<Kpac> getAll();

    void delete(Long id);
}
