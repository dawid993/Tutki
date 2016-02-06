package pl.tut.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class userClass implements Serializable {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;  
    
    @Column(name="login",nullable=false,length=100)
    private String login;
    @Column(name="haslo",nullable=false,length=100) 
    private String haslo;
    @Column(name="imie",nullable=false,length=100) 
    private String imie;
    @Column(name="data_ur",nullable=false,length=100) 
    private Date data_ur;
    @Column(name="plec",nullable=false,length=100) 
    private String plec; //MAN / WOMAN
    @Column(name="email",nullable=false,length=100) 
    private String email;

    public userClass() {
        
    } 
    
    public userClass(String login, String haslo){
        this.login = login;
        this.haslo = haslo;
    }

    public userClass(String login, String haslo, String imie, Date data_ur, String plec, String email) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}