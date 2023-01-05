public class Main {
    public static void main(String[] args) {
        Person Person01=new Person(" James Peterson", 34, 180, 73.5);
        Person Person02=new Person(" Bob Thomley", 25, 171, 68.2);

        System.out.println(Person01.getName());
        System.out.println(Person01.getAge());
        System.out.println(Person01.getHeight());
        System.out.println(Person01.getWeight());

        Person01.growOlder();

        System.out.println(Person01.getName());
        System.out.println(Person01.getAge());
        System.out.println(Person01.getHeight());
        System.out.println(Person01.getWeight());
    }
}