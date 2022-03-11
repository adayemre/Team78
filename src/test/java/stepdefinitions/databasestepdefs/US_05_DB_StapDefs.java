package stepdefinitions.databasestepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getColumnData;

public class US_05_DB_StapDefs {
    List<Object> actualAppointmentList;
    @Given("user sets a connection with Medunna database")
    public void user_sets_a_connection_with_medunna_database() {
        createConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunnadb_user" ,
                "Medunnadb_@129");
    }
    @Given("user selects id column data")
    public void user_selects_id_column_data() {
        actualAppointmentList=getColumnData("select * from appointment where id=23269", "created_by");
        System.out.println(actualAppointmentList);
    }

    @Then("user validates created_by value with the database")
    public void userValidatesCreated_byValueWithTheDatabase() {
        assertTrue(actualAppointmentList.contains("mehmetuns"));
    }
}
