public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(14, 1.72);
        Person p2 = new Person();
        System.out.println("Age: " + p1.getAge() + ", height: " + p1.getHeight());
        p1.setHeight(1.90);
        System.out.println("Ny højde: " + p1.getHeight());
        p1.hasBirthday();
        System.out.println(p1.getAge());
    }
}
