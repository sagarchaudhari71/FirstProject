package encapsulation;

public class SMainClass {
public static void main(String[] args) {
	StudentClass s = new StudentClass();
	
	s.setSid(101);
	s.setSname("sagar");
	s.setScity("new york, USA");
	s.setSpercentage(71.70);
    System.out.println(s.getScity());	
}
}
