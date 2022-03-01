package eu.kazernedossin.bibliotheekweb.dao;

import com.herminiogarcia.dmaog.dataAccess.DataAccess;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataAccessSingleton {

    private static DataAccess dataAccess;
    private static String dataFile;
    private static String mappingRules = getMappingRules();
    private static String mappingLanguage = "shexml";
    private static Long reloadMinutes;
    private static String username;
    private static String password;
    private static String drivers;

    public static DataAccess getInstance() {
        if(dataAccess == null) {
            dataAccess = new DataAccess(dataFile, mappingRules, mappingLanguage, reloadMinutes, username, password, drivers);
        }
        return dataAccess;
    }

    private static String getMappingRules() {
        String rules = null;
        try {
            rules = String.join("", Files.readAllLines(Paths.get("books.shexml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rules;
    }
}
