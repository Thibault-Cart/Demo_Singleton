public class Main {
    public static void main(String[] args) {

        // to get the instance of DataBaseCred  user getInstance
        DataBaseCred db = DataBaseCred.getInstance();
        // set the data
        db.setDbname("Student");
        db.setUsername("root");
        db.setPassword("password");
        db.setUrl("localhost");

        // create a other instance of DataBaseCred
        DataBaseCred db2 = DataBaseCred.getInstance();

        System.out.println(db.toString());
        System.out.println(db2.toString());
        // as we see both are the same.
        // this is the singleton pattern.

    }
}
