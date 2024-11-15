public class Enseignant {
    private int id;
    private String nom;
    private String prenom;

    // Constructeur sans paramètre
    public Enseignant() {}

    // Constructeur avec paramètre
    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode equals pour comparer les enseignants par leur ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enseignant that = (Enseignant) o;
        return id == that.id;
    }

    // Méthode toString pour afficher l'enseignant
    @Override
    public String toString() {
        return "Enseignant{id=" + id + ", nom='" + nom + "', prenom='" + prenom + "'}";
    }
}
