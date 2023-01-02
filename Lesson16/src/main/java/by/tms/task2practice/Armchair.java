package by.tms.task2practice;

import lombok.Getter;

@Getter
public class Armchair<T extends Frame, V extends Material, K extends Leg> {
    private T frame;
    private V material;
    private K leg;

    public Armchair(T frame, V material, K leg) {
        this.frame = frame;
        this.material = material;
        this.leg = leg;
    }

    public String printClassName() {
        return String.format("%s\n%s\n%s", frame.getClass().getName(), material.getClass().getName(), leg.getClass().getName());
    }

    public T getFrame() {
        return frame;
    }

    public V getMaterial() {
        return material;
    }

    public K getLeg() {
        return leg;
    }
}
