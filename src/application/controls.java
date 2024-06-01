package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class controls {
    //pulling in buttons, image view and labels from scenebuilder
    @FXML
    private ImageView computerRes;    //computer turn  image 

    @FXML
    private Button lizardBtn;

    @FXML
    private Button paperButton;

    @FXML
    private ImageView playerRes;           //player choice image

    @FXML
    private Label resultScTxt;    //label for the result 

    @FXML
    private Button rockButton;

    @FXML
    private Button scissorsBtn;

    @FXML
    private Label scoreTxt;         // label for user winning or computer winning

    @FXML
    private Button spockBtn;
      //intiallizing the variable chocies
	private static final String ROCK = "rock";
	private static final String PAPER = "paper";
	private static final String SCISSORS = "scissors";
	private static final String LIZARD = "lizard";
	private static final String SPOCK = "spock";
	//intiallizing the image displayed
	private Image image;
	
    @FXML
    private void playerTurn(ActionEvent event){    //when player presses on button - actions 
    	
    	String playerChoice = null;
    	switch(((Button)event.getSource()).getId()) {
    	case "rockButton":  //when player clicks the rock button
    		image = new Image(getClass().getResourceAsStream("rock.png")); //the player image will be the rock
    		playerChoice = ROCK;                          //the player choice is set to rock
    		break;
    	case "paperButton":              //when player clicks the paper button
    		image = new Image(getClass().getResourceAsStream("paper.png")); //the player image will be the paper
    		playerChoice = PAPER;                //the player choice is set to paper
    		break;
    	case "scissorsBtn":               //when player clicks the scissors button
    		image = new Image(getClass().getResourceAsStream("scissors.png")); //the player image will be the scissors
    		playerChoice = SCISSORS;                  //the player choice is set to scissors
    		break;
    	case "lizardBtn":                   //when player clicks the lizard button
    		image = new Image(getClass().getResourceAsStream("lizard.png"));    //the player image will be the lizard
    		playerChoice = LIZARD;                        //the player choice is set to lizard
    		break;
    	case "spockBtn":                           //when player clicks the spock button
    		image = new Image(getClass().getResourceAsStream("spock.png"));  //the player image will be the spock
    		playerChoice = SPOCK;                           //the player choice is set to spock
    		break;
    		
    		
    		
    	}
    	playerRes.setImage(image);         //setting the player choice image as the one clicked
    	
    	//calling on function that decides winner
    	checkWinner(playerChoice,computerTurn());      
    	
    	
    	
    	
    }
    //computer turn function
    private String computerTurn() {
    	String computerChoice = null;
    	int index = (int)(Math.random() * 5);  // randomizer for computer choice
    	switch(index){         //for every index is a game option
    	case 0:    //first option
    		image = new Image(getClass().getResourceAsStream("rock.png"));  //image is set as rock
    		computerChoice = ROCK;           //computers choice is set as rock
    		break; 
    	case 1:   //second option
    		image = new Image(getClass().getResourceAsStream("paper.png"));  //image is set as paper
    		computerChoice = PAPER;         //computers choice is paper
    		break;
    	case 2:  //third option
    		image = new Image(getClass().getResourceAsStream("scissors.png")); //image set to scissors
    		computerChoice = SCISSORS;                //ccomputer choice is scissors
    		break;
    	case 3:  //fourth option
    		image = new Image(getClass().getResourceAsStream("lizard.png"));  //image is set to lizard
    		computerChoice = LIZARD;                  //computer choice is lizard
    		break;
    	case 4:  //fifth option
    		image = new Image(getClass().getResourceAsStream("spock.png"));   //image is set to spock
    		computerChoice = SPOCK;              // computer choice is spock
    		break;
    	}
    	computerRes.setImage(image);   // setting the computer imageview as the image chosen
    	return computerChoice;    //returning the computer choice 
    }
    
    
    //checkWInner takes in the computer choice and player choice to calc who wins
    public void checkWinner(String playerChoice, String computerChoice){
        if(playerChoice.equals(computerChoice)){    //if both choices are the same = tie
            scoreTxt.setText("Tie!");     
            resultScTxt.setText(" ");
        }
        else if (playerChoice.equals("rock") && computerChoice.equals("paper")){  
        	scoreTxt.setText("Computer wins!");        //displays who wins
        	resultScTxt.setText("Paper covers Rock");     //displays the action of the choices
        }
        else if (playerChoice.equals("rock") && computerChoice.equals("scissors")){
        	scoreTxt.setText("You win!");
        	resultScTxt.setText("Rock crushes Scissors");
        }
        else if (playerChoice.equals("paper") && computerChoice.equals("rock")){
        	scoreTxt.setText("you win!");
        	resultScTxt.setText("Paper covers Rock");
        }
        else if (playerChoice.equals("paper") && computerChoice.equals("scissors")){
        	scoreTxt.setText("Computer wins!");
        	resultScTxt.setText("Scissors cuts paper");
        }
        else if (playerChoice.equals("scissors") && computerChoice.equals("rock")){
        	scoreTxt.setText("Computer wins!");
        	resultScTxt.setText("Rock crushes Scissors");
        }
        else if (playerChoice.equals("scissors") && computerChoice.equals("paper")){
        	scoreTxt.setText("You win!");
        	resultScTxt.setText("Scissors cuts paper");
        	
        }
        else if (playerChoice.equals("scissors") && computerChoice.equals("lizard")){
        	scoreTxt.setText("you Win!");
        	resultScTxt.setText("Scissor decapities lizard");
        }
        else if (playerChoice.equals("lizard") && computerChoice.equals("spock")){
        	scoreTxt.setText("you Win!");
        	resultScTxt.setText("lizard poisons spock");
        }
        else if (playerChoice.equals("paper") && computerChoice.equals("spock")){
        	scoreTxt.setText("you Win!");
        	resultScTxt.setText("Paper disporoves spock");
        }
        else if (playerChoice.equals("rock") && computerChoice.equals("spock")){
        	scoreTxt.setText("computer Wins!");
        	resultScTxt.setText("Spock vaporizes rock");
        }  
        else if (playerChoice.equals("rock") && computerChoice.equals("lizard")){
        	scoreTxt.setText("you Win!");
        	resultScTxt.setText("Rock curshes lizard");
        }   
        else if (playerChoice.equals("paper") && computerChoice.equals("lizard")){
        	scoreTxt.setText("computer Wins!");
        	resultScTxt.setText("Lizard eats paper");
        }   
        else if (playerChoice.equals("scissors") && computerChoice.equals("spock")){
        	scoreTxt.setText("computer Wins!");
        	resultScTxt.setText("Spock smashes scissors");
        }   
        else if (playerChoice.equals("lizard") && computerChoice.equals("scissors")){
        	scoreTxt.setText("computer Wins!");
        	resultScTxt.setText("Scissors decapites lizard");
        }   
        else if (playerChoice.equals("spock") && computerChoice.equals("scissors")){
        	scoreTxt.setText("you Win!");
        	resultScTxt.setText("Spock smashes scissors");
        }   
        else if (playerChoice.equals("spock") && computerChoice.equals("rock")){
        	scoreTxt.setText("you Win!");
        	resultScTxt.setText("Spock vaporizes rock");
        }   
        else if (playerChoice.equals("spock") && computerChoice.equals("lizard")){
        	scoreTxt.setText("computer Wins!");
        	resultScTxt.setText("Lizard posions spock");
        }   
        else if (playerChoice.equals("spock") && computerChoice.equals("paper")){
        	scoreTxt.setText("computer Wins!");
        	resultScTxt.setText("Paper disproves spock");
        	
        }   
        else if(playerChoice.equals("lizard") && computerChoice.equals("rock")) {
        	scoreTxt.setText("computer wins!");
        	resultScTxt.setText("rock crushes lizard");
        }
        else if(playerChoice.equals("lizard") && computerChoice.equals("paper")) {
        	scoreTxt.setText("you win!");
        	resultScTxt.setText("lizard eats paper");
        }
    }
    
    
    
    
    
    
    
}
