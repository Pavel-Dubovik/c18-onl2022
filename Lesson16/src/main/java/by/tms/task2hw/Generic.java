package by.tms.task2hw;

import java.io.Serializable;

public class Generic<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public Generic(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public String printClassName() {
        return String.format("%s\n%s\n%s", t.getClass().getName(), v.getClass().getName(), k.getClass().getName());
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}
