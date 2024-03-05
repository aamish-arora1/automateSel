package contexts;

import java.util.HashMap;

public class SessionContext {
    private final HashMap<String, Object> context;

    public SessionContext() {
        this.context=new HashMap<>();
    }
    public void addTestState(String key, Object details) {
        context.put(key, details);
    }

    public Object getTestState(String key) {
        return context.get(key);
    }
}
