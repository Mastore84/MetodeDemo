public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1.72);
        Person p2 = new Person();
        System.out.println(p1.getHeight());
        p1.setHeight(1.90);
        System.out.println("Ny højde: " + p1.getHeight());
    }
}
