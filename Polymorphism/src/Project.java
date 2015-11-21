import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Project {
    private int projectID = 45456;
    private Date startDate;
    private Date endDate;
    private long difference;
    private long projectHours;
    private double basicStaffCost;
    private double costEstimate;
    private double costEstimate2;

        //EACH DAY COUNTS AS 8 WORKING HOURS
        public long getHours() {
            return projectHours;
        }
        public int getProjectID() {
            return projectID;
        }
        public double getCostEstimate2() {
            return costEstimate2;
        }
        //SETTERS
        public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }
        public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }
        public void setDifference(){
            this.difference = this.endDate.getTime() - this.startDate.getTime();
        }
        public void setHours(){
            this.projectHours = (TimeUnit.DAYS.convert(this.difference, TimeUnit.MILLISECONDS))*8;
        }
        public void setCostEstimate(double costEstimate) {
            this.costEstimate += costEstimate;
        }

        public void setBasicStaffCost(long prHours){
            Manager testManager = new Manager();
            Administrator testAdmin = new Administrator();
            AdvertisingStaff testAdvertising = new AdvertisingStaff();
            testManager.setMemberPaycheck(prHours);
            testAdmin.setMemberPaycheck(prHours);
            testAdvertising.setMemberPaycheck(prHours);
            this.basicStaffCost = testAdvertising.getMemberPay()+testManager.getMemberPay()+testAdmin.getMemberPay();
        }
        public void setCostEstimate2() {
            this.costEstimate2 = basicStaffCost + costEstimate;
        }
}