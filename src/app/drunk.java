package app;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import com.sun.lwuit.Command;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.layouts.BorderLayout;

public class drunk extends MIDlet {
	
	public Form form;
	public drunk() {

	}
	
	protected void startApp() throws MIDletStateChangeException {
		Display.init(this);
		final Alcohol a1=new Alcohol();
		form = new Form("  ");
		
		form.getStyle().setBgColor(0xedc8a7 );
		form.setLayout(new BorderLayout());
		form.addComponent(BorderLayout.CENTER,new Label("              Drink-O-Meter"));
		Command b=new Command("START"){
			public void actionPerformed(ActionEvent arg0) {
				new listAl().data(a1);
			}
		};
		form.addCommand(b);
			
		form.show();		
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {

	}

	protected void pauseApp() {

	}

}
