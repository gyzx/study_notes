/**
 * @author: huzhong
 * @DATE: 2020/7/28 16:57
 * @DESCRIPTION: 登记式，该方法还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，
 * 防止反序列化重新创建新的对象，绝对防止多次实例化。不能用过反射来调用私有方法
 *
 **/
public enum SingletonEnum {

    INSTACE;

    public SingletonEnum getInstace() {
        return INSTACE;
    }

    public static void main(String[] args) throws Exception {
        SingletonEnum s1 = SingletonEnum.INSTACE;
        SingletonEnum s2 = SingletonEnum.INSTACE;
        System.out.println("正常情况下，实例化两个实例是否相同：" + (s1 == s2));

        // https://www.cnblogs.com/saoyou/p/11087462.html
        // http://c.biancheng.net/view/1338.html
    }
}
