
package pl.tut.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tutorial")
public class TutorialPOJO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private int id;  
    @Column(name="content",nullable=true,length=100) 
    private String content = "";
    @Column(name="autor",nullable=true,length=100)   
    private String autor;
    @Column(name="kategoria",nullable=true,length=100)    
    private String kategoria;
    @Column(name="nazwa",nullable=true,length=100)  
    private String nazwa;

    public TutorialPOJO() {
    }

    public TutorialPOJO(String Autor, String nazwa, String kategoria, String content){
        
        this.autor = Autor;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void String(String autor) {
        this.autor = autor;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    
    
}
