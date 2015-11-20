import java.util.ArrayList;

public class AdvertType {
    private double advertPurchasingStaffCost = 0.0;
    private double advertCopyrightCosts = 0.0;
    private double advertSpaceCost = 0.0;



    public double calculateWeb() {
        WebBasedAdvert testWeb = new WebBasedAdvert();
        double webBased = 300.50;
        return webBased;
    }

    public double calculateEmail() {
        double emailAd = 100.50;
        return emailAd;
    }

    public double calculateTV() {
        double tvAd = 1200.50;
        return tvAd;
    }

    public double calculateRadio() {
        double radioAd = 400.50;
        return radioAd;
    }

    public double calculateNewspaper() {
        double newspaperAd = 50.50;
        return newspaperAd;
    }

    public double calculateMagasine() {
        double magasineAd = 150.50;
        return magasineAd;
    }
}
















    /*public double getAdvertSpaceCosts() {
        return advertSpaceCost;
    }
    public void setAdvertSpaceCosts(double advertSpaceCosts) {
        this.advertSpaceCost = advertSpaceCosts;
    }
    public double getAdvertCopyrightCosts() {
        return advertCopyrightCosts;
    }
    public void setAdvertCopyrightCosts(double advertCopyrightCosts) {
        this.advertCopyrightCosts = advertCopyrightCosts;
    }
    public double getAdvertPurchasingStaff() {
        return advertPurchasingStaffCost;
    }
    public void setAdvertPurchasingStaff(double advertPurchasingStaff) {
        this.advertPurchasingStaffCost = advertPurchasingStaff;
    }
    public void setProjectID(int project){ this.projectID = project; }
    public int getProjectID(){
        return projectID;
    }
    public String getAdvertName() {
//        return advertName;*/
//    }
//}