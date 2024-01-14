package org.library.classes;

public class User {
    String FirstName;
    String LastName;
    String  userID;
    int permissionLvl;

    //TODO create unique id for libId on creation.


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getPermissionLvl() {
        return permissionLvl;
    }

    public void setPermissionLvl(int permissionLvl) {
        this.permissionLvl = permissionLvl;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
