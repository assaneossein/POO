public class Dalton {
    private String nom;
    private int taille;
    public Dalton(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }
    public String parle() {
        if (nom.equals("Joe")) {
            return "Je hais Lucky Luke";
        } else if (nom.equals("Jack") || nom.equals("William")) {
            return "Calme toi Joe";
        } else if (nom.equals("Averell")) {
            return "Quand est-ce qu'on mange?";
        } else {
            return "Je ne sais pas quoi dire...";
        }
    }
    public class SimulRobot {
    private Dalton joe;
    private Dalton jack;
    private Dalton william;
    private Dalton averell;

    public SimulRobot() {
        joe = new Dalton("Joe", 137, 0, 0, 1, 0, 1.5);
        jack = new Dalton("Jack", 165, 0, 0, 1, 0, 1.5);
        william = new Dalton("William", 190, 0, 0, 1, 0, 1.5);
        averell = new Dalton("Averell", 210, 0, 0, 1, 0, 1.5);

        Cheval cheval = new Cheval("Cheval", Color.BLACK, 0, 0, 1, 0, 3.0);
        joe.setCheval(cheval);
    }

    public void deplace(double temps) {
        joe.deplace(temps);
        jack.deplace(temps);
        william.deplace(temps);
        averell.deplace(temps);
    }
