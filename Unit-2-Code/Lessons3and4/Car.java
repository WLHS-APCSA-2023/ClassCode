/**
This is an updated version that includes constructor overload
  as well as a void and non-void method**/

public class Car{
    private double mpg;
    private int mileage;
    private int year;
    private String make;
    private String model;
    private int currentYear = 2023;
    private int age;
  
    public Car(double carMPG, int carYear, String carMake, String carModel, int carMileage){
      mpg = carMPG;
      year = carYear;
      make = carMake;
      model = carModel;
      mileage = carMileage;
    }

    //Overloaded constructor for electric car
    public Car(int carYear, String carMake, String carModel, int carMileage){
      year = carYear;
      make = carMake;
      model = carModel;
      mileage = carMileage;
    }
    
    //non-void method because it returns a double
    public double getAverageMilesPerYear(){
        if(currentYear  == year){
            return mileage;
        }
        return (double)mileage/(currentYear - year);
    }

    //void method for calculating age
    public void calculateAge(){
        age = currentYear - year;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Your car is a " + year + " " + make + " " + model;
    }
  }
