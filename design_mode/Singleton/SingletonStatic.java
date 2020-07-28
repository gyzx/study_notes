/**
 * @author: huzhong
 * @DATE: 2020/7/28 17:03
 * @DESCRIPTION: 这种方式可以达到双检索一样的功效，但实现更简单，对静态域使用延迟初始化，应使用这种方式而不是双检索的方式。这种只适用于
 * 静态域的情况，双检索可以在实例域需要延迟初始化时使用。
 * 这种方式同样利用了 classloder 机制来保证初始化 instance 时只有一个线程，它跟第 3 种方式不同的是：第 3 种方式只要 Singleton 类被装载
 * 了，那么 instance 就会被实例化（没有达到 lazy loading 效果），而这种方式是 SingletonStatic 类被装载了，instance 不一定被初始化。因为
 * SingletonHolder 类没有被主动使用，只有显示通过调用 getInstance 方法时，才会显示装载 SingletonHolder 类，从而实例化 instance。想象
 * 一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 SingletonStatic 类加载时就实例化，因为不能确保
 * SingletonStatic 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。
 **/
public class SingletonStatic {

    private static class SingletonHolder {
        private static final SingletonStatic INSTANCE = new SingletonStatic();
    }

    private SingletonStatic() {}

    public static final SingletonStatic getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
