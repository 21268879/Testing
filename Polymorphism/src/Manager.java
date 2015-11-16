import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Manager extends Staff {
    private double memberSalary = 35.50;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Project testProject = new Project();


            //ASK FOR PROJECT ID
            for (int x = 0; x < 6; x++) {
                System.out.println("Enter the ID of the project you would like to estimate the costs for.\n");
                int projectID = sc.nextInt();

                //GET START AND END PROJECT DATES
                if (projectID == testProject.getProjectID()) {
                    System.out.println("Enter the start date of the promotion: ");
                    String projectStart = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter the end date of the promotion: ");
                    String projectEnd = sc.nextLine();
                    testProject.setStartDate(projectStart);
                    testProject.setEndDate(projectEnd);

                    //CALCULATE and SET PROJECT HOURS
                    Calculator calculate = new Calculator(testProject.getStartDate(), testProject.getEndDate());
                    testProject.setHours(calculate.calculateHours());


                        //ADVERT TYPES
                    boolean finishAdding = false;
                    int arrayLoop = 0;
                    while (arrayLoop <=5 && finishAdding == false){
                             System.out.println("To add an advert into this project," +" type one of the following:\nWeb-based\nEmail\nTV\nRadio\nNewspaper\nMagasine");
                             String chosenAd = sc.nextLine();
                             testProject.populateArrayList(chosenAd);
                        arrayLoop++;
                            if(arrayLoop<=5){
                             System.out.println("Would you like to add more advert types?\n" +"Type yes or no.");
                             String adOption = sc.nextLine();
                                switch (adOption) {
                                    case "Yes": finishAdding = false;
                                        break;
                                    case "yes": finishAdding =false;
                                        break;
                                    case "No": finishAdding=true;
                                        break;
                                    case"no": finishAdding=true;
                                        break;
                                    default: finishAdding=false;
                                        break;
                                }
                             }
                    }
                    double projectCost = testProject.getHours()*testProject.getArraySize();
                    testProject.setCostEstimate(projectCost);
                    x = 6;
                    System.out.println("Project estimate is: £" + testProject.getCostEstimate() + "\nNumber of hours spend on the project: " + testProject.getHours());
                }else if (projectID != testProject.getProjectID())
                    System.out.println("The project ID does not exist.");
            }
        }
}
