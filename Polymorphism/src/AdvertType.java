import java.util.ArrayList;

public class AdvertType {	
    private int advertType;
    private ArrayList<Staff> projectStaffList;
    //Adding new features
	
    public int getAdvertType() {
        return advertType;
    }

    public void setAdvertType(int advertType) {
        this.advertType = advertType;
    }

    public ArrayList<Staff> getProjectStaffList() {
        return projectStaffList;
    }

    public void setProjectStaffList(ArrayList<Staff> projectStaffList) {
        this.projectStaffList = projectStaffList;
    }
}
