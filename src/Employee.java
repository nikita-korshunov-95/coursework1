public class Employee {
    private String name;
    private String surname;
    private String midname;
    private int department;
    private double salary;
    private int idCount = 1;
    private int id;
    public Employee (String name, String surname, String midname, int department, double salary) {
        this.name = name;
        this.surname = surname;
        this.midname = midname;
        this.department = department;
        this.salary = salary;
        this.id = idCount++;
    }
    public String getName () {
        return name;
    }
    public String getSurname () {
        return surname;
    }
    public String getMidname () {
        return midname;
    }
    public int getDepartment () {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment (int department) {
        this.department = department;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
    @Override
    public String toString () {
        return "Работник{" + surname + " " + name  + " " + midname + ", Отдел:" + department + ", Зарплата:"
                + salary + ", id:" + id + '}';
    }
    public String printFullName () {
        return "Работник{"  + surname + " " + name + " " + midname +'}';
    }
}
