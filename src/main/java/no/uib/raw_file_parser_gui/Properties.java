package no.uib.raw_file_parser_gui;

import java.io.InputStream;

/**
 * This class provides the version number of ThermoRawFileParserGUI.
 *
 * @author Harald Barsnes
 */
public class Properties {

    /**
     * Retrieves the version number set in the pom file.
     *
     * @return the version number of the ThermoRawFileParserGUI
     */
    public String getVersion() {

        java.util.Properties p = new java.util.Properties();

        try {
            InputStream is = this.getClass().getClassLoader().getResourceAsStream("thermo-raw-file-parser-gui.properties");
            p.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return p.getProperty("thermo-raw-file-parser-gui.version");
    }
}
