package practice17;

interface StudentList {
    void add(StudentNode node);
    boolean remove(int position);
    boolean print(int position);
    void clear();
    boolean isEmpty();
}
