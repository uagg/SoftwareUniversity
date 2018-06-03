import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {

    private final class ListNode<T> {

        private T value;

        private ListNode<T> nextNode;
        private ListNode<T> prevNode;

        private ListNode(T value) {
            this.value = value;
        }
    }

    private ListNode<T> head;
    private ListNode<T> tail;

    private int count;

    public CustomLinkedList() {
        this.count = 0;
    }

    public void add(T element) {
        if (this.count == 0) {
            this.head = new ListNode<>(element);
            this.head.nextNode = this.tail;
        } else {
            ListNode<T> newTail = new ListNode<>(element);
            if (this.tail == null) {
                this.tail = newTail;
                this.tail.prevNode = this.head;
                this.head.nextNode = this.tail;
            } else {
                newTail.prevNode = this.tail;
                this.tail.nextNode = newTail;
                this.tail = newTail;
            }
        }
        this.count++;
    }

    public boolean remove(T element) {

        int targetHash = element.hashCode();
        int headHash = this.head.value.hashCode();

        if (headHash == targetHash) {
            this.head = this.head.nextNode;
            count--;
            return true;
        }

        ListNode<T> currentNode = this.head;
        while (true) {
            int currentHash = currentNode.value.hashCode();

            if (currentHash == targetHash) {
                ListNode<T> left = currentNode.prevNode;
                ListNode<T> right = currentNode.nextNode;

                if (left != null) {
                    left.nextNode = right;
                }
                if (right != null) {
                    right.prevNode = left;
                }

                this.count--;
                return true;
            }

            if (currentNode.nextNode == null) {
                break;
            }

            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public int getSize() {
        return this.count;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private final class CustomIterator implements Iterator<T> {

        private ListNode<T> currentElement = head;

        @Override
        public boolean hasNext() {
            return currentElement != null;
        }

        @Override
        public T next() {
            T toReturn = currentElement.value;
            currentElement = currentElement.nextNode;
            return toReturn;
        }
    }
}