package ie.atu.week8;

import java.io.*;

public class CreateFile1 {
    public static void main(String[] args) {

        {
            File myFile = new File("MyFile.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());
            String content = "Details to write";
                try
                {
                    PrintWriter myWriter = new PrintWriter(
                            new FileWriter(myFile, true));
                    myWriter.println(" Hello Feller");
                    myWriter.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }

        }

    }

}
