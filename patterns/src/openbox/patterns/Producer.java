package openbox.patterns;

@SuppressWarnings({"UnusedDeclaration"})
public interface Producer<T,Ex extends Exception> {

    T get() throws Ex;
}