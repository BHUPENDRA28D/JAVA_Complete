package A16;

import java.time.LocalDate;

public class Contact {
    private String name;
    private  long contact;

    public void setName(String name){ this.name =name;}
    public void setContact(long name){ contact =name;}

    public String getName(){return name;}
    public long getContact(){return contact;}
}
class DetailedContact extends Contact{
    private String email;
    private LocalDate dob;

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}