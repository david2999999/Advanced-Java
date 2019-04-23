@ThreadSafe
public class ServerStatus {
    @GuardedBy("users") public final Set<String> users;
    @GuardedBy("queries") public final Set<String> queries;
    
    public void addUser(String u) {
        synchronized (users) {
            users.add(u);
        }
    }
    
    public void addQuery(String q) {
        synchronized (queries) {
            queries.add(q);
        }
    }
}