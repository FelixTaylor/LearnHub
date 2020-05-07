package inheritance;

public class Mensch {

    private String name;

    public Mensch() {
        this.name = "";
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            System.err.println("Kein valider Name angegeben!");
        }
    }

    public String getName() {
        return this.name;
    }
}
