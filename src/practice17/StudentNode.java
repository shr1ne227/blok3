package practice17;

import java.util.Scanner;

class StudentNode {
    private String name;
    private int age;
    StudentNode next;
    StudentNode prev;

    void read(Scanner scanner) {
        System.out.print("Имя: ");
        name = scanner.nextLine();
        System.out.print("Возраст: ");
        age = scanner.nextInt();
        scanner.nextLine();
    }

    void print() {
        System.out.println(name + ", возраст " + age);
    }
}
