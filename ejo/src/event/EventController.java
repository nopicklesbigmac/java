package event;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import common.CommonService;
import common.OpenService;
import common.PublicController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import main.Controller;

public class EventController extends PublicController implements Initializable{
	@FXML ComboBox eventcombo;
	@FXML Label datetext;
	@FXML TextArea eventarea;
	private @FXML TextField searchfield;
	private @FXML Button searchButton;
	private Parent eventForm;
	private CommonService commonService;
	private Controller controller;
	private EventDAO event;
	private OpenService openService;
	
	public void setEventForm(Parent eventForm) {
		this.eventForm = eventForm;
	}

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		event = new EventDAO();
		ArrayList<EventDTO>  selects = event.selectAll();
		if (selects==null) {  
	      }else {
	         for (EventDTO select:selects) {
	            addcombo(select.getTitle());
	         }
	      }
		controller = new Controller();
		commonService = new CommonService();

		searchButton.setOnMouseClicked((MouseEvent)->{
			controller.setSearchText(searchfield.getText());
			System.out.println(searchfield.getText());
			System.out.println(controller.getSearchText());
			controller.openSearchPage();
		});
	}
	
	@Override
	public void eventProc() {
		String Title = (String) eventcombo.getValue();
		EventDTO selectevent = event.selectEvent(Title);
		if (selectevent==null) {
	      }else {
	    	  datetext.setText(selectevent.getEventdate());
	    	  eventarea.setText(selectevent.getContent());
	         }
	      }
	public void addcombo(String event) {
		eventcombo.getItems().add(event);

	}
	
	
}