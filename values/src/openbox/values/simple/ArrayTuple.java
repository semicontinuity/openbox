package openbox.values.simple;

import openbox.values.Tuple;

public class ArrayTuple<E> implements Tuple {
    private E[] value;

    @SafeVarargs
    public ArrayTuple(final E... value) {
        this.value = value;
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public E get(int index) {
        return value[index];
    }
}
