
public class Personne {
    private String nom;
    public Montre tool = null;

    public Personne(String nom){
        this.nom=nom;

    }

    public String afficheHeure(){
        return  tool.getHeures() + "h" + tool.getMin() + "min";
    }

    public void retirer(){
        if(this.tool!=null){
            this.tool = null;
        }

    }

    public void demander(Personne p){
        if(p.tool!=null){
            System.out.println(" Sur la montre de "+p.getNom()+" il est "+p.tool.getHeures()+" : "+p.tool.getMin());
        }
        System.out.println("");
    }


    public void porter(Montre m){
        if(this.tool == null){
            this.tool = m;
        }
    }

    public String getNom() {
        return nom;
    }
}
