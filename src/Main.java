public class Main {
    public static void main(String[] args) {
             //task1
        var dog = 8.0;

        System.out.println(dog);
        var cat = 3.6;

        System.out.println(cat);
        var paper = 763789;

        System.out.println(paper);

            //task2
                dog = dog + 4;
                    System.out.println(dog);
                cat = cat + 4;
                    System.out.println(cat);
                paper = paper + 4;
                    System.out.println(paper);

             //task3
            dog = dog - 3.5;
                System.out.println(dog);
            cat = cat - 1.6;
                System.out.println(cat);
            paper = paper - 7639;
                System.out.println(paper);

            //task4
        var friend = 19;
            System.out.println(friend);
        friend = friend + 2;
            System.out.println(friend);
        friend = friend / 7;
            System.out.println(friend);

        //task5
        var frog = 3.5;
            System.out.println(frog);
        frog = frog * 10;
            System.out.println(frog);
        frog = frog / 3.5;
            System.out.println(frog);
        frog = frog + 4;
            System.out.println(frog);

        //task6
        var FirstFighter = 78.2;
        var SecondFighter = 82.7;
        var AllMass = FirstFighter + SecondFighter;
            System.out.println(AllMass);
        var Difference = SecondFighter - FirstFighter;
            System.out.println(Difference);

        //task7
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var last = secondFighter % firstFighter;
            System.out.println(last);

        //task8
        var allTime = 640;
        var oneEmpl = 8;
        var allEmpl = allTime / oneEmpl;
            System.out.println("Всего работников в компании - " + allEmpl + " человек");
        var plusEmpl = allEmpl + 94;
        var lastHours = allTime / plusEmpl;
            System.out.println("Если в компании работает " + plusEmpl + " человек, то всего " + lastHours + " часов работы может быть поделено между сотрудниками");
    }
}