package ie.atu.week8;

import java.io.*;

public class CreateFile1 {
    public static void main(String[] args) {

        {
            File myFile = new File("MyFile.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());


        }

    }

}
