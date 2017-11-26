
package com.pe.giancarlo.proyalm.conexion;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
     protected static SqlSessionFactory sqlSessionFactory;
    
     static{
         try {
            Reader reader = Resources.getResourceAsReader("conexion/SqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader, "mysql");
        } catch (Exception e) {
            System.out.println(e);
        }
     }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
     
     
}
