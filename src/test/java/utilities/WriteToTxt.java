package utilities;

import pojos.Appointment;
import pojos.AppointmentMiddle;
import pojos.Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class WriteToTxt {



    public static void saveRegistrantData(Registrant registrant){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_registrant_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(registrant+"\n");
            writer.close();
        }catch (Exception e){
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



    public static void saveAppointmentCreation(AppointmentMiddle appointmentCreationAPI){
        try{

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_creation_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointmentCreationAPI+"\n");
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void saveRegistrantData(List<Object> SSNIds){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("database_registrant_data"), false); // her seferinde listeyi bastan getiriyor öncekileri silse iyi olur
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for(Object eachSSN : SSNIds){
                writer.append(eachSSN+",\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }





}