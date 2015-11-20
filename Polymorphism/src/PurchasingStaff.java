
public class PurchasingStaff extends Staff{
    private static final double memberSalary = 20.60;
    private double pay;
    public double getMemberSalary(){
        return memberSalary;
    }
    public void setMemberPay(double projectHr){
        this.pay = projectHr * this.memberSalary;
    }
    public double getPay() {
        return pay;
    }
}
