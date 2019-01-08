package data.managers;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import utils.PreferencesManagerConstants;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class PreferencesManager {
    private final static String path = "src\\configuration\\appconfig.xml";

    private Document document;
    private static PreferencesManager instance;
    private Properties properties;
    private String[] keys;

    private PreferencesManager() throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        this.document = builder.parse(new File(path));
        this.properties = new Properties();
        this.keys = new String[]{
                PreferencesManagerConstants.CLASS_NAME, PreferencesManagerConstants.DRIVER_TYPE,
                PreferencesManagerConstants.HOST_NAME, PreferencesManagerConstants.PORT,
                PreferencesManagerConstants.DB_NAME, PreferencesManagerConstants.USER,
                PreferencesManagerConstants.PASSWORD };
        propertySetting();
    }

    private void propertySetting(){
        String value, key;
        String[] keyArray;
        for (int i = 0; i < keys.length; i++) {
            keyArray = keys[i].split("\\.");
            key = keyArray[keyArray.length - 1];
            value = document.getElementsByTagName(key).item(0).getTextContent();
            properties.setProperty(keys[i], value);
        }
    }

    public static PreferencesManager getInstance() throws ParserConfigurationException, SAXException, IOException {
        if(instance == null){
            instance = new PreferencesManager();
        }
        return instance;
    }

    public void setProperty(String key, String value){
        document.getElementsByTagName(key).item(0).setTextContent(value);
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }
}
