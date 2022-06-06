package org.example.package1;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("A test battle for a text-based RPG game.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println();
        System.out.println("Choose your class by typing a corresponding letter.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("A. Knight");
        System.out.println("B. Archer");
        System.out.println("C. Mage");
        TimeUnit.SECONDS.sleep(1);

        Scanner scanner = new Scanner(System.in);
        String cls = null;
        String name = null;
        String weapon = null;
        int hp = 0, mp = 0, stamina = 0;
        int enm = 0;
        boolean input;
        Character character = null;

        String choice;

        do {
            System.out.print("Your class: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "A", "a" -> {
                    System.out.println("You chose a knight.");
                    cls = "Knight";

                    TimeUnit.SECONDS.sleep(1);

                    name = inputYesNo("Choose a name for your character: ",
                            "Do you want to keep that name? [y/n] ");

                    character = new Character(cls, name, weapon);

                    hp = 15;
                    mp = 0;
                    stamina = 15;

                    input = true;
                }
                case "B", "b" -> {
                    System.out.println("You chose an archer.");
                    cls = "Archer";

                    TimeUnit.SECONDS.sleep(1);

                    name = inputYesNo("Choose a name for your character: ",
                            "Do you want to keep that name? [y/n] ");

                    character = new Character(cls, name, weapon);

                    hp = 10;
                    mp = 0;
                    stamina = 12;

                    input = true;
                }
                case "C", "c" -> {
                    System.out.println("You chose a mage.");
                    cls = "Mage";

                    TimeUnit.SECONDS.sleep(1);

                    name = inputYesNo("Choose a name for your character: ",
                            "Do you want to keep that name? [y/n] ");

                    character = new Character(cls, name, weapon);

                    hp = 10;
                    mp = 15;
                    stamina = 0;

                    input = true;
                }
                default -> {
                    System.out.println("Error. Try again.");
                    TimeUnit.SECONDS.sleep(1);

                    input = false;
                }
            }
        }
        while (!input);

        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("Now choose your weapon.");
        TimeUnit.MILLISECONDS.sleep(500);

        String weaponChoice;

        switch (cls) {
            case "Knight" -> {
                weaponKnight();
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print("Your weapon: ");

                weaponChoice = scanner.nextLine().toLowerCase();

                boolean loop = true;
                do {
                    if (weaponChoice.equals("a")) {
                        System.out.println("Your weapon is a " + Knight.weapon1);
                        weapon = Knight.weapon1;

                        character.setWeapon(Knight.weapon1);

                        loop = false;
                    } else if (weaponChoice.equals("b")) {
                        System.out.println("Your weapon is a " + Knight.weapon2);
                        weapon = Knight.weapon2;

                        character.setWeapon(Knight.weapon2);

                        loop = false;
                    } else {
                        System.out.println("Please, try again.");
                        TimeUnit.SECONDS.sleep(1);
                    }
                } while (loop);
            }
            case "Archer" -> {
                weaponArcher();
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print("Your weapon: ");

                weaponChoice = scanner.nextLine().toLowerCase();

                boolean loop = true;
                do {
                    if (weaponChoice.equals("a")) {
                        System.out.println("Your weapon is a " + Archer.weapon1);
                        weapon = Archer.weapon1;

                        character.setWeapon(Archer.weapon1);

                        loop = false;
                    } else if (weaponChoice.equals("b")) {
                        System.out.println("Your weapon is a " + Archer.weapon2);
                        weapon = Archer.weapon2;

                        character.setWeapon(Archer.weapon2);

                        loop = false;
                    } else {
                        System.out.println("Please, try again.");
                        TimeUnit.SECONDS.sleep(1);
                    }
                } while (loop);
            }
            case "Mage" -> {
                weaponMage();
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print("Your weapon: ");

                weaponChoice = scanner.nextLine().toLowerCase();

                boolean loop = true;
                do {
                    if (weaponChoice.equals("a")) {
                        System.out.println("Your weapon is a " + Mage.weapon1);
                        weapon = Mage.weapon1;

                        character.setWeapon(Mage.weapon1);

                        loop = false;
                    } else if (weaponChoice.equals("b")) {
                        System.out.println("Your weapon is a " + Mage.weapon2);
                        weapon = Mage.weapon2;

                        character.setWeapon(Mage.weapon2);

                        loop = false;
                    } else {
                        System.out.println("Please, try again.");
                        TimeUnit.SECONDS.sleep(1);
                    }
                } while (loop);
            }
            default -> System.out.println("Error.");
        }
        TimeUnit.SECONDS.sleep(1);

        System.out.println("Your character is now created.");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("Initiating a test battle.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("3...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1...");
        TimeUnit.SECONDS.sleep(1);

        Random random = new Random();
        int hpRatRand = ThreadLocalRandom.current().nextInt(10, 15);
        int hpSpiderRand = ThreadLocalRandom.current().nextInt(8, 13);

        Enemy GiantRat = new Enemy(hpRatRand, 0, 10);
        Enemy GiantSpider = new Enemy(hpSpiderRand, 0, 13);

        if (rand2() == 1) {
            System.out.println("Your enemy is a Giant Rat");

            enm = 1;
        }
        else {
            System.out.println("Your enemy is a Giant Spider");

            enm = 2;
        }

        TimeUnit.SECONDS.sleep(1);
        System.out.println("Your statistics.");
        System.out.println("HP: " + hp);
        System.out.println("MP: " + mp);
        System.out.println("Stamina: " + stamina);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Your enemy's statistics.");
        if (enm == 1) {
            System.out.println("HP: " + hp);
            System.out.println("MP: " + mp);
            System.out.println("Stamina: " + stamina);
        }
        else {
            System.out.println("HP: " + hp);
            System.out.println("MP: " + mp);
            System.out.println("Stamina: " + stamina);
        }

    }

    public static String inputYesNo (String question, String confirmation) {

        String answer;
        String yn;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(question);
            answer = input.next();

            System.out.print(confirmation);
            yn = input.next().toLowerCase();
        } while (yn.equals("n"));

        return answer;
    }

    public static int rand2 () {
        Random random = new Random();
        return random.nextInt(2) + 1;
    }
    public static int rand3 () {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
    public static int rand4 () {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }

    public static void weaponMage() {
        System.out.println("A. " + Mage.weapon1);
        System.out.println("B. " + Mage.weapon2);
    }

    public static void weaponArcher() {
        System.out.println("A. " + Archer.weapon1);
        System.out.println("B. " + Archer.weapon2);
    }

    public static void weaponKnight() {
        System.out.println("A. " + Knight.weapon1);
        System.out.println("B. " + Knight.weapon2);
    }


}



