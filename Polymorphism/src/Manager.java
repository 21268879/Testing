import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.text.*;

public class Manager extends Staff{
    private double memberSalary = 35.50;
    private double pay;

    public void setMemberSalary(double projectHr){
        this.pay = projectHr * this.memberSalary;
    }
    public double getMemberSalary(){
        return memberSalary;
    }
    public double getPay() {
        return pay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Project testProject = new Project();
        AdvertType calculate = new AdvertType();

        //GET PROJECT ID(you have 6 tries)
        for (int x = 0; x < 6; x++) {
            System.out.println("Enter the ID of the project you would like to estimate the costs for.\n");
            int projectID = sc.nextInt();sc.nextLine();

            //COMPARE PROJECT ID
            if (projectID == testProject.getProjectID())
            //IF PROJECT ID CORRECT
            {
                SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");    //DATE FORMATTER FOR PASING FORMATED STRINGS
                System.out.println("Enter the starting date for the project in yyyy-MM-dd format:"); //GET START DATE
                String startDate = sc.nextLine();//sc.nextLine();
                try{
                    testProject.setStartDate(sf.parse(startDate));
                }catch (ParseException e) {
                    System.out.println("Wrong start date format, please use the yyyy-MM-dd format when entering the project start dates.");
                }

                System.out.println("Enter the end of the project in yyyy-MM-dd format:"); //GET END DATE
                String endDate = sc.nextLine();
                try{
                    testProject.setEndDate(sf.parse(endDate));
                }catch(ParseException e2) {
                    System.out.println("Wrong end date format, please use the yyyy-MM-dd format when entering the project end dates.");
                }
                //CALCULATE MILLISECONDS BETWEEN Those two dates
                testProject.setDifference();
                //CALCULATE HOURS
                testProject.setHours();
                x = 6;
            } else if (projectID != testProject.getProjectID())
                System.out.println("The project ID does not exist.");
        }
        //ASK FOR ADVERT TYPES
        String[] advertsAr = new String[6];
        boolean continueAds = true;
        String moreAds;
        for(int i = 0; i < advertsAr.length; i++) {
                if(continueAds == true){
                System.out.println("Enter the advert type you would like to add: ");
                advertsAr[i] = sc.nextLine();

                    switch (advertsAr[i]) {
                        case "Web-based": testProject.setCostEstimate(calculate.calculateWeb());
                            break;
                        case "Email": testProject.setCostEstimate(calculate.calculateEmail());
                            break;
                        case "TV": testProject.setCostEstimate(calculate.calculateTV());
                            break;
                        case "Radio":testProject.setCostEstimate(calculate.calculateRadio());
                            break;
                        case "Newspaper":testProject.setCostEstimate(calculate.calculateNewspaper());
                            break;
                        case"Magasine": testProject.setCostEstimate(calculate.calculateMagasine());
                            break;
                    }

                    if(i < 5){
                        System.out.println("The current project cost is £"+ testProject.getCostEstimate());
                        System.out.println("Would you like to ad more advert types, answer yes or no.");
                        moreAds = sc.nextLine();

                        switch (moreAds){
                                case "yes": continueAds = true;
                                    break;
                                case "no": continueAds = false;
                                    break;
                                default: continueAds = false;
                            }
                    }
                }
        }
        testProject.setBasicStaffCost(testProject.getHours()); //BASIC STAFF COST
        System.out.println("Estimated cost of your project is £"+ testProject.getCostEstimate());
        System.out.println("Hours needed for project: " +testProject.getHours());
        System.out.println("And the costs of basic staff is £" + testProject.getBasicStaffCost());
    }
}