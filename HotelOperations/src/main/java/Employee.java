public class Employee {

    int employeeId;
    String name;
    String department;
    double payRate;
    double totalHours;
    int weeksWorked;
    double startTime;
    double endTime;



    boolean isWorking;
    double todayHours;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
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

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public void setWeeksWorked(int weeksWorked) {
        this.weeksWorked = weeksWorked;
    }

    public int getWeeksWorked() {
        return weeksWorked;
    }
    //endregion

    public void punchTimeCard(double time) {
        if(!isWorking) {
            startTime = time;
            isWorking = true;
        } else {
            isWorking = false;
            endTime = time;
            todayHours = time - startTime;
            this.totalHours += todayHours;
        }
    }

    public boolean punchIn(double time) {
        if (!this.isWorking && time < 24 && time > 0) {
            startTime = time;
            setWorking(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean punchOut(double time) {
        if (this.isWorking && time < 24 && time > 0) {
        endTime = time;
        totalHours += endTime - startTime;
        setWorking(false);
        return true;
        } else {
            return false;
        }
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

//    public double punchIn() {
//        double startHour = LocalTime.now().getHour();
//        double startMinute = LocalTime.now().getMinute();
//        startMinute /= 60;
//        startTime = startHour + startMinute;
//
//        return startTime;
//    }
//
//    public double punchOut() {
//        double endHour = LocalTime.now().getHour();
//        double endMinute = LocalTime.now().getMinute();
//        endMinute /= 60;
//        endTime = endHour + endMinute;
//
//        return endTime;
//    }

    public double calculateTotalPay(int hoursWorked, int payRate) {
        return this.totalHours * this.payRate;
    }

    public double getEndTime() {
        return endTime;
    }

    public double getStartTime() {
        return startTime;
    }
}
