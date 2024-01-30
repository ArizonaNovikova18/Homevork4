public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
       int age = 12;
       if (age >= 18) {
           System.out.println("Если возраст человека равен " +  age + ", то он совершеннолетний");
       }
       else {
           System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
       }
       System.out.println("Задание 2");
       int temperature = 2;
       if (temperature < 5) {
           System.out.println("На улице " + temperature + " градусов, нужно надеть шапку!");
       }
       else {
           System.out.println("На улице " + temperature + " градусов, можно идти без шапки!");
       }
       System.out.println("Задание 3");
       int speed = 70;
       if (speed > 60) {
           System.out.println("Если скорость " + speed + " то, придется заплатить штраф!");
       }
       else {
           System.out.println("Если скорость " + speed + " то, можно ездить спокойно!");
       }
       System.out.println("Задание 4");
       int person = 18;
       if (person >= 2 && person <= 6) {
           System.out.println("Если возраст человека равен " + person + " то, ему нужно ходить в детский сад");
       }
       else {
           if (person >= 7 && person <= 17) {
               System.out.println("Если возраст человека равен " + person + " то, ему нужно ходить в школу");
       }
        else {
               if (person >= 18 && person <= 24) {
                       System.out.println("Если возраст человека равен " + person + " то, ему нужно ходить в университет");
           }
        }

            if (person >= 24) {
                System.out.println("Если возраст человека равен " + person + " то, ему нужно ходить на работу");
            }

        }
        System.out.println("Задание 5");
        int kid = 12;
        if (kid < 5) {
            System.out.println("Если возраст ребенка равен " + kid + " то, ему нельзя кататься на аттракционе!");
        }
        else {
            if (kid > 5 && kid < 14) {
                System.out.println("Если возраст ребенка равен " + kid + " то, ему можно кататься на аттракционе в сопровождении взрослого. (Без взрослого, кататься нельзя!)");
        }
        if (kid > 14) {
            System.out.println("Если возраст ребенка равен " + kid + " то, ему можно кататься на аттракционе без сопровождения взрослых!");
        }
        System.out.println("Задание 6");
        int human = 150;
        if (human <= 60) {
           System.out.println("В вагоне есть места для сидения");
        }
        else {
        if (human > 60 && human < 120) {
            System.out.println("В вагоне остались только стоячие места");
        }
        }
        if (human > 120){
            System.out.println("Вагон переполнен! Мест нет!!!");
        }
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one + " самое большое число!");
        }
        else {
            if (two > one && two > three) {
                System.out.println(two + " самое большое число!");
            }
            if (three > one && three > two) {
                System.out.println(three + " самое большое число!");
            }
        }
        }

        }
    }
