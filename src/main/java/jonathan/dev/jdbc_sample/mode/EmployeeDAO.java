package jonathan.dev.jdbc_sample.mode;

import jonathan.dev.jdbc_sample.ConnectionUtil;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

@Repository
public class EmployeeDAO {

    private ConnectionUtil connectionUtil;

    public void insert(final EmployeeModel employeeModel){
        try(
                Connection connection = connectionUtil.getconnection();
                Statement statement = connection.createStatement()
                ){
            String comandoInsertSql = "INSERT INTO employees (name, salary, birthday) values ('" +
                    employeeModel.getName() + "', " +
                    employeeModel.getSalary().toString() + ", "
                    +  formatOffsetDateTime(employeeModel.getBirthday()) + ") ";

            statement.executeUpdate(comandoInsertSql);

        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    public void update(final EmployeeModel employeeModel){

    }

    public void delete ( final long id){

    }

    public void findAll(){


    }

    public void findById(final long id){

    }

    private String formatOffsetDateTime(final OffsetDateTime dateTime){
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); //Formatando a hora e data no SQL
    }
}
