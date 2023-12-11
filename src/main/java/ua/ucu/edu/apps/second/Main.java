package ua.ucu.edu.apps.second;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();

        Auth auth = new Auth();
        if (auth.auth(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
