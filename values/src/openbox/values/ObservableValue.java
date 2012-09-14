package openbox.values;

/**
 * Observable value.
 * @param <Source> the type of the objects that is the 'source' of change events related to this value
 * (may be different from the type of the value itself)
 */
public interface ObservableValue<Source> {

    @SuppressWarnings({"UnusedDeclaration"})
    void addListener(ValueObserver<Source> listener);

    @SuppressWarnings({"UnusedDeclaration"})
    void removeListener(ValueObserver<Source> listener);
}
