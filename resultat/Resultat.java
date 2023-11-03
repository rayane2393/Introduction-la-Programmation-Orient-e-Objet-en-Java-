import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

class Personne {
    private String nom;
    private String prenom;
    private int age;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Etudiant extends Personne {
    private int numeroEtudiant;

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }
}

interface Forme {
    double calculerAire();
}

class Cercle implements Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}

class Rectangle implements Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double calculerAire() {
        return longueur * largeur;
    }
}

class CompteBancaire {
    private double solde;

    public CompteBancaire() {
        solde = 0.0;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public double getSolde() {
        return solde;
    }
}

class Bibliothèque {
    private List<String> livres;

    public Bibliothèque() {
        livres = new ArrayList<>();
    }

    public void ajouterLivre(String titre) {
        livres.add(titre);
    }

    public void supprimerLivre(String titre) {
        livres.remove(titre);
    }

    public void listerLivres() {
        for (String livre : livres) {
            System.out.println(livre);
        }
    }
}

class CompteBancaire {
    private double solde;

    public CompteBancaire() {
        solde = 0.0;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant <= solde) {
            solde -= montant;
        } else {
            throw new SoldeInsuffisantException("Solde insuffisant.");
        }
    }

    public double getSolde() {
        return solde;
    }
}

class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message) {
        super(message);
    }
}

public class Calculatrice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculatrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JButton bouton = new JButton("Cliquez-moi");
        frame.add(bouton);

        frame.setVisible(true);
    }
}


