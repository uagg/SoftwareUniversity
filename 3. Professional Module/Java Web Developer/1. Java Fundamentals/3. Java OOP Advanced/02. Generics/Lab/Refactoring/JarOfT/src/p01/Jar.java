package p01;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<Pickle> {
    Deque<Pickle> jar;

    public Jar() {
        this.jar = new ArrayDeque<>();
    }

    public void add(Pickle pickle) {
        this.jar.push(pickle);
    }

    public Pickle remove() {

        return this.jar.pop();
    }
}
