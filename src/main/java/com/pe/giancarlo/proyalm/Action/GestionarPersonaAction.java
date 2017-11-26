/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.giancarlo.proyalm.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.pe.giancarlo.proyalm.Mapper.IPersonaMapper;
import com.pe.giancarlo.proyalm.Mapper.IUsuarioMapper;
import com.pe.giancarlo.proyalm.beans.Usuario;
import com.pe.giancarlo.proyalm.beans.Persona;
import com.pe.giancarlo.proyalm.beans.Rol;
import com.pe.giancarlo.proyalm.conexion.MyBatisUtil;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class GestionarPersonaAction extends ActionSupport{
    
  private List<Usuario>  listusu;
  private List<Rol>  listrol;
  private Persona persona;
  private Usuario usuario;  

    public List<Rol> getListrol() {
        return listrol;
    }

    public void setListrol(List<Rol> listrol) {
        this.listrol = listrol;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
  public List<Usuario> getListusu() {
        return listusu;
    }

    public void setListusu(List<Usuario> listusu) {
        this.listusu = listusu;
    }
        private SqlSessionFactory ssf =
            MyBatisUtil.getSqlSessionFactory();

  
public String executar(){
        SqlSession sesion = ssf.openSession();        
        IUsuarioMapper usuarimaper = sesion.getMapper(IUsuarioMapper.class);
        listusu=usuarimaper.consultar_persona();
        listrol=usuarimaper.consultar_rol();
        
        return SUCCESS;
}
public String Ingresar(){
    String usu="";
    SqlSession sesion = ssf.openSession();        
    IPersonaMapper personamapper= sesion.getMapper(IPersonaMapper.class);
    personamapper.insertar(persona);
    sesion.commit();
    usu=persona.getApe_pat().substring(0,2)+persona.getDni()+persona.getApe_mat().substring(0,2);
    usuario.setUsu(usu);
    usuario.setPas(usu);
    usuario.setEst_act("A");
    usuario.setPersona_id(persona);
    usuario.setIntento(0);
    IUsuarioMapper usuarimaper = sesion.getMapper(IUsuarioMapper.class);
    usuarimaper.insertar(usuario);
    sesion.commit();
    return  SUCCESS;
}
public String Estado(){
        SqlSession sesion = ssf.openSession();        
        IUsuarioMapper usuarimaper = sesion.getMapper(IUsuarioMapper.class);
        usuarimaper.Estado_usuario(usuario);
        sesion.commit();
        return  SUCCESS;
}
public String Editar(){
        SqlSession sesion = ssf.openSession();        
        IUsuarioMapper usuarimaper = sesion.getMapper(IUsuarioMapper.class);
        usuarimaper.Estado_usuario(usuario);
        sesion.commit();
        return  SUCCESS;
}

}


