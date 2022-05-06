package test.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import test.dao.AbstractDao;
import test.dao.KpacSetDao;
import test.model.KpacSet;

@Repository
public class KpacSetDaoImpl extends AbstractDao<KpacSet> implements KpacSetDao {
    protected KpacSetDaoImpl(SessionFactory factory) {
        super(factory, KpacSet.class);
    }
}
