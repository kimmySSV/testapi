package com.ldb.testapi.DBConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
@Configuration
public class DatavaseConfig {

    @Bean(name = "wallet")
    @ConfigurationProperties(prefix = "spring.wallet")
    public DataSource WALLETDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "WALLETJdbcTemplate")
    public JdbcTemplate WALLETJdbcTemplate(@Qualifier("wallet") DataSource WALLETJdbcTemplate) {
        return new JdbcTemplate(WALLETJdbcTemplate);

    }


}
