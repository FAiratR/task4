package edu.t1;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;

@Configuration
public class DataSource {
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    public static HikariDataSource getDs() {
        return ds;
    }

    static {
        config.setDriverClassName("org.h2.Driver");
        config.setJdbcUrl("jdbc:h2:./src/main/resources/dbTask4");
        config.setUsername("admin");
        config.setPassword("admin");
        ds = new HikariDataSource(config);
    }

    @SneakyThrows
    public Connection getConnection(){
        return ds.getConnection();
    }
}