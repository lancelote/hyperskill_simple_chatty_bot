package stage4.hw7;

class Employee {

    String name;
    int salary;
    String address;

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public Employee(String name, int salary) {
        this(name, salary, "unknown");
    }

    public Employee() {
        this("unknown", 0);
    }
}
