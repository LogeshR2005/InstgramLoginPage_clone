package application;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HomeController {
  
	@FXML
	private Pane titlelayer,buttomlayer;
	
	@FXML
	private ImageView Notify,Message,Post,Reel,Search,Personal,Home;
	
	
	
	private Image clicked;
	
	public void messager() {
		System.out.println("Actions -> Message!");
		
	}
	
	public void notification() {
		System.out.println("Action -> Notifications");
	}
	
	public void home() {
		System.out.println("Action -> Home");
		clicked = new Image("home_clicked.png");
		Home.setImage(clicked);
	}
	public void search() {
		System.out.println("Action -> searching");
		clicked = new Image("home.png");
		Home.setImage(clicked);
		
				}
	
	public void personal() {
		System.out.println("Action -> ME");
	}
	public void reel() {
		System.out.println("Action -> reel");
		
	}
	public void post() {
	
		System.out.println("Action -> post");
	}
	
	
	
	
	
}
