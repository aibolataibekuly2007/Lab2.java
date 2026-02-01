public class ReportGenerator {
    private String reportType;

    public ReportGenerator(String reportType) {
        this.reportType = reportType;
    }

    public void generateReport() {
        switch(reportType) {
            case "pdf" -> generatePdfReport();
            case "excel" -> generateExcelReport();
            default -> System.out.println("Unknown report type");
        }
    }

    private void generatePdfReport() {
        System.out.println("Generating PDF report");
    }

    private void generateExcelReport() {
        System.out.println("Generating Excel report");
    }
}