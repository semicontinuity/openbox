package openbox.values;

public interface Tuple extends Value {

    /**
     * Returns the number of elements in the tuple
     * @return the number of elements in the tuple
     */
    int length();

    /**
     * Returns the specified element of the tuple
     * @param index the index of the tuple element to get.
     * @return the specified element of the tuple
     */
    <T> T get(int index);
}
