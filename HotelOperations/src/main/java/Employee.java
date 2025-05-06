public class Employee {

    int employeeId;
    String name;
    String department;
    double payRate;
    int hoursWorked;
    int weeksWorked;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked, int weeksWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.weeksWorked = weeksWorked;
    }

    //region getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setWeeksWorked(int weeksWorked) {
        this.weeksWorked = weeksWorked;
    }

    public int getWeeksWorked(){
        return weeksWorked;
    }

    //endregion

    public double calculateTotalPay (int hoursWorked, int payRate) {
        return this.hoursWorked * this.payRate;
    }

//    public int calculateRegularhours(int hoursWorked, int weeksWorked) {
//        int regularHours = 0;
//        int hoursPerWeek = hoursWorked / weeksWorked;
//        if(hoursPerWeek >= 40) {
//            regularHours = (weeksWorked * 40);
//        } else {
//            regularHours += hoursPerWeek;
//        }
//
//        return regularHours;
//    }





}
