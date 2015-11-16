import java.util.ArrayList;

public class AdvertType {
    private String advertName;
    private int projectID;
    private double advertPurchasingStaffCost = 0.0;
    private double advertCopyrightCosts = 0.0;
    private double advertSpaceCost = 0.0;


    public double getAdvertSpaceCosts() {
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
        return advertName;
    }
}