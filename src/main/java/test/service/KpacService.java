package test.service;

import java.util.List;
import test.model.Kpac;

public interface KpacService {
    Kpac add(Kpac kpac);

    Kpac get(Long id);

    List<Kpac> getAll();

    void delete(Long id);
}
