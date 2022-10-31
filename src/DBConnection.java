public class DBConnection {
    private static volatile DBConnection instance;
    private DBConnection(){
    }
    public static DBConnection getInstance(){
        DBConnection local_instance = instance;
        if (local_instance == null)
        {
            synchronized (DBConnection.class){
                local_instance = instance;
                if (local_instance == null)
                {
                    instance = new DBConnection();
                }
            }

        }
        return instance;
    }
}
