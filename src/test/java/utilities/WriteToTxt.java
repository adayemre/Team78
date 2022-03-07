package utilities;

import pojos.Appointment;
import pojos.Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToTxt {


    public static void saveRegistrantData(Registrant registrant) {
        try {
            //fileWriter object creates a file in the path(registrant_filename). we make it true to add new data without deleting others
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("registrant_filename"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);   // adds our test records into the created file

            writer.append(registrant+"\n");

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public static void saveRegistrantDataApi(Registrant registrant) {
        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_registrant_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(registrant+"\n");

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void saveAppointData(Appointment appointment){
        try{
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment+"\n");

            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }



}