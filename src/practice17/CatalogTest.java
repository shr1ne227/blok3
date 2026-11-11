package practice17;

import java.util.Scanner;

public class CatalogTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Односвязный  2. Двусвязный  3. Кольцевой");
        int type = scanner.nextInt();
        scanner.nextLine();
        StudentList list;
        if (type == 1) {
            list = new SinglyList();
        } else if (type == 2) {
            list = new DoublyList();
        } else if (type == 3) {
            list = new CircularList();
        } else {
            System.out.println("Неизвестный тип списка");
            return;
        }

        int action = -1;
        while (action != 0) {
            System.out.println("1. Создать пустой  2. Добавить  3. Удалить");
            System.out.println("4. Вывести  5. Очистить  6. Проверить пустоту  0. Выйти");
            action = scanner.nextInt();
            scanner.nextLine();
            if (action == 1 || action == 5) {
                list.clear();
                System.out.println("Список пуст");
            } else if (action == 2) {
                StudentNode node = new StudentNode();
                node.read(scanner);
                list.add(node);
            } else if (action == 3 || action == 4) {
                System.out.print("Номер элемента (с 1): ");
                int position = scanner.nextInt();
                scanner.nextLine();
                boolean found;
                if (action == 3) {
                    found = list.remove(position);
                } else {
                    found = list.print(position);
                }
                if (!found) {
                    System.out.println("Элемент не найден");
                }
            } else if (action == 6) {
                System.out.println("Список пуст: " + list.isEmpty());
            } else if (action != 0) {
                System.out.println("Неизвестная команда");
            }
        }
    }
}
