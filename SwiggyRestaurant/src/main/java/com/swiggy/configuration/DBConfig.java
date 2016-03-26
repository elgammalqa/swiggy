package com.swiggy.configuration;

import javax.annotation.Resource;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
@PropertySources({ @PropertySource(value ={ "classpath:platform.properties" }) })

public class DBConfig {

	Logger              LOGGER = LoggerFactory.getLogger(DBConfig.class);

    @Resource
    private Environment environment;

    @Bean
    public DataSource setSwiggyDataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("mysql.driver"));
        dataSource.setUrl(environment.getRequiredProperty("mysql.jdbcurl"));
        dataSource.setUsername(environment.getRequiredProperty("mysql.user"));
        dataSource.setPassword(environment.getRequiredProperty("mysql.password"));
        dataSource.setValidationQuery("select 1");
        dataSource.setTestOnBorrow(true);
        dataSource.setValidationInterval(34000);
        return dataSource;
    }
    
    
    @Bean
    public JdbcTemplate setJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(setSwiggyDataSource());
        return jdbcTemplate;
    }

    @Bean
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(setSwiggyDataSource());
        return namedParameterJdbcTemplate;
    }
}
