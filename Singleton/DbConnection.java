class DbConnection {
    public static DbConnection instance = null;

    private DbConnection(String dbUser, String dbPassword, String dbName) {
        SQLConnection connection = new SQLConnection(dbUser, dbPassword, dbName);
    }

    public static synchronized DbConnection getDbConnection(String dbUser, String dbPassword, String dbName) {
        if (instance == null) {
            instance = new DbConnection(dbUser, dbPassword, dbName);
        }
        return instance;
    }

    public String getDbName() {
        return "Hello";
    }
}

class SQLConnection {
    String dbUser;
    String dbPassword;
    String dbName;

    public SQLConnection(String dbUser, String dbPassword, String dbName) {
        super();
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbName = dbName;
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        String dbUser = "admin";
        String dbPassword = "admin";
        String dbName = "testDb";
        DbConnection connection = DbConnection.getDbConnection(dbUser, dbPassword, dbName);
        System.out.println(connection.getDbName());
    }
}
