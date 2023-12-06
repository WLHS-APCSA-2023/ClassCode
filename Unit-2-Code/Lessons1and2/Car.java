public class Car{
  private double mpg;
  private int mileage;
  private int year;
  private String make;
  private String model;
  private int currentYear = 2023;

  public Car(double carMPG, int carYear, String carMake, String carModel, int carMileage){
    mpg = carMPG;
    year = carYear;
    make = carMake;
    model = carModel;
    mileage = carMileage;
  }

  public double getAverageMilesPerYear(){
    return (double)mileage/(currentYear - year);

  }
}
