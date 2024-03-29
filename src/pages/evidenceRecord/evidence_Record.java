/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages.evidenceRecord;

import admin.JdbcDao;
import admin.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import static pages.evidenceRecordTab.erPageController.CHOSEN;
import static pages.homePage.HomeController.CLASS_ID;

/**
 *
 * @author vanessa
 */
public class evidence_Record extends Application{
    public Map <String,String> assGrade = new HashMap<>();
    public String assignments;
    static Stage primaryStage = new Stage();
    
    public static void main(String[] args) throws Exception {
       launch(args);
       
       
    }
    @Override
    public void start(Stage stage) throws Exception {
//        Parent newClassRoot = FXMLLoader.load(getClass().getResource("eRCHart.fxml"));
//        Scene newClassScene = new Scene(newClassRoot);
//        primaryStage.setTitle("Creating Assignment");
//        primaryStage.setScene(newClassScene);
//        primaryStage.show();
        
    }
    //creates evidence record
    public void ER() throws Exception{
        display();
        primaryStage.setTitle("Evidence Record");
        
        Label labelOv = new Label("             ");//creates a border around chart
        labelOv.setStyle("-fx-background-color: white;");
        labelOv.setMaxWidth(Double.POSITIVE_INFINITY);
        labelOv.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelOh = new Label("          ");//creates a border around chart
        labelOh.setStyle("-fx-background-color: white;");
        labelOh.setMaxWidth(Double.POSITIVE_INFINITY);
        labelOh.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelInfo = new Label(" ");//edit to have student information
        
        
        //creates levels lables
        Label name = new Label(getName());
        Label className = new Label(getClassName());
        name.setStyle("-fx-background-color: #112416 #112416;");
        className.setTextFill(Color.web("#fffefe"));
        
        Label labelR = new Label("       R       ");
        labelR.setStyle("-fx-background-color: #112416 #112416;");
        labelR.setTextFill(Color.web("#fffefe"));
        Label label_1 = new Label("       1-      ");
        label_1.setStyle("-fx-background-color: #112416 #112416;");
        label_1.setTextFill(Color.web("#fffefe"));
        Label label1 = new Label("       1       ");
        label1.setStyle("-fx-background-color: #112416 #112416;");
        label1.setTextFill(Color.web("#fffefe"));
        Label label1_ = new Label("      1+      ");
        label1_.setStyle("-fx-background-color: #112416 #112416;");
        label1_.setTextFill(Color.web("#fffefe"));
        Label label_2 = new Label("       2-      ");
        label_2.setStyle("-fx-background-color: #112416 #112416;");
        label_2.setTextFill(Color.web("#fffefe"));
        Label label2 = new Label("       2       ");
        label2.setStyle("-fx-background-color: #112416 #112416;");
        label2.setTextFill(Color.web("#fffefe"));
        Label label2_ = new Label("      2+      ");
        label2_.setStyle("-fx-background-color: #112416 #112416;");
        label2_.setTextFill(Color.web("#fffefe"));
        Label label_3 = new Label("       3-      ");
        label_3.setStyle("-fx-background-color: #112416 #112416;");
        label_3.setTextFill(Color.web("#fffefe"));
        Label label3 = new Label("       3       ");
        label3.setStyle("-fx-background-color: #112416 #112416;");
        label3.setTextFill(Color.web("#fffefe"));
        Label label3_ = new Label("      3+      ");
        label3_.setStyle("-fx-background-color: #112416 #112416;");
        label3_.setTextFill(Color.web("#fffefe"));
        Label label_4 = new Label("       4-      ");
        label_4.setStyle("-fx-background-color: #112416 #112416;");
        label_4.setTextFill(Color.web("#fffefe"));
        Label label4 = new Label("       4       ");
        label4.setStyle("-fx-background-color: #112416 #112416;");
        label4.setTextFill(Color.web("#fffefe"));
        Label label4_ = new Label("      4+      ");
        label4_.setStyle("-fx-background-color: #112416 #112416;");
        label4_.setTextFill(Color.web("#fffefe"));
        
        //creates spacers between levels(makes it easier to read)
        Label labelE = new Label("");
        labelE.setStyle("-fx-background-color: grey;");
        labelE.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE1 = new Label("");
        labelE1.setStyle("-fx-background-color: grey;");
        labelE1.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE1.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE2 = new Label("");
        labelE2.setStyle("-fx-background-color: grey;");
        labelE2.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE2.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE3= new Label("");
        labelE3.setStyle("-fx-background-color: grey;");
        labelE3.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE3.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE4 = new Label("");
        labelE4.setStyle("-fx-background-color: grey;");
        labelE4.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE4.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE5 = new Label("");
        labelE5.setStyle("-fx-background-color: grey;");
        labelE5.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE5.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE6 = new Label("");
        labelE6.setStyle("-fx-background-color: grey;");
        labelE6.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE6.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE7 = new Label("");
        labelE7.setStyle("-fx-background-color: grey;");
        labelE7.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE7.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE8 = new Label("");
        labelE8.setStyle("-fx-background-color: grey;");
        labelE8.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE8.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE9 = new Label("");
        labelE9.setStyle("-fx-background-color: grey;");
        labelE9.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE9.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE10 = new Label("");
        labelE10.setStyle("-fx-background-color: grey;");
        labelE10.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE10.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE11 = new Label("");
        labelE11.setStyle("-fx-background-color: grey;");
        labelE11.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE11.setMaxHeight(Double.POSITIVE_INFINITY);
        Label labelE12 = new Label("");
        labelE12.setStyle("-fx-background-color: grey;");
        labelE12.setMaxWidth(Double.POSITIVE_INFINITY);
        labelE12.setMaxHeight(Double.POSITIVE_INFINITY);
        
        GridPane gridPane = new GridPane();
        //gridPane.setGridLinesVisible(true);
        gridPane.add(labelInfo, 0, 0, 1, 1);
        gridPane.add(labelOv, 0, 1, 4, 300);
        gridPane.add(labelOh, 1, 0, 300, 4);
        
        int i=7;
        int j=0;
        while(j<assGrade.size()){//fix the 17 to work with the database
            Label labelP = new Label((String) assGrade.keySet().toArray()[j]);//edit
            System.out.println((String) assGrade.keySet().toArray()[j]);
            System.out.println(i-7);
            labelP.setStyle("-fx-background-color: #112416 #112416;");
            labelP.setTextFill(Color.web("#fffefe"));
            gridPane.add(labelP, i-1, 4, 1, 1);
            System.out.println(i-1);
            Label label = new Label("    ");
            label.setStyle("-fx-background-color: grey;");
            label.setMaxWidth(Double.POSITIVE_INFINITY);
            label.setMaxHeight(Double.POSITIVE_INFINITY);
            gridPane.add(label, i, 4, 1, 28);
            System.out.println(i);
            String test= String.valueOf(i);
            j++;
            System.out.println(i);
            System.out.println(" ");
            i+=2;
            //System.out.println("j is " + j);
        }
        System.out.println("size is " + assGrade.size());
        
        //adds levels and level spacers to gridPane
        gridPane.add(labelR, 4, 5, 1, 1);//row R
        gridPane.add(labelE, 4, 6, 100, 1);
        gridPane.add(label_1, 4, 7, 1, 1);//row 1-
        gridPane.add(labelE1, 4, 8, 100, 1);//row 1-/1
        gridPane.add(label1, 4, 9, 1, 1);//row 1
        gridPane.add(labelE2, 4, 10, 100, 1);//row 1/1+
        gridPane.add(label1_, 4, 11, 1, 1);//row 1+
        gridPane.add(labelE3, 4, 12, 100, 1);//row 1+/2-
        gridPane.add(label_2, 4, 13, 1, 1);//row 2-
        gridPane.add(labelE4, 4, 14, 100, 1);//row 2-/2
        gridPane.add(label2, 4, 15, 1, 1);//row 2
        gridPane.add(labelE5, 4, 16, 100, 1);//row 2/2+
        gridPane.add(label2_, 4, 17, 1, 1);//row 2+
        gridPane.add(labelE6, 4, 18, 100, 1);//row 2+/3-
        gridPane.add(label_3, 4, 19, 1, 1);//row 3-
        gridPane.add(labelE7, 4, 20, 100, 1);//row 3-/3
        gridPane.add(label3, 4, 21, 1, 1);//row 3
        gridPane.add(labelE8, 4, 22, 100, 1);//row 3/3+
        gridPane.add(label3_, 4, 23, 1, 1);//row 3+
        gridPane.add(labelE9, 4, 24, 100, 1);//row 3+/4-
        gridPane.add(label_4, 4, 25, 1, 1);//row 4-
        gridPane.add(labelE10, 4, 26, 100, 1);//row 4-/4
        gridPane.add(label4, 4, 27, 1, 1);//row 4
        gridPane.add(labelE11, 4, 28, 100, 1);//row 4/4+
        gridPane.add(label4_, 4, 29, 1, 1);//row 4+
        gridPane.add(labelE12, 4, 30, 100, 1);//row 4++
        gridPane.add(name, 4, 40, 20, 5);
        gridPane.add(className, 4, 50,20,5);
        
        System.out.println("here");
        //Button test = new Button("tezt");
        //gridPane.add(test,8,21);
        for (int w = 0; w < assGrade.size(); w++) {
            //System.out.println("im in");
           
            String temp =((String) assGrade.values().toArray()[w]);
            System.out.println("temp is ?" + temp);
            if(temp !=null){ 
                final Button btn = new Button();
                double r=15;
                btn.setShape(new Circle(r));
                btn.setMinSize(2*r, 2*r);
                btn.setMaxSize(2*r, 2*r);
                getPlacement(temp); 
                //gridPane.add(btn,7,25);
                gridPane.add(btn, w+7, getPlacement(assGrade.get((String) assGrade.keySet().toArray()[w])));
            }else{
                
            }
            System.out.println();
            //System.out.println("weird "+ getPlacement((String) assGrade.values().toArray()[w]));
           

        }
       
        Scene scene = new Scene(gridPane, 1200, 900);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
    public int getPlacement(String mark) {
        int i=0;
        switch (mark) {
            case "R":
                i = 4;
                break;
            case "1-":
                i = 7;
                break;
            case "1":
                i = 9;
                break;
            case "1+":
                i = 11;
                break;
            case "2-":
                i = 13;
                break;
            case "2":
                i = 15;
                break;
            case "2+":
                i = 17;
                break;
            case "3-":
                i = 19;
                break;
            case "3":
                i = 21;
                break;
            case "3+":
                i = 23;
                break;
            case "3+/4-":
                i = 24;
                break;
            case "4-":
                i = 25;
                break;
            case "4-/4":
                i = 26;
                break;
            case "4":
                i = 27;
                break;
            case "4/4+":
                i = 28;
                break;
            case "4+":
                i = 29;
                break;
            case "4++":
                i = 30;
                break;
            case "null":
                i =0;
            default:
                i = 0;
        }
       return i;         
    }
    
  
    public void display() throws SQLException{

       getAssignmentGradeId(CHOSEN);
       System.out.println(assGrade);

    }
    
    public void getAssignmentGradeId(Student s) throws SQLException{
        
        HashMap temnp = new HashMap();
        //ObservableList<Mark> marks = FXCollections.observableArrayList();
        
        JdbcDao jdbc = new JdbcDao();
        Connection database = jdbc.getConnection();
        
        try{
            String sql = "SELECT * FROM Assignment_grade WHERE Student_id = ? ";
            PreparedStatement statement = database.prepareStatement(sql);
            statement.setInt(1,s.getId());
            //System.out.println("student id: " + stId);
           
            ResultSet rs = statement.executeQuery();
            if(rs!= null){
                while(rs.next()){
                    int id = rs.getInt("Assignment_grade_id");
                    int assId = rs.getInt("Assignment_id");
                    String mark = rs.getString("Assignment_grade");
                    if(belongsToClass(assId) == true){
                        String assName = getAssignmentName(assId);
                        String name = getAssignmentName(assId);
                        assGrade.put(name,mark);
                    }
                    
           
                    //System.out.println("the Mark object " + temp.getMap());
                }
            }else{
                System.out.println("no result from db");
            }
            //Student1 tempS = new Student1(s.getName(),marks);
                    //System.out.println("the student bind is " + tempS.getMap());
        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
        //System.out.println("size of result array " + result.size());
//       for(Mark m:result){
//           System.out.println("the result is " + m);
//       }
          
        
    }
    /**
     * check if the assignment belongs to the current class
     * @param assId
     * @return 
     */
    public boolean belongsToClass(int assId){
        JdbcDao jdbc = new JdbcDao();
        Connection database = jdbc.getConnection();
        try{
            String sql = "SELECT * FROM Assignment WHERE Assignment_Id = ?  AND Class_Id = ?";
            PreparedStatement statement = database.prepareStatement(sql);
            statement.setInt(1,assId);
            statement.setInt(2,CLASS_ID);
            System.out.println("current class id is: " + CLASS_ID);
           
            ResultSet rs = statement.executeQuery();
            if(rs!= null){
                while(rs.next()){
                    return true;
                    //System.out.println("assignment name  " + result);
                }
            }else{
                System.out.println("no result from db");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
        

    public String getAssignmentName(int assId){
        String result ="";
        JdbcDao jdbc = new JdbcDao();
        Connection database = jdbc.getConnection();
        
        try{
            String sql = "SELECT * FROM Assignment WHERE Assignment_Id = ? ";
            PreparedStatement statement = database.prepareStatement(sql);
            statement.setInt(1,assId);
            //System.out.println("student id: " + stId);
           
            ResultSet rs = statement.executeQuery();
            if(rs!= null){
                while(rs.next()){
                    result = rs.getString("Assignment_Name");   
                    //System.out.println("assignment name  " + result);
                }
            }else{
                System.out.println("no result from db");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return result;
    }
    
    public String getName(){
        return CHOSEN.getName();
    }
   public String getClassName(){
       String result ="";
        JdbcDao jdbc = new JdbcDao();
        Connection database = jdbc.getConnection();
        
        try{
            String sql = "SELECT * FROM Class WHERE Class_ID = ? ";
            PreparedStatement statement = database.prepareStatement(sql);
            statement.setInt(1,CLASS_ID);
            //System.out.println("student id: " + stId);
           
            ResultSet rs = statement.executeQuery();
            if(rs!= null){
                while(rs.next()){
                    result = rs.getString("Class_Name");   
                    System.out.println("class name  " + result);
                }
            }else{
                System.out.println("no result from db");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return result;
   }
       
    
    
}
