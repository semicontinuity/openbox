package openbox.values.delegating;

import openbox.values.ByteValue;

@SuppressWarnings({"UnusedDeclaration"})
public class DelegatingByteValue extends AbstractDelegatingValue<ByteValue> implements ByteValue {

    @Override
    public byte get() { return delegate.get(); }

    @Override
    public void put(final byte value) { delegate.put(value); }
}