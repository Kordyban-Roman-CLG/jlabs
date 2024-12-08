package lab_7;

public class task_1 {

    static class AntWorker extends Thread {
        private double x, y;
        private double startX, startY;
        private double speed;

        public AntWorker(double startX, double startY, double speed) {
            this.x = startX;
            this.y = startY;
            this.startX = startX;
            this.startY = startY;
            this.speed = speed;
        }

        @Override
        public void run() {
            double targetX = 0;
            double targetY = 0;

            while (true) {
                double distanceToTarget = Math.sqrt(Math.pow(targetX - x, 2) + Math.pow(targetY - y, 2));

                if (distanceToTarget < speed) {
                    x = targetX;
                    y = targetY;

                    if (targetX == 0 && targetY == 0) {
                        targetX = startX;
                        targetY = startY;
                    } else {
                        targetX = 0;
                        targetY = 0;
                    }
                } else {
                    double dx = (targetX - x) / distanceToTarget * speed;
                    double dy = (targetY - y) / distanceToTarget * speed;
                    x += dx;
                    y += dy;
                }


                System.out.println("Worker Ant at:\t(" + x + ", " + y + ")");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    static class AntWarrior extends Thread {
        private double x, y;
        private double centerX, centerY;
        private double radius;
        private double speed;
        private double angle;

        public AntWarrior(double centerX, double centerY, double radius, double speed) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.speed = speed;
            this.x = centerX + radius;
            this.y = centerY;
            this.angle = 0;
        }

        @Override
        public void run() {
            while (true) {
                angle += speed / radius;
                x = centerX + radius * Math.cos(angle);
                y = centerY + radius * Math.sin(angle);

                System.out.println("Warrior Ant at:\t\t\t\t(" + x + ", " + y + ")");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main() {
        AntWorker worker = new AntWorker(10, 10, 0.5);
        AntWarrior warrior = new AntWarrior(5, 5, 3, 0.1);

        worker.start();
        warrior.start();
    }
}
/*
    Створити два потоки згідно варіанту.
    1. Мурахи-робочі рухаються в один з кутів області їх проживання (наприклад, [0; 0]) по прямій з швидкістю V, а потім повертатися назад в точку свого народження з тією ж швидкістю.
    2. Мурахи-воїни рухаються по колу з радіусом R зі швидкістю V.
*/