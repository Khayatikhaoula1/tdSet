public class Main {
    public static void main(String[] args) {
        // Création des enseignants
        Enseignant e1 = new Enseignant(1, "Dupont", "Jean");
        Enseignant e2 = new Enseignant(2, "Durand", "Marie");
        Enseignant e3 = new Enseignant(3, "Martin", "Pierre");
        Enseignant e4 = new Enseignant(1, "Dupont", "Jean"); // Même ID que e1

        // Création des gestionnaires
        GestionEnseignant gestionHashSet = new EspritHashSet();
        GestionEnseignant gestionTreeSet = new EspritTreeSet();

        // Test sur HashSet
        System.out.println("Test sur HashSet:");
        gestionHashSet.ajouterEnseignant(e1);
        gestionHashSet.ajouterEnseignant(e2);
        gestionHashSet.ajouterEnseignant(e3);
        gestionHashSet.displayEnseignants();
        System.out.println("Recherche par enseignant (e1): " + gestionHashSet.rechercherEnseignant(e1));
        System.out.println("Recherche par ID (1): " + gestionHashSet.rechercherEnseignant(1));
        gestionHashSet.supprimerEnseignant(e2);
        gestionHashSet.displayEnseignants();

        // Test sur TreeSet
        System.out.println("\nTest sur TreeSet:");
        gestionTreeSet.ajouterEnseignant(e1);
        gestionTreeSet.ajouterEnseignant(e2);
        gestionTreeSet.ajouterEnseignant(e3);
        gestionTreeSet.displayEnseignants();
        System.out.println("Recherche par enseignant (e1): " + gestionTreeSet.rechercherEnseignant(e1));
        System.out.println("Recherche par ID (1): " + gestionTreeSet.rechercherEnseignant(1));
        gestionTreeSet.supprimerEnseignant(e2);
        gestionTreeSet.displayEnseignants();
    }
}
