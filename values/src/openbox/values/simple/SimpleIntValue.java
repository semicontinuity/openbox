package openbox.values.simple;

import openbox.values.IntValue;

/**
 * The simple implementation of IntValue (backed by an int).
 */
@SuppressWarnings({"UnusedDeclaration"})
public class SimpleIntValue implements IntValue {

    protected int value;

    public SimpleIntValue() { }

    public SimpleIntValue(final int value) { this.value = value; }

    @Override
    public int get() { return value; }

    @Override
    public void put(final int value) { this.value = value; }

    @Override
    public String toString() { return String.valueOf(value); }
}
