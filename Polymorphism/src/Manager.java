import java.util.*;
import java.text.*;

public class Manager extends Staff{
    public void setMemberPaycheck(long projectHours){
        Salary managerSalary = new Salary();
        this.memberPaycheck = managerSalary.getManagerStaffSalary() * projectHours;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Project testProject = new Project();
            AdvertType testAdvertTypes = new AdvertType();
            boolean incorrectDateFormat;

            for (int x = 0; x < 6; x++) {     //GET PROJECTS DATES
                SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");       //DATE FORMATTER FOR PASING FORMATED STRINGS
                do {
                  incorrectDateFormat = false;
                    System.out.println("Enter the starting date for the project in yyyy-MM-dd format:");    //GET START DATE
                    String startDate = sc.nextLine();
                    try{
                        testProject.setStartDate(sf.parse(startDate));
                    }catch (ParseException wrongDateFormat) {
                        System.out.println("Wrong start date format, please use the yyyy-MM-dd format when entering the project start dates.");
                        incorrectDateFormat = true;
                    }
                }while(incorrectDateFormat);

                do{
                   incorrectDateFormat = false;
                    System.out.println("Enter the end of the project in yyyy-MM-dd format:");   //GET END DATE
                    String endDate = sc.nextLine();
                    try{
                        testProject.setEndDate(sf.parse(endDate));
                    }catch(ParseException wrongDateFormat2) {
                        System.out.println("Wrong end date format, please use the yyyy-MM-dd format when entering the project end dates.");
                        incorrectDateFormat = true;
                    }
                }while(incorrectDateFormat);

                    testProject.setDifference();   //CALCULATE MILLISECONDS BETWEEN Those two dates

                    testProject.setHours();   //CALCULATE HOURS

                    testProject.setBasicStaffCost(testProject.getHours());  //SET BASIC STAFF COST
                    x = 6;
            }
            //ASK FOR ADVERT TYPES
            String[] advertsAr = new String[6];
            boolean continueAds = true;
            String moreAds;
            boolean adPresent;
            String newAdvert;
            for(int i = 0; i < advertsAr.length; i++) {
                    if(continueAds == true){

                        do{
                            adPresent = false;
                            System.out.println("Enter the advert type you would like to add: ");
                            newAdvert = sc.nextLine();
                            adPresent = Arrays.asList(advertsAr).contains(newAdvert);
                        }while(adPresent == true);

                        advertsAr[i] = newAdvert;
                        switch (advertsAr[i]) {
                            case "Web-based": testProject.setCostEstimate(testAdvertTypes.calculateWeb());
                                break;
                            case "Email": testProject.setCostEstimate(testAdvertTypes.calculateEmail());
                                break;
                            case "TV": testProject.setCostEstimate(testAdvertTypes.calculateTV(testProject.getHours()));
                                break;
                            case "Radio":testProject.setCostEstimate(testAdvertTypes.calculateRadio(testProject.getHours()));
                                break;
                            case "Newspaper":testProject.setCostEstimate(testAdvertTypes.calculateNewspaper());
                                break;
                            case"Magazine": testProject.setCostEstimate(testAdvertTypes.calculateMagazine());
                                break;
                        }
                        testProject.setCostEstimate2();
                            if(i < 5){
                                System.out.println("Current cost estimate for the project is £"+ testProject.getCostEstimate2());
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
            System.out.println("The final estimated cost for the project is £"+ testProject.getCostEstimate2());
            System.out.println("Hours needed for project: " +testProject.getHours());
        }
}