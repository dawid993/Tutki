
package Tutorial_package;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Tutorial {
    
    private String content = "";
    private String autor;
    private String kategoria;

    public Tutorial() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    
    
    
}
