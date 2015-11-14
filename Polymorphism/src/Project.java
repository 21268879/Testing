import java.util.ArrayList;

public class Project {
    private String startDate;
    private String endDate;
    private double numberOfDays;
    private int projectID = 45456;
    private ArrayList<Staff> projectMembers;

    public int getProjectID() {
        return projectID;
    }/*
    public String[][] getAdTypes() {
        return adTypes;
    }
    public void setAdTypes(String[][] adTypes) {
        this.adTypes = adTypes;
    }*/
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public double getNumberOfDays() {
        return numberOfDays;
    }
    public void setNumberOfDays(double numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}