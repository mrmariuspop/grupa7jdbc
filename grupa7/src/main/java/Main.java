import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataSourceFactory dataSourceFactory = new DataSourceFactory();
        Connection connection = dataSourceFactory.getConnection();
//        dataSourceFactory.createTable();
//        dataSourceFactory.insertPerson(4,"'Virgil'");
        dataSourceFactory.getAllPersons();
    }
}
