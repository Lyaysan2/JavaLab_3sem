import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

public class PasswordBlackListJdbcTemplateImpl implements PasswordBlackList {

    private static final String SQL_FIND_PASSWORD = "select * from password_black_list where password = ?";

    private JdbcTemplate jdbcTemplate;

    public PasswordBlackListJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean contains(String password) {
        return jdbcTemplate.query(SQL_FIND_PASSWORD, passwordRowMapper, password).size() != 0;
    }


    private final RowMapper<PasswordModel> passwordRowMapper = (row, rowNumber) -> {
        int id = row.getInt("id");
        String password = row.getString("password");

        return new PasswordModel(id, password);
    };
}
