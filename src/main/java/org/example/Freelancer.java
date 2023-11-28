package org.example;

public class Freelancer extends WorkerBase {
    private Freelancer(String name, String lastName, double salary) {
        super(name, lastName, salary);
    }
    public static Freelancer create(String name, String lastName, double salary){
        if (name == null || name.length() < 3){
            throw new RuntimeException("Некорректное имя работника.");
        }
        if (lastName == null || lastName.length() < 3){
            throw new RuntimeException("Некорректная фамилия работника.");
        }
        if (salary < 5){
            throw new RuntimeException("Некорректная почасовая зарплата работника.");
        }
        return new Freelancer(name, lastName, salary);
    }

    @Override
    protected Double salaryOfMonth(double salary) {
        return 20.8 * 8 * salary;
    }
}
