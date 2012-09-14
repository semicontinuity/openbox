package openbox.values.delegating;

import openbox.values.LongValue;

public class DelegatingLongValue extends DelegatingValue<LongValue> implements LongValue {

    @Override
    public long get() { return delegate.get(); }

    @Override
    public void put(final long value) { delegate.put(value); }
}
