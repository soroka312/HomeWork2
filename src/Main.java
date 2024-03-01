public class Main {
    public static void main(String[] args) {
        //Задача 1

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6

        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var totalWeight = firstFighter + secondFighter;
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг");
        var difference = secondFighter - firstFighter;
        System.out.println("Разница масс " + difference + " кг");

        //Задача 7

        var remains = secondFighter % firstFighter;
        System.out.println(remains);

        //Задача 8

        var totalHours = 640;
        var oneEmployee = 8;
        var totalEmployees = totalHours / oneEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees +
                " человек");

        totalEmployees = totalEmployees + 94;
        totalHours = totalEmployees * oneEmployee;
        System.out.println("Если в компании работает " + totalEmployees +
                " человек, то всего " + totalHours +
                " часов работы может быть поделено между сотрудниками");




    }
}