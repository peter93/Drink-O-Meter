package app;

import com.sun.lwuit.Button;
import com.sun.lwuit.Form;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;

public class Cal {

	public void data(final Alcohol a1){
		Form f2=new Form(" ");
		int sI=a1.sel;
		
		try{
		if(sI==0){
			
			 final TextField b = new TextField();
		     f2.addComponent(b);
		     final Button ok=new Button("BACK");
		 	 f2.addComponent(ok); 
		 	 ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					a1.beer((Integer.parseInt(b.getText())));
					new listAl().data(a1);
					}
			});
		 	 }else if(sI==1){
		 		 final TextField b = new TextField();
			     f2.addComponent(b);
			     final Button ok=new Button("BACK");
			 	 f2.addComponent(ok); 
			 	 ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						a1.vodka((Integer.parseInt(b.getText())));
						new listAl().data(a1);
						}
				});
			 	 
			 	 }else if(sI==2){
			 final TextField b = new TextField();
		     f2.addComponent(b);
		     final Button ok=new Button("BACK");
		 	 f2.addComponent(ok); 
		 	 ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					a1.rum((Integer.parseInt(b.getText())));
					new listAl().data(a1);
					}
			});
		 	 
		 	 }else if(sI==3){
		 		 final TextField b = new TextField();
			     f2.addComponent(b);
			     final Button ok=new Button("BACK");
			 	 f2.addComponent(ok); 
			 	 ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						a1.wishky((Integer.parseInt(b.getText())));
						new listAl().data(a1);
						}
				});
			 	 
			 	 }else if(sI==4){
			 		 final TextField b = new TextField();
				     f2.addComponent(b);
				     final Button ok=new Button("BACK");
				 	 f2.addComponent(ok); 
				 	 ok.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							a1.tequila((Integer.parseInt(b.getText())));
							new listAl().data(a1);
							}
					});
				 	 
				 	 }
		
		}catch(Exception e){
			 
		 }
		f2.show();		
	 }

}

	



