package openbox.patterns;

@SuppressWarnings({"UnusedDeclaration"})
public interface Factory<I,O,E extends Exception> {

    O create(I input) throws E;
}