import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;


public class Apple implements GroceryProductFactory {
    @Override
    //setPrice method scans through data file for price of product and sets the price accordingly
    public void setPrice(){
        try {
            String f = "Apple Price";
            File myObj = new File("price.txt");

            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                //read line and splits data into title and value
                String splitData[] = myReader.nextLine().split(":");

                //if it does not contain data, continue
                if(splitData.length == 1) continue;

                //check if we are reading the price line
                if(splitData[0].equals(f)) {
                    //print price
                    System.out.println("Price of Apple is set to" + splitData[1] ); //print price
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }    }
    }


