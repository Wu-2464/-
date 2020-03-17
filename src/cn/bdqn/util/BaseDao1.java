package cn.bdqn.util;
/**
 * 单例模式---饿汉模式(线程安全)
 * 
 * 
 * @author Administrator
 *
 */
public class BaseDao1 {
	//2.私有的静态的全局的变量
	private static BaseDao1 dao1 = new BaseDao1();
	
	//1.私有化构造方法
	private BaseDao1() {
		super();
	}
	
	// 3.公有的静态的方法(返回值是当前对象)
	public static BaseDao1 getInstance(){
		return dao1;
	}
}
