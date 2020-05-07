package inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Mensch mensch = new Mensch();
        mensch.setName("Kevin");
        printObjectInfo(mensch);
        System.out.println(" ");

        Kind kind = new Kind();
        kind.setName("Julia");
        // Beachte das wir kind als Parameter übergeben können!
        // Das Kind ist auch eine Mensch!
        printObjectInfo(kind);
        // Methode aus dem Objekt 'Kind'
        System.out.println("Lieblingsfarbe: " + kind.getLieblingsFarbe());
        System.out.println(" ");

        Marvin marvin = new Marvin();
        printObjectInfo(marvin);
        // Methode aus dem Objekt 'Kind'
        System.out.println("Lieblingsfarbe: " + marvin.getLieblingsFarbe());
        // Methode aus dem Objekt 'Marvin
        System.out.println("Ist " + marvin.getName() + " schlau? " + marvin.isClever());
    }

    private static void printObjectInfo(Mensch mensch) {
        System.out.println(mensch.getClass());
        System.out.println("Class(simple): " + mensch.getClass().getSimpleName());
        System.out.println("Parent(simple): " + mensch.getClass().getSuperclass().getSimpleName());
        System.out.println("Hashcode: " + mensch.hashCode());
        System.out.println("Der Mensch heißt: " + mensch.getName());
    }
}
