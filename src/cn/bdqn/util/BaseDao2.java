package cn.bdqn.util;

/**
 * ����ģʽ---��̬�ڲ���
 * 
 * @author Administrator
 * 
 */
public class BaseDao2 {
	
	
	// 2.˽�еľ�̬��ȫ�ֵı���
	private static BaseDao2 dao2;

	// 1.˽�л����췽��
	private BaseDao2() {
		super();
	}

	// ��̬�ڲ���(private public protected)
	static class BaseHelper {
		private final static BaseDao2 BASEDAO2 = new BaseDao2();
	}

	// 3.���еľ�̬�ķ���(����ֵ�ǵ�ǰ����)
	public static BaseDao2 getInstance() {
		dao2 = BaseHelper.BASEDAO2;
		return dao2;
	}

}
