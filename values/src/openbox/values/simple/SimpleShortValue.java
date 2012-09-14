package openbox.values.simple;

import openbox.values.ShortValue;

/**
 * The simple implementation of ShortValue (backed by a short).
 */
@SuppressWarnings({"UnusedDeclaration"})
public class SimpleShortValue implements ShortValue {

    protected short value;

    public SimpleShortValue() { }

    public SimpleShortValue(final byte value) { this.value = value; }

    @Override
    public short get() { return value; }

    @Override
    public void put(final short value) { this.value = value; }

    @Override
    public String toString() { return String.valueOf(value); }
}