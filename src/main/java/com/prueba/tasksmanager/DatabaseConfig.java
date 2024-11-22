package com.prueba.tasksmanager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    /* Las credenciales de conexion deberian ser obtenidas desde variables de entorno o archivo de configuracion
       en este caso se ommite esa configuracion ya que solo es un proyecto de prueba y las credenciales deben ser
       remplazadas para su funcionamiento
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setUrl("jdbc:mariadb://localhost:3606/tasks_db");
        dataSource.setUsername("user");
        dataSource.setPassword("password");
        return dataSource;
    }
}
