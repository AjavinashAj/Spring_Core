package in.ashokit.Reports;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport{

	public void generateReport() {
		System.out.println("ExcelReport Generating.....");
	}
	

}
