package User_package;

import java.util.Date;


public class User {
    
    private String login, haslo;
    private String imie;
    private Date data_ur;
    private String plec; //MAN / WOMAN
    private String email;

    public User() {
        
    } 
    
    public User(String login, String haslo){
        this.login = login;
        this.haslo = haslo;
    }

    public User(String login, String haslo, String imie, Date data_ur, String plec, String email) {
        this.login = login;
        this.haslo = haslo;
        this.imie = imie;
        this.data_ur = data_ur;
        this.plec = plec;
        this.email = email;
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

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getData_ur() {
        return data_ur;
    }

    public void setData_ur(Date data_ur) {
        this.data_ur = data_ur;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}