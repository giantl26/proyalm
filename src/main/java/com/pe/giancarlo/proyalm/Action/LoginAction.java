package com.pe.giancarlo.proyalm.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.pe.giancarlo.proyalm.Mapper.IUsuarioMapper;
import com.pe.giancarlo.proyalm.beans.Usuario;
import com.pe.giancarlo.proyalm.conexion.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class LoginAction extends ActionSupport {

    private SqlSessionFactory ssf
            = MyBatisUtil.getSqlSessionFactory();

    private String username;
    private String password;
    private String mensaje;
    
    public String init() {
        return SUCCESS;
    }

    public String validar() {
        Usuario usuario = new Usuario();
        usuario.setUsu(username);
        usuario.setPas(password);
        SqlSession sesion = ssf.openSession();
        IUsuarioMapper usuarimaper = sesion.getMapper(IUsuarioMapper.class);
        usuarimaper.IniciarSeccion(usuario);
        username="";
        password="";
        if (usuario.getEst_act().equalsIgnoreCase("I")) {
            addActionError(getText("login.msjusuine"));
            mensaje=getText("login.msjusuine");
            return INPUT;
        }
        if (usuario.getEst_act().equalsIgnoreCase("B")) {
            addActionError(getText("login.msjusublo"));
            mensaje=getText("login.msjusublo");
            return INPUT;
        }
        if (usuario.getEst_act().equalsIgnoreCase("N")) {
            addActionError(getText("login.msjusucon"));
            mensaje=getText("login.msjusucon");
            return INPUT;
        }
        if (usuario.getEst_act().equalsIgnoreCase("A")) {
            return SUCCESS;
        }
        return SUCCESS;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
