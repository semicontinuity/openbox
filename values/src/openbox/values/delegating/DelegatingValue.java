package openbox.values.delegating;

import openbox.values.Value;

public abstract class DelegatingValue<T extends Value> implements Value {
    protected T delegate;

    public void delegateTo(final T delegate) { this.delegate = delegate; }
}
