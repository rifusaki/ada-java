package pecs;

import java.util.ArrayList;

public class Lists {
    static <T> void copy(ArrayList<? extends T> origin, ArrayList<? super T> dest) {
        for (T i : origin) {
            dest.add(i);
        }
    }
}
