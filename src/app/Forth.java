package app;

import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.TextField;
import com.sun.lwuit.animations.CommonTransitions;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;

public class Forth{
	public void data(final Alcohol a1){
		Form form =new Form(" ");
		form.setTransitionOutAnimator(CommonTransitions.createFade(200));
		try{
		final List sex = new List();
		form.addComponent(new Label("Weight(kg):"));
		final TextField w = new TextField();
		form.addComponent(w);
		sex.addItem("MALE");
		sex.addItem("FEMALE");
		form.addComponent(sex);
		sex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a1.setSexWeight(sex.getSelectedIndex(),(Integer.parseInt(w.getText())));
				new Fifth().data(a1);
			   }
			});
		  }catch(Exception e){
				 
			 }		form.show();
	}

}
