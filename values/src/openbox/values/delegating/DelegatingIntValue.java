package openbox.values.delegating;

import openbox.values.IntValue;

@SuppressWarnings({"UnusedDeclaration"})
public class DelegatingIntValue extends DelegatingValue<IntValue> implements IntValue {

    @Override
    public int get() { return delegate.get(); }

    @Override
    public void put(final int value) { delegate.put(value); }
}