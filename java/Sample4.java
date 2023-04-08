import java.awt.*;
class Sample4 extends Frame{
Sample4(String title){
super(title);
setLayout(null);
setVisible(true);
setSize(100,100);
List l=new List(4,true);
l.add("english");
l.add("hindi");
l.add("marathi");
l.add("sanskrit");
l.setBounds(100,100,100,100);
add(l);
}
public static void main(String args[]){
Sample4 s = new Sample4("rol no.72");
}
}