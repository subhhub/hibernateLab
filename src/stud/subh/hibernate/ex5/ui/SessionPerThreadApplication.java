package stud.subh.hibernate.ex5.ui;

import stud.subh.hibernate.ex5.dao.SessionUtil;

public class SessionPerThreadApplication {
	public static void main(String[] args) {
		System.out.println("**Unique Object Per Thread Application**");

		for(int i = 1; i<=5; i++)
		System.out.println(Thread.currentThread().getName()+" thread "+SessionUtil.getThreadLocalSession().hashCode());
//		System.out.println(Thread.currentThread().getName()+" thread "+SessionUtil.getSession().hashCode());
		
		MyThread mt = new MyThread();
		mt.setName("Child");
		mt.start();
	}
}
class MyThread extends Thread{
	public void run(){
		for(int i = 1; i<=5; i++)
			System.out.println(Thread.currentThread().getName()+" thread "+SessionUtil.getSession().hashCode());
	}
}