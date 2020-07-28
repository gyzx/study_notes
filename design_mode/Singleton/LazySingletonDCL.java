/**
 * @author: huzhong
 * @DATE: 2020/7/28 16:52
 * @DESCRIPTION: 双检锁/双重校验锁；该方法采用双锁机制，安全且在多线程情况下能保持高性能
 **/
public class LazySingletonDCL {

    private volatile static LazySingletonDCL instance;

    private LazySingletonDCL() {}

    public static LazySingletonDCL getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDCL.class) {
                if (instance == null) {
                    instance = new LazySingletonDCL();
                }
            }
        }
        return instance;
    }
}
