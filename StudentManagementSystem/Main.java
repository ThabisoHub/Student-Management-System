public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        InputHandler input = new InputHandler();

        while (true) {
            System.out.println("\n===============Student Management System====================");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display all Students");
            System.out.println("5. Display Average Grades");
            System.out.println("6. Exit");

            int choice = input.getIntInput("Enter your choice: ");

            switch (choice) {
                case 1 -> {
                    String name = input.getStringInput("Enter name: ");
                    String id = input.getStringInput("EnterID: ");
                    int age = input.getIntInput("Enter age: ");
                    System.out.println("Enter grades (-1 to stop):");
                    manager.addStudent(new Student(name, id, age, input.getGradesInput()));
                }

                case 2 -> {
                    String editId = input.getStringInput("Enter ID to edit: ");
                    String newName = input.getStringInput("Enter new name: ");
                    int newAge = input.getIntInput("Enter new Age: ");
                    System.out.println("Enter new Grades (-1 to stop):");
                    manager.editStudent(editId, newName, newAge, input.getGradesInput());
                }


                case 3 -> {
                    String removeId = input.getStringInput("Enter ID to remove: ");
                    manager.removeStudent(removeId);
                }

                case 4 -> manager.displayAllStudents();
                      
                case 5 -> manager.calculateAndDisplayAllAverages();

                case 6 -> System.out.println("Exiting System. Goodbye!");

                default -> System.out.println("Invalid choice! please try again!");

            }
        }
    }
}
