package lab311;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //герои
        Heroes Ia = new Heroes("Иа-Иа");
        Heroes Svinya = new Heroes("Пятачок");
        Heroes They = new Heroes("Они");
        //предметы
        Inventory Pot = new Inventory("горшок");
        Inventory Balloon = new Inventory("шарик");
        Inventory Teeth = new Inventory("зубы");
        //мамми
        MamaKenga MamaKenga = new MamaKenga();

        Dop reverse;
        reverse = () -> "обратно.";

        Dop then;
        then = () -> "потом";

        Dop he;
        he = () -> "он";

        Dop where;
        where = () -> "откуда ";

        Dop suddenly;
        suddenly = () -> ", но вдруг ";

        Dop wasVisible;
        wasVisible = () -> "Было видно, что ";


        INobody nobody = new INobody() {
            @Override
            public String dontThink() {
                return "Никто не знал, ";
            }
        };



        System.out.println(Ia.saw(Pot) + ",");
        System.out.println(Ia.perkUp() + ".");
        Svinya.setCondition(Conditions.SAD);
        System.out.println(Svinya.turnToAt() + ".");
        Ia.setCondition(Conditions.FORMER);
        System.out.println(Ia.catched(Balloon) + " в " + Teeth.getName() + " и ");
        Ia.setCondition(Conditions.CAUTIOUSLY);
        System.out.println(Ia.layed(Balloon) + " в " + Pot.getName() + ", ");
        Ia.setCondition(Conditions.NORMAL);
        System.out.println("потом " + Ia.pulled(Balloon) + " и " + Ia.layed(Balloon) + Ia.layedOn() + ",");
        Ia.setCondition(Conditions.CAUTIOUSLY);
        System.out.println("a потом " + Ia.pickedUp(Balloon) + reverse.addText());
        Ia.dontSee();
        System.out.println(Ia.beingBisy());
        Ia.layedIn();
        Ia.setCondition(Conditions.ABSHAPPY);
        System.out.println(Ia.tookOut() + reverse.addText());
        System.out.println(wasVisible.addText() + Ia.beHappy());
        System.out.println(nobody.dontThink() + where.addText() + They.arised() + suddenly.addText() + They.comeToBe() + MamaKenga.message());

    }

}

