package ranint.hai.door;

import java.util.Scanner;
import ranint.linh.character.Character;

public class DoorBlock {
    private float gpa = 0.0f;
    private float cpa = 0.0f;
    private int level = 1;
    private float totalGPA = 0.0f;
    private int gpaCount = 0;

    Scanner scanner = new Scanner(System.in);

    // Calculate GPA and update GPA stats
    public void calculateGPA(float newGPA) {
        this.gpa = newGPA;
        totalGPA += newGPA;
        gpaCount++;
        System.out.println("GPA updated to: " + newGPA);
    }

    // Show current GPA
    public void showGPA() {
        System.out.println("Current GPA: " + gpa);
    }

    // Calculate CPA as the average of all GPAs
    public void calculateCPA() {
        if (gpaCount > 0) {
            cpa = totalGPA / gpaCount;
        }
        System.out.println("CPA calculated as: " + cpa);
    }

    // Show current CPA
    public void showCPA() {
        System.out.println("Current CPA: " + cpa);
    }

    // Display character stats at the end of a level
    public void showStat(Character character) {
        System.out.println("Final stats for this level:");
        character.showInformation();
        character.showStat();
        showGPA();
        showCPA();
    }

    // Proceed to the next level
    public void nextLevel() {
        level++;
        System.out.println("Congratulations! Proceeding to level " + level);
        resetForNextLevel();
    }

    // Reset level-specific data
    private void resetForNextLevel() {
        gpa = 0.0f; // Reset GPA for the new level
    }

    // Replay the current level
    public void replay() {
        System.out.println("Replaying level " + level);
        resetForNextLevel();
    }
}