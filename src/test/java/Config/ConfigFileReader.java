package Config;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private Properties properties;
    private final String propertyFilePath= "E:\\FWD\\FWD workspace\\EDUCATLY\\src\\main\\resources\\Properties\\educatly.properties";
    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }

    }
    public String getDriverPath(){
        String DriverPath = properties.getProperty("DriverPath");
        if(DriverPath!= null) return DriverPath;
        else throw new RuntimeException("Path not specified in the properties file.");
    }
    public String getEducatlyUrl() {
        String URL = properties.getProperty("URL");
        if(URL != null) return URL;
        else throw new RuntimeException("url not specified in the properties file.");
    }
    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the properties file.");
    }
    public String getUserEmail() {
        String email = properties.getProperty("email");
        if(email != null) return email;
        else throw new RuntimeException("email not specified in the properties file.");
    }
    public String getUserPassword() {
        String password = properties.getProperty("password");
        if(password != null) return password;
        else throw new RuntimeException("password not specified in the properties file.");
    }
    public int getfoundProgramsIndex() {
        String foundProgramsIndex = properties.getProperty("foundProgramsIndex");
        if(foundProgramsIndex != null) return Integer.parseInt(foundProgramsIndex);
        else throw new RuntimeException("foundProgramsIndex not specified in the properties file.");
    }
}
