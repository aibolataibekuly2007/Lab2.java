import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggerService {
    private static final Logger logger = Logger.getLogger(LoggerService.class.getName());
    private static final String CONNECTION_STRING = "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";

    public void log(LogLevel level, String message) {
        String formattedMessage = String.format("%s: %s", level, message);
        switch(level) {
            case ERROR -> logger.severe(formattedMessage);
            case WARNING -> logger.warning(formattedMessage);
            case INFO -> logger.info(formattedMessage);
        }
    }

    public static String getConnectionString() {
        return CONNECTION_STRING;
    }

    enum LogLevel {
        ERROR, WARNING, INFO
    }
}

class DatabaseService {
    public void connect() {
        String connectionString = LoggerService.getConnectionString();
        System.out.println("Connecting with: " + connectionString);
    }
}

class LoggingService {
    public void logToDatabase(String message) {
        String connectionString = LoggerService.getConnectionString();
        System.out.println("Logging to DB: " + message + " with: " + connectionString);
    }
}