package openbox.values;

import java.util.ArrayList;

public class MulticastDelegate extends ArrayList<Runnable> implements Runnable {

    public MulticastDelegate(final int size) {
        super(size);
    }

    public MulticastDelegate() {
        super();
    }

    @Override
    public void run() {
        for (int i = 0; i < size(); i++) {
            get(i).run();
        }
    }
}
