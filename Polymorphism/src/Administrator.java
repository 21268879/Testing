public class Administrator extends Staff {
    private static final double ADMINISTRATIONSALARY = 17.40;
    @Override
    public double getMemberSalary(){
        return ADMINISTRATIONSALARY;
    }
}
