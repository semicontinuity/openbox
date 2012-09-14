package openbox.patterns;

public interface Stoppable<E extends Exception> {
    void stop() throws E;
}
