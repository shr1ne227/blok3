package practice17;

class SinglyList implements StudentList {
    private StudentNode head;

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
            return;
        }
        StudentNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
    }

    @Override
    public boolean remove(int position) {
        StudentNode current = find(position);
        if (current == null) {
            return false;
        }
        StudentNode previous = find(position - 1);
        if (current == head) {
            head = current.next;
        } else {
            previous.next = current.next;
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

    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
