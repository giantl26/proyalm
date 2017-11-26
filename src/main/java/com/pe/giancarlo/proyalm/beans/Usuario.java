
package com.pe.giancarlo.proyalm.beans;


public class Usuario {
	private int id;
	private String  usu;
	private String  pas;
	private String  est_act;
	private int  intento;
	private Rol rol_id;
	private Persona persona_id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public String getEst_act() {
        return est_act;
    }

    public void setEst_act(String est_act) {
        this.est_act = est_act;
    }
    public int getIntento() {
        return intento;
    }
    public void setIntento(int intento) {
        this.intento = intento;
    }
    public Rol getRol_id() {
        return rol_id;
    }
    public void setRol_id(Rol rol_id) {
        this.rol_id = rol_id;
    }
    public Persona getPersona_id() {
        return persona_id;
    }
    public void setPersona_id(Persona persona_id) {
        this.persona_id = persona_id;
    }
}
