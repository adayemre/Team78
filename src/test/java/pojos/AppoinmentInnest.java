package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppoinmentInnest {
    /*
    {
            "createdBy": "anonymousUser",
            "createdDate": "2022-03-02T20:42:39.827279Z",
            "id": 12235,
            "login": "patienttugba",
            "firstName": "Patient",
            "lastName": "Tugba",
            "email": "patienttugba@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null,
            "ssn": "677-85-5486"
        }
     */


    private String firstName;
    private String lastName;
    private String email;
    private String ssn;


    public AppoinmentInnest() {
    }


    public AppoinmentInnest(String firstName, String lastName, String email, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ssn = ssn;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    @Override
    public String toString() {
        return "AppoinmentInnest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
