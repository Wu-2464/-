package cn.bdqn.util;
/**
 * ����ģʽ---����ģʽ(�̰߳�ȫ)
 * 
 * 
 * @author Administrator
 *
 */
public class BaseDao1 {
	//2.˽�еľ�̬��ȫ�ֵı���
	private static BaseDao1 dao1 = new BaseDao1();
	
	//1.˽�л����췽��
	private BaseDao1() {
		super();
	}
	
	// 3.���еľ�̬�ķ���(����ֵ�ǵ�ǰ����)
	public static BaseDao1 getInstance(){
		return dao1;
	}
}
