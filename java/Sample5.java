import java.awt.*;
public class Sample5 extends Frame{
Sample5(String title){
super(title);
setLayout(null);
setVisible(true);
setSize(500,500);
Button b1=new Button("OK");
b1.setBounds(100,100,100,100);
Button b2=new Button("CANCEL");
b2.setBounds(200,100,100,100);
Button b3=new Button("RESET");
b3.setBounds(300,110,100,100);
add(b1);
add(b2);
add(b3);
}
public static void main(String args[]){
Sample5 s = new Sample5("roll no.72");
}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               