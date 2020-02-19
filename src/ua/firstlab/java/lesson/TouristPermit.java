package ua.firstlab.java.lesson;

public class TouristPermit {
    private static int timeTrevel = 24;
    public int durationInDay;
    public int costInEuro;
    private int starNumber;
    private String nameHotel;
    public String country;
    protected int averageTemp;
    protected String food;

    public static int getTimeTrevel() {
        return timeTrevel;
    }

    public static void setTimeTrevel(int timeTrevel) {
        TouristPermit.timeTrevel = timeTrevel;
    }

    public int getDurationInDay() {
        return durationInDay;
    }

    public void setDurationInDay(int durationInDay) {
        this.durationInDay = durationInDay;
    }

    public int getCostInEuro() {
        return costInEuro;
    }

    public void setCostInEuro(int costInEuro) {
        this.costInEuro = costInEuro;
    }

    public int getStarNumber() {
        return starNumber;
    }

    public void setStarNumber(int starNumber) {
        this.starNumber = starNumber;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    public TouristPermit(int durationInDay, int costInEuro, int starNumber, String nameHotel) {
        this(durationInDay, costInEuro, starNumber, nameHotel, null, null);

    }

    public TouristPermit() {
        this(0, 0, 0, null, null, null);
    }

    @Override
    public String toString() {
        return "TouristPermit{" +
                "durationInDay=" + durationInDay +
                ", costInEuro=" + costInEuro +
                ", starNumber=" + starNumber +
                ", nameHotel='" + nameHotel + '\'' +
                ", country='" + country + '\'' +
                ", food='" + food + '\'' +
                '}';
    }

    public static void printStaticTime_Trevel() {
        System.out.println("timeInHour = " + timeTrevel);
    }

    public static void printTime_Trevel() {
        System.out.println("timeInHour = " + timeTrevel);
    }

    public TouristPermit(int durationInDay, int costInEuro, int starNumber, String nameHotel, String country, String food) {
        this.durationInDay = durationInDay;
        this.costInEuro = costInEuro;
        this.starNumber = starNumber;
        this.nameHotel = nameHotel;
        this.country = country;
        this.food = food;
    }
}




