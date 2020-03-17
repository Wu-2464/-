package cn.bdqn.test;

import cn.bdqn.util.BaseDao1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDao1 dao = BaseDao1.getInstance();
		
		BaseDao1 dao2 = BaseDao1.getInstance();
		
		System.out.println(dao==dao2);
	}

}
