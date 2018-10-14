/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Alex
 */
public class UII {
    
    String username;
    String password;
    String firstName;
    String lastName;
    String level;
    String exp;
    
    public UII(String iUsername, String iPassword, String iFirstName, String iLastName, String iLevel, String iExp){
        username = iUsername;
        password = iPassword;
        firstName = iFirstName;
        lastName = iLastName;
        level = iLevel;
        exp = iExp;
    }
    
    public UII(String [] dets){
        username = dets[0];
        password = dets[1];
        firstName = dets[2];
        lastName = dets[3];
        level = dets[4];
        exp = dets[5];
    }
    
}
