package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentMiddle {


    /*
    {
  "appoSpeciality": "string",
  "birthDate": "2022-03-07T10:27:00.874Z",
  "email": "string",
  "firstName": "string",
  "gender": "string",
  "lastName": "string",
  "phone": "string",
  "snumber": "string",
  "ssn": "string",
  "startDate": "2022-03-07"
}
     */

    private AppoinmentInnest user;

    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private String phone;
    private String startDate;


    public AppointmentMiddle() {
    }


    public AppointmentMiddle(AppoinmentInnest user, String firstName, String lastName, String ssn, String email, String phone, String startDate) {
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.email = email;
        this.phone = phone;
        this.startDate = startDate;
    }


    public AppoinmentInnest getUser() {
        return user;
    }

    public void setUser(AppoinmentInnest user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    @Override
    public String toString() {
        return "AppointmentCreationAPI{" +
                "user=" + user +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}