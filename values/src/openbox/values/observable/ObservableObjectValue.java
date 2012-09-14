package openbox.values.observable;

import openbox.values.ObjectValue;

/**
 * Observable object value.
 * @param <Source> the type of the objects that is the 'source' of change events related to this value
 * @param <T> the type of the value
 */
public class ObservableObjectValue<Source,T>
    extends ObservableValueSupport<Source> implements ObjectValue<T> {

    protected T value;

    @Override
    public T get() { return value; }

    @Override
    public void put(final T value) { this.value = value; }
}