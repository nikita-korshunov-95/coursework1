public class Main {
    public static void main(String[] args) {
        Employee[] employeeCorp = new Employee[10];
        employeeCorp[0] = new Employee("Григорий", "Некрасов", "Александрович", 4, 120500);
        employeeCorp[1] = new Employee("Алексей", "Владимиров", "Игоревич", 3, 180420);
        employeeCorp[2] = new Employee("Артур", "Хафизов", "Уралович", 2, 130000);
        employeeCorp[3] = new Employee("Евгений", "Михайлец", "Николаевич", 2, 150800);
        employeeCorp[4] = new Employee("Степан", "Соловьев", "Иванович", 4, 110000);
        employeeCorp[5] = new Employee("Виктор", "Князев", "Петрович", 3, 122000);
        employeeCorp[6] = new Employee("Владимир", "Киселев", "Андреевич", 2, 105000);
        employeeCorp[7] = new Employee("Николай", "Головин", "Алексеевич", 1, 165000);
        employeeCorp[8] = new Employee("Андрей", "Хохлов", "Петрович", 2, 141000);
        employeeCorp[9] = new Employee("Дмитрий", "Маврин", "Николаевич", 3, 124000);
        printAllEmployee (employeeCorp);
        System.out.println("Фонд отплаты труда: " + calculateAllSalary(employeeCorp));
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary(employeeCorp));
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary(employeeCorp));
        System.out.println("Средняя зарплата офиса: " + calculateMediumSalary(employeeCorp));
        printFullName(employeeCorp);
        }
    public static void printAllEmployee(Employee[] employeeCorp) {
        for (Employee employee : employeeCorp) {
            System.out.println(employee);
        }
    }
    public static double calculateAllSalary(Employee[] employeeCorp) {
        double salaries = 0;
        for (Employee employee : employeeCorp) {
            salaries += employee.getSalary();
        }
        return salaries;
    }
    public static Employee getEmployeeWithMinSalary(Employee[] employeeCorp) {
        Employee getEmployeeWithMinSalary = employeeCorp[0];
        for (Employee employee : employeeCorp) {
            if (employee.getSalary() < getEmployeeWithMinSalary.getSalary()) {
                getEmployeeWithMinSalary = employee;
            }
        }
        return getEmployeeWithMinSalary;
    }
    public static Employee getEmployeeWithMaxSalary(Employee[] employeeCorp) {
        Employee getEmployeeWithMaxSalary = employeeCorp[0];
        for (Employee employee : employeeCorp) {
            if (employee.getSalary() > getEmployeeWithMaxSalary.getSalary()) {
                getEmployeeWithMaxSalary = employee;
            }
        }
        return getEmployeeWithMaxSalary;
    }
    public static double calculateMediumSalary(Employee[] employeeCorp) {
        double allSalary = calculateAllSalary(employeeCorp);
        return  allSalary / employeeCorp.length;
    }
    public static void  printFullName(Employee[] employeeCorp) {
        for (Employee employee : employeeCorp) {
            System.out.println(employee.printFullName());
        }
    }
}