package openbox.values.observable;

import openbox.values.ShortValue;

@SuppressWarnings({"UnusedDeclaration"})
public class ObservableShortValue extends ObservableValueSupport implements ShortValue {

    protected short value;

    @Override
    public short get() { return value; }

    @Override
    public void put(final short value) { this.value = value; }
}