package stepdefinitions.dbsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getColumnData;

public class DB_AppointmentStepDefs {

    List<Object> appointmentListId = new ArrayList<>();

    @Given("user sets a connection with database")
    public void user_sets_a_connection_with_database() {
        createConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunnadb_user" , "Medunnadb_@129");
    }

    @And("user selects all {string} coloumn data")
    public void user_selects_all_column_data(String id) {
        appointmentListId = getColumnData("select * from appointment", id);
        System.out.println(appointmentListId);
    }

    @Then("user validates appointment {string} with the database")
    public void user_validates_appointment_ids_with_the_database(String id) {
        assertTrue(appointmentListId.toString().contains(id));
    }
}
