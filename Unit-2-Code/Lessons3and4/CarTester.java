public class CarTester {
    public static void main(String[] args) {
        Car car = new Car(30, 2020, "Honda", "CRV", 45000);
        //Car car2 = new Car(45,2022,"Toyota","Prius",14000);
        Car myTesla = new Car(2023, "Tesla", "Model X", 5000);
        Car car1 = new Car(20,2015,"Toyota","Camry",20000);
        Car car2 = new Car(10,2023,"Porsche","911",500);

        double myAvgMiles = car.getAverageMilesPerYear();
        System.out.println("My Honda's average miles per year is " + myAvgMiles);

        //calling a void method
        car.calculateAge();

        //calling a non-void method so we can actually get the age of the car and print it
        System.out.println("Age is " + car.getAge());

        double mpy1 = car2.getAverageMilesPerYear();
        System.out.println(mpy1);

        //only works because we have a toString method in the Car class
        System.out.println(car1);
        System.out.println(car2);

    }
}
