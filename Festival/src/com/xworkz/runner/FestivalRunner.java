package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.classes.Diwali;
import com.xworkz.classes.Dussehra;
import com.xworkz.classes.GaneshChaturthi;
import com.xworkz.classes.Holi;
import com.xworkz.classes.MahaShivaratri;
import com.xworkz.classes.Navaratri;
import com.xworkz.classes.RakshaBandhan;
import com.xworkz.classes.RamNavami;
import com.xworkz.classes.Sankranti;
import com.xworkz.classes.Ugadi;
import com.xworkz.interfaces.Festival;

public class FestivalRunner {
	public static void main(String[] args) {
		ApplicationContext context1 = new AnnotationConfigApplicationContext(Diwali.class);		
		Festival fest1 = context1.getBean(Diwali.class);
		fest1.celebrate();
		fest1.doPooja();
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(Dussehra.class);
		Festival fest2 = context2.getBean(Dussehra.class);
		fest2.celebrate();
		fest2.doPooja();
		
		ApplicationContext context3 = new AnnotationConfigApplicationContext(GaneshChaturthi.class);
		Festival fest3 = context3.getBean(GaneshChaturthi.class);
		fest3.celebrate();
		fest3.doPooja();
		
		ApplicationContext context4 = new AnnotationConfigApplicationContext(Holi.class);
		Festival fest4 = context4.getBean(Holi.class);
		fest4.celebrate();
		fest4.doPooja();
		
		ApplicationContext context5 = new AnnotationConfigApplicationContext(MahaShivaratri.class);
		Festival fest5 = context5.getBean(MahaShivaratri.class);
		fest5.celebrate();
		fest5.doPooja();
		
		ApplicationContext context6 = new AnnotationConfigApplicationContext(Navaratri.class);
		Festival fest6 = context6.getBean(Navaratri.class);
		fest6.celebrate();
		fest6.doPooja();
		
		ApplicationContext context7 = new AnnotationConfigApplicationContext(RakshaBandhan.class);
		Festival fest7 = context7.getBean(RakshaBandhan.class);
		fest7.celebrate();
		fest7.doPooja();
		
		ApplicationContext context8 = new AnnotationConfigApplicationContext(RamNavami.class);
		Festival fest8 = context8.getBean(RamNavami.class);
		fest8.celebrate();
		fest8.doPooja();
		
		ApplicationContext context9 = new AnnotationConfigApplicationContext(Sankranti.class);
		Festival fest9 = context9.getBean(Sankranti.class);
		fest9.celebrate();
		fest9.doPooja();
		
		ApplicationContext context10 = new AnnotationConfigApplicationContext(Ugadi.class);
		Festival fest10 = context10.getBean(Ugadi.class);
		fest10.celebrate();
		fest10.doPooja();
	}

}
