package openbox.values;

public interface DelegatingValue<T extends Value> extends Value {
    void delegateTo(T delegate);
}
