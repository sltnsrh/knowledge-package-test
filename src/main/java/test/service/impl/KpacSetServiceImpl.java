package test.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import test.dao.KpacSetDao;
import test.model.KpacSet;
import test.service.KpacSetService;

@Service
public class KpacSetServiceImpl implements KpacSetService {
    private final KpacSetDao kpacSetDao;

    public KpacSetServiceImpl(KpacSetDao kpacSetDao) {
        this.kpacSetDao = kpacSetDao;
    }

    @Override
    public KpacSet add(KpacSet kpacSet) {
        return kpacSetDao.add(kpacSet);
    }

    @Override
    public KpacSet get(Long id) {
        return kpacSetDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get K-PAC Set by id: " + id));
    }

    @Override
    public List<KpacSet> getAll() {
        return kpacSetDao.getAll();
    }

    @Override
    public void delete(Long id) {
        kpacSetDao.delete(id);
    }
}
