package org.enset.ext;

import org.enset.dao.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        return 90;
    }
}
