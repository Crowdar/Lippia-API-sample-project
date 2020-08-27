package report;

import io.lippia.reporter.cucumber4.adapter.ReportServerApiAdapter;

public class Reporter extends ReportServerApiAdapter {

    public Reporter(String arg) {
        super(arg);
    }
    
	@Override
	public String getBase64Image() {
		return null;
	}

}