import java.awt.*;
class Uselist{
public static void main(String args[]){
int i;
Frame fr = new Frame();
fr.setTitle("roll no.72");
fr.setSize(350,300);
fr.setVisible(true);
List city = new List(10,false);
city.add("nashik");
city.add("pune");
city.add("mumbai");
city.add("nagpur");
city.add("kolkata");
city.add("delhi");
city.add("bengaluru");
city.add("hydrebad");
city.add("indore");
fr.add(city);
}
}

