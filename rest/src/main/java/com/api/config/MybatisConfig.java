package com.api.config;

import javax.sql.DataSource; 
import org.apache.ibatis.session.SqlSessionFactory; 
import org.mybatis.spring.SqlSessionFactoryBean; 
import org.mybatis.spring.annotation.MapperScan; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

@Configuration 
@MapperScan( 
		basePackages = "com.tistory.aljjabaegi.api.mapper", sqlSessionFactoryRef = "sqlSessionFactory" 
)


public class MybatisConfig {
	
	@Bean 
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext 
	applicationContext) throws Exception { 
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean(); 
		factory.setDataSource(dataSource); 
		
		factory.setMapperLocations(applicationContext.getResources("classpath*:com/research/restapi/mapper/*.xml")); 
		factory.setTypeAliasesPackage("com.research.restapi.domain"); 
		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration(); 
		//configuration.setJdbcTypeForNull(null);
		configuration.setCacheEnabled(false); 
		//configuration.setMapUnderscoreToCamelCase(true); 
		factory.setConfiguration(configuration); 
		return factory.getObject(); 
	}
}
