package api.report;

import io.lippia.reporter.cucumber4.adapter.ReportServerApiAdapter;

public class Reporter extends ReportServerApiAdapter{

	public Reporter() {
		super();
	}

	@Override
	public String getBase64Image() {
		return  null;
	}

}
 
