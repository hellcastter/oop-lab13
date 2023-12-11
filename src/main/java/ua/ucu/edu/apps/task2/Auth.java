package ua.ucu.edu.apps.task2;

public class Auth extends Авторизація {
    public boolean auth(DataBase db) {
        db.recieveStaticData();
        return true;
    }
}
