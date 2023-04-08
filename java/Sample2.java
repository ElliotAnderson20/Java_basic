import java.awt.*;
class Sample2 extends Frame{
    Button ok,cancel;
    Label l1,l2;
    TextArea first;
    TextField second;
    Sample2(String title){
        super(title);
        setVisible(true);
        setSize(500,400);
        setLayout(null);
        ok=new Button("ok");
        cancel=new Button("cancel");
        ok.setBounds(70,250,50,50);
        cancel.setBounds(150,250,50,50);
        l1=new Label("enter your name ");
        l2=new Label("enter your password");
        l1.setBounds(100,100,700,70);
        l2.setBounds(100,180,120,70);
        first = new TextArea(10,50);
        second = new TextField();
        first.setBounds(300,200,200,200);
        second.setBounds(76,200,200,200);
        add(ok);
        add(cancel);
        add(l1);
        add(l2);
        add(first);
        add(second);
    }
    public static void main(String args[]) 
    {
       Sample2 s = new Sample2("roll no.72");
    }
}