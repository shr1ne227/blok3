package practice17;

class DoublyList implements StudentList {
    private StudentNode head;
    private StudentNode tail;

    private StudentNode find(int position) {
        if (position < 1 || isEmpty()) {
            return null;
        }
        StudentNode current = head;
        for (int i = 1; i < position; i++) {
            if (current.next == null) {
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
            node.prev = tail;
        }
        tail = node;
    }

    @Override
    public boolean remove(int position) {
        StudentNode current = find(position);
        if (current == null) {
            return false;
        }

        if (current.prev == null) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current.next == null) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
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
