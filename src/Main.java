public class Main {
    public static void main(String[] args) {
        System.out.println("=== DRY Principle Example ===");
        LoggerService logger = new LoggerService();
        logger.log(LoggerService.LogLevel.INFO, "Application started");
        logger.log(LoggerService.LogLevel.WARNING, "Low memory");
        logger.log(LoggerService.LogLevel.ERROR, "Database connection failed");

        DatabaseService dbService = new DatabaseService();
        dbService.connect();

        LoggingService loggingService = new LoggingService();
        loggingService.logToDatabase("Test log message");

        System.out.println("\n=== KISS Principle Example ===");
        SimpleProcessor processor = new SimpleProcessor();
        int[] numbers = {1, -2, 3, -4, 5};

        System.out.println("Processing numbers:");
        processor.processNumbers(numbers);

        System.out.println("\nPrinting positive numbers:");
        processor.printPositiveNumbers(numbers);

        System.out.println("\nDivision examples:");
        System.out.println("10 / 2 = " + processor.divide(10, 2));
        System.out.println("10 / 0 = " + processor.divide(10, 0));

        System.out.println("\n=== YAGNI Principle Example ===");
        User user = new User("John Doe", "john@example.com", "123 Main St");

        UserRepository repository = new UserRepository();
        repository.saveToDatabase(user);

        EmailService emailService = new EmailService();
        emailService.sendEmail(user.getEmail(), "Welcome", "Welcome to our service");

        FileReader fileReader = new FileReader();
        String content = fileReader.readFile("test.txt");
        System.out.println("File content: " + content);

        ReportGenerator pdfGenerator = new ReportGenerator("pdf");
        pdfGenerator.generateReport();

        ReportGenerator excelGenerator = new ReportGenerator("excel");
        excelGenerator.generateReport();
    }
}