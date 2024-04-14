package XO;

import java.util.Scanner;

class GameLogic {

    void run() {
        Scanner p1 = new Scanner(System.in);
        System.out.print("Хочешь играть? y/n ");
        String chose=p1.nextLine();
        if (chose.equals("y")){
            Field fl = new Field();

            System.out.print("1 ход. Ход крестиков: ");
            fl.setP1(p1.nextInt());
            Scanner p2 = new Scanner(System.in);
            fl.bol = true;
            while (fl.bol) {
                System.out.print("2 ход. Ход ноликов: ");
                fl.setP2(p2.nextInt());
            }
            fl.bol = true;
            while (fl.bol) {
                System.out.print("3 ход. Ход крестиков: ");
                fl.setP1(p1.nextInt());
            }
            fl.bol = true;
            while (fl.bol) {
                System.out.print("4 ход. Ход ноликов: ");
                fl.setP2(p2.nextInt());
            }
            fl.bol = true;
            while (fl.bol) {
                System.out.print("5 ход. Ход крестиков: ");
                fl.setP1(p1.nextInt());
            }
            fl.bol = true;
            fl.win();
            while (fl.bol) {
                System.out.print("6 ход. Ход крестиков: ");
                fl.setP2(p1.nextInt());
            }
            fl.bol = true;
            fl.win();
            while (fl.bol) {
                System.out.print("7 ход. Ход крестиков: ");
                fl.setP1(p1.nextInt());
            }
            fl.bol = true;
            fl.win();
            while (fl.bol) {
                System.out.print("8 ход. Ход крестиков: ");
                fl.setP2(p1.nextInt());
            }
            fl.bol = true;
            fl.win();
            while (fl.bol) {
                System.out.print("9 ход. Ход крестиков: ");
                fl.setP1(p1.nextInt());
            }
            fl.bol = true;
            fl.win();
            System.out.println("Ходы кончились...");
        }
        else if (chose.equals("n")) System.out.println("Выход из игры");
        else System.out.println("Ошибка");
    }
    public static void main(String[] args) {
    }
}