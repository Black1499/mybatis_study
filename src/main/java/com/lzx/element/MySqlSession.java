package com.lzx.element;

import com.lzx.entity.Author;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class MySqlSession {
    public void doSqlSession(){
//        // 配置数据库
//        PooledDataSource dataSource = new PooledDataSource();
//        dataSource.setDriver("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis_studydb");
//        dataSource.setUsername("root");
//        dataSource.setPassword("");
//        // 关闭事务的自动提交
//        dataSource.setDefaultAutoCommit(false);
//        // 采用Mybatis的JDBC的事务方式
//        TransactionFactory transactionFactory = new JdbcTransactionFactory();
//        Environment environment = new Environment("development", transactionFactory, dataSource);
//        Configuration configuration = new Configuration(environment);
//        // 加入映射器
//        configuration.addMapper(AuthorDao.class);
//        // 创建SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration)
//        SqlSession session =  sqlSessionFactory.openSession();
//        try {
//            // do work
//            sqlSessionFactory.commit();
//
//        } catch (Exception e){
//            sqlSessionFactory.rollback();
//        } finally {
//            session.close();
//        }
    }
}
