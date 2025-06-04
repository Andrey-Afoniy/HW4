public class Main {
    public static void main(String[] args) {
        System.out.println("1 Задание");
        byte age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("2 Задание");
        byte temp = 6;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        System.out.println("3 Задание");
        byte speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то,придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то,можно ездить спокойно");
        }

        System.out.println("4 Задание");
        byte age1 = 25;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то его место в университете");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему пора ходить на работу");
        }

        System.out.println("5 Задание");
        byte age2 = 7;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нельзя кататься на аттракционе");
        } else if (age2 >= 5 && age2 <= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему  можно кататься на аттракционе в сопровождении взрослого");
        } else if (age2 > 14) {
            System.out.println("Если возраст человека равен " + age2 + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("6 Задание");
        int places = 102;
        int seating = 60;
        int people = 85;
        if (people < seating ) {
            System.out.println("В вагоне есть сидячие места");
        }
        else  if (people >= seating  && people < places) {
            System.out.println("В вагоне нет сидячих мест, но есть стоячие места");
        }
        else if (people >= places){
            System.out.println("В вагоне нет мест");
        }

        System.out.println("7 Задание");
        int one = 98;
        int two = 1;
        int three = 100;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }

    }
}