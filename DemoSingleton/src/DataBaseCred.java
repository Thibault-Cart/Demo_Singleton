public class DataBaseCred {

    private String dbname;
    private String password;
    private String username;
    private String url;

    private DataBaseCred() {

    }

    @Override
    public String toString() {
       return "DataBaseCred{" +
               "dbname='" + dbname + '\'' +
               ", password='" + password + '\'' +
               ", username='" + username + '\'' +
               ", url='" + url + '\'' +
               '}';
    }

    public static DataBaseCred UniqueInstance;

    //region getter setter


    public String getDbname() {
        return dbname;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getUrl() {
        return url;
    }


    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //endregion
    public static DataBaseCred getInstance() {
        if (UniqueInstance == null) {
            UniqueInstance = new DataBaseCred();
        }
        return UniqueInstance;
    }
}
