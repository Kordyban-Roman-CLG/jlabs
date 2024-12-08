package lab_6;

public class Main {
    static void clear(boolean absolute) {
        if (absolute) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } else {
            System.out.print("\n\n\n");
        }
    }

    public static void main(String[] args) {
        clear(true);
        task_1.main();
        clear(false);
        task_2.main();
    }
}