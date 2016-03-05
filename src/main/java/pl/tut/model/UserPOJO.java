package pl.tut.model;

import java.io.Serializable;
//import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserPOJO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private int id;  
    @Column(name="imie",nullable=true,length=100) 
    private String imie;
    @Column(name="haslo",nullable=true,length=100) 
    private String haslo;
    @Column(name="login",nullable=true,length=100) 
    private String login;
    @Column(name="plec",nullable=true,length=100) 
    private String plec; //MAN / WOMAN
    @Column(name="email",nullable=true,length=100) 
    private String email;

    public UserPOJO() {
        
    } 
    
    public UserPOJO(String email, String haslo){
        this.email = email;
        this.haslo = haslo;
    }

    public UserPOJO( String haslo, String imie, String plec, String email) {
        this.haslo = haslo;
        this.imie = imie;
        this.plec = plec;
        this.email = email;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPOJO)) {
            return false;
        }
        UserPOJO other = (UserPOJO) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mindMap.encje.Kurs[ id=" + id + " ]";
    }
    
}