import java.util.ArrayList;

public class Driver
{
    public static void main(String[] args)
    {
        System.out.println("\n");
        five_a();
        five_b();
        five_c();
        five_d();
        five_e();
        five_f();
        five_g();
        five_h();
        System.out.println("\n");
    }


    private static void five_a()
    {
        System.out.println("5 a) Unidirectional association between Student and Transcript.");
        Transcript t = new Transcript("CS 3560", 89.99);
        Student2 s = new Student2("Bob", t);

        System.out.println("Transcript obj info:   "+t.toString());
        System.out.println("Student obj info:   "+s.toString());
        System.out.println("\n");
    }

    private static void five_b()
    {
        System.out.println("5 b) Bidirectional association between Course & book.");

        Book b = new Book();
        b.setName("Calculus");
        b.setAuthor("James Stuawart");

        Course c = new Course(123, b);
        b.setCourse(c);

        System.out.println("book obj info: "+b.toString());
        System.out.println("course obj info: "+c.toString());

        System.out.println("\n");
    }

    private static void five_c()
    {
        System.out.println("5 c) Team aggregated of Players");
        Player p1 = new Player("p1", true);
        Player p2 = new Player("p2", false);
        Player p3 = new Player("p3", false);
        Player p4 = new Player("p4", false);
        Player p5 = new Player("p5", false);
        Team team = new Team();
        team.setCode(123);
        team.addPlayer(p1);
        team.addPlayer(p2);
        team.addPlayer(p3);
        team.addPlayer(p4);
        team.addPlayer(p5);

        System.out.println("team:  "+team);
        
        System.out.println("\n");
    }

    private static void five_d()
    {
        System.out.println("5 d) Dog composed of Paw objects.");
        Dog dog = new Dog();

        dog.setBreed("Huskey");
        dog.setName("Bob");

        System.out.println("dog:  "+dog);
        
        System.out.println("\n");
    }

    private static void five_e()
    {
        System.out.println("5 e) Inheritance relationship where Professor & Staff extend from Employee.");
        Employee e = new Employee("Bob", 1);
        Professor p = new Professor("Bill", 1, "CS");
        Staff s = new Staff("Mark", 1, 1);

        System.out.println("employee:  "+e);
        System.out.println("professor:  "+p);
        System.out.println("staff:  "+s);

        
        System.out.println("\n");
    }

    private static void five_f()
    {
        System.out.println("5 f) Magazine & Ticket extending from Salableitem interface.\n");
        Magizine m = new Magizine();
        Ticket t = new Ticket();

        m.sellingCopy();
        t.sellingCopy();
        
        System.out.println("\n");
    }

    private static void five_g()
    {
        System.out.println("5 g) Person & Movie classes with Watch as the Association Class");
        ArrayList<Watch> watchList = new ArrayList<Watch>();

        // Create two people
        Person p1 = new Person("John Doe");
        Person p2 = new Person("Jane Doe");

        // Create two movies
        Movie m1 = new Movie("Home Alone", "comdey");
        Movie m2 = new Movie("Avengers", "Action");

        watchList.add( new Watch(10, m1, p1) );
        watchList.add( new Watch(9, m2, p2) );
        watchList.add( new Watch(8, m1, p2) );
        watchList.add( new Watch(7, m2, p1) );

        for (Watch w : watchList)
        {
            System.out.println(w);
        }

        System.out.println("\n");
    }

    private static void five_h()
    {
        System.out.println("5 h) Payroll class has dependency with Worker Class");
        
        Payroll payroll = new Payroll();
        Worker worker = new Worker("Bob", 25);

        // Payroll obj depends on Worker class
        // because payroll obj uses worker obj
        payroll.processPayments(worker);

        System.out.println("\n");
    }
}

