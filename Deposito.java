package org.example;

import java.util.ArrayList;

public class Deposito {
    private ArrayList al;

    public Deposito() {
        al = new ArrayList();
    }

    public void addObject(Object x) {
        al.add(x);
    }

    public Object getObject() {
        if (al.size() == 0) {
            return null;
        }
        return al.remove(0);
    }
}
