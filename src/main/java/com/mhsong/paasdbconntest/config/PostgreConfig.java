package com.mhsong.paasdbconntest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource(value = "classpath:db.properties")
@EnableTransactionManagement
public class PostgreConfig {
}
