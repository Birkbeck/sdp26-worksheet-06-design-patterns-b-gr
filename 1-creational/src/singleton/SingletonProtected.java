package singleton;

public class SingletonProtected {
    private static final SingletonProtected instance = new SingletonProtected();


    private SingletonProtected() {
    }

    public static SingletonProtected getInstance() {
        return instance;
    }


}


/*
//OR



private SingletonProtected() {
}

public static SingletonProtected getInstance() {
    return Instance.INSTANCE;
}

private static class Instance {
    public static final SingletonProtected INSTANCE = new SingletonProtected();
}
}
*/
