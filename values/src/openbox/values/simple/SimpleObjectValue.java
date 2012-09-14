package openbox.values.simple;

import openbox.values.ObjectValue;

/**
 * The simple implementation of ObjectValue.
 */
@SuppressWarnings({"UnusedDeclaration"})
public class SimpleObjectValue<T> implements ObjectValue<T> {

    protected T value;

    public SimpleObjectValue() { }

    public SimpleObjectValue(final T value) { this.value = value; }

    @Override
    public T get() { return value; }

    @Override
    public void put(final T value) { this.value = value; }

    @Override
    public String toString() { return String.valueOf(value); }
}