package hs.sample.k.apiserver.global.config;


import java.io.IOException;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(
        value = "hs.sample.k.apiserver.domain"
)

//(basePackageClasses = {})
// @EnableTransactionManagement
public class MyBatisConfig {

    private ApplicationContext applicationContext;

    @Autowired
    public MyBatisConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
        Resource[] resources = null;
        try {
            resources = new PathMatchingResourcePatternResolver().getResources(
                "classpath:mybatis/sqlmap/**/*sqlmap.xml"
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setConfigLocation(
            applicationContext.getResource("classpath:mybatis/mybatis-config.xml"));
        sessionFactory.setMapperLocations(resources);

        return sessionFactory.getObject();
    }


}
