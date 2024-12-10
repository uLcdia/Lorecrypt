import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String inputCommand = this.scanner.nextLine();

            if (inputCommand.equals("add")) {
                this.add();
            } else if (inputCommand.equals("list")) {
                this.list();
            } else if (inputCommand.equals("remove")) {
                this.remove();
            } else if (inputCommand.equals("stop")) {
                break;
            }
        }
    }

    private void add() {
        System.out.print("To add: ");
        String inputAdd = scanner.nextLine();
        this.todoList.add(inputAdd);
    }

    private void list() {
        this.todoList.print();
    }

    private void remove() {
        System.out.print("Which one is removed? ");
        int inputRemove = Integer.parseInt(scanner.nextLine());
        this.todoList.remove(inputRemove);
    }
}
