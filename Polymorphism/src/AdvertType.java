import java.util.ArrayList;

public class AdvertType {
    private double advertCopyrightCostsL = 750;
    private double advertCopyrightCostsH = 1500.0;
    private double advertSpaceCostTV = 1800;
    private double advertSpaceCostR = 900;
    private double purchasingStaffSalary = 20.60;


    public double calculateWeb() {
        return 0;
    }

    public double calculateEmail() {
        return advertCopyrightCostsL;
    }

    public double calculateTV(double prHours) {
        double tvAd = advertCopyrightCostsH +advertSpaceCostTV+(prHours*this.purchasingStaffSalary);
        return tvAd;
    }

    public double calculateRadio(double prHours) {
        double radioAd = advertSpaceCostR + advertCopyrightCostsL+ (prHours*this.purchasingStaffSalary);
        return radioAd;
    }

    public double calculateNewspaper() {
        double newspaperAd = advertCopyrightCostsL;
        return newspaperAd;
    }

    public double calculateMagasine() {
        double magasineAd = advertCopyrightCostsH;
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