package stepdefinitions.databaseStepDefs;
import pages.US05_AppointmentPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pages.US05_AppointmentPage;
import pages.US09_SignInPage;
import pojos.Appointment;

import java.util.List;
import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getColumnData;

public class US05_DatabaseStepDefs {

    US09_SignInPage signInPage=new US09_SignInPage();
    US05_AppointmentPage appointmentPage=new US05_AppointmentPage();

    Appointment appointment = new Appointment();



    private String firstname = appointment.getFirstname();
    public String username=firstname;


        List<Object> actualAppointmentList;
        @Given("user sets a connection with Medunna database")
        public void user_sets_a_connection_with_medunna_database() {
            createConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunnadb_user" ,
                    "Medunnadb_@129");
        }
        @Given("user selects id column data")
        public void user_selects_id_column_data() {
            actualAppointmentList=getColumnData("select * from appointment", "created_by");
            System.out.println(actualAppointmentList);
        }


    @Then("user validates created_by value with the database,")
    public void userValidatesCreated_byValueWithTheDatabase() {
        assertTrue(actualAppointmentList.contains("mehmetuns"));
        System.out.println(firstname);

    }
}


