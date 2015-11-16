
public class TVAdvert extends AdvertType {
    private String advertName;
    private double purchasingStaffCost;

    public void setPurchaingStaffCost(double projectHours, double memberSalary){
        this.purchasingStaffCost = projectHours * memberSalary;
    }
    public String getAdvertName() {
        return advertName;
    }
}
