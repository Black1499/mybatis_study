package com.lzx.select.mappers;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzx.select.entity.CustomerEntity;
import com.lzx.select.entity.InvoiceEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class SelectMapperTest {


    static SqlSessionFactory sqlSessionFactory;
    static SqlSession sqlSession;
    SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);

    @BeforeClass
    public static void initSqlSessionFactory() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = sqlSessionFactory.openSession();
    }

    @AfterClass
    public static void destroySqlSession(){
        sqlSession.close();
    }

    @Test
    public void testGetInvoiceByInvoiceId() {
        System.out.println(selectMapper.getInvoiceByInvoiceId(1));
    }


    @Test
    public void testGetCustomerById() {
        System.out.println(selectMapper.getCustomerById(1));
    }

    @Test
    public void testGetInvoiceForCustomerByInvoiceId() {
        System.out.println(selectMapper.getInvoiceForCustomerByInvoiceId(1));

    }


    @Test
    public void testGetCusById(){
        System.out.println(selectMapper.getCusById(1));
    }
    @Test
    public void testGetIncByCustomerId(){
        System.out.println(selectMapper.getIncByCustomerId(1));
    }

    @Test
    public void testGetAll(){
        PageHelper.startPage(2, 2);
        List<CustomerEntity> list = selectMapper.getAll();
        PageInfo page = new PageInfo(list);
        System.out.println(page.getPageNum());
        System.out.println(page.getPageSize());
    }

}