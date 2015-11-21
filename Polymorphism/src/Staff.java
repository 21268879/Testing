
public class Staff{
        double memberSalary;
        double memberPaycheck;

        public void setMemberPaycheck(long projectHours){
                this.memberPaycheck = memberSalary * projectHours;
        }
        public double getMemberPay(){
                return memberPaycheck;
        }
}