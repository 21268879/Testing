import java.util.ArrayList;

public class Project {
    private String startDate;
    private String endDate;
    private double projectHours =60;
    private int projectID = 45456;
    private double costEstimate;
    private ArrayList<String> projectAdverts= new ArrayList<>();


        public void populateArrayList(String chosenAd) {
            projectAdverts.add(chosenAd);
        }
        public int getArraySize(){
           int arraySize = projectAdverts.size();
           return arraySize;
        }

    //GETTERS
    public String getStartDate() {
        return startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public double getHours() {
        return projectHours;
    }
    public int getProjectID() {
        return projectID;
    }
    public double getCostEstimate() {
        return costEstimate;
    }
    public ArrayList<String> getProjectAdverts() {
        return projectAdverts;
    }

    //SETTERS
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public void setHours(double numberOfHours) {
        this.projectHours = numberOfHours;
    }
    public void setCostEstimate(double costEstimate) {
        this.costEstimate = costEstimate;
    }
    public void setProjectAdverts(ArrayList<String> projectAdverts) {
        this.projectAdverts = projectAdverts;
    }
}