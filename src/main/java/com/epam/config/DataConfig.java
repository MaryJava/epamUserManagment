package com.epam.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@PropertySource("classpath:application.properties")
@EntityScan("com.epam.model")
@EnableJpaRepositories("com.epam")
@EnableTransactionManagement
public class DataConfig {

}
