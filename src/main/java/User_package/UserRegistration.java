
package User_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.tut.dao.UserDAO;
import pl.tut.model.userClass;

@Component
@ManagedBean
@SessionScoped
public class UserRegistration {
    
    private static final Map<String, userClass> userList = new HashMap<>();
    private userClass UserTmp = new userClass();
    private ArrayList<String> listaPlec = null;
    private userClass tmp_user = new userClass();
    private Date data;
    
    @Autowired
    private UserDAO dao;
    
    public UserRegistration() {
        
         listaPlec = new ArrayList<>(Arrays.asList(
           "Kobieta",
           "Mężczyzna"
        ));
        
        userList.put("Admin", new userClass("admin", "admin"));
    }
    
    public void addUser(){      
            userList.put(tmp_user.getLogin(), new userClass(tmp_user.getLogin(), tmp_user.getHaslo(), tmp_user.getImie(),
                                                        tmp_user.getPlec(), tmp_user.getEmail()));     
    }
    
    public void rejestracja(){
    	System.out.println("sda");    	
    	UserTmp.setLogin("davixon");
    	System.out.println(dao);
        dao.save(UserTmp);

    }
    
    
    public userClass getUserTmp() {
        return UserTmp;
    }

    public void setUserTmp(userClass UserTmp) {
        this.UserTmp = UserTmp;
    }

    public ArrayList<String> getListaPlec() {
        return listaPlec;
    }

    public void setListaPlec(ArrayList<String> listaPlec) {
        this.listaPlec = listaPlec;
    }

    public userClass getTmp_user() {
        return tmp_user;
    }

    public void setTmp_user(userClass tmp_user) {
        this.tmp_user = tmp_user;
    } 

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}
