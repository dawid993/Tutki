
package User_package;

import pl.tut.model.userClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import pl.tut.dao.TutorialDAOImp;
import pl.tut.dao.UserDAOImp;
import pl.tut.model.Lesson;
import pl.tut.model.Tutorial;

@ManagedBean
@SessionScoped
public class UserRegistration {
    
    private static final Map<String, userClass> userList = new HashMap<>();
    private userClass UserTmp = new userClass();
    private ArrayList<String> listaPlec = null;
    private userClass tmp_user = new userClass();
    private Date data;
    
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
    	UserDAOImp dao = new UserDAOImp();
    	UserTmp.setLogin("davixon");
    	System.out.println(UserTmp);
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
