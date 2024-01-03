public class Storage {
    private Employee[] employeeCorp = new Employee[10];
    public Storage() {
        employeeCorp[0] = new Employee("Григорий", "Некрасов", "Александрович", 4, 120500);
        employeeCorp[1] = new Employee("Алексей", "Владимиров", "Игоревич", 3, 180420);
        employeeCorp[2] = new Employee("Артур", "Хафизов", "Уралович", 2, 130000);
        employeeCorp[3] = new Employee("Евгений", "Михайлец", "Николаевич", 2, 150800);
        employeeCorp[4] = new Employee("Степан", "Соловьев", "Иванович", 4, 110000);
        employeeCorp[5] = new Employee("Виктор", "Князев", "Петрович", 3, 122000);
        employeeCorp[6] = new Employee("Владимир", "Киселев", "Андреевич", 2, 105000);
        employeeCorp[7] = new Employee("Николай", "Головин", "Алексеевич", 1, 165000);
        employeeCorp[8] = new Employee("Андрей", "Хохлов", "Петрович", 2, 141000);
        employeeCorp[9] = new Employee("Дмитрий", "Сергеев", "Николаевич", 3, 124000);
    }
    public void printAllEmployee() {
        for (Employee employee : employeeCorp) {
            System.out.println(employee);
        }
    }
    public double calculateAllSalary() {
        double salaries = 0;
        for (Employee employee : employeeCorp) {
            salaries += employee.getSalary();
        }
        return salaries;
    }
    public Employee calculateMinEmployee() {
        Employee calculateMinEmployee = employeeCorp[0];
        for (Employee employee : employeeCorp) {
            if (employee.getSalary() < calculateMinEmployee.getSalary()) {
                calculateMinEmployee = employee;
            }
        }
        return calculateMinEmployee;
    }
    public Employee calculateMaxEmployee() {
        Employee calculateMaxEmployee = employeeCorp[0];
        for (Employee employee : employeeCorp) {
            if (employee.getSalary() > calculateMaxEmployee.getSalary()) {
                calculateMaxEmployee = employee;
            }
        }
        return calculateMaxEmployee;
    }
    public double calculateMediumSalary() {
        double allSalary = calculateAllSalary();
        return  allSalary / employeeCorp.length;
    }
    public void  printFullName() {
        for (Employee employee : employeeCorp) {
            System.out.println(employee.printFullName());
        }
    }
}

