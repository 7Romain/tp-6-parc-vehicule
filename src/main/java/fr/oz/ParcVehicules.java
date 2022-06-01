package fr.oz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ParcVehicules {

    ArrayList<VehiculeAMoteur> stock = new ArrayList<VehiculeAMoteur>();

    public ParcVehicules(ArrayList<VehiculeAMoteur> stock) {
        this.stock = stock;
    }

    public void controlerVehicules() {

        for (VehiculeAMoteur chaque : stock) {
            try {
                Random random = new Random();
                int km;
                km = 1 + (random.nextInt(5));
                chaque.rouler(km);
            } catch (ExceptionEssence ex) {
                Random random = new Random();
                int ajout;
                ajout = 1 + (random.nextInt(10));

                chaque.faireLePlein(ajout);
            }

        }

    }

    public void tester() {
        Iterator<VehiculeAMoteur> aControler = stock.iterator();

        while (aControler.hasNext()) {
            VehiculeAMoteur stock = aControler.next();
            try {
                Random random = new Random();
                int km;
                km = 1 + (random.nextInt(5));
                stock.rouler(km);
            } catch (ExceptionEssence ex) {
                Random random = new Random();
                int ajout;
                ajout = 1 + (random.nextInt(10));

                stock.faireLePlein(ajout);
            }

        }
    }

}
