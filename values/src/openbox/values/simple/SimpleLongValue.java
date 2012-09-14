package openbox.values.simple;

import openbox.values.LongValue;

/**
 * The simple implementation of LongValue (backed by a long).
 */
@SuppressWarnings({"UnusedDeclaration"})
public class SimpleLongValue implements LongValue {

    protected long value;

    public SimpleLongValue() {
    }

    public SimpleLongValue(long value) {
        this.value = value;
    }

    public long get() {
        return value;
    }

    public void put(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}