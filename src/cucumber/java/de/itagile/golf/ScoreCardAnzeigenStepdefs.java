package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import java.util.Map;
import java.util.StringJoiner;

import de.itagile.golf.util.SystemProperties;
import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Gegebensei;
import io.cucumber.java.de.Wenn;

public class ScoreCardAnzeigenStepdefs {

    TrackerDriver driver;

    public ScoreCardAnzeigenStepdefs(TrackerDriver driver) {
        this.driver = driver;
    }
    @Gegebensei("ich habe auf einem Loch {int} Schlag gemacht")
    public void ich_habe_auf_einem_loch_schlag_gemacht(Integer loch) {
        for (int i = 0; i < loch ; i++) {
            this.driver.gibEin("Schlage Ball");
        }
        this.driver.gibEin("Nächstes Loch");

    }

    @Wenn("ich den Befehl Scorecard aufrufe")
    public void ich_den_befehl_scorecard_aufrufe() {
    this.driver.gibEin("Scorecard");
    }

    @Dann("möchte ich folgende Tabelle sehen:")
    public void möchte_ich_folgende_tabelle_sehen(io.cucumber.datatable.DataTable dataTable) {
        StringJoiner result = new StringJoiner(SystemProperties.LINE_SEPARATOR);
        final Map<String, String> map = dataTable.subTable(1,0).asMap();
        map.forEach((key, value) -> result.add(key + ". Loch: " + value));
        this.driver.assertThatAntwort(containsString(result.toString()));
    }
}
