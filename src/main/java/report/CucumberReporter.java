package report;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberGenericAdapter;

public class CucumberReporter extends ExtentCucumberGenericAdapter {

    public CucumberReporter(String arg) {
        super(arg);
    }

    @Override
    public String getScreenshotBase64() {
        return null;
    }

    @Override
    public Boolean isScreenshotDisable() {
        return true;
    }
}
