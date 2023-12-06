/*The test must create at least two objects from your class and apply at least two methods to them, at least one void and one non-void.*/

public class PlantTester {
    public static void main(String[] args) {
        Plant myPlant = new Plant("Daisy", "Asteraceae", 2, 0.4, "Bellis perennis");
        Plant myPlant2 = new Plant("Fern", "Pteridophyta", 3, 1.3, "Polypodiopsida");
        Plant myPlant3 = new Plant("Cactus", "Cactaceae", 5, 4.2, "Cactaceae");
        Plant myPlant4 = new Plant();
        Plant myPlant5 = new Plant("Rose", "Rosa");
        Plant myPlant6 = new Plant("Daisy", "Asteraceae", 2, 0.4, "Bellis perennis");

        myPlant.grow();
        myPlant.cut();
        int plantAge = myPlant.getAgeOneYearAgo();
        System.out.println("One year ago, this plant was " +plantAge+" years old.");
        System.out.println(); //Add a line break

        myPlant2.bloom();
        int plantCurrentAge = myPlant2.getAgeInYears();
        System.out.println("Right now, the " +myPlant2.getSpecies()+" is " +plantCurrentAge+" years old.");

        double plantGrowth = myPlant2.getGrowthPerYear();
        String plantName = myPlant2.getSpecies();
        System.out.println("The " + plantName +" grew " + plantGrowth + " meteres per year.");

        System.out.println("Its height is "+ myPlant2.getHeightInMeters() + " meters.");
        System.out.println("One year ago, it was "+ myPlant2.getAgeOneYearAgo() +" years old.");
        System.out.println(); //Add a line break

        myPlant3.grow();
        myPlant3.bloom();
        System.out.println("If it was a little taller, this plant would be " + myPlant3.getTallerHeight() +" meters tall.");
        System.out.println(); //Add a line break

        myPlant4.bloom();
        double tallerPlantFour = myPlant4.getTallerHeight();
        System.out.println("If it grows, this plant will be "+tallerPlantFour + " meters tall.");
        int futurePlantFour = myPlant4.getFutureAge();
        System.out.println("In the future, it will be "+futurePlantFour+ " years old.");
        myPlant4.cut();
        System.out.println(); //Add a line break

        myPlant5.bloom();
        double growthPerYr = myPlant5.getGrowthPerYear();
        String plantName5 = myPlant5.getSpecies();
        System.out.println(plantName5+" has grown " +growthPerYr+ " meters per year.");
        System.out.println(); //Add a line break

        // will give examples of the toString working:
        System.out.println(myPlant+"\n");
        System.out.println(myPlant2+"\n");
        System.out.println(myPlant3+"\n");
        System.out.println(myPlant4+"\n");
        System.out.println(myPlant5+"\n");

        System.out.println(myPlant.equals(myPlant6));
    }
}
