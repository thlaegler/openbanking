package com.finzsoft.sovse.occ.rest;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import com.finzsoft.sovse.occ.MavenProperties;
import com.google.common.io.ByteStreams;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class TestUtil {

    public static String getRequestBody(String filename, String subFolder) {
        return new String(getFileBytes(filename, subFolder));
    }
    
    public static InputStream getFileStream(String filename, String subFolder) {
        return new ByteArrayInputStream(getFileBytes(filename, subFolder));
    }
    
    /**
     * Gets a json file from the specified folder (param: 'json.folder'). This folder is being
     * searched in the class path (relative path e.g. src/main/resources/data) as well is on the
     * users file system (absolute path e.g. /Users/umesh.gite/occ/jsondata).
     * 
     * The zip-file creation and execution must work on Unix and Windows, thus the system-independent file/path separators
     * 
     * @param filename
     * @param subFolder
     * @return
     * @throws IOException
     */
    private static byte[] getFileBytes(String filename, String subFolder) {
        String jsonFolder = null;
        String filePath = null;
        try {
            // Throws NoSuchElementException if parameter not defined
            jsonFolder = MavenProperties.getDataDirectory();
            if (jsonFolder == null || jsonFolder.isEmpty()) {
                throw new NoSuchElementException("Empty JSON folder parameter");
            }
            
            filePath = String.format("%s%s%s%s%s", jsonFolder, File.separator, subFolder,
                    File.separator, filename);
            if (jsonFolder.startsWith(File.separator)) {
                // Read JSON files from absolute path
                filePath = String.format("file:%s%s%s%s", File.separator, File.separator, filePath);
            } else if (jsonFolder.startsWith("~" + File.separator)) {
                // Read JSON files from absolute path using user-home / tilde
                filePath = filePath.replaceFirst("^~", System.getProperty("user.home"));
                filePath = String.format("file:%s%s%s%s", File.separator, File.separator,
                        File.separator, filePath);
            } else {
                // Read JSON files from relative path
                String absolutePath = new File(".").getAbsolutePath();
                filePath = String.format("file:%s%s%s%s%s", File.separator, File.separator,
                        absolutePath, File.separator, filePath);
            }
            return Files.readAllBytes(Paths.get(new URI(filePath)));
        } catch (NoSuchElementException ex1) {
            // Fallback: Read JSON files from classpath
            if (subFolder == null || subFolder.isEmpty()) {
                filePath = String.format("data%s%s", File.separator, filename);
            } else {
                filePath = String.format("data%s%s%s%s", File.separator,
                        subFolder, File.separator, filename);
            }
            try {
                return ByteStreams.toByteArray(TestUtil.class.getClassLoader().getResourceAsStream(filePath));
            } catch (IOException ex3) {
                log.error("No JSON data found in classpath directory {}", filePath, ex3);
            }
        } catch (IOException | URISyntaxException ex2) {
            log.error("Cannot read JSON file", ex2);
        }

        log.error("No JSON test data found under {}", filePath);
        return new byte[1];
    }

}
