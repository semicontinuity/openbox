package openbox.values.observable;

import openbox.values.IntValue;

@SuppressWarnings({"UnusedDeclaration"})
public class ObservableIntValue extends ObservableValueSupport implements IntValue {

    protected int value;

    @Override
    public int get() { return value; }

    @Override
    public void put(final int value) { this.value = value; }
}
