package lab_1;

public class Main {
    static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clear();
        task_1.main();
    }
}
