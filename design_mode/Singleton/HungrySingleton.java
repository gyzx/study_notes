/**
 * @author: huzhong
 * @DATE: 2020/7/28 16:38
 * @DESCRIPTION: 饿汉模式。特点是一旦加载就创建一个单例，保证在调用getInstance方法之前单例就已经存在了
 *              优点：没有加锁，执行效率会提高。
 *              缺点：类加载的时候就初始化，浪费内存
 **/
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
