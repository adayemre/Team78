package utilities;

import pojos.Appointment;
import pojos.Registrant;
import pojos.RegistrantApi;
import pojos.US10_Appointment;
import stepdefinitions.apisteps.US0010_Physician_Appointments_Api_Step_Defs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class WriteToTxt {

    public static void saveRegistrantData(Registrant registrant) {

        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("registrant_filename"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(registrant + "\n");
            // writer.append(registrant.toString());

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

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }