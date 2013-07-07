package app;

import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.layouts.BorderLayout;

public class Alcohol {
    public	double beer=0,vodka=0,rum=0,tequila=0,wishky=0,r,w,h;
    public float bac;
    public int sel;
    public void beer(int v){
	beer  =v*650*0.05;
    }
    public void vodka(int v){
    	vodka =v*40*0.4;
    }
    public void rum(int v){
    	rum     =v*0.4*40;
    }
    public void tequila(int v){
    	tequila =v*40*.44;
    }
    
    public void wishky(int v){
    	wishky = v*0.4*40;
    }
public void setSexWeight(int b,int v){
	if(b==0){
		r = 0.73;
	}else 
		r = 0.66;
	
	w = v*2.20462;
	
}
public void setTime(float v){
	h = v;
	
}
public void selectDrink(int sI) {
	 sel=sI;
		
}
public void calculate(){
	Form form =new Form(" ");
	form.getStyle().setBgColor(0xedc8a7 );
	form.setLayout(new BorderLayout());
	try{
		double total= (vodka + beer + rum + tequila + wishky)*0.03;
		bac=(float) (((total*r*0.06*100)/w)-(0.015*h));
		form.addComponent(BorderLayout.CENTER,new Label("               BAC:"+String.valueOf(bac)));
	
	 }catch(Exception e){
		 
	 }
	form.show();
}


}
