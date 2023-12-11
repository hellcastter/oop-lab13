package ua.ucu.edu.apps.first;

public class Auth {
    public MyUser login() {
//        return new MyFacebookUser(new FacebookUser());
        return new MyTwitterUser(new TwitterUser());
    }
}
