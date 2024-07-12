public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Ram", "Babu", 435265, 20.00);
        employee.setHeight(70); // in inches

        // Initial state
        System.out.print(employee);
        System.out.println("***************************************************************");

        // Displaying the raised pay
        System.out.println("New hourly pay after raise: $" + employee.getRaise());
        System.out.println("***************************************************************");

        // Display pay for the week
        int hoursWorked = 45;
        System.out.println("Total pay for " + hoursWorked + " hours: $" + employee.payDay(hoursWorked));
        System.out.println("***************************************************************");

        // Display final state
        System.out.println("Updated status:");
        System.out.print(employee);
        System.out.println("***************************************************************");
    }
}
