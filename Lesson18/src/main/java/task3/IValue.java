package task3;

@FunctionalInterface
public interface IValue<T> {
    T getValue(T t);
}
