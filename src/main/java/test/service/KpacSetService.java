package test.service;

import java.util.List;
import test.model.KpacSet;

public interface KpacSetService {
    KpacSet add(KpacSet kpacSet);

    KpacSet get(Long id);

    List<KpacSet> getAll();

    void delete(Long id);
}
