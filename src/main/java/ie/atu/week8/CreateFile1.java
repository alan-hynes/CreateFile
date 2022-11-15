package ie.atu.week8;

import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class CreateFile1 {
    public static void main(String[] args) {

        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("My file is located at ");
            String fileName = keyboard.nextLine();
                try
                {
                    Scanner inputFile = new Scanner(new File(fileName));
                    while(inputFile.hasNextLine())
                    {
                        System.out.println(inputFile.nextLine());
                    }
                } catch (IOException e)
                {
                    e.printStackTrace();
                }

        }

    }

}
