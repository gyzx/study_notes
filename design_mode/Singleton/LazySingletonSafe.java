/**
 * @author: huzhong
 * @DATE: 2020/7/28 16:45
 * @DESCRIPTION: 加锁的懒汉模式，可以在多线程环境下很好的工作，但是，效率很低，99%的情况下不需要同步
 *              优点：第一次调用才初始化，避免内存浪费
 *              缺点：必须加锁synchronized才能保证单例，但加锁会影响效率。getInstance()的性能对应用程序不是很关键（该方法使用不太频繁）
 **/
public class LazySingletonSafe {

    private static LazySingletonSafe instance;

    private LazySingletonSafe() {}

    public static synchronized LazySingletonSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonSafe();
        }
        return instance;
    }
}
