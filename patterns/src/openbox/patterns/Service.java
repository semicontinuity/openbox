package openbox.patterns;

public interface Service<E extends Exception> extends Startable<E>, Stoppable<E> {
}
