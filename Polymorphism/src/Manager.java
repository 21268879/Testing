import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.text.*;


public class Manager extends Staff{
    private double memberSalary = 35.50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Project testProject = new Project();
        Calculator calculate = new Calculator();

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
        System.out.println("Estimated cost of your project is £"+testProject.getCostEstimate());
    }
}
//ADVERT TYPES
//NEW LOOP FOR CHOOSING ADVERTS
                   /* public class testAdsArray {
                        public static void main(String[] args) {
                            String[] advertsAr = new String[6];
                            Scanner sc = new Scanner(System.in);

                            for(int i =0; i < advertsAr.length; i++) {
                                System.out.println("Enter the advert type you would like to add:");
                                advertsAr[i] = sc.nextLine();
                                System.out.println(advertsAr[i]);
                            }
                        }
                    }*/

/*double projectCost = testProject.getHours()*testProject.getArraySize();
                    testProject.setCostEstimate(projectCost);*/

        /*boolean finishAdding = false;
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

        x = 6;
        System.out.println("Project estimate is: £" + testProject.getCostEstimate() + "\nNumber of hours spend on the project: " + testProject.getHours());*/