package pl.tut.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.tut.dao.TutorialDAO;
import pl.tut.model.TutorialPOJO;

@ManagedBean
@SessionScoped
@Component
public class TutorialController implements Serializable {

	private TutorialPOJO nowyTutorial;
	private List<SelectItem> categories;
	private String selection;
	@Autowired
	private TutorialDAO daoT;

	public TutorialController() {

		nowyTutorial = new TutorialPOJO();
		nowyTutorial.setNazwa("...");
		// selection = "...";

		categories = new ArrayList<SelectItem>();
		SelectItemGroup group1 = new SelectItemGroup("Programowanie");
		SelectItemGroup group2 = new SelectItemGroup("Sieci Komputerowe");
		SelectItemGroup group3 = new SelectItemGroup("Grafika");
		SelectItemGroup group4 = new SelectItemGroup("Języki obce");
		SelectItemGroup group5 = new SelectItemGroup("Bezbieczeństwo");
		SelectItemGroup group6 = new SelectItemGroup("Matematyka");

		SelectItem group11 = new SelectItem("C/C++");
		SelectItem group12 = new SelectItem("Java");
		SelectItem group13 = new SelectItem("Python");
		SelectItem group14 = new SelectItem(".Net");

		SelectItem group21 = new SelectItem("Sieci I");
		SelectItem group22 = new SelectItem("Sieci II");
		SelectItem group23 = new SelectItem("Sieci III");

		SelectItem group31 = new SelectItem("Grafika I");
		SelectItem group32 = new SelectItem("Grafika II");
		SelectItem group33 = new SelectItem("Grafika III");

		SelectItem group41 = new SelectItem("Języki obce I");
		SelectItem group42 = new SelectItem("Języki obce II");
		SelectItem group43 = new SelectItem("Języki obce III");

		SelectItem group51 = new SelectItem("Bezbieczeństwo I");
		SelectItem group52 = new SelectItem("Bezbieczeństwo II");
		SelectItem group53 = new SelectItem("Bezbieczeństwo III");

		SelectItem group61 = new SelectItem("Matematyka I");
		SelectItem group62 = new SelectItem("Matematyka II");
		SelectItem group63 = new SelectItem("Matematyka III");

		group1.setSelectItems(new SelectItem[] { group11, group12, group13, group14 });
		group2.setSelectItems(new SelectItem[] { group21, group22, group23 });
		group3.setSelectItems(new SelectItem[] { group31, group32, group33 });
		group4.setSelectItems(new SelectItem[] { group41, group42, group43 });
		group5.setSelectItems(new SelectItem[] { group51, group52, group53 });
		group6.setSelectItems(new SelectItem[] { group61, group62, group63 });

		categories.add(group1);
		categories.add(group2);
		categories.add(group3);
		categories.add(group4);
		categories.add(group5);
		categories.add(group6);

	}

	public String save() {
		System.out.println("S");
		nowyTutorial.setAutor("TEST AUTOR");
		daoT.save(nowyTutorial);

		nowyTutorial.setNazwa("...");
		selection = "...";

		return "newTutResult.xhtml";
	}

	public String onFlowProcess(FlowEvent event) { // do wizarda

		return event.getNewStep();
	}

	public TutorialPOJO getNowyTutorial() {
		return nowyTutorial;
	}

	public void setNowyTutorial(TutorialPOJO newTutorial) {
		this.nowyTutorial = newTutorial;
	}

	public List<SelectItem> getCategories() {
		return categories;
	}

	public void setCategories(List<SelectItem> categories) {
		this.categories = categories;
	}

	/*
	 * public String getSelection() { return selection; }
	 * 
	 * public void setSelection(String selection) { this.selection = selection;
	 * }
	 */

}
