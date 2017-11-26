package com.pe.giancarlo.proyalm.util;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public abstract class AbstractTest {

    protected static SqlSessionFactory sqlSessionFactory;
    protected static SqlSession        sqlSession;
    private static   String            environment = "mysql"; //sqlServerEnv
    
    @BeforeClass
    public static void oneTimeSetUp() throws IOException {
        try {
            Reader reader = Resources.getResourceAsReader("conexion/SqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader, environment);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Before
    public void before() {
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }

    @AfterClass
    public static void oneTimeTearDown() {
    }
}
