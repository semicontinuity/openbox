package openbox.patterns;

public interface Marshallable<T,E extends Exception> {
    void marshal(T receiver) throws E;
}
