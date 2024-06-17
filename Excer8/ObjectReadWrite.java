package com.hcltech.Excer8;
import java.io.*;
import java.util.Date;

public class ObjectReadWrite {
    public static void main(String[] args) {
        String filename = "objects.dat";

        // Create objects
        Date dateObject = new Date();
        Double doubleObject = 123.456;
        Long longObject = 789L;

        // Write objects to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(dateObject);
            oos.writeObject(doubleObject);
            oos.writeObject(longObject);
            System.out.println("Objects written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing objects to file.");
            e.printStackTrace();
        }

        // Read objects from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Date readDateObject = (Date) ois.readObject();
            Double readDoubleObject = (Double) ois.readObject();
            Long readLongObject = (Long) ois.readObject();

            System.out.println("Objects read from file successfully:");
            System.out.println("Date object: " + readDateObject);
            System.out.println("Double object: " + readDoubleObject);
            System.out.println("Long object: " + readLongObject);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading objects from file.");
            e.printStackTrace();
        }
    }
}
