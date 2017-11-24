package stud.subh.hibernate.o2obipkfk.ui;

import org.hibernate.Session;

import stud.subh.hibernate.o2obipkfk.dao.ATMCard;
import stud.subh.hibernate.o2obipkfk.dao.Account;
import stud.subh.hibernate.o2obipkfk.dao.SessionUtil;

public class RelationO2OPKFKBiApplication {
	public static void main(String[] args) {
		System.out.println("**Mapping One-to-One bi-directional(PK to FK) Application**");
		
		Session session = SessionUtil.getSession();
		
		ATMCard aTMCard = new ATMCard();
		aTMCard.setCardno(65432);
		aTMCard.setCardpassword("4451");
		aTMCard.setCardtype("mestro card");
		Account account = new Account();
		account.setAccno(1009);
		account.setName("ajay");
		account.setBalance(34562f);
		account.setAtmCard(aTMCard);
		
		session.beginTransaction().begin();
		int ru = (Integer) session.save(account);
		session.beginTransaction().commit();
		System.out.println("Object Persisted : "+ru);
		
		/*ATMCard ac = (ATMCard) session.get(ATMCard.class, 98765);	//Navigating
		System.out.println("cno : "+ac.getCardno());
		System.out.println("pass :"+ac.getCardpassword());
		System.out.println("type : "+ac.getCardtype());
		System.out.println("accno : "+ac.getAccount().getAccno());
		System.out.println("Ac Holder name : "+ac.getAccount().getName());*/
		
		session.close();
	}
}