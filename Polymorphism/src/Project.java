import java.util.Date;
import java.time.*;
import java.util.ArrayList;

public class Project {
    private int projectID = 45456;
    private Date startDate;
    private Date endDate;
    private long difference;
    private long projectHours;
    private double costEstimate;
    private ArrayList<String> projectAdverts= new ArrayList<>();

        //GETTERS
        public Date getStartDate() {
            return startDate;
        }
        public Date getEndDate() {
            return endDate;
        }
        //EACH DAY COUNTS AS 8 WORKING HOURS
        public long getHours() {
            this.difference = this.startDate.getTime() - this.endDate.getTime();
            this.projectHours = ((this.difference - (-57600000))/ -3600000);
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
        public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }
        public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }
        public void setCostEstimate(double costEstimate) {
            this.costEstimate += costEstimate;
        }
        public void setProjectAdverts(ArrayList<String> projectAdverts) {
            this.projectAdverts = projectAdverts;
        }


}
//DateTime date = DateTime.parse("04/02/2011 20:27:05",
//DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));