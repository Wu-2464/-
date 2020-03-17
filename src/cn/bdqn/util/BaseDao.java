package cn.bdqn.util;
/**
 * 单例模式---懒汉模式(懒汉的线程安全模式)
 * @author Administrator
 *
 */
public class BaseDao {
	//2.私有的静态的全局的变量
	private static BaseDao dao;
	
	//1.私有化构造方法
	private BaseDao() {
		super();
	}
	
	// 3.公有的静态的方法(返回值是当前对象)
	//加上synchronized 不可能两个线程同时访问
	public synchronized static BaseDao getInstance(){
		//这个对象当前在不在，如果不在  new出来
		if(dao==null){
			dao = new BaseDao();
		} 
		//在  直接返回
		return dao;
	}

}
