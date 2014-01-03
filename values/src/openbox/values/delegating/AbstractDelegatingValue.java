package openbox.values.delegating;

import openbox.values.DelegatingValue;
import openbox.values.Value;

public abstract class AbstractDelegatingValue<T extends Value> implements DelegatingValue<T> {

    protected T delegate;

    @Override
    public void delegateTo(final Value delegate) {
        assert delegate != null;
        //noinspection unchecked
        this.delegate = (T) delegate;
    }
}
