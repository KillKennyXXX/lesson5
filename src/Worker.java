public class Worker {
    private final String FIO;
    private  String email;
    private int phone;
    private int salary;
    private int age;


    public Worker(String FIO, String email, int phone, int salary, int age) {
        this.FIO = FIO;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.printf("Работник %s(email %s,телефон %d) имеет зарплату %d р в месяц%n", FIO, email, phone, salary);
    }
}
