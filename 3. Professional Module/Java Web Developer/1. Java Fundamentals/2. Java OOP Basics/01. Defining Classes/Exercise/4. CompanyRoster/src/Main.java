import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Map<String, List<Employee>> employees = new HashMap<>();

    public static void main(String[] args) {

        int employeeAmount = Integer.parseInt(sc.nextLine());
        while (employeeAmount-- > 0) {
            String[] tokens = sc.nextLine().split("\\s+");
            Employee currentEmployee = makeEmployee(tokens);
            if (!employees.containsKey(tokens[3])) {
                employees.put(tokens[3], new ArrayList<>());
            }
            if (currentEmployee != null) {
                employees.get(tokens[3]).add(currentEmployee);
            }
        }

        employees.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(
                        e2.getValue().stream().mapToDouble(a -> a.getSalary()).average().getAsDouble(),
                        e1.getValue().stream().mapToDouble(a -> a.getSalary()).average().getAsDouble()
                )).limit(1)
                .forEach(e -> {
                    System.out.println(String.format("Highest Average Salary: %s", e.getKey()));
                    e.getValue().stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                            .collect(Collectors.toList()).forEach(System.out::println);
                });
    }

    public static Employee makeEmployee(String[] inputTokens) {
        Employee employee = null;
        if(inputTokens.length == 4) {
            String name = inputTokens[0];
            double salary = Double.parseDouble(inputTokens[1]);
            String position = inputTokens[2];
            String department = inputTokens[3];
            // Make an employee object without email and age
            employee = new Employee(name, salary, position, department);
        } else if(inputTokens.length == 5) {
            String name = inputTokens[0];
            double salary = Double.parseDouble(inputTokens[1]);
            String position = inputTokens[2];
            String department = inputTokens[3];
            String emailOrAge = inputTokens[4];
            if (inputTokens[4].contains("@")) {
                employee = new Employee(name, salary, position, department);
                employee.setEmail(emailOrAge);
            } else {
                int age = Integer.parseInt(inputTokens[4]);
                employee = new Employee(name, salary, position, department);
                employee.setAge(age);
            }
        } else if(inputTokens.length == 6) {
            String name = inputTokens[0];
            double salary = Double.parseDouble(inputTokens[1]);
            String position = inputTokens[2];
            String department = inputTokens[3];
            String email = inputTokens[4];
            int age = Integer.parseInt(inputTokens[5]);
            // Make an employee object
            employee = new Employee(name, salary, position, department, email, age);
        }
        return employee;
    }
}