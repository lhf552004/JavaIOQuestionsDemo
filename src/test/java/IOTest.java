import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOTest {
    @Test
    public void whenConvertingToFile_thenCorrect()
            throws IOException {

        InputStream initialStream = new FileInputStream(
                new File("src/main/resources/sample.txt"));
        byte[] buffer = new byte[initialStream.available()];
        initialStream.read(buffer);
        // Convert byte[] array to string
        String s = new String(buffer, StandardCharsets.UTF_8);
        System.out.println(s);
        File targetFile = new File("src/main/resources/targetFile.tmp");
        OutputStream outStream = new FileOutputStream(targetFile);
        outStream.write(buffer);
    }
}
