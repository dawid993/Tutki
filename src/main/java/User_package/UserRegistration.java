
package User_package;

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
    
    private static final Map<String, User> userList = new HashMap<>();
    private User UserTmp = new User();
    private ArrayList<String> listaPlec = null;
    private User tmp_user = new User();
    
    public UserRegistration() {
        
         listaPlec = new ArrayList<>(Arrays.asList(
           "Kobieta",
           "Mężczyzna"
        ));
        
        userList.put("Admin", new User("admin", "admin"));
    }
    
    public void addUser(){      
            userList.put(tmp_user.getLogin(), new User(tmp_user.getLogin(), tmp_user.getHaslo(), tmp_user.getImie(),
                                                       tmp_user.getData_ur(), tmp_user.getPlec(), tmp_user.getEmail()));     
    }
    public User getUserTmp() {
        return UserTmp;
    }

    public void setUserTmp(User UserTmp) {
        this.UserTmp = UserTmp;
    }

    public ArrayList<String> getListaPlec() {
        return listaPlec;
    }

    public void setListaPlec(ArrayList<String> listaPlec) {
        this.listaPlec = listaPlec;
    }

    public User getTmp_user() {
        return tmp_user;
    }

    public void setTmp_user(User tmp_user) {
        this.tmp_user = tmp_user;
    } 
    
}
