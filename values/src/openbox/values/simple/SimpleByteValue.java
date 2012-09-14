package openbox.values.simple;

import openbox.values.ByteValue;

/**
 * The simple implementation of ByteValue (backed by a byte).
 */
@SuppressWarnings({"UnusedDeclaration"})
public class SimpleByteValue implements ByteValue {

    protected byte value;

    public SimpleByteValue() { }

    public SimpleByteValue(final byte value) { this.value = value; }

    @Override
    public byte get() { return value; }

    @Override
    public void put(final byte value) { this.value = value; }

    @Override
    public String toString() { return String.valueOf(value); }
}