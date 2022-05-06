package test.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import test.dao.KpacDao;
import test.model.Kpac;
import test.service.KpacService;

@Service
public class KpacServiceImpl implements KpacService {
    private final KpacDao kpacDao;

    public KpacServiceImpl(KpacDao kpacDao) {
        this.kpacDao = kpacDao;
    }

    @Override
    public Kpac add(Kpac kpac) {
        return kpacDao.add(kpac);
    }

    @Override
    public Kpac get(Long id) {
        return kpacDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get K-PAC by id: " + id));
    }

    @Override
    public List<Kpac> getAll() {
        return kpacDao.getAll();
    }

    @Override
    public void delete(Long id) {
        kpacDao.delete(id);
    }
}
