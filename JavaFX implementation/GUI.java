 

public class Main extends Application{
    private Label myLabel = new Label("Launches World of Zuul pre-set game");
    private Label myLabel2 = new Label("WORLD OF ZUUL");
    private Label myLabel3 = new Label("Launches a CSV game file");
    /**
     * The main entry point
     * @param args the command line arguments
     */
    public static void main(String[] args) { launch ( args );}
    {
    	
     
    }
    
    @Override

    public void start(Stage MenuStage) throws Exception
    {
        // Create a Button or any control item
        Button preButton = new Button("Preset");
        Button csvButton = new Button("CSV");
       

        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);

        //set an action on the button using method reference
        preButton.setOnAction(this::buttonClick);
        
        csvButton.setOnAction(this::buttonClick2);

        // Add the button and label into the pane
        pane.add(myLabel, 20, 31);
        pane.add(myLabel2, 20, 0);
        pane.add(preButton, 20, 30);
        pane.add(csvButton, 20, 40);
        pane.add(myLabel3, 20, 41);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 800,800);
        MenuStage.setTitle("JavaFX Example");
        MenuStage.setScene(scene);

        // Show the Stage (window)
        MenuStage.show();
    }

    /**
     */
    private void buttonClick(ActionEvent event)
    {
        // Launches the game
   
        String language;
    	String country;
    	
    	
            language = "en";
            country = "US";
    
    	
    	// Start specific game 
       new zuul.mygame.MyGame(language, country).play();
       
      
       
    }
    
    private void buttonClick2(ActionEvent event)
    {
        // Launches the game
   
        myLabel3.setText("Test");
    }
}