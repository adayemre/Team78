package utilities;

import pojos.Appointment;

import pojos.AppointmentMiddle;
import pojos.Registrant;
import pojos.RegistrantApi;
import pojos.US10_Appointment;
import stepdefinitions.apisteps.US0010_Physician_Appointments_Api_Step_Defs;
import pojos.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import java.util.Map;



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


    public static void saveRegistrantData(List<Object> SSNIds) {
        try {
            //fileWriter object creates a file in the path given(database_registrant_data). we make it false to add new data after deleting others
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("database_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);   // adds our test records into the created file

            for (Object eachSSN:SSNIds) {
                writer.append(eachSSN + ",\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveRegistrantData(Registrant [] registrants){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_all_registrant_data"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for(int i=0; i< registrants.length;i++) {
                writer.append(registrants[i].getFirstName()+","+ registrants[i].getLastName()+","+registrants[i].getSsn()+","+ registrants[i].getLogin()+
                        ","+ registrants[i].getId()+","+registrants[i].getEmail()+ "\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void saveRegistrantDataApi(Registrant registrant) {
        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("US01api_registrant_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(registrant+"\n");

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public static void saveAppointmentData(Appointment appointment) {
            try {
                //src/resources/testdata/Registrantdata.txt
                FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_records"), true);
                BufferedWriter writer = new BufferedWriter(fileWriter);

                writer.append(appointment+"\n");
                // writer.append(registrant.toString());

                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public static void saveApiRegistrantData(RegistrantApi registrantapi) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_registrant_data_file_name"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(registrantapi + "\n");
            // writer.append(registrant.toString());

            writer.close();
        } catch (Exception e) {

     public static void saveAppointData(AppointmentBT appointment){
        try{
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment+"\n");

            writer.close();
        }catch (Exception e){
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



    public static void saveAppointmentCreation(AppointmentMiddle appointmentCreationAPI){
        try{

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_creation_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointmentCreationAPI+"\n");

    }

    public static void saveAppointmentOuterData(AppointmentOuter appointment){
        try{
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_outer_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment+"\n");

            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void savePatientAppointment(Patient patient){
        try{
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("patient_appointment_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(patient+"\n");

            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }


    public static void saveRegistrantData(List<Object> SSNIds){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("database_registrant_data"), false); // her seferinde listeyi bastan getiriyor ??ncekileri silse iyi olur
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for(Object eachSSN : SSNIds){
                writer.append(eachSSN+",\n");
            }
         writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

              


    public static void saveTestItemInfo(CTestItem cTestItem){
        try{
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("created_testItem_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(cTestItem.getName()+","+cTestItem.getDescription()+","+cTestItem.getPrice()+","+
                    cTestItem.getDefaultValMin()+","+cTestItem.getDefaultValMax()+","+cTestItem.getCreatedDate()+"\n");

            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void saveApiPhysicianAppointment(List<US10_Appointment> list) {
        try {
            String path="C:\\Users\\admin\\IdeaProjects\\Team78\\src\\test\\resources\\testdata\\PhysicianAppointment.txt";
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(list + "\n");
            // writer.append(registrant.toString());

    public static void saveAllTestItems(CTestItem [] cTestItems){
        try{
            //we make it FALSE because we will update all data whenever we make a get request for all. Every time we will get all data
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("testItems_All_records"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i=0;i<cTestItems.length;i++){
                writer.append(cTestItems[i].getName()+","+cTestItems[i].getDescription()+","+ cTestItems[i].getPrice()+","+
                            cTestItems[i].getDefaultValMin()+","+cTestItems[i].getDefaultValMax()+","+cTestItems[i].getCreatedDate()+"\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void saveDBTestItemsData(List<Object> testItems) {
        try {
            //we make it FALSE to add updated data
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("DB_testItems_data"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Object eachTestItem:testItems) {
                writer.append(eachTestItem + ",\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void saveDeletedTestItem(String testItem) {
        try {
            //fileWriter object creates a file in the path(registrant_filename). we make it true to add new data without deleting others
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("deletedTestItemInfo"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);   // adds our test records into the created file
            writer.append(testItem+"\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
