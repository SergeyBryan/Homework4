//Задание 1
public class Main {
    public static void main(String[] args) {
        byte age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возвраст совершенолетия ещё не наступил");
        }
//Задание 2
        {
            int Age2 = 8;
            if (Age2 >= 7 && Age2 < 18) {
                System.out.println("Ребенок ходит в школу");
            } else if (Age2 >= 18 && Age2 < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else if (Age2 >= 24) {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
            }
        }
//Задание 3
        {int totalTrain = 102;
        int sitChairs = 60;
        int noSitChairs = 42;
        int factChairs = 25;
        int factNoSitChairs = 40;
        if (factChairs >= sitChairs) {
                        System.out.println("Сидячих мест нет");
                    } else {
                        System.out.println("Осталось мест сидячих " + (sitChairs - factChairs));
                    }
                    if (factNoSitChairs >= noSitChairs) {
                        System.out.println("Стоячих мест нет");
                    } else {
                        System.out.println("Осталось мест стоячих " + (noSitChairs - factNoSitChairs));
                    }
                    if (factNoSitChairs+factChairs >= totalTrain) {
                        System.out.println("Мест нет");
                    } else {
                        System.out.println("Осталось мест в вагоне " + (totalTrain - (factNoSitChairs+factChairs)));
                    }
                }
//Задание 4
                {
                    int age3 = 25;
                    if (age3 >= 2 && age3 <= 6) {
                        System.out.println("Если возвраст человека равен "+age3+", то ему нужно ходить в детский сад");
                    } else if (age3>=7 && age3<=18){
                        System.out.println("Если возвраст человека равен "+age3+", то ему нужно ходить в школу");
                    } else if (age3>18 && age3<24){
                        System.out.println("Если возвраст человека равен "+age3+", то его место в университете");
                    } else if (age3>24){
                        System.out.println("Если возвраст человека равен "+age3+", то ему пора ходить на работу");
                    }
                }
//Задание 5
                {
                    int age4 = 13;
                    boolean adult = false;
                    if (age4 < 5) {
                        System.out.println("Ребенок не может кататься на атракционе");
                    } else if (age4>5 && age4<=14) {
                        if(adult == true){
                            System.out.println("Можно кататься в сопровождении взрослого");
                        }else {
                            System.out.println("Кататься без взрослого нельзя");
                        }
                    } else if (age4>14){
                        System.out.println("Ребенок может кататься без сопровождения взрослого");
                    }
                }
//Задание 6
        {

            {
                int one = 10;
                int two = 5;
                int free = 3;
                if (free > two && free > one) {
                    System.out.println(free + " free большее число");
                } else if (two > free && two > one) {
                    System.out.println(two + " two большее число");
                } else if (one > two && one > free) {
                    System.out.println(one + " one большее число");
                }
            }
        }
    }
}