import java.awt.Image;
import javax.swing.ImageIcon;

public class Node {
	int routeNumber = 0;
	String stop1 = "";
	String stop2 = "";
	String stop3 = "";
	String stop4 = "";
	String stop5 = "";
	String stop6 = "";
	String stop7 = "";
	Image routeImg;
	Node nextRoute;
	Node prevRoute;
	
	public Node(int routeNumber, String stop1, String stop2, String stop3, String stop4, String stop5, String stop6, String stop7, String img) {
		this.routeNumber = routeNumber;
		this.stop1 = stop1;
		this.stop2 = stop2;
		this.stop3 = stop3;
		this.stop4 = stop4;
		this.stop5 = stop5;
		this.stop6 = stop6;
		this.stop7 = stop7;
		this.routeImg = new ImageIcon(this.getClass().getResource(img)).getImage();
		nextRoute = null;
		prevRoute = null;
	}
}
