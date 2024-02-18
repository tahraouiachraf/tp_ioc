package org.enset.presentation;

import org.enset.ext.DaoImpl2;
import org.enset.service.impl.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Result="+metier.calcul());
    }
}
