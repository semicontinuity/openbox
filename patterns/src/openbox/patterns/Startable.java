package openbox.patterns;

public interface Startable<E extends Exception> {
    void start() throws E;
}
