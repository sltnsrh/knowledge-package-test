package test.dao;

import java.util.List;
import java.util.Optional;
import test.model.KpacSet;

public interface KpacSetDao {
    KpacSet add(KpacSet kpacSet);

    Optional<KpacSet> get(Long id);

    List<KpacSet> getAll();

    void delete(Long id);
}
