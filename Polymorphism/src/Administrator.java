public class Administrator extends Staff {
    private static final double memberSalary = 17.40;
    private double pay;
    public double getMemberSalary(){
        return memberSalary;
    }
    public void setMemberSalary(double projectHr){
        this.pay = projectHr * this.memberSalary;
    }
    public double getPay() {
        return pay;
    }
}
