package com.lzx.element;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MySqlSessionFactory {
//    // 配置文件放到了resources文件夹中
//    // 如果你放到了一个包中，你可以这样找到它 com/lzx/config/mybatis-config.xml
//    String resource = "mybatis-config.xml";
//    InputStream inputStream = Resources.getResourceAsStream(resource);//读取配置文件
//    MySqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    public void getSqlSessionFactory(){
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis_studydb");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setDefaultAutoCommit(false);
    }
}
