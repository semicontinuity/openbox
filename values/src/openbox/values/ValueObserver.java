package openbox.values;

public interface ValueObserver<Source> {
    void valueChanged(Source source);
}
