public class Staff{
        private String staffMemberId;
        private int projectID;
        private double memberSalary;
        private double pay;

        public String getStaffMemberId() {
                return staffMemberId;
        }
        public void setStaffMemberId(String staffMemberId) {
                this.staffMemberId = staffMemberId;
        }
        public int getProjectID() {
                return projectID;
        }
        public void setProjectID(int projectID) {
                this.projectID = projectID;
        }

        public void setMemberPay(double projectHr){
                pay = projectHr * memberSalary;
        }
        public double getPay() {
                return pay;
        }

}