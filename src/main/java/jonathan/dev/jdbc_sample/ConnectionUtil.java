package jonathan.dev.jdbc_sample;


import org.springframework.stereotype.Component;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class ConnectionUtil {

    private final DataSource dataSource;

    public ConnectionUtil(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public Connection getconnection() throws SQLException{
        return dataSource.getConnection();
    }
}
