package PDFReport;

public class Sample {

	//@Test

	public void report() throws Exception {
		String Path="./Report/test.pdf";
		GeneratePDFReport.openPDF(Path);
		GeneratePDFReport.report("Welcome to PDF","C:\\Users\\sakth\\OneDrive\\Desktop\\Tyson joining Kit.jpeg");
		GeneratePDFReport.report("HomePage","C:\\Users\\sakth\\OneDrive\\Desktop\\Tyson joining Kit.jpeg");

		GeneratePDFReport.closeDocument();


	}

}
