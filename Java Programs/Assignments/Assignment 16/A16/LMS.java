package A16;

public class LMS {
    private String name;
    private String email;
    private boolean active;
    private   double sub_amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getSub_amount() {
        return sub_amount;
    }

    public void setSub_amount(double sub_amount) {
        this.sub_amount = sub_amount;
    }
}

//Admin class.
class Admin extends LMS
{       private String adminData;
        private int chapter;

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public String getAdminData() {
        return adminData;
    }

    public void setAdminData(String adminData) {
        this.adminData = adminData;
    }
}

//Learner Class.
class Learner extends LMS{
    private int active_time;

    public int getActive_time() {
        return active_time;
    }

    public void setActive_time(int active_time) {
        this.active_time = active_time;
    }
}