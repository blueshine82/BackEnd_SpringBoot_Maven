package com.admin.newpdfprd.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;

@ExtendWith(value = { SpringExtension.class })
@SpringBootTest
@Slf4j
public class DbTest {

	@Autowired
	DataSource dataSource;
	
	public void connection() throws SQLException {
		try(Connection connection = dataSource.getConnection()){
			DatabaseMetaData metaData = connection.getMetaData();
			log.info("URL : " + metaData.getURL());
			log.info("DriverName : " + metaData.getDriverName());
			log.info("UserName : " + metaData.getUserName());
		}
	}
}
