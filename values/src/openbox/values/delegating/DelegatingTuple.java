package openbox.values.delegating;

import openbox.values.DelegatingValue;
import openbox.values.Tuple;
import openbox.values.Value;

import javax.xml.bind.annotation.XmlElementRef;
import java.util.List;

/**
 * A tuple that delegates storage of its elements to another tuple.
 * @param <E> the type of values of the tuple (must be AbstractDelegatingValue - because of JAXB limitations).
 */
public class DelegatingTuple<E extends AbstractDelegatingValue> implements Tuple, DelegatingValue<Tuple> {

    @XmlElementRef
    protected List<E> values;

    @SuppressWarnings("UnusedDeclaration")
    public DelegatingTuple() {
    }

    public DelegatingTuple(final List<E> values) {
        this.values = values;
    }

    @Override
    public int length() { return values.size(); }

    @Override
    public <TE> TE get(final int index) {
        //noinspection unchecked
        return (TE) values.get(index);
    }

    public void delegateTo(final Tuple tuple) {
        for (int i = 0; i < values.size(); i++) {
            values.get(i).delegateTo(tuple.<Value>get(i));
        }
    }
}
