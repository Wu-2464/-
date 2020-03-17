package cn.bdqn.util;

/**
 * 单例模式---静态内部类
 * 
 * @author Administrator
 * 
 */
public class BaseDao2 {
	
	
	// 2.私有的静态的全局的变量
	private static BaseDao2 dao2;

	// 1.私有化构造方法
	private BaseDao2() {
		super();
	}

	// 静态内部类(private public protected)
	static class BaseHelper {
		private final static BaseDao2 BASEDAO2 = new BaseDao2();
	}

	// 3.公有的静态的方法(返回值是当前对象)
	public static BaseDao2 getInstance() {
		dao2 = BaseHelper.BASEDAO2;
		return dao2;
	}

}
