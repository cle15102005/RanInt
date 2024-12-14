import java.util.ArrayList;
import java.util.Scanner;

public class Money {
    private double balance;
    private double scholarshipAmount;
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<String> items = new ArrayList<>();
    private ArrayList<String> jobs = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    // Constructor
    public Money(double initialFunds) {
        this.balance = initialFunds;
    }

    // Method to set initial funds
    public void setInitialFunds(double amount) {
        this.balance = amount;
        System.out.println("Initial funds set to: vnd" + amount);
    }

    // Method to register for a course
    public void registerCourse(String courseName, double courseFee) {
        if (courseFee <= balance) {
            courses.add(courseName);
            balance -= courseFee;
            System.out.println("Successfully registered for course: " + courseName);
        } else {
            System.out.println("Insufficient balance to register for this course.");
        }
    }

    // Method to add scholarship funds
    public void addScholarship(double amount) {
        scholarshipAmount += amount;
        balance += amount;
        System.out.println("Scholarship of vnd" + amount + " added. Current balance: vnd" + balance);
    }

    // Method to check remaining balance
    public double checkBalance() {
        System.out.println("Current balance: vnd" + balance);
        return balance;
    }

    // Method to purchase an item
    public void purchaseItem(String itemName, double itemCost) {
        if (itemCost <= balance) {
            items.add(itemName);
            balance -= itemCost;
            System.out.println("Successfully purchased: " + itemName);
        } else {
            System.out.println("Insufficient balance to purchase this item.");
        }
    }

    // Method to take a job and earn money
    public void takeJob(String jobName, double salary) {
        jobs.add(jobName);
        balance += salary;
        System.out.println("Completed job: " + jobName + " and earned vnd" + salary + ". Current balance: vnd" + balance);
    }

    // Display registered courses
    public void displayCourses() {
        System.out.println("Registered Courses:");
        if (courses.isEmpty()) {
            System.out.println("No courses registered yet.");
        } else {
            for (String course : courses) {
                System.out.println("- " + course);
            }
        }
    }

    // Display purchased items
    public void displayItems() {
        System.out.println("Purchased Items:");
        if (items.isEmpty()) {
            System.out.println("No items purchased yet.");
        } else {
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }

    // Display completed jobs
    public void displayJobs() {
        System.out.println("Completed Jobs:");
        if (jobs.isEmpty()) {
            System.out.println("No jobs completed yet.");
        } else {
            for (String job : jobs) {
                System.out.println("- " + job);
            }
        }
    }

    // Main method to test the Money class
    public static void main(String[] args) {
        Money studentMoney = new Money(12500000); // Set initial funds to 12500000vnd

        studentMoney.setInitialFunds(25000000); // Optional: reset funds

        studentMoney.registerCourse("Calculus 1", 3000000);
        studentMoney.registerCourse("Basic Physic 1", 3000000);

        studentMoney.addScholarship(12500000);
        studentMoney.purchaseItem("Laptop", 17000000);
        studentMoney.takeJob("Library Assistant", 7500000);

        studentMoney.checkBalance();

        studentMoney.displayCourses();
        studentMoney.displayItems();
        studentMoney.displayJobs();
    }
}
