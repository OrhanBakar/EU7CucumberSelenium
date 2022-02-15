package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},

        //cucumber.json i olusturur

        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun=false,
        tags="@wip"
        //eski versiyonu   tags={"@driver","@VYT-123"}

        //OR LU DA YAPILABILIR
        //tags="@driver or @VYT-123"
        //ESKI VERSIYONU  tags="@driver","@VYT-123"
        //%: VERSIYONDAN SONRA ISE YARAMIYOR

        //EXCLUDE A TEST CASE
        //tags="@driver and not @wip"
        //eski versiyonu
        //tags={"@driver","~@wip"}
)
public class CukesRunner {


}
