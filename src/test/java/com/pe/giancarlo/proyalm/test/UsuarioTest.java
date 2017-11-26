package com.pe.giancarlo.proyalm.test;


import com.pe.giancarlo.proyalm.Mapper.IUsuarioMapper;
import com.pe.giancarlo.proyalm.beans.Rol;
import com.pe.giancarlo.proyalm.beans.Usuario;
import com.pe.giancarlo.proyalm.util.AbstractTest;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class UsuarioTest  extends AbstractTest{
    
    private IUsuarioMapper usuariomapper; 
    public UsuarioTest() {    
    }    
   @Before
    public void setUp() {

        usuariomapper=sqlSession.getMapper(IUsuarioMapper.class);
    }
    
    @Test @Ignore
    public void insertar(){
        Usuario usu = new Usuario();
        usu.setUsu("LJUDAS");
        usu.setPas("LJUDAS");    
        usuariomapper.insertar(usu);
        System.out.println("Usuario id: " + usu.getId()+"/n");    
        System.out.println("Intento: " + usu.getIntento()+"/n");
    }

    @Test @Ignore
    public void Consultar(){        
        ArrayList<Usuario> lstusu=new ArrayList<>();
        lstusu=usuariomapper.consultar_todos(); 
        for(Usuario usu:lstusu){
        System.out.println("Usuario id: " + usu.getId()+"\n");    
        System.out.println("USUARIO: " + usu.getUsu()+"\n");
        System.out.println("PASS: " + usu.getPas()+"\n");
        System.out.println("ESTADO: " + usu.getEst_act()+"\n");
        System.out.println("PERSONA_ID: " + usu.getPersona_id()+"\n");
        System.out.println("-----------------------------------------");
        }
    }
    
    @Test @Ignore 
    public void Consultar_Rol(){        
        ArrayList<Rol> lstrol=new ArrayList<>();
        lstrol=usuariomapper.consultar_rol(); 
        for(Rol rol:lstrol){
        System.out.println("Usuario id: " + rol.getId());    
        System.out.println("USUARIO: " + rol.getCar());
        System.out.println("PASS: " + rol.getDes());
        System.out.println("-----------------------------------------");
        }


    }    

    @Test @Ignore 
    public void Consultar_Activos(){        
        
        ArrayList<Usuario> lstusu=new ArrayList<>();
        lstusu=usuariomapper.consultar_Activos(); 
        for(Usuario usu:lstusu){
        System.out.println("Usuario id: " + usu.getId()+"\n");    
        System.out.println("USUARIO: " + usu.getUsu()+"\n");
        System.out.println("PASS: " + usu.getPas()+"\n");
        System.out.println("ESTADO: " + usu.getEst_act()+"\n");
        System.out.println("PERSONA_ID: " + usu.getPersona_id()+"\n");
        System.out.println("-----------------------------------------");
        }
     
    }

    @Test @Ignore
    public void Cambiar_estado(){                
        Usuario usu = new Usuario();
        usu.setId(6);
        usu.setEst_act("B");    
        usuariomapper.Estado_usuario(usu);        
        }       
    @Test @Ignore
    public void Consultar_Persona(){        
        
        ArrayList<Usuario> lstusu=new ArrayList<>();
        lstusu=usuariomapper.consultar_persona(); 
        for(Usuario usu:lstusu){
        System.out.println("Usuario id: " + usu.getId());    
        System.out.println("USUARIO: " + usu.getUsu());
        System.out.println("PASS: " + usu.getPas());
        System.out.println("ESTADO: " + usu.getEst_act());
        System.out.println("PERSONA");
        System.out.println("PERSONA_ID: " + usu.getPersona_id().getId());
        System.out.println("PERSONA NOMBRE: " + usu.getPersona_id().getNom());
        System.out.println("PERSONA APELLIDO: " + usu.getPersona_id().getApe_pat());
        System.out.println("PERSONA APELLIDO: " + usu.getPersona_id().getApe_mat());
        System.out.println("PERSONA DIRRECION: " + usu.getPersona_id().getDir());
        System.out.println("PERSONA DNI: " + usu.getPersona_id().getDni());
        System.out.println("PERSONA FECHA: " + usu.getPersona_id().getFec_nac());
        System.out.println("ROL");
        System.out.println("ROL: " + usu.getRol_id().getId());
        System.out.println("ROL: " + usu.getRol_id().getCar());
        System.out.println("ROL: " + usu.getRol_id().getDes());
        
        System.out.println("-----------------------------------------");
        }
    }

        @Test @Ignore
        public void IniciarSeccion(){        
       
        Usuario usu=new Usuario();
        usu.setUsu("LGARCIAF");
        usu.setPas("LGARCIAF");
       
       usuariomapper.IniciarSeccion(usu);
        
        System.out.println(usu.getUsu());
        System.out.println(usu.getEst_act());
        System.out.println(usu.getPersona_id().getId());
        }
    }
    
    
