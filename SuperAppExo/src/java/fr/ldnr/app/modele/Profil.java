package fr.ldnr.app.modele;

public class Profil {
    private String nom = "";
    private String prenom = "";
    private String email = "";
    
    public static Profil profil = null;

    private Profil() {
    }
    
    public static Profil getProfil() {
        if (profil == null)
            profil = new Profil();
        return profil;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profil{" + "nom=" + nom + ", prenom=" + prenom + ", email=" + email + '}';
    }
    
}
