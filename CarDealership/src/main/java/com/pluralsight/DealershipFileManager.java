package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    public Dealership getDealership(  ) {
        //read inventory.csv file
        //read the first line which has the dealership data
        //take the line of dealership data and split by | which returns a string array of each piece of dealership data
        //take each column/piece of data and pass it into the constructor of our Dealership to create a specific dealership object

        try {
            FileReader fileReader = new FileReader("data/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }



        Dealership dealership = new Dealership("","", "");
        return dealership;
    }


    public void saveDealership(Dealership dealership){

    }

}
