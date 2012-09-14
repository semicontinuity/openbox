package openbox.values.observable;

import openbox.values.ByteValue;

@SuppressWarnings({"UnusedDeclaration"})
public class ObservableByteValue extends ObservableValueSupport implements ByteValue {

    protected byte value;

    @Override
    public byte get() { return value; }

    @Override
    public void put(final byte value) { this.value = value; }
}