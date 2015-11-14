public class Calculator {
    private String projectStart;
    private String projectEnd;
    private String[][] staffSalaries = new String[3][1];
    private double studioCost;
    private double staffCost;
    private double materialCost;   //photos,music etc.-
    private double spaceCost;	   //newspapers, air-time, advertising hoardings etc.
    private double estimatedCosts = studioCost + staffCost + materialCost + spaceCost;

    public Calculator(String projectStart, String projectEnd) {
        this.projectStart = projectStart;
        this.projectEnd = projectEnd;
    }

    //GETTERS
    public double getStudioCost() {
        return studioCost;
    }

    public double getSpaceCost() {
        return spaceCost;
    }

    public double getStaffCost() {
        return staffCost;
    }

    public double getMaterialCost() {
        return materialCost;
    }


    //SETTERS
    public void setStudioCost(double studioCost) {
        this.studioCost = studioCost;
    }

    public void setStaffCost(double staffCost) {
        this.staffCost = staffCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public void setSpaceCost(double spaceCost) {
        this.spaceCost = spaceCost;
    }

    public double baseStaffCost(){
        //BASE MEMBERS
        Manager testManager = new Manager();
        AdvertisingStaff testAdvertising = new AdvertisingStaff();
        Administrator testAdministrator = new Administrator();
        staffCost = testAdministrator.getSalary() + testAdvertising.getSalary() + testManager.getMemberSalary() ;
        return staffCost;
     }

    public int calculateHours(){     //TODO
        int imaginaryDates = 60*8;
        return imaginaryDates;
    }
}