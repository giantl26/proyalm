package com.pe.giancarlo.proyalm.test;


import com.pe.giancarlo.proyalm.Mapper.IPersonaMapper;
import com.pe.giancarlo.proyalm.Mapper.IUsuarioMapper;
import com.pe.giancarlo.proyalm.beans.Persona;
import com.pe.giancarlo.proyalm.beans.Rol;
import com.pe.giancarlo.proyalm.beans.Usuario;
import com.pe.giancarlo.proyalm.util.AbstractTest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class PersonaTest  extends AbstractTest{
    
    private IPersonaMapper personamapper; 
    public PersonaTest() {    
    }    
   @Before
    public void setUp() {

        personamapper=sqlSession.getMapper(IPersonaMapper.class);
    }
    
    @Test @Ignore
    public void insertar(){
        Persona per = new Persona();
        per.setNom("ANA ALMIDON");
        per.setApe_pat("ALMONCAN");
        per.setApe_mat("ALOYA");
        per.setDni("12345678");
        per.setFec_nac(java.sql.Date.valueOf("2017-12-31"));
        per.setDir("ALAMEDA 365");
        
        personamapper.insertar(per);
        
        System.out.println("PERSONA id: " + per.getId()+"/n");    
   
    }

    
    }
    
    
