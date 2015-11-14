public class Staff{
        private String staffMemberId;
        private int projectID;
        private double memberSalary;

        public Staff (){
        }

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
        public double getMemberSalary() {
                return memberSalary;
        }
        public void setMemberSalary(double memberSalary) {
                this.memberSalary = memberSalary;
        }
}