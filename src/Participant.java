public class Participant {
    public int id;
    public String nom;
    public String prenom;
    public int age;
    public String email;
    public String profession;
    public String civilite;

    public Participant() {
    }

    public Participant(int id, String nom, String prenom, int age, String email, String profession, String civilite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
        this.profession = profession;
        this.civilite = civilite;
    }
}
