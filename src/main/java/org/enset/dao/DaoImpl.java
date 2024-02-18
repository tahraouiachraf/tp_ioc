package org.enset.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        double temp = Math.round(Math.random()*40);
        return temp;
    }
}
