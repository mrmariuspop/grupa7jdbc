import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSourceFactory {
    private static Connection connection;


    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/gr7cti","root","");
        connection.setAutoCommit(false);
        return connection;
    }
    public boolean createTable() throws SQLException {
        String query="create table if not exists PERSONS (ID INT, NAME VARCHAR(45))";
        return connection.createStatement().executeUpdate(query)==0;
    }

    //TODO: update method and delete method
    public void insertPerson(int id, String name) throws SQLException {
        String query = "insert into persons value("+id+", "+name+")";
        System.out.println(query);
        connection.createStatement().executeUpdate(query);
        connection.commit();
    }

    public List<Person> getAllPersons() throws SQLException {
        List<Person> persons = new ArrayList<Person>();
        System.out.println(persons);
        String query = "select * from persons";
        ResultSet resultSet  = connection.createStatement().executeQuery(query);
        while (resultSet.next()) {
            Person person = new Person();
            person.setId(resultSet.getInt("id"));
            person.setName(resultSet.getString("name"));
            persons.add(person);
        }
        System.out.println(persons);
        return persons;
    }
}