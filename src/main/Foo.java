package FooBarQuxCorgeGrault_NOUGUE.src.main;

import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo(Bar bar, List<Baz> bazs, Qux qux, Corge corge, List<Grault> graults) {
        this.bar = bar;
        this.bazs = bazs;
        this.qux = qux;
        this.corge = corge;
        this.graults = graults;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault(Grault grault) {
        this.graults.add(grault);
    }
}
