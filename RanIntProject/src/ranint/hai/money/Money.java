package ranint.hai.money;
import java.util.ArrayList;

import ranint.huy.menu.Course;

public class Money {
    private double balance;
    private double scholarshipAmount;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<String> items = new ArrayList<>();
    private ArrayList<String> jobs = new ArrayList<>();
    
    public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Method to set initial funds
    public void setInitialFunds(double amount) {
        this.balance = amount;
        System.out.println("Your mom gave you " + amount+ " VND. Don't waste it.");
    }

    // Method to register for a course
    public void registerCourse(Course course) {
        if (course.getCost() <= balance) {
            courses.add(course);
            this.setBalance(balance- course.getCost());
            System.out.println("Successfully registered for course: " + course.getName());
        } else {
            System.out.println("Insufficient balance to register for this course.");
        }
    }

    // Method to add scholarship funds
    public void addScholarship(double amount) {
        scholarshipAmount += amount;
        balance += amount;
        this.setBalance(balance);
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
            balance -= itemCost;
            this.setBalance(balance);
            System.out.println("Successfully purchased: " + itemName);
        } else {
            System.out.println("Insufficient balance to purchase this item.");
        }
    }

    // Method to take a job and earn money
    public void takeJob(String jobName, double salary) {
        jobs.add(jobName);
        balance += salary;
        this.setBalance(balance);
        System.out.println("Completed job: " + jobName + " and earned vnd" + salary + ". Current balance: vnd" + balance);
    }

    // Display registered courses
    public void displayCourses() {
        System.out.println("Registered Courses:");
        if (courses.isEmpty()) {
            System.out.println("No courses registered yet.");
        } else {
            for (Course course : courses) {
                System.out.println("- " + course.getName());
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
}