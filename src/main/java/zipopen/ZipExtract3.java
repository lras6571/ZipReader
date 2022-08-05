package zipopen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipExtract3 {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("C:\\Users\\Lasan Rashmika\\Downloads\\08-01-2022-13_29_54.zip");
        Path source1 = Paths.get("C:\\pom.zip");
        Path target = Paths.get("C:\\Users\\Lasan Rashmika\\Desktop");

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader("C:\\Users\\Lasan Rashmika\\Downloads\\08-01-2022-13_29_54");
            br = new BufferedReader(fr);

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }

    }

}