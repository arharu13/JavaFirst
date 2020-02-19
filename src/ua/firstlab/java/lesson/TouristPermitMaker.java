package ua.firstlab.java.lesson;

public class TouristPermitMaker {
    public static void main(String[] args) {
        TouristPermit loltouristPermit = new TouristPermit();
        TouristPermit normaltouristPermit = new TouristPermit(14, 250, 4, "Ocean");
        TouristPermit luxarytouristPermit = new TouristPermit(21, 600, 5, "Open Plaza", "USA", "FREE");


        System.out.println(loltouristPermit);
        System.out.println(normaltouristPermit);
        System.out.println(luxarytouristPermit);
        System.out.println();


        TouristPermit.printStaticTime_Trevel();
        loltouristPermit.printTime_Trevel();
        int itnemarray = 4;
        TouristPermit[] touristPermits = new TouristPermit[itnemarray];

        for (int i = 0; i < 4; i++) {
            touristPermits[i] = new TouristPermit();
        }

        for (TouristPermit touristPermit : touristPermits) {
            System.out.println(touristPermit);
        }
    }


}
