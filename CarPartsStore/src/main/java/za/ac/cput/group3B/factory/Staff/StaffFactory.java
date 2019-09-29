package za.ac.cput.group3B.factory.staff;

import za.ac.cput.group3B.domain.Staff.Staff;

public class StaffFactory {
    public static Staff getStaff(int staffId, String staffFName, String staffLName, String staffJobTitle) {
        return new Staff.Builder()
                .staffId(staffId)
                .staffFName(staffFName)
                .staffLName(staffLName)
                .staffJobTitle(staffJobTitle)
                .build();
    }
}
