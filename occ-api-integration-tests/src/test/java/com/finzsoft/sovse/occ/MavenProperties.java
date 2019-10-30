package com.finzsoft.sovse.occ;

import java.io.IOException;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MavenProperties {

  private static final String PROPERTIES_FILE = "/maven.properties";
  private static final Properties PROPERTIES = new Properties();

  // defaults
  private static String baseUri = "http://localhost:8080";
  private static String basePath = "/OCC_API_Server/occ-api/v1.0/private";
  private static String clientId = "RESTUSER";
  private static String clientSecret = "changeme";
  private static String username = "3079049";
  private static String password = "changeme";
  private static String tokenUrl =
      "http://localhost:8080/OCC_API_Server/occ-api/v1.0/login_phase_1/token";
  private static String redirectUrl = "http://localhost:8080/redirect";
  private static boolean perfEnabled = true;
  private static String clientNumber = "0003023022";
  private static String externalApplicationNumber = "0100176960";
  private static String dataDirectory = "";

  static {
    java.io.InputStream is = MavenProperties.class.getResourceAsStream(PROPERTIES_FILE);
    try {
      PROPERTIES.load(is);
    } catch (IOException ex) {
      log.error("Cannot read maven properties {}", PROPERTIES_FILE, ex);
    }
  }

  public static String get(String key) {
    return PROPERTIES.getProperty(key);
  }

  public static String getBaseUri() {
    return isPropertySet("baseUri") ? get("baseUri") : baseUri;
  }

  public static String getBasePath() {
    return isPropertySet("basePath") ? get("basePath") : basePath;
  }

  public static String getClientId() {
    return isPropertySet("clientId") ? get("clientId") : clientId;
  }

  public static String getClientSecret() {
    return isPropertySet("clientSecret") ? get("clientSecret") : clientSecret;
  }

  public static String getUsername() {
    return isPropertySet("username") ? get("username") : username;
  }

  public static String getPassword() {
    return isPropertySet("password") ? get("password") : password;
  }

  public static String getTokenUrl() {
    return isPropertySet("tokenUrl") ? get("tokenUrl") : tokenUrl;
  }

  public static String getRedirectUrl() {
    return isPropertySet("redirectUrl") ? get("redirectUrl") : redirectUrl;
  }

  public static boolean isPerfEnabled() {
    return isPropertySet("perfEnabled") ? ((get("perfEnabled") == "true") ? true : false)
        : perfEnabled;
  }

  public static String getClientNumber() {
    return isPropertySet("clientNumber") ? get("clientNumber") : clientNumber;
  }

  public static String getExternalApplicationNumber() {
    return isPropertySet("externalApplicationNumber") ? get("externalApplicationNumber")
        : externalApplicationNumber;
  }

  public static String getDataDirectory() {
    return isPropertySet("dataDirectory") ? get("dataDirectory") : dataDirectory;
  }

  private static boolean isPropertySet(String key) {
    return get(key) != null && !get(key).isEmpty() && !get(key).startsWith("$");
  }

}
