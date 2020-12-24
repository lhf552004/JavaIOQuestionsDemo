package com.jci.myproject;

import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, ClassNotFoundException {
        // TODO Auto-generated method stub
        // Start Demo 1-Create folder-------------------
//        boolean success = false;
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter path of directory to create");
//        String dir = reader.nextLine();
//
//
//        File directory = new File(dir);
//        if (directory.exists()) {
//            System.out.println("Directory already exists ...");
//        } else {
//            System.out.println("Directory not exists, creating now");
//            success = directory.mkdir();
//            if (success) {
//                System.out.printf("Successfully created new directory : %s%n", dir);
//            } else {
//                System.out.printf("Failed to create new directory: %s%n", dir);
//            }
//        }
//        // close Scanner to prevent resource leak reader.close();
//        reader.close();
        // End Demo 1---------------------------

        // Start Demo 2 --FileReader----------------------------------
//        Reader fileReader = new FileReader("src/main/resources/sample.txt");
//        char[] buff;
//        int data = fileReader.read();
//        while(data != -1) {
//            //do something with data...
//            System.out.println((char)data);
//
//            data = fileReader.read();
//        }
//        fileReader.close();
//        // End Demo2--------------------------------
//
//        // Start Demo 3---BufferedReader Read line-------------
//        String line;
//        BufferedReader bufferreader = new BufferedReader(new FileReader("src/main/resources/sample.txt"));
//
//
//        while ((line = bufferreader.readLine()) != null) {
//            /**
//             Your implementation
//             **/
//            System.out.println(line);
//        }
        // End Demo 3---------------------------------

        // Start Demo 4 append string to file-----------
//        String path = "C:/sample.txt";
//
//        //creating file object from given path
//        File file = new File("src/main/resources/sample.txt");
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getCanonicalPath());
//
//        //FileWriter second argument is for append if its true than FileWritter will
//        //write bytes at the end of File (append) rather than beginning of file
//        FileWriter fileWriter = new FileWriter(file,true);
//
//        //Use BufferedWriter instead of FileWriter for better performance
//        BufferedWriter bufferFileWriter  = new BufferedWriter(fileWriter);
//        fileWriter.append("\nThis text should be appended in File form Java Program");
//
//        //Don't forget to close Streams or Reader to free FileDescriptor associated with it
//        bufferFileWriter.close();
//
//        System.out.println("Java Program for appending content into File has been completed");

        // End Demo 4-------------------------------

        // Start Demo 5 read zip file--------------------------
//        readUsingZipFile();
        // End Demo 6----------------------------------
        // Start Demo 7 default character encoding------------------------
//        String defaultCharacterEncoding = System.getProperty("file.encoding");
//        System.out.println("defaultCharacterEncoding by property: " + defaultCharacterEncoding);
//        System.out.println("defaultCharacterEncoding by code: " + getDefaultCharEncoding());
//        System.out.println("defaultCharacterEncoding by charSet: " + Charset.defaultCharset());

        // TODO: Is it safe to do that?
//        System.setProperty("file.encoding", "UTF-16");
//
//        System.out.println("defaultCharacterEncoding by property after updating file.encoding : " + System.getProperty("file.encoding"));
//
//        System.out.println("defaultCharacterEncoding by code after updating file.encoding : " + getDefaultCharEncoding());
//
//        System.out.println("defaultCharacterEncoding by java.nio.Charset after updating file.encoding : " + Charset.defaultCharset());
        // End Demo 7----------------------------------

        // Start Demo 8 Delete folder-------------------------------
//        deleteDirectory(new File("one"));
        // End Demo 8----------------------------------

        // Start Demo 9 convert InputStream to string -----------------
//        FileInputStream fis = new FileInputStream("src/main/resources/sample.txt");
//        String inputStreamString = new Scanner(fis,"UTF-8").useDelimiter("\\A").next();
//        System.out.println(inputStreamString);
        // End Demo 9 -------------------------------------------------

        // Start Demo 10 read whole text from file into String
//        String data = new String(Files.readAllBytes(Paths.get("src/main/resources/sample.txt")));
//        System.out.println(data);
        // End Demo 10-------------------------------------------------

        // Start Demo 11 from file-------------------------------------
//        //absolute path for source file to be copied
//        String source = "src/main/resources/sample.txt";
//        //directory where file will be copied
//        String target ="src/main/resources/temp/";
//
//        //name of source file
//        File sourceFile = new File(source);
//        String name = sourceFile.getName();
//
//        File targetFile = new File(target+name);
//        System.out.println("Copying file : " + sourceFile.getName() +" from Java Program");
//
//        //copy file from one location to other
//        FileUtils.copyFile(sourceFile, targetFile);
//
//        System.out.println("copying of file from Java program is completed");
        // end demo 11---------------------------------------------------

        // Start Demo 12 read resource file from classpath----------------
        // loading resource using getResourceAsStream() method
        // Not work
//        InputStream in = Main.class.getResourceAsStream("app.properties");
//        Properties config = new Properties();
//        try {
//            config.load(in);
//            System.out.println(config.getProperty("name"));
//            System.out.println(config.getProperty("version")); }
//        catch (IOException e1) {
//            e1.printStackTrace();
//        }

        // loading resource using getResource() method
        // Not work
//        URL resourceURL = Main.class.getResource("app.properties");
//        Properties appConfig = new Properties();
//        try {
//            appConfig.load(resourceURL.openStream());
//            System.out.println(appConfig.getProperty("name"));
//            System.out.println(appConfig.getProperty("version"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // End Demo 12--------------------------------------------

        // Start Demo 13 read xml file----------------------------
        // our XML file for this example
//        File xmlFile = new File("src/main/resources/info.xml");
//        // Let's get XML file as String using BufferedReader
//        // FileReader uses platform's default character encoding
//        // if you need to specify a different encoding, use InputStreamReader
//        Reader fileReader = new FileReader(xmlFile);
//        BufferedReader bufReader = new BufferedReader(fileReader);
//        StringBuilder sb = new StringBuilder();
//        String line = bufReader.readLine();
//        while( line != null){
//            sb.append(line).append("\n");
//            line = bufReader.readLine();
//        }
//        String xml2String = sb.toString();
//        System.out.println("XML to String using BufferedReader : ");
//        System.out.println(xml2String);
//        bufReader.close();
//        // parsing XML file to get as String using DOM Parser
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
//        Document xmlDom = docBuilder.parse(xmlFile);
//
//        String xmlAsString = xmlDom.toString(); // this will not print what you want System.out.println("XML as String using DOM Parser : ");
//        System.out.println(xmlAsString);
//        // Reading XML as String using jCabi library
//        XML xml = new XMLDocument(new File("src/main/resources/info.xml"));
//        String xmlString = xml.toString();
//        System.out.println("XML as String using JCabi library : " );
//        System.out.println(xmlString);

        // End Demo 13---------------------------------------------------

        // Start Demo 14 serialize and deserialize----------------------------------------------
//        Employee employee = new Employee();
//        employee.setAge(33);
//        employee.setName("Calvin");
//        serialize(employee);
//        System.out.println(deserialize());
        // End Demo 14----------------------------------------------------------------------

        // Start Demo 15 RandomAccessFile------------------------------------------------
//        String data = "KitKat (4.4 - 4.4.2)";
//        writeToRandomAccessFile("sample.store", 100, data);
//        System.out.println("String written into RandomAccessFile from Java Program : " + data);
//        String fromFile = readFromRandomAccessFile("sample.store", 100);
//        System.out.println("String read from RandomAccessFile in Java : " + fromFile);
        // End Demo 15-------------------------------------------------------------------



    }

    private static final String FILE_NAME = "C:\\temp\\pics.zip";
    private static final String OUTPUT_DIR = "C:\\temp\\Images\\";
    private static final int BUFFER_SIZE = 8192;

    private static void readUsingZipFile() throws IOException {
        final ZipFile file = new ZipFile(FILE_NAME);
        System.out.println("Iterating over zip file : " + FILE_NAME);
        try {
            final Enumeration<? extends ZipEntry> entries = file.entries();
            while (entries.hasMoreElements()) {
                final ZipEntry entry = entries.nextElement();
                System.out.printf("File: %s Size %d Modified on %TD %n", entry.getName(), entry.getSize(), new Date(entry.getTime()));
                extractEntry(entry, file.getInputStream(entry));
            }
            System.out.printf("Zip file %s extracted successfully in %s", FILE_NAME, OUTPUT_DIR);
        } finally {
            file.close();
        }
    }

    private static void readUsingZipInputStream() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(FILE_NAME));
        final ZipInputStream is = new ZipInputStream(bis);
        try {
            ZipEntry entry;
            while ((entry = is.getNextEntry()) != null) {
                System.out.printf("File: %s Size %d Modified on %TD %n", entry.getName(), entry.getSize(), new Date(entry.getTime()));
                extractEntry(entry, is);
            }
        } finally {
            is.close();
        }
    }


    private static void extractEntry(final ZipEntry entry, InputStream is) throws IOException {
        String exractedFile = OUTPUT_DIR + entry.getName();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(exractedFile);
            final byte[] buf = new byte[BUFFER_SIZE];
            int read = 0;
            int length;
            while ((length = is.read(buf, 0, buf.length)) >= 0) {
                fos.write(buf, 0, length);
            }
        } catch (IOException ioex) {
            fos.close();
        }
    }

    public static String getDefaultCharEncoding(){
        byte [] bArray = {'w'};
        InputStream is = new ByteArrayInputStream(bArray);
        InputStreamReader reader = new InputStreamReader(is);
        String defaultCharacterEncoding = reader.getEncoding();
        return defaultCharacterEncoding;
    }

    public static boolean deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            File[] children = dir.listFiles();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDirectory(children[i]);
                if (!success) {
                    return false;
                }
            }
        } // either file or an empty directory
        System.out.println("removing file or directory : " + dir.getName());
        return dir.delete();
    }

    private static void serialize(Serializable object) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("serialize.ser")));
        oos.writeObject(object);
        oos.close();
    }

    private static Object deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("serialize.ser")));
        Object obj = ois.readObject();
        return obj;
    }

    /*
    * Utility method to read from RandomAccessFile in Java
    */
    public static String readFromRandomAccessFile(String file, int position) {
        String record = null;
        try {
            RandomAccessFile fileStore = new RandomAccessFile(file, "rw");
            // moves file pointer to position specified
            fileStore.seek(position);
            // reading String from RandomAccessFile
            record = fileStore.readUTF();
            fileStore.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return record;
    }

    /*
    * Utility method for writing into RandomAccessFile in Java
    */
    public static void writeToRandomAccessFile(String file, int position, String record) {
        try {
            RandomAccessFile fileStore = new RandomAccessFile(file, "rw");
            // moves file pointer to position specified
            fileStore.seek(position);
            // writing String to RandomAccessFile
            fileStore.writeUTF(record);
            fileStore.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
