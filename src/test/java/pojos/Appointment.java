package pojos;

public class Appointment {

    private String firstname;
    private String lastname;
    private String ssn;
    private String email;
    private String email2;
    private String phoneNumber;
    private String date;

    public Appointment() {
    }
    public Appointment(String firstname, String lastname, String ssn, String email, String phoneNumber, String date) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.email = email;
      
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email) {
        this.email2 = email2;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Appointment{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                ", email2='" + email2 + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}