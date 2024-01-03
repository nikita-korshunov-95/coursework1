public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.printAllEmployee();
        System.out.println("Фонд отплаты труда: " + storage.calculateAllSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + storage.calculateMinEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + storage.calculateMaxEmployee());
        System.out.println("Средняя зарплата офиса: " + storage.calculateMediumSalary());
        storage.printFullName();
    }
}