
/**
 * @author: huzhong
 * @DATE: 2020/7/28 16:38
 * @DESCRIPTION: 懒汉模式，特点是类加载的时候没有生成单例，只有当第一次调用的时候才去创建
 * 这种最大的问题就是不支持多线程
 **/
public class LazySingletonNotSafe {

    private static LazySingletonNotSafe instance;

    private LazySingletonNotSafe() {}

    public static LazySingletonNotSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonNotSafe();
        }
        return instance;
    }
}