package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentOuter {


/*
{
    "createdBy": "anonymousUser",
    "createdDate": "2022-03-07T19:51:05.450030Z",
    "id": 18230,
    "startDate": "2025-12-12T00:00:00Z",
    "endDate": "2025-12-12T01:00:00Z",
    "status": "UNAPPROVED",
    "anamnesis": null,
    "treatment": null,
    "diagnosis": null,
    "prescription": null,
    "description": null,
    "physician": null,
    "patient": {
 */

    private AppointmentMiddle patient;
    private String startDate;
    private Integer id;

    public AppointmentOuter() {
    }

    public AppointmentOuter(AppointmentMiddle patient, String startDate, int id) {
        this.patient = patient;
        this.startDate = startDate;
        this.id = id;
    }

    public AppointmentMiddle getPatient() {
        return patient;
    }

    public void setPatient(AppointmentMiddle patient) {
        this.patient = patient;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "AppointmentOuter{" +
                "patient=" + patient +
                ", startDate='" + startDate + '\'' +
                ", id=" + id +
                '}';
    }
}
