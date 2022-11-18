/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mycompany.uas_prakpbo.*;

/**
 *
 * @author user
 */
public class User {
    int userId;
    String userName;
    String pass;
    String userEmail;
    String userGender;
    CategoryUser userCategory;
    int userFollowers;

    public User(int userId, String userName, String pass, String userEmail, String userGender, CategoryUser userCategory, int userFollowers) {
        this.userId = userId;
        this.userName = userName;
        this.pass = pass;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userCategory = userCategory;
        this.userFollowers = userFollowers;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public CategoryUser getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(CategoryUser userCategory) {
        this.userCategory = userCategory;
    }

    public int getUserFollowers() {
        return userFollowers;
    }

    public void setUserFollowers(int userFollowers) {
        this.userFollowers = userFollowers;
    }
}
