package exam1;

/** 
 * I'm not going to do any kind of input validation, as it is not
 * required at all. This is more of a logical exercise.
 * 
 * Constructor makes sure capacity is not negative, and attributes are
 * private. Only way to change occupiedSpaces is through park() and leave() methods
 * which will verify the numbers make sense.
 */

public class Parking {
    private final int capacity;
    private int occupiedSpaces;

    public Parking(int capacity) {
        if (capacity < 0) { throw new IllegalArgumentException("Capacity cannot be negative"); }
        this.capacity = capacity;
        this.occupiedSpaces = 0;
    }

    public boolean park() {
        if (this.occupiedSpaces < this.capacity) {
            this.occupiedSpaces++;
            return true;
        }
        return false;
    }

    public boolean leave() {
        if (this.occupiedSpaces > 0) {
            this.occupiedSpaces--;
            return true;
        }
        return false;
    }

    public int getFreeSpaces() {
        return this.capacity - this.occupiedSpaces;
    }

}
    