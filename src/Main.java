public class Main {
    public static void main(String[] args) {
       ;

        //Task 1
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        //Task 2
        System.out.println("Task 2");
        dog = dog + 4;
        cat = cat +4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        //Task 3
        System.out.println("Task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        //Task 4
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        //Task 5
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        //Task 6
        System.out.println("Task 6");
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        var totalWeightBoxer = WeightBoxer1 + WeightBoxer2;
        System.out.println("Общая масса двух бойцов " + totalWeightBoxer + " кг");

        var differenceMasses = WeightBoxer2 - WeightBoxer1;
        System.out.println("Разница между массами бойцов " + differenceMasses + " кг");



        //Task 7
        System.out.println("Task 7");
        var remainsDivision = WeightBoxer2 % WeightBoxer1;
        System.out.println("Остаток от деления между двумя весами " + remainsDivision + " кг");


        //Task 8
        System.out.println("Task 8");
        var workHours = 640;
        var EveryEmployeeWatches1 = 8;
        var  totalEmployeesCompany1 = workHours / EveryEmployeeWatches1;
        System.out.println("Всего работников в компании — " + totalEmployeesCompany1 + " человек");

        var totalEmployeesCompany2 = totalEmployeesCompany1 + 94;
        var EveryEmployeeWatches2 = totalEmployeesCompany2 * EveryEmployeeWatches1;
     System.out.println("Если в компании работает " + totalEmployeesCompany2 +
             " человек,то всего " + EveryEmployeeWatches2 + " часов работы может быть поделено между сотрудниками" );





    }
}