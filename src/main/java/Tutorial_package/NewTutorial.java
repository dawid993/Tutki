/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_package;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;

import pl.tut.dao.UserDAO;

@ManagedBean
@SessionScoped
public class NewTutorial {
    
    private Tutorial nowyTutorial;
    @Autowired
    private UserDAO userDao;

    public NewTutorial() {
        
           nowyTutorial = new Tutorial();
    }

    public Tutorial getNowyTutorial() {
        return nowyTutorial;
    }

    public void setNowyTutorial(Tutorial newTutorial) {
        this.nowyTutorial = newTutorial;        
    }
    
    
    
}
