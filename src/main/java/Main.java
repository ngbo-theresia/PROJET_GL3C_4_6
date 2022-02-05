public class Main {
    public static void main(String[] args) {

        Montre m = new Montre(4, 54);

        Personne p = new Personne("paul");
        p.porter(m);
        System.out.println("je suis:" + p.getNom());
        p.affiche().Heure();
        p.affiche().Min();
        m.avance();
        p.affiche().Heure();
        p.affiche().Min();
        p.retirer();
        Montre montre_max = new Montre(12, 30);

        Personne max = new Personne("max");
        max.porter(montre_max);
        p.demander(max);
    }
}
