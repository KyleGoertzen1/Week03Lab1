package business;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String passWord;

    public User() {
        firstName = "";
        passWord = "";
    }

    public User(String firstName, String passWord) {
        this.firstName = firstName;
        this.passWord = passWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
