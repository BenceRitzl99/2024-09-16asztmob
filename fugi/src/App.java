public class App {
    public static void main(String[] args) throws Exception {
        DataService dataService1 = new DataService(new Sqlite());
        DataService dataService2 = new DataService(new Mariadb());
    }
}
