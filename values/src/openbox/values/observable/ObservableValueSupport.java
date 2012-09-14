package openbox.values.observable;

import openbox.values.ObservableValue;
import openbox.values.ValueObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class ObservableValueSupport<Source> implements ObservableValue<Source> {

    protected final List<ValueObserver<Source>> listeners = new ArrayList<>();


    @Override
    @SuppressWarnings({"UnusedDeclaration"})
    public void addListener(final ValueObserver<Source> listener) { listeners.add(listener); }

    @Override
    @SuppressWarnings({"UnusedDeclaration"})
    public void removeListener(final ValueObserver<Source> listener) { listeners.remove(listener); }


    protected void fireValueChanged(final Source source) {
        for (int i = 0; i < listeners.size(); i++) {
            //noinspection unchecked
            listeners.get(i).valueChanged(source);
        }
    }
}
