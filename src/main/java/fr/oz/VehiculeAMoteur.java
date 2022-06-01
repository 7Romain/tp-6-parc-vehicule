package fr.oz;

public class VehiculeAMoteur extends Vehicule {

    public VehiculeAMoteur(String marque, String modele, float volume_reservoir, float station) {
        super(marque, modele);
        this.moteur = new Moteur(volume_reservoir, station);

    }

    String getMarque() {
        return marque;

    }

    float getVolume_reservoir() {
        return moteur.volume_reservoir;
    }

    float getEssenceMise() {
        return moteur.essenceMise;
    }

    float getVolume_total() {
        return moteur.volume_total;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    Moteur moteur;

    public void rouler(float consommation) throws ExceptionEssence {
        if (!getMoteur().isDémarré()) {
            demarrer();
        }
        System.out.println("Je suis " + modele);
        float carburant = moteur.utiliser(consommation);
        if (carburant <= 0.0) {
            throw new ExceptionEssence();
        }

    }

    void demarrer() {
        moteur.démarrer();
        System.out.println(
                "Je suis le vehicule " + marque + " " + modele + " \n il reste " + moteur.volume_reservoir
                        + "litres dans le réservoir");

    }

    public void faireLePlein(float carburant) {
        moteur.faireLePlein(carburant);

    }

}
