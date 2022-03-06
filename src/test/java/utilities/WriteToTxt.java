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
            BufferedWriter writer = new BufferedWriter(fileWriter);// adds our test records in the created file
            //1. way of adding data to txt file
            writer.append(registrant+"\n");

            //2. way of adding data to txt file
//            writer.append(registrant.getUsername() + "," + registrant.getFirstname() + "," + registrant.getLastname() + "," + registrant.getSsn() + "," +
//                    registrant.getEmail() + "," + registrant.getPassword() + "\n");
            //1. way of adding data to txt file
//            writer.append(registrant.toString()); we can also write like this to write all data in pojo to txt file

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void saveAppointData(Appointment appointment){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_records"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment+"\n");

            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }



}