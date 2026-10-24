
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker
{  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Float> studentGrades = new ArrayList<>();

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();  // Use int for loop and index

        // Input students name and grades
        for (int i = 0; i < n; i++) 
        {
            sc.nextLine();  // consume newline
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            String name = sc.nextLine();
            studentNames.add(name);

          float grade;
          do
          {
             System.out.print("Enter Grade of " + name + " (0–100): ");
             grade = sc.nextFloat();
          }
          while(grade < 0 || grade > 100);// validation
            studentGrades.add(grade);
        }

        // Calculate average, highest, and lowest
        float sum = 0;
        float highest = Float.MIN_VALUE;
        float lowest = Float.MAX_VALUE;

        for (float grade : studentGrades) 
        	
        {
            sum += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        float average = sum / n;

        // Display summary
        System.out.println("\n------ Summary Report -------");
        for (int i = 0; i < n; i++) {
            System.out.println(studentNames.get(i) + " - Grade = " + studentGrades.get(i));
        }

        System.out.printf("Average Grade : %.2f\n", average);
        System.out.println("Highest Grade : " + highest);
        System.out.println("Lowest Grade  : " + lowest);

        sc.close();
    }
}

