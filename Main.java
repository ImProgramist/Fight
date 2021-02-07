import java.util.Scanner;

public class Main {
    private static Object tn1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуй путник, ты прибыл на бои у тебя есть выбор и 3 классов \n1)Tank\n2)Health\n3)Damage");
        int player = sc.nextInt();
        if (player == 1) {
            System.out.println("Выбери героя за которого хочешь играть\n1)Райнхард\n2)Tiny\n3)Голем");
            FightTank();
        } else if (player == 2) {
            System.out.println("Выбери героя за которого хочешь играть\n1)Урса\n2)Артур\n3)Bob");
            FightHealth();
        }
        else if (player == 2) {
            System.out.println("Выбери героя за которого хочешь играть\n1)Кобр\n2)Зилонг\n3)Роберт");
            FightDamage();
        }
    }
        public static void FightTank () {
            Scanner sc = new Scanner(System.in);
            int player = sc.nextInt();
            if (player == 1) {
                Tank tn = new Tank(1000, 75, 25, 60, 100, "Райнхард", 5, 250);
            } else if (player == 2) {
                Tank tn = new Tank(900, 95, 30, 50, 100, "Tiny", 7, 350);
            } else if (player == 3) {
                Tank tn = new Tank(1200, 65, 20, 60, 100, "Голем", 3, 150);
            }
        }

    public static void FightHealth() {
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        if (player == 1) {
            Health tn = new Health(700, 100, 35, 50, 100, "Урса", 100, 200);
        } else if (player == 2) {
            Health tn = new Health(750, 80, 40, 30, 100, "Артур", 80, 180);
        } else if (player == 3) {
            Health tn = new Health(850, 65, 45, 55, 100, "Bob", 60, 250);
        }
    }
    public static void FightDamage() {
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        if (player == 1) {
            Damage tn = new Damage(600, 120, 60, 65, 100, "Кобр", 100, 10);
        } else if (player == 2) {
            Damage tn = new Damage(550, 150, 50, 60, 100, "Зилонг", 80, 8);
        } else if (player == 3) {
            Damage tn = new Damage(700, 130, 45, 75, 100, "Роберт", 90, 9);
        }
    }


}
