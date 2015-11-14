import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Manager extends Staff {
    private double memberSalary = 35;
        public static void main(String[] args) {
            double projectDays;
            double estimatedCosts;
            int countID;

            Scanner sc = new Scanner(System.in);
            Project testProject = new Project();

            //ASK FOR PROJECT ID
            for (countID = 0; countID < 6; countID++) {
                System.out.println("Enter the ID of the project you would like to estimate the costs for.\n");
                int projID = sc.nextInt();

                //GET START AND END PROJECT DATES
                if (projID == testProject.getProjectID()) {
                    System.out.println("Enter the start date of the promotion: ");
                    String stDate = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter the end date of the promotion: ");
                    String enDate = sc.nextLine();

                    testProject.setStartDate(stDate);
                    testProject.setEndDate(enDate);
                    countID = 6;
                } else if (projID != testProject.getProjectID() || countID < 5) {
                    System.out.println("The project ID does not exist.");
                }else{
                    System.out.println("Please re-run the program, you have entered 5 invalid project IDs.\n");
                }
            }

            //CALCULATE DAYS
            Calculator estimateCosts = new Calculator(testProject.getStartDate(), testProject.getEndDate());
            projectDays = estimateCosts.calculateHours();
            testProject.setNumberOfDays(projectDays);

            System.out.println("What types of adverts would you like");
            //GET MAMBERS SALARIES
            estimatedCosts = (estimateCosts.baseStaffCost()) * testProject.getNumberOfDays();
            System.out.println("The cost of the staff hours is £" + estimatedCosts);
        }
}