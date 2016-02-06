
package User_package;

import pl.tut.model.user;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class UserRegistration {
    
    private static final Map<String, user> userList = new HashMap<>();
    private user UserTmp = new user();
    private ArrayList<String> listaPlec = null;
    private user tmp_user = new user();
    
    public UserRegistration() {
        
         listaPlec = new ArrayList<>(Arrays.asList(
           "Kobieta",
           "Mężczyzna"
        ));
        
        userList.put("Admin", new user("admin", "admin"));
    }
    
    public void addUser(){      
            userList.put(tmp_user.getLogin(), new user(tmp_user.getLogin(), tmp_user.getHaslo(), tmp_user.getImie(),
                                                       tmp_user.getData_ur(), tmp_user.getPlec(), tmp_user.getEmail()));     
    }
    public user getUserTmp() {
        return UserTmp;
    }

    public void setUserTmp(user UserTmp) {
        this.UserTmp = UserTmp;
    }

    public ArrayList<String> getListaPlec() {
        return listaPlec;
    }

    public void setListaPlec(ArrayList<String> listaPlec) {
        this.listaPlec = listaPlec;
    }

    public user getTmp_user() {
        return tmp_user;
    }

    public void setTmp_user(user tmp_user) {
        this.tmp_user = tmp_user;
    } 
    
}
