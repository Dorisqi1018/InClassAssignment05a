public class Main {

    public static void main(String[] args) {
	// write your code here


        Rectangle box1 = new Rectangle(20,70,40,30);
        box1.draw();
        box1.setColor(Color.BLUE);
        box1.fill();
        Rectangle box2 = new Rectangle(60,70,40,30);
        box2.draw();
        box2.setColor(Color.MAGENTA);
        box2.fill();
        Rectangle box3 = new Rectangle(100,70,40,30);
        box3.draw();
        box3.setColor(Color.CYAN);
        box3.fill();
        Rectangle box4 = new Rectangle(40,40,40,30);
        box4.draw();
        box4.setColor(Color.RED);
        box4.fill();
        Rectangle box5 = new Rectangle(80,40,40,30);
        box5.draw();
        box5.setColor(Color.PINK);
        box5.fill();
        Rectangle box6 = new Rectangle(60,10,40,30);
        box6.draw();
        box6.setColor(Color.CUSTOM);
        box6.fill();

    }
}
