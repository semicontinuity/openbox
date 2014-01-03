package openbox.values.delegating;

import openbox.values.ShortValue;

@SuppressWarnings({"UnusedDeclaration"})
public class DelegatingShortValue extends AbstractDelegatingValue<ShortValue> implements ShortValue {

    @Override
    public short get() { return delegate.get(); }

    @Override
    public void put(final short value) { delegate.put(value); }
}