package pl.tut.controller;


import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.tut.dao.UserDAO;
import pl.tut.model.UserPOJO;

@ManagedBean
@RequestScoped
@Component
public class UserController implements Serializable {
    
    private UserPOJO u = new UserPOJO();
    private UserPOJO u2;// = new UserPOJO();
    private String haslo;
    private Date data;
    @Autowired
    UserDAO dao;// = new UserDao();
    
    public UserController() {
        
    }
    
    public String rejestracja(){
        
        if(haslo.equals(u.getHaslo())){
            
          
           dao.save(u);
          
           return "Succes.xhtml";
        }
        else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
            (FacesMessage.SEVERITY_WARN, "Podane Hasla sie nie zgadzaja", "Popraw je"));
                    
        }
       
        return null;
    }
//    public void inicialUser(){
//        u2 = new UserPOJO(new UserDao().getUser(0).getEmail(), new UserDao().getUser(0).getHaslo());
//        
//    }
//    
    public UserPOJO getUser() {
        return u;
    }
    
    public void setUser(UserPOJO u) {
        this.u = u;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public UserPOJO getU2() {
        return u2;
    }

    public void setU2(UserPOJO u2) {
        this.u2 = u2;
    }
    
    
}
