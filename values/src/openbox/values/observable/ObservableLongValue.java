package openbox.values.observable;

import openbox.values.LongValue;

public class ObservableLongValue extends ObservableValueSupport implements LongValue {
    protected long value;

    public long get() {
        return value;
    }

    public void put(long value) {
        this.value = value;
    }
}