public class Plant {
    private String species;
    private String family;
    private int age;
    private double height;
    private String scientificName;

    public Plant(String theSpecies, String theFamily, int ageInYears, double heightInMeters, String sciName) {
        species = theSpecies;
        family = theFamily;
        age = ageInYears;
        height = heightInMeters;
        scientificName = sciName;
    }

    public Plant(String theSpecies, String sciName) {
        species = theSpecies;
        family = "unknown family";
        age = 10;
        height = 2;
        scientificName = sciName;
    }

    public Plant() {
        species = "New Species";
        family = "unknown family";
        age = 10;
        height = 2;
        scientificName = "plantium abcdefghijklmno";
    }

    public void grow() {
        age++;
        height += 0.1;
        System.out.println(species + " has grown to " + age + " years old and is now " + height + " meters tall.");
    }

    public void bloom() {
        System.out.println(species + " is now blooming with beautiful flowers!");
    }

    public void cut() {
        height -= 0.1;
        System.out.println(species + " was cut to " + height + " meters.");
    }

    public String getSpecies() {
        return species;
    }

    public int getAgeInYears() {
        return age;
    }

    public int getAgeOneYearAgo() {
        age--;
        return age;
    }

    public int getFutureAge() {
        age++;
        return age;
    }

    public String getFamily() {
        return family;
    }

    public double getHeightInMeters() {
        return height;
    }

    public double getTallerHeight() {
        height += 0.2;
        return height;
    }

    public double getGrowthPerYear() {
        return (double) height / age;
    }

    public String toString() {
        return "The plant " + species + " belongs to the family " + family + ". " + species + " is " + age + " years old, has a height of " + height + " meters, and has the scientific name of " + scientificName + ".";
    }
}
