package cn.bdqn.util;
/**
 * ����ģʽ---����ģʽ(�������̰߳�ȫģʽ)
 * @author Administrator
 *
 */
public class BaseDao {
	//2.˽�еľ�̬��ȫ�ֵı���
	private static BaseDao dao;
	
	//1.˽�л����췽��
	private BaseDao() {
		super();
	}
	
	// 3.���еľ�̬�ķ���(����ֵ�ǵ�ǰ����)
	//����synchronized �����������߳�ͬʱ����
	public synchronized static BaseDao getInstance(){
		//�������ǰ�ڲ��ڣ��������  new����
		if(dao==null){
			dao = new BaseDao();
		} 
		//��  ֱ�ӷ���
		return dao;
	}

}
