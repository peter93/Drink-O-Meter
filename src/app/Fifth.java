package app;

import com.sun.lwuit.Button;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;

public class Fifth {
	public void data(final Alcohol a1){
	 Form form= new Form(" ");
	 try{
	 form.addComponent(new Label("Time passed(hr):"));
	 final TextField h = new TextField();
	 form.addComponent(h);
	 final Button ok=new Button("CALCULATE");;
	 form.addComponent(ok); 
 	 ok.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			a1.setTime((Float.parseFloat(h.getText())));
			a1.calculate();
			}
	});

  }catch(Exception e){
	 
 }
	 form.show();
	 
	}
}
