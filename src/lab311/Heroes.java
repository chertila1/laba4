package lab311;
import java.io.PrintStream;
import java.util.Scanner;

public class Heroes extends AHeroes {
    Heroes(String name) {

        this.name = name;
    }

    public String saw(Inventory inventory) {

        return name + " увидел " + inventory.getName();
    }

    public String perkUp() {

        return name + " оживился";
    }

    public String turnToAt() {
        if (condition == Conditions.SAD) {
            return name + " грустно оглянулся";
        } else {
            return name + " оглянулся";
        }
    }

    public String catched(Inventory inventory) {
        if (condition == Conditions.FORMER) {
            return (name + " схватил бывший " + inventory.getName());
        } else {
            return (name + "схватил" + inventory.getName());
        }
    }

    public String layed(Inventory inventory) {
        if (condition == Conditions.CAUTIOUSLY) {
            return (name + " осторожно положил " + inventory.getName());
        } else {
            return (name + " положил " + inventory.getName());
        }
    }

    public String layedOn() {
        class Ground {
            private String name;
            Ground(String name) {
                this.name = name;
            }
            public String getName() {
                return name;
            }
        }
        Ground ground = new Ground("земля");
        return " положил на " + ground.getName();
    }

    public String pulled(Inventory inventory) {

        return name + " достал " + inventory.getName();
    }

    public String pickedUp(Inventory inventory) {
        return name + " поднял " + inventory.getName();
    }

    public void layedIn() {
        System.out.println("Куда Иа клал шарик? Варианты ответов: 1 - в кастрюлю, 2 - в горшок, 3 - на парашу");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        try {
            if (a.equals("2")) {
                System.out.print(getName() + " то клал его в горшок, ");
            } else {
                throw new WrongAnswerException("Неверный ответ. Передумай.");
            }
        }
        catch (WrongAnswerException e) {
                System.out.println(e.getMessage());
                this.layedIn();
            };
    }

    public void dontSee() {
        System.out.println("Как Иа-Иа отреагировал на Винни Пуха? ");
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        try {
            if (b.equals("Никак") || b.equals("никак") || b.equals("проигнорил") || b.equals("динамо")) {
                System.out.println("Но Иа-Иа ничего не слышал.");
            } else {
                throw new ReactException("Учи матчасть.");
            }
            }
        catch (ReactException e) {
            System.out.println(e.getMessage());
            this.dontSee();
        }
        }

    public String tookOut () {

        return "то вынимал его ";
    }

    public String arised() {
        return name + " взялись";
    }

    public String comeToBe() {
        return name + " очутились здесь, ";
    }

    public String beingBisy() {
        return name + " было не до того.";
    }

    public String beHappy() {
        if (condition == Conditions.ABSHAPPY) {
            return name + " абсолютно счастлив!";
        }
        return "жыжа";
    }

    public static class Pupka{
        public static String beAnxious(){
            return " тревожный";
        }
    }

}

