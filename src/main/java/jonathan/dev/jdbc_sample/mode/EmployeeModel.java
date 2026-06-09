package jonathan.dev.jdbc_sample.mode;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class EmployeeModel {

    private long id;

    private String name;

    private BigDecimal salary;

    private OffsetDateTime birthday;
}
