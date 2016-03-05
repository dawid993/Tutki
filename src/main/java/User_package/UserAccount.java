package User_package;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

import pl.tut.model.UserPOJO;


@ManagedBean
@SessionScoped
@Component
public class UserAccount {
    
    private UserPOJO loggInWho=null;
    private boolean loggIn;
    private String login, haslo;
    
    public UserAccount() {
         
    }

    public String logujSie(){
        
        if(login.equals("admin"))
           if(haslo.equals("admin")){
               loggIn = true;
               //...
               return "loggResult.xhtml";
           }
        
        return null;
    }
    public String loggOut(){
        loggIn = false;
        return "index.xhtml";
    }
    
    public boolean isLoggIn() {
        return loggIn;
    }

    public void setLoggIn(boolean loggIn) {
        this.loggIn = loggIn;
    }

    public UserPOJO getLoggInWho() {
        return loggInWho;
    }

    public void setLoggInWho(UserPOJO loggInWho) {
        this.loggInWho = loggInWho;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
    
    
}
