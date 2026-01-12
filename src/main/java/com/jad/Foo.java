package com.jad;

import java.util.ArrayList;
import java.util.List;

import com.jad.Grault;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.qux = new Qux();
        this.graults = new ArrayList<>();
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault() {
        Grault grault = new Grault(this);
        this.graults.add(grault);
    }

    // Getters
    public Bar getBar() {
        return bar;
    }
    public List<Baz> getBazs() {
        return bazs;
    }
    public Qux getQux() {
        return qux;
    }
    public Corge getCorge() {
        return corge;
    }
    public List<Grault> getGraults() {
        return graults;
    }

    // Setters
    public void setCorge(Corge corge) {
        if (this.corge != null) {
            this.corge.setFoo(null);
        }
        this.corge = corge;
        corge.setFoo(this);
    }
}
