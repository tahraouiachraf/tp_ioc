package org.enset.service.impl;

import org.enset.dao.IDao;
import org.enset.service.facade.IMetier;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
