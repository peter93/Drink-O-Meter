package app;

import com.sun.lwuit.Button;
import com.sun.lwuit.Form;
import com.sun.lwuit.List;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;

public class listAl {

	public void data(final Alcohol a1){
		Form form =new Form("                   List");
		try{
		final List alc = new List();
		alc.addItem("Beer");
		alc.addItem("Vodka");
		alc.addItem("rum");
		alc.addItem("Wishky");
		alc.addItem("Tequila");
		form.addComponent(alc);
		alc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a1.selectDrink(alc.getSelectedIndex());
				new Cal().data(a1);   
			}
			});
		final Button ok=new Button("NEXT");
	 	 form.addComponent(ok); 
	 	 ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 new Forth().data(a1);
				}
		});
		  }catch(Exception e){	 
			 }		form.show();

	}

}
