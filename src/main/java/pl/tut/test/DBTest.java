/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tut.test;



import java.util.HashSet;
import java.util.Set;

import pl.tut.dao.TutorialDAOImp;
import pl.tut.model.Lesson;
import pl.tut.model.Tutorial;

/**
 *
 * @author Dawid
 */
public class DBTest {
    public static void main(String[] args){
    	Lesson l= new Lesson();
    	l.setLessonContent("sdasdasdasdasd");
    	l.setLessonName("LekcjaNastepna");    	
    	Set<Lesson> lessons = new HashSet<Lesson>();
    	lessons.add(l);
    	
    	TutorialDAOImp dao = new TutorialDAOImp();
    	Tutorial tut = dao.getTutorial(1);
    	
    	System.out.println(tut.getLessons().size());
    	tut.getLessons().add(l);
    	
    	dao.save(tut);
    }    
}
