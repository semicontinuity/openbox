package openbox.values;

public interface ObjectValue<T> extends Value {

    T get();

    void put(T value);
}
