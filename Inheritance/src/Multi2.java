class Person {
    void walk() {
        System.out.println("Person is walking...");
    }

    void sleep() {
        System.out.println("Person is sleeping...");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("Employee is working...");
    }

    void attendMeeting() {
        System.out.println("Employee is attending a meeting...");
    }
}

class Manager extends Employee {
    void assignTask() {
        System.out.println("Manager is assigning tasks...");
    }

    void reviewPerformance() {
        System.out.println("Manager is reviewing performance...");
    }
}

public class Multi2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.walk();
        m.sleep();
        m.work();
        m.attendMeeting();
        m.assignTask();
        m.reviewPerformance();
    }
}
