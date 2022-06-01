package fr.oz;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Scooter yamaha = new Scooter("yamaha", "X-MAX", 3.0f);
        Voiture citroen = new Voiture("Citroen", "C5", 3.0f);
        Voiture laguna = new Voiture("Renault", "Laguna", 3.0f);
        Scooter suzuki = new Scooter("Suzuki", "GSX-R", 2.0f);
        Voiture ford = new Voiture("Ford", "Focus", 4.0f);
        Voiture honda = new Voiture("Honda", "HR-V", 3.0f);
        Voiture audi = new Voiture("Audi", "R8", 3.0f);

        VehiculeAMoteur[] stockTableau = { yamaha, citroen, laguna, suzuki, ford, honda, audi };
        ArrayList<VehiculeAMoteur> stock = new ArrayList(Arrays.asList(stockTableau));

        ParcVehicules hertz = new ParcVehicules(stock);
        hertz.controlerVehicules();
        System.out.println("...................................................................");
        hertz.tester();

    }
}
