package practice17;

class CircularList implements StudentList {
    private StudentNode head;
    private StudentNode tail;

    private StudentNode find(int position) {
        if (position < 1 || isEmpty()) {
            return null;
        }
        StudentNode current = head;
        for (int i = 1; i < position; i++) {
            if (current.next == head) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    @Override
    public void add(StudentNode node) {
        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        tail.next = head;
    }

    @Override
    public boolean remove(int position) {
        StudentNode current = find(position);
        if (current == null) {
            return false;
        }
        if (head == tail) {
            clear();
            return true;
        }
        StudentNode previous = find(position - 1);
        if (current == head) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
        if (current == tail) {
            tail = previous;
        }
        tail.next = head;
        return true;
    }

    @Override
    public boolean print(int position) {
        StudentNode node = find(position);
        if (node == null) {
            return false;
        }
        node.print();
        return true;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
