package rlet_fxml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joe Fleck
 */
public class UserList {
    
    ArrayList<User> listOfUsers;
    UserCntl userCntl;
    
    public UserList(UserCntl userCntl, String enteredUsername, String enteredPassword) {
        this.userCntl = userCntl;
        
        listOfUsers = new ArrayList<>();
        addUsersToList(enteredUsername, enteredPassword);
    }
    
    private void addUsersToList(String enteredUsername, String enteredPassword) {
        String filename = "userTextFile";
        File inputFile = new File(filename);
        
        try(Scanner in = new Scanner(inputFile)) {
            
            while(in.hasNextLine()) {
                String line = in.nextLine();
                String[] data = line.split(",");
                String userFirstName = data[0];
                String userLastName = data[1];
                String userUserName = data[2];
                String userPassword = data[3];
                
                getListOfUsers().add(new User(this, userFirstName, userLastName, userUserName, userPassword,
                        enteredUsername, enteredPassword));
            }
            
        } catch(FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }    
    }
    
    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }
    
    public UserCntl getUserCntl() {
        return userCntl;
    }
    
    
    
}
