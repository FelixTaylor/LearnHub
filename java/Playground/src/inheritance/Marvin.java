package inheritance;

public class Marvin extends Kind {
    private final boolean knowledge = true;

    public Marvin() {
        // Die setName(String) Methode wurde in der Paren-Class 'Mensch'
        // definiert.
        setName("Marvin");
    }

    public boolean isClever() {
        return this.knowledge;
    }
}
