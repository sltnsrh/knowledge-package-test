package test.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import test.dao.AbstractDao;
import test.dao.KpacDao;
import test.model.Kpac;

@Repository
public class KpacDaoImpl extends AbstractDao<Kpac> implements KpacDao {
    protected KpacDaoImpl(SessionFactory factory) {
        super(factory, Kpac.class);
    }
}
