package ua.ucu.edu.apps.second;

public class DataBase extends БазаДаних {
    public String recieveUserData() {
        return отриматиДаніКористувача();
    }

    public String recieveStaticData() {
        return отриматиСтатистичніДані();
    }
}
