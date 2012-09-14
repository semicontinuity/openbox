package openbox.values.delegating;

import openbox.values.ObjectValue;

public class DelegatingObjectValue<T> extends DelegatingValue<ObjectValue<T>> implements ObjectValue<T> {

    @Override
    public T get() { return delegate.get(); }

    @Override
    public void put(final T value) { delegate.put(value); }
}
