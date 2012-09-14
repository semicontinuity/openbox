package openbox.patterns;

import java.io.Serializable;

public interface Identifiable<I extends Comparable<I> & Serializable> {
    I getId();
    void setId(I id);
}
