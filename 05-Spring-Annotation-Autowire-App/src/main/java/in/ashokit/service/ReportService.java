package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.Reports.IReport;

@Service
public class ReportService {
	@Autowired
	@Qualifier("pdf")
	private IReport pdfreport;
	@Autowired
	@Qualifier("excel")
	private IReport excelreport;
	public void generate() {
		System.out.println("Injected::"+pdfreport.getClass().getName());
		pdfreport.generateReport();
		System.out.println("Injected::"+excelreport.getClass().getName());
		excelreport.generateReport();
	}

}
