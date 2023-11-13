import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.time.*;

public class App {
	
	// QUEUE : PRIORITY = START / FIRST-IN FIRST-OUT
	//	ADD 	/	ADD PASSENGER TO THE LINE
	//	REMOVE 	/ 	REMOVE PASSENGER FROM THE LINE
	//	PEEK 	/	CHECKS THE FIRST PASSENGER
	
	// STACK : PRIORITY = END / LAST-IN FIRST-OUT
	//	PUSH 	/	ADDS FARE TO THE STACK
	//	POP		/	REMOVES FARE TO THE STACK
	//	PEEK
	
	// NODE : STORES DATA
	// LINKEDLIST : HOLDS METHODS/OPERATIONS 
	
	Font Norwester;

	private JFrame frame;
	private JFrame frame2;
	private JFrame frame3;
	private JFrame frame4;
	private JFrame frame5;
	private JFrame history;
	
	UserLinkedList routes = new UserLinkedList();
	JLabel routeLbl, routeStartLbl, routeEndLbl, F3routeLbl, routeImg;
	
	JLabel A1DestLbl, A1TypeLbl;
	int A1Dest = 0, A1Type = 0;
	JLabel A2DestLbl, A2TypeLbl;
	int A2Dest = 0, A2Type = 0;
	
	JLabel B1DestLbl, B1TypeLbl;
	int B1Dest = 0, B1Type = 0;
	JLabel B2DestLbl, B2TypeLbl;
	int B2Dest = 0, B2Type = 0;
	
	JLabel C1DestLbl, C1TypeLbl;
	int C1Dest = 0, C1Type = 0;
	JLabel C2DestLbl, C2TypeLbl;
	int C2Dest = 0, C2Type = 0;
	
	JLabel D1DestLbl, D1TypeLbl;
	int D1Dest = 0, D1Type = 0;
	JLabel D2DestLbl, D2TypeLbl;
	int D2Dest = 0, D2Type = 0;
	
	JLabel E1DestLbl, E1TypeLbl;
	int E1Dest = 0, E1Type = 0;
	JLabel E2DestLbl, E2TypeLbl;
	int E2Dest = 0, E2Type = 0;
	
	JLabel A1cover, A2cover, B1cover, B2cover, C1cover, C2cover, D1cover, D2cover, E1cover, E2cover, boardBtn;
	int passengerCount = 0;
	
	JLabel passengerIcon1, passengerIcon2, passengerIcon3, passengerIcon4, passengerIcon5, passengerIcon6, passengerIcon7, passengerIcon8, passengerIcon9, passengerIcon10;
	
	JLabel seatNumberA1, seatNumberA2, seatNumberB1, seatNumberB2, seatNumberC1, seatNumberC2, seatNumberD1, seatNumberD2, seatNumberE1, seatNumberE2;
	JLabel destinationA1, destinationA2, destinationB1, destinationB2, destinationC1, destinationC2, destinationD1, destinationD2, destinationE1, destinationE2;
	JLabel fareTypeA1, fareTypeA2, fareTypeB1, fareTypeB2, fareTypeC1, fareTypeC2, fareTypeD1, fareTypeD2, fareTypeE1, fareTypeE2;
	JLabel fareA1, fareA2, fareB1, fareB2, fareC1, fareC2, fareD1, fareD2, fareE1, fareE2;
	
	private JLabel collectFareBtn, departBtn, F4backBtn, passengerOnBoardA1, passengerOnBoardA2, passengerOnBoardB1, passengerOnBoardB2, passengerOnBoardC1, passengerOnBoardC2, passengerOnBoardD1, passengerOnBoardD2, passengerOnBoardE1, passengerOnBoardE2, fareCollector;
	
	JLabel passengerCountRecord, passengerCountDetails;
	
	Queue<String> queue = new LinkedList<>();
	Stack<Float> fareStack = new Stack<>();
	
	int Regular = 0;
	int Discounted = 0;
	float historyTotalFare = 0;
	int historyCount = 0;
	private JLabel passengerCountRecord_1;
	private JLabel cumulativeFare;
	private JLabel travelRoute;
	private JLabel saveBtn;
	
	JLabel grid1DateTime, grid1TravelRoute, grid1PassengerCount, grid1DistanceTraveled, grid1CumulativeFare;
	JLabel grid2DateTime, grid2TravelRoute, grid2PassengerCount, grid2DistanceTraveled, grid2CumulativeFare;
	JLabel grid3DateTime, grid3TravelRoute, grid3PassengerCount, grid3DistanceTraveled, grid3CumulativeFare;
	JLabel grid4DateTime, grid4TravelRoute, grid4PassengerCount, grid4DistanceTraveled, grid4CumulativeFare;
	JLabel grid5DateTime, grid5TravelRoute, grid5PassengerCount, grid5DistanceTraveled, grid5CumulativeFare;
	JLabel grid6DateTime, grid6TravelRoute, grid6PassengerCount, grid6DistanceTraveled, grid6CumulativeFare;
	
	JLabel grid1TravelRouteLbl, grid1PassengerCountLbl, grid1DistanceTraveledLbl, grid1CumulativeFareLbl;
	JLabel grid2TravelRouteLbl, grid2PassengerCountLbl, grid2DistanceTraveledLbl, grid2CumulativeFareLbl;
	JLabel grid3TravelRouteLbl, grid3PassengerCountLbl, grid3DistanceTraveledLbl, grid3CumulativeFareLbl;
	JLabel grid4TravelRouteLbl, grid4PassengerCountLbl, grid4DistanceTraveledLbl, grid4CumulativeFareLbl;
	JLabel grid5TravelRouteLbl, grid5PassengerCountLbl, grid5DistanceTraveledLbl, grid5CumulativeFareLbl;
	JLabel grid6TravelRouteLbl, grid6PassengerCountLbl, grid6DistanceTraveledLbl, grid6CumulativeFareLbl;
	
	Queue<String> DateTime = new LinkedList<>();
	Queue<String> TravelRoute = new LinkedList<>();
	Queue<Integer> PassengerCount = new LinkedList<>();
	Queue<Float> DistanceTraveled = new LinkedList<>();
	Queue<Float> CumulativeFare = new LinkedList<>();
	
	Queue<String> DateTimeDuplicate = new LinkedList<>();
	Queue<String> TravelRouteDuplicate = new LinkedList<>();
	Queue<Integer> PassengerCountDuplicate = new LinkedList<>();
	Queue<Float> DistanceTraveledDuplicate = new LinkedList<>();
	Queue<Float> CumulativeFareDuplicate = new LinkedList<>();
	
	Image passengerOnBoardUnpaidSrc = new ImageIcon(this.getClass().getResource("/passenger on-board.png")).getImage();
	Image passengerOnBoardUnpaidImg = passengerOnBoardUnpaidSrc.getScaledInstance(49, 49, Image.SCALE_DEFAULT);
	
	public void Reset() {
		boardBtn.setVisible(false);
		passengerCount = 0;
		Regular = 0;
		Discounted = 0;
		
		while (routes.Current.prevRoute != null) {
			routes.prevElement();
			routeLbl.setText(Integer.toString(routes.Current.routeNumber));
			routeStartLbl.setText(routes.Current.stop1);
			routeEndLbl.setText(routes.Current.stop7);
			routeImg.setIcon(new ImageIcon(routes.Current.routeImg.getScaledInstance(338, 586, Image.SCALE_DEFAULT)));
		}
		
		removePassenger(0);
		
		seatNumberA1.setText("");
		destinationA1.setText("");
		fareTypeA1.setText("");
		fareA1.setText("");
		seatNumberA2.setText("");
		destinationA2.setText("");
		fareTypeA2.setText("");
		fareA2.setText("");
		seatNumberB1.setText("");
		destinationB1.setText("");
		fareTypeB1.setText("");
		fareB1.setText("");
		seatNumberB2.setText("");
		destinationB2.setText("");
		fareTypeB2.setText("");
		fareB2.setText("");
		seatNumberC1.setText("");
		destinationC1.setText("");
		fareTypeC1.setText("");
		fareC1.setText("");
		seatNumberC2.setText("");
		destinationC2.setText("");
		fareTypeC2.setText("");
		fareC2.setText("");
		seatNumberD1.setText("");
		destinationD1.setText("");
		fareTypeD1.setText("");
		fareD1.setText("");
		seatNumberD2.setText("");
		destinationD2.setText("");
		fareTypeD2.setText("");
		fareD2.setText("");
		seatNumberE1.setText("");
		destinationE1.setText("");
		fareTypeE1.setText("");
		fareE1.setText("");
		seatNumberE2.setText("");
		destinationE2.setText("");
		fareTypeE2.setText("");
		fareE2.setText("");
		
		departBtn.setVisible(false);
		collectFareBtn.setVisible(true);
		F4backBtn.setVisible(false);
		
		passengerOnBoardA1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardA1.setVisible(false);
		passengerOnBoardA2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardA2.setVisible(false);
		passengerOnBoardB1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardB1.setVisible(false);
		passengerOnBoardB2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardB2.setVisible(false);
		passengerOnBoardC1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardC1.setVisible(false);
		passengerOnBoardC2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardC2.setVisible(false);
		passengerOnBoardD1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardD1.setVisible(false);
		passengerOnBoardD2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardD2.setVisible(false);
		passengerOnBoardE1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardE1.setVisible(false);
		passengerOnBoardE2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardE2.setVisible(false);
		fareCollector.setBounds(977, 261, 39, 49);
	}
	
	public void historyRetrieve(Queue<String> DateTime, Queue<String> TravelRoute, Queue<Integer> PassengerCount, Queue<Float> DistanceTraveled, Queue<Float> CumulativeFare, int value) {
		if (value >= 1) {
			grid1DateTime.setText("Date & Time: " + DateTime.remove());
			grid1TravelRoute.setText(TravelRoute.remove());
			grid1PassengerCount.setText(PassengerCount.remove() + " PASSENGERS");
			grid1DistanceTraveled.setText(Float.toString(DistanceTraveled.remove()) + "KM");
			grid1CumulativeFare.setText("P" + CumulativeFare.remove());
			
			grid1TravelRouteLbl.setVisible(true);
			grid1PassengerCountLbl.setVisible(true);
			grid1DistanceTraveledLbl.setVisible(true);
			grid1CumulativeFareLbl.setVisible(true);
		}
		if (value >= 2) {
			grid2DateTime.setText("Date & Time: " + DateTime.remove());
			grid2TravelRoute.setText(TravelRoute.remove());
			grid2PassengerCount.setText(PassengerCount.remove() + " PASSENGERS");
			grid2DistanceTraveled.setText(Float.toString(DistanceTraveled.remove()) + "KM");
			grid2CumulativeFare.setText("P" + CumulativeFare.remove());
			
			grid2TravelRouteLbl.setVisible(true);
			grid2PassengerCountLbl.setVisible(true);
			grid2DistanceTraveledLbl.setVisible(true);
			grid2CumulativeFareLbl.setVisible(true);
		}
		if (value >= 3) {
			grid3DateTime.setText("Date & Time: " + DateTime.remove());
			grid3TravelRoute.setText(TravelRoute.remove());
			grid3PassengerCount.setText(PassengerCount.remove() + " PASSENGERS");
			grid3DistanceTraveled.setText(Float.toString(DistanceTraveled.remove()) + "KM");
			grid3CumulativeFare.setText("P" + CumulativeFare.remove());
			
			grid3TravelRouteLbl.setVisible(true);
			grid3PassengerCountLbl.setVisible(true);
			grid3DistanceTraveledLbl.setVisible(true);
			grid3CumulativeFareLbl.setVisible(true);
		}
		if (value >= 4) {
			grid4DateTime.setText("Date & Time: " + DateTime.remove());
			grid4TravelRoute.setText(TravelRoute.remove());
			grid4PassengerCount.setText(PassengerCount.remove() + " PASSENGERS");
			grid4DistanceTraveled.setText(Float.toString(DistanceTraveled.remove()) + "KM");
			grid4CumulativeFare.setText("P" + CumulativeFare.remove());
			
			grid4TravelRouteLbl.setVisible(true);
			grid4PassengerCountLbl.setVisible(true);
			grid4DistanceTraveledLbl.setVisible(true);
			grid4CumulativeFareLbl.setVisible(true);
		}
		if (value >= 5) {
			grid5DateTime.setText("Date & Time: " + DateTime.remove());
			grid5TravelRoute.setText(TravelRoute.remove());
			grid5PassengerCount.setText(PassengerCount.remove() + " PASSENGERS");
			grid5DistanceTraveled.setText(Float.toString(DistanceTraveled.remove()) + "KM");
			grid5CumulativeFare.setText("P" + CumulativeFare.remove());
			
			grid5TravelRouteLbl.setVisible(true);
			grid5PassengerCountLbl.setVisible(true);
			grid5DistanceTraveledLbl.setVisible(true);
			grid5CumulativeFareLbl.setVisible(true);
		}
		if (value >= 6) {
			grid6DateTime.setText("Date & Time: " + DateTime.remove());
			grid6TravelRoute.setText(TravelRoute.remove());
			grid6PassengerCount.setText(PassengerCount.remove() + " PASSENGERS");
			grid6DistanceTraveled.setText(Float.toString(DistanceTraveled.remove()) + "KM");
			grid6CumulativeFare.setText("P" + CumulativeFare.remove());
			
			grid6TravelRouteLbl.setVisible(true);
			grid6PassengerCountLbl.setVisible(true);
			grid6DistanceTraveledLbl.setVisible(true);
			grid6CumulativeFareLbl.setVisible(true);
		}
	}
	
	public float FareStackCounter() {
		float Total = 0;
		while (!fareStack.isEmpty()) {
			Total += fareStack.pop();
		}
		
		historyTotalFare = Total;
		return Total;
	}
	
	public void TypeCounter(int value) {
		if (value > 1) {
			Discounted += 1;
		} else if (value == 1) {
			Regular += 1;
		}
	}
	
	public void FareCalculator(JLabel jlbl, int destination, int type) {
		int fare = 13;
		int additionalFare = 0;
		Float total = (float) 0.00;
		
		if (destination > 2) {
			additionalFare = destination - 2;
		}
		if (type > 1) {
			total = (float) ((fare + additionalFare) * 0.80);
		} else {
			total = (float) (fare + additionalFare);
		}
		
		fareStack.push(total);
		jlbl.setText("P" + total);
	}
	
	public void TypeSelector(JLabel jlbl, int value) {
		switch (value) {
			case 1:
				jlbl.setText("Regular");
				break;
			case 2:
				jlbl.setText("Student");
				break;
			case 3:
				jlbl.setText("Elderly");
				break;
			case 4:
				jlbl.setText("Disabled");
				break;
		}
	}
	
	public void DestinationSelector(JLabel jlbl, int value) {
		switch (value) {
			case 1:
				jlbl.setText(routes.Current.stop1);
				break;
			case 2:
				jlbl.setText(routes.Current.stop2);
				break;
			case 3:
				jlbl.setText(routes.Current.stop3);
				break;
			case 4:
				jlbl.setText(routes.Current.stop4);
				break;
			case 5:
				jlbl.setText(routes.Current.stop5);
				break;
			case 6:
				jlbl.setText(routes.Current.stop6);
				break;
			case 7:
				jlbl.setText(routes.Current.stop7);
				break;
		}
	}

	public void addPassenger(int value) {
		switch (value) {
			case 1:
				A1cover.setVisible(false);
				A1Dest = 1;
				DestinationSelector(A1DestLbl, A1Dest);
				A1Type = 1;
				TypeSelector(A1TypeLbl, A1Type);
				passengerIcon1.setVisible(true);
				break;
			case 2:
				A2cover.setVisible(false);
				A2Dest = 1;
				DestinationSelector(A2DestLbl, A2Dest);
				A2Type = 1;
				TypeSelector(A2TypeLbl, A2Type);
				passengerIcon2.setVisible(true);
				break;
			case 3:
				B1cover.setVisible(false);
				B1Dest = 1;
				DestinationSelector(B1DestLbl, B1Dest);
				B1Type = 1;
				TypeSelector(B1TypeLbl, B1Type);
				passengerIcon3.setVisible(true);
				break;
			case 4:
				B2cover.setVisible(false);
				B2Dest = 1;
				DestinationSelector(B2DestLbl, B2Dest);
				B2Type = 1;
				TypeSelector(B2TypeLbl, B2Type);
				passengerIcon4.setVisible(true);
				break;
			case 5:
				C1cover.setVisible(false);
				C1Dest = 1;
				DestinationSelector(C1DestLbl, C1Dest);
				C1Type = 1;
				TypeSelector(C1TypeLbl, C1Type);
				passengerIcon5.setVisible(true);
				break;
			case 6:
				C2cover.setVisible(false);
				C2Dest = 1;
				DestinationSelector(C2DestLbl, C2Dest);
				C2Type = 1;
				TypeSelector(C2TypeLbl, C2Type);
				passengerIcon6.setVisible(true);
				break;
			case 7:
				D1cover.setVisible(false);
				D1Dest = 1;
				DestinationSelector(D1DestLbl, D1Dest);
				D1Type = 1;
				TypeSelector(D1TypeLbl, D1Type);
				passengerIcon7.setVisible(true);
				break;
			case 8:
				D2cover.setVisible(false);
				D2Dest = 1;
				DestinationSelector(D2DestLbl, D2Dest);
				D2Type = 1;
				TypeSelector(D2TypeLbl, D2Type);
				passengerIcon8.setVisible(true);
				break;
			case 9:
				E1cover.setVisible(false);
				E1Dest = 1;
				DestinationSelector(E1DestLbl, E1Dest);
				E1Type = 1;
				TypeSelector(E1TypeLbl, E1Type);
				passengerIcon9.setVisible(true);
				break;
			case 10:
				E2cover.setVisible(false);
				E2Dest = 1;
				DestinationSelector(E2DestLbl, E2Dest);
				E2Type = 1;
				TypeSelector(E2TypeLbl, E2Type);
				passengerIcon10.setVisible(true);
				break;
		}
	}
	
	public void removePassenger(int value) {
		switch (value) {
		case 0:
			A1cover.setVisible(true);
			A1Dest = 0;
			A1DestLbl.setText("");
			A1Type = 0;
			A1TypeLbl.setText("");
			passengerIcon1.setVisible(false);
			
			A2cover.setVisible(true);
			A2Dest = 0;
			A2DestLbl.setText("");
			A2Type = 0;
			A2TypeLbl.setText("");
			passengerIcon2.setVisible(false);
			
			B1cover.setVisible(true);
			B1Dest = 0;
			B1DestLbl.setText("");
			B1Type = 0;
			B1TypeLbl.setText("");
			passengerIcon3.setVisible(false);
			
			B2cover.setVisible(true);
			B2Dest = 0;
			B2DestLbl.setText("");
			B2Type = 0;
			B2TypeLbl.setText("");
			passengerIcon4.setVisible(false);
			
			C1cover.setVisible(true);
			C1Dest = 0;
			C1DestLbl.setText("");
			C1Type = 0;
			C1TypeLbl.setText("");
			passengerIcon5.setVisible(false);
			
			C2cover.setVisible(true);
			C2Dest = 0;
			C2DestLbl.setText("");
			C2Type = 0;
			C2TypeLbl.setText("");
			passengerIcon6.setVisible(false);
			
			D1cover.setVisible(true);
			D1Dest = 0;
			D1DestLbl.setText("");
			D1Type = 0;
			D1TypeLbl.setText("");
			passengerIcon7.setVisible(false);
			
			D2cover.setVisible(true);
			D2Dest = 0;
			D2DestLbl.setText("");
			D2Type = 0;
			D2TypeLbl.setText("");
			passengerIcon8.setVisible(false);
			
			E1cover.setVisible(true);
			E1Dest = 0;
			E1DestLbl.setText("");
			E1Type = 0;
			E1TypeLbl.setText("");
			passengerIcon9.setVisible(false);
			
			E2cover.setVisible(true);
			E2Dest = 0;
			E2DestLbl.setText("");
			E2Type = 0;
			E2TypeLbl.setText("");
			passengerIcon10.setVisible(false);
			break;
		case 1:
			A1cover.setVisible(true);
			A1Dest = 0;
			A1DestLbl.setText("");
			A1Type = 0;
			A1TypeLbl.setText("");
			passengerIcon1.setVisible(false);
			break;
		case 2:
			A2cover.setVisible(true);
			A2Dest = 0;
			A2DestLbl.setText("");
			A2Type = 0;
			A2TypeLbl.setText("");
			passengerIcon2.setVisible(false);
			break;
		case 3:
			B1cover.setVisible(true);
			B1Dest = 0;
			B1DestLbl.setText("");
			B1Type = 0;
			B1TypeLbl.setText("");
			passengerIcon3.setVisible(false);
			break;
		case 4:
			B2cover.setVisible(true);
			B2Dest = 0;
			B2DestLbl.setText("");
			B2Type = 0;
			B2TypeLbl.setText("");
			passengerIcon4.setVisible(false);
			break;
		case 5:
			C1cover.setVisible(true);
			C1Dest = 0;
			C1DestLbl.setText("");
			C1Type = 0;
			C1TypeLbl.setText("");
			passengerIcon5.setVisible(false);
			break;
		case 6:
			C2cover.setVisible(true);
			C2Dest = 0;
			C2DestLbl.setText("");
			C2Type = 0;
			C2TypeLbl.setText("");
			passengerIcon6.setVisible(false);
			break;
		case 7:
			D1cover.setVisible(true);
			D1Dest = 0;
			D1DestLbl.setText("");
			D1Type = 0;
			D1TypeLbl.setText("");
			passengerIcon7.setVisible(false);
			break;
		case 8:
			D2cover.setVisible(true);
			D2Dest = 0;
			D2DestLbl.setText("");
			D2Type = 0;
			D2TypeLbl.setText("");
			passengerIcon8.setVisible(false);
			break;
		case 9:
			E1cover.setVisible(true);
			E1Dest = 0;
			E1DestLbl.setText("");
			E1Type = 0;
			E1TypeLbl.setText("");
			passengerIcon9.setVisible(false);
			break;
		case 10:
			E2cover.setVisible(true);
			E2Dest = 0;
			E2DestLbl.setText("");
			E2Type = 0;
			E2TypeLbl.setText("");
			passengerIcon10.setVisible(false);
			break;
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// ============================================== || ROUTES || ============================================== \\
		
		routes.addElement(1, "P.Ocampo", "Harisson Plaza", "Ospital ng Maynila", "Mabini", "Malate Church", "Pedro Gil", "Salas", "/route1.png");
		routes.addElement(2, "P. Burgos", "Southern Intramuros", "National Museum", "MNL City Hall", "Lawton", "Lawton Ferry", "Quiapo Church", "route2.png");
		routes.addElement(3, "Recto", "Lerma", "Nicanor Reyes", "Univ of Sto. Tomas", "Ramon Magsaysay HS", "España PNR", "Blumentrit", "route3.png");
		routes.addElement(4, "Rotonda", "Doña Josefa", "Banawe", "Quezon Institute", "St. Lukes", "Tomas Morato", "Kamuning", "/route4.png");
		routes.addElement(5, "University Ave.", "Techno hub", "UP Gymnasium", "Cenral Ave.", "T.Sora Commnowealth", "Lower Holy Spirit", "Holy Spirit Commonwealth", "/route5.png");
		routes.addElement(6, "Edsa Q.Ave", "TRANSCO", "Fabella", "Lung Center", "Quezon Memorial", "Visayas Ave.", "Philcoa", "/route6.png");
		routes.addElement(7, "Araneta", "Roosevelt Q.Ave", "Timog Q.Ave", "Nayong Kanluran", "West Triangle", "Philam", "SM North", "/route7.png");
		
		
		// ============================================== || FONTS || ============================================== \\
		
		try {
			Norwester = Font.createFont(Font.TRUETYPE_FONT, new File("FontsFree-Net-norwester.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("FontsFree-Net-norwester.ttf")));
		} catch(IOException | FontFormatException e) {}
		
		
		// ============================================== || FRAME 1 || ============================================== \\
		
		Image startUpScreenBGSrc = new ImageIcon(this.getClass().getResource("/startUpScreenBG.png")).getImage();
		Image startUpScreenBGImg = startUpScreenBGSrc.getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
		
		Image startBtnSrc = new ImageIcon(this.getClass().getResource("/startButton.png")).getImage();
		Image startBtnImg = startBtnSrc.getScaledInstance(282, 282, Image.SCALE_DEFAULT);
		
		Image historyBtnSrc = new ImageIcon(this.getClass().getResource("/historyButton.png")).getImage();
		Image historyBtnImg = historyBtnSrc = historyBtnSrc.getScaledInstance(63, 63, Image.SCALE_DEFAULT);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1380, 805);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel startButton = new JLabel("");
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				routeLbl.setText(Integer.toString(routes.Current.routeNumber));
				routeStartLbl.setText(routes.Current.stop1);
				routeEndLbl.setText(routes.Current.stop7);
				routeImg.setIcon(new ImageIcon(routes.Current.routeImg.getScaledInstance(338, 586, Image.SCALE_DEFAULT)));
				frame2.show();
				frame.dispose();
			}
		});
		startButton.setIcon(new ImageIcon(startBtnImg));
		startButton.setBounds(199, 549, 282, 63);
		frame.getContentPane().add(startButton);
		
		JLabel historyButton = new JLabel("");
		historyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (historyCount >= 1) {
					DateTimeDuplicate.addAll(DateTime);
					TravelRouteDuplicate.addAll(TravelRoute);
					PassengerCountDuplicate.addAll(PassengerCount);
					DistanceTraveledDuplicate.addAll(DistanceTraveled);
					CumulativeFareDuplicate.addAll(CumulativeFare);
					
					historyRetrieve(DateTimeDuplicate, TravelRouteDuplicate, PassengerCountDuplicate, DistanceTraveledDuplicate, CumulativeFareDuplicate, historyCount);
					DateTimeDuplicate.add(" ");
					DateTimeDuplicate.clear();
					TravelRouteDuplicate.add(" ");
					TravelRouteDuplicate.clear();
					PassengerCountDuplicate.add(0);
					PassengerCountDuplicate.clear();
					DistanceTraveledDuplicate.add((float) 0);
					DistanceTraveledDuplicate.clear();
					CumulativeFareDuplicate.add((float) 0);
					CumulativeFareDuplicate.clear();
				}
				history.show();
			}
		});
		historyButton.setIcon(new ImageIcon(historyBtnImg));
		historyButton.setBounds(114, 549, 63, 63);
		frame.getContentPane().add(historyButton);
		
		JLabel startUpScreenBG = new JLabel("");
		startUpScreenBG.setIcon(new ImageIcon(startUpScreenBGImg));
		startUpScreenBG.setBounds(0, 0, 1366, 768);
		frame.getContentPane().add(startUpScreenBG);
		
		
		// ============================================== || FRAME 2 || ============================================== \\
		
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 1380, 805);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);

		Image routeSelectionBGSrc = new ImageIcon(this.getClass().getResource("/routeSelectionBG.png")).getImage();
		Image routeSelectionBGImg = routeSelectionBGSrc.getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
		
		Image continueBtnSrc = new ImageIcon(this.getClass().getResource("/continueButton.png")).getImage();
		Image continueBtnImg = continueBtnSrc.getScaledInstance(284, 284, Image.SCALE_DEFAULT);
		
		Image previousBtnSrc = new ImageIcon(this.getClass().getResource("/previousButton.png")).getImage();
		Image previousBtnImg = previousBtnSrc.getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		
		Image nextBtnSrc = new ImageIcon(this.getClass().getResource("/nextButton.png")).getImage();
		Image nextBtnImg = nextBtnSrc.getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		
		Image reverseBtnSrc = new ImageIcon(this.getClass().getResource("/reverseButton.png")).getImage();
		Image reverseBtnImg = reverseBtnSrc.getScaledInstance(46, 46, Image.SCALE_DEFAULT);
		
		JLabel previousBtn = new JLabel("");
		previousBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				routes.prevElement();
				routeLbl.setText(Integer.toString(routes.Current.routeNumber));
				routeStartLbl.setText(routes.Current.stop1);
				routeEndLbl.setText(routes.Current.stop7);
				routeImg.setIcon(new ImageIcon(routes.Current.routeImg.getScaledInstance(338, 586, Image.SCALE_DEFAULT)));
			}
		});
		previousBtn.setIcon(new ImageIcon(previousBtnImg));
		previousBtn.setBounds(128, 262, 25, 25);
		frame2.getContentPane().add(previousBtn);
		
		JLabel nextBtn = new JLabel("");
		nextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				routes.nextElement();
				routeLbl.setText(Integer.toString(routes.Current.routeNumber));
				routeStartLbl.setText(routes.Current.stop1);
				routeEndLbl.setText(routes.Current.stop7);
				routeImg.setIcon(new ImageIcon(routes.Current.routeImg.getScaledInstance(338, 586, Image.SCALE_DEFAULT)));
			}
		});
		nextBtn.setIcon(new ImageIcon(nextBtnImg));
		nextBtn.setBounds(328, 262, 25, 25);
		frame2.getContentPane().add(nextBtn);
		
		routeLbl = new JLabel("");
		routeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		routeLbl.setFont(Norwester.deriveFont(20f));
		routeLbl.setBounds(148, 251, 182, 46);
		frame2.getContentPane().add(routeLbl);

		routeStartLbl = new JLabel("");
		routeStartLbl.setFont(Norwester.deriveFont(20f));
		routeStartLbl.setBounds(132, 366, 255, 46);
		frame2.getContentPane().add(routeStartLbl);

		routeEndLbl = new JLabel("");
		routeEndLbl.setFont(Norwester.deriveFont(20f));
		routeEndLbl.setBounds(132, 485, 255, 46);
		frame2.getContentPane().add(routeEndLbl);
		
		JLabel reverseButton = new JLabel("");
		reverseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String tempStop = routes.Current.stop7;
				routes.Current.stop7 = routes.Current.stop1;
				routes.Current.stop1 = tempStop;
				tempStop = routes.Current.stop6;
				routes.Current.stop6 = routes.Current.stop2;
				routes.Current.stop2 = tempStop;
				tempStop = routes.Current.stop5;
				routes.Current.stop5 = routes.Current.stop3;
				routes.Current.stop3 = tempStop;
				routes.Current = routes.Current;
				routeStartLbl.setText(routes.Current.stop1);
				routeEndLbl.setText(routes.Current.stop7);
			}
		});
		reverseButton.setIcon(new ImageIcon(reverseBtnImg));
		reverseButton.setBounds(233, 424, 46, 46);
		frame2.getContentPane().add(reverseButton);
		
		JLabel continueBtn = new JLabel("");
		continueBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				F3routeLbl.setText(routes.Current.stop1 + " - " + routes.Current.stop7);
				
				frame3.show();
				frame2.dispose();
			}
		});
		continueBtn.setIcon(new ImageIcon(continueBtnImg));
		continueBtn.setBounds(118, 574, 284, 78);
		frame2.getContentPane().add(continueBtn);
		
		routeImg = new JLabel("");
		routeImg.setBounds(942, 91, 333, 586);
		frame2.getContentPane().add(routeImg);
		
		JLabel routeSelectionBG = new JLabel("");
		routeSelectionBG.setIcon(new ImageIcon(routeSelectionBGImg));
		routeSelectionBG.setBounds(0, 0, 1366, 768);
		frame2.getContentPane().add(routeSelectionBG);
		
		
		// ============================================== || FRAME 3 || ============================================== \\
		
		frame3 = new JFrame();
		frame3.setBounds(100, 100, 1380, 805);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		Image boardingBGSrc = new ImageIcon(this.getClass().getResource("/boardingBG.png")).getImage();
		Image boardingImg = boardingBGSrc.getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
		
		Image addPassengerBtnSrc = new ImageIcon(this.getClass().getResource("/addPassengerButton.png")).getImage();
		Image addPassengerBtnImg = addPassengerBtnSrc.getScaledInstance(284, 284, Image.SCALE_DEFAULT);
		
		Image removePassengerBtnSrc = new ImageIcon(this.getClass().getResource("/removePassengerButton.png")).getImage();
		Image removePassengerBtnImg = removePassengerBtnSrc.getScaledInstance(284, 284, Image.SCALE_DEFAULT);
		
		Image backBtnSrc = new ImageIcon(this.getClass().getResource("/backButton.png")).getImage();
		Image backBtnImg = backBtnSrc.getScaledInstance(284, 284, Image.SCALE_DEFAULT);
		
		Image prevBtnSrc = new ImageIcon(this.getClass().getResource("/previousButton.png")).getImage();
		Image prevBtnImg = prevBtnSrc.getScaledInstance(15, 15, Image.SCALE_DEFAULT);
		
		Image nextBtnImg2 = nextBtnSrc.getScaledInstance(15, 15, Image.SCALE_DEFAULT);
		
		Image coverSrc = new ImageIcon(this.getClass().getResource("/cover.png")).getImage();
		Image coverImg = coverSrc.getScaledInstance(371, 80, Image.SCALE_DEFAULT);
		
		Image boardBtnSrc = new ImageIcon(this.getClass().getResource("/boardButton.png")).getImage();
		Image boardBtnImg = boardBtnSrc.getScaledInstance(284, 284, Image.SCALE_DEFAULT);
		
		Image passengerSrc = new ImageIcon(this.getClass().getResource("/passenger.png")).getImage();
		Image passengerImg = passengerSrc.getScaledInstance(56, 56, Image.SCALE_DEFAULT);
		
		A1cover = new JLabel("");
		A1cover.setIcon(new ImageIcon(coverImg));
		A1cover.setBounds(479, 183, 371, 80);
		frame3.getContentPane().add(A1cover);
		
		A2cover = new JLabel("");
		A2cover.setIcon(new ImageIcon(coverImg));
		A2cover.setBounds(912, 183, 371, 80);
		frame3.getContentPane().add(A2cover);
		
		B1cover = new JLabel("");
		B1cover.setIcon(new ImageIcon(coverImg));
		B1cover.setBounds(488, 270, 371, 80);
		frame3.getContentPane().add(B1cover);
		
		B2cover = new JLabel("");
		B2cover.setIcon(new ImageIcon(coverImg));
		B2cover.setBounds(912, 263, 371, 80);
		frame3.getContentPane().add(B2cover);
		
		C1cover = new JLabel("");
		C1cover.setIcon(new ImageIcon(coverImg));
		C1cover.setBounds(486, 347, 371, 80);
		frame3.getContentPane().add(C1cover);
		
		C2cover = new JLabel("");
		C2cover.setIcon(new ImageIcon(coverImg));
		C2cover.setBounds(911, 349, 371, 80);
		frame3.getContentPane().add(C2cover);
		
		D1cover = new JLabel("");
		D1cover.setIcon(new ImageIcon(coverImg));
		D1cover.setBounds(486, 431, 371, 80);
		frame3.getContentPane().add(D1cover);
		
		D2cover = new JLabel("");
		D2cover.setIcon(new ImageIcon(coverImg));
		D2cover.setBounds(908, 434, 371, 80);
		frame3.getContentPane().add(D2cover);
		
		E1cover = new JLabel("");
		E1cover.setIcon(new ImageIcon(coverImg));
		E1cover.setBounds(483, 503, 371, 80);
		frame3.getContentPane().add(E1cover);
		
		E2cover = new JLabel("");
		E2cover.setIcon(new ImageIcon(coverImg));
		E2cover.setBounds(913, 501, 371, 80);
		frame3.getContentPane().add(E2cover);
		
		JLabel addPassengerBtn = new JLabel("");
		addPassengerBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (passengerCount < 10) {
					passengerCount += 1;
				}
				if (passengerCount > 0) {
					boardBtn.setVisible(true);
				}
				addPassenger(passengerCount);
			}
		});
		addPassengerBtn.setIcon(new ImageIcon(addPassengerBtnImg));
		addPassengerBtn.setBounds(54, 485, 284, 60);
		frame3.getContentPane().add(addPassengerBtn);
		
		JLabel removePassengerBtn = new JLabel("");
		removePassengerBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				removePassenger(passengerCount);
				if (passengerCount > 0) {
					passengerCount -= 1;
				}
				if (passengerCount < 1) {
					boardBtn.setVisible(false);
				}
			}
		});
		removePassengerBtn.setIcon(new ImageIcon(removePassengerBtnImg));
		removePassengerBtn.setBounds(54, 555, 284, 60);
		frame3.getContentPane().add(removePassengerBtn);
		
		JLabel backBtn = new JLabel("");
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame2.show();
				frame3.dispose();
			}
		});
		backBtn.setIcon(new ImageIcon(backBtnImg));
		backBtn.setBounds(54, 625, 284, 60);
		frame3.getContentPane().add(backBtn);
		
		boardBtn = new JLabel("");
		boardBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (passengerCount >= 1) {
					queue.add("A1");
				}
				if (passengerCount >= 2) {
					queue.add("A2");
				}
				if (passengerCount >= 3) {
					queue.add("B1");
				}
				if (passengerCount >= 4) {
					queue.add("B2");
				}
				if (passengerCount >= 5) {
					queue.add("C1");
				}
				if (passengerCount >= 6) {
					queue.add("C2");
				}
				if (passengerCount >= 7) {
					queue.add("D1");
				}
				if (passengerCount >= 8) {
					queue.add("D2");
				}
				if (passengerCount >= 9) {
					queue.add("E1");
				}
				if (passengerCount >= 10) {
					queue.add("E2");
				}
				
				frame4.show();
				frame3.dispose();
			}
		});
		boardBtn.setIcon(new ImageIcon(boardBtnImg));
		boardBtn.setBounds(1028, 645, 284, 60);
		boardBtn.setVisible(false);
		frame3.getContentPane().add(boardBtn);
		
		F3routeLbl = new JLabel();
		F3routeLbl.setFont(Norwester.deriveFont(30f));
		F3routeLbl.setBounds(450, 76, 752, 45);
		frame3.getContentPane().add(F3routeLbl);
		
		
		// ========================= || A1 || ========================= \\
		
		JLabel A1DestprevBtn = new JLabel("");
		A1DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (A1Dest > 1) {
					A1Dest -= 1;
				}
				DestinationSelector(A1DestLbl, A1Dest);
			}
		});
		A1DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		A1DestprevBtn.setBounds(535, 213, 15, 15);
		frame3.getContentPane().add(A1DestprevBtn);
		
		JLabel A1DestnextBtn = new JLabel("");
		A1DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (A1Dest < 7) {
					A1Dest += 1;
				}
				DestinationSelector(A1DestLbl, A1Dest);
			}
		});
		A1DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		A1DestnextBtn.setBounds(660, 213, 15, 15);
		frame3.getContentPane().add(A1DestnextBtn);
		
		A1DestLbl = new JLabel("");
		A1DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		A1DestLbl.setBounds(548, 206, 115, 30);
		frame3.getContentPane().add(A1DestLbl);
		
		JLabel A1TypeprevBtn = new JLabel("");
		A1TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (A1Type > 1) {
					A1Type -= 1;
				}
				
				TypeSelector(A1TypeLbl, A1Type);
			}
		});
		A1TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		A1TypeprevBtn.setBounds(688, 213, 15, 15);
		frame3.getContentPane().add(A1TypeprevBtn);
		
		JLabel A1TypenextBtn = new JLabel("");
		A1TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (A1Type < 4) {
					A1Type += 1;
				}
				
				TypeSelector(A1TypeLbl, A1Type);
			}
		});
		A1TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		A1TypenextBtn.setBounds(816, 213, 15, 15);
		frame3.getContentPane().add(A1TypenextBtn);
		
		A1TypeLbl = new JLabel("");
		A1TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		A1TypeLbl.setBounds(703, 205, 115, 30);
		frame3.getContentPane().add(A1TypeLbl);
		
		
		// ========================= || A2 || ========================= \\
		
		JLabel A2DestprevBtn = new JLabel("");
		A2DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (A2Dest > 1) {
					A2Dest -= 1;
				}
				
				DestinationSelector(A2DestLbl, A2Dest);
			}
		});
		A2DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		A2DestprevBtn.setBounds(972, 213, 15, 15);
		frame3.getContentPane().add(A2DestprevBtn);
		
		JLabel A2DestnextBtn = new JLabel("");
		A2DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (A2Dest < 7) {
					A2Dest += 1;
				}
				
				DestinationSelector(A2DestLbl, A2Dest);
			}
		});
		A2DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		A2DestnextBtn.setBounds(1099, 213, 15, 15);
		frame3.getContentPane().add(A2DestnextBtn);
		
		A2DestLbl = new JLabel("");
		A2DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		A2DestLbl.setBounds(987, 206, 115, 30);
		frame3.getContentPane().add(A2DestLbl);
		
		JLabel A2TypeprevBtn = new JLabel("");
		A2TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (A2Type > 1) {
					A2Type -= 1;
				}
				
				TypeSelector(A2TypeLbl, A2Type);
			}
		});
		A2TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		A2TypeprevBtn.setBounds(1127, 213, 15, 15);
		frame3.getContentPane().add(A2TypeprevBtn);
		
		JLabel A2TypenextBtn = new JLabel("");
		A2TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (A2Type < 4) {
					A2Type += 1;
				}
				
				TypeSelector(A2TypeLbl, A2Type);
			}
		});
		A2TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		A2TypenextBtn.setBounds(1255, 213, 15, 15);
		frame3.getContentPane().add(A2TypenextBtn);
		
		A2TypeLbl = new JLabel("");
		A2TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		A2TypeLbl.setBounds(1142, 205, 115, 30);
		frame3.getContentPane().add(A2TypeLbl);
		
		
		// ========================= || B1 || ========================= \\
		
		JLabel B1DestprevBtn = new JLabel("");
		B1DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (B1Dest > 1) {
					B1Dest -= 1;
				}
				DestinationSelector(B1DestLbl, B1Dest);
			}
		});
		B1DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		B1DestprevBtn.setBounds(535, 295, 15, 15);
		frame3.getContentPane().add(B1DestprevBtn);
		
		JLabel B1DestnextBtn = new JLabel("");
		B1DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (B1Dest < 7) {
					B1Dest += 1;
				}
				DestinationSelector(B1DestLbl, B1Dest);
			}
		});
		B1DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		B1DestnextBtn.setBounds(660, 295, 15, 15);
		frame3.getContentPane().add(B1DestnextBtn);
		
		B1DestLbl = new JLabel("");
		B1DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		B1DestLbl.setBounds(549, 287, 115, 30);
		frame3.getContentPane().add(B1DestLbl);
		
		JLabel B1TypeprevBtn = new JLabel("");
		B1TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (B1Type > 1) {
					B1Type -= 1;
				}
				
				TypeSelector(B1TypeLbl, B1Type);
			}
		});
		B1TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		B1TypeprevBtn.setBounds(688, 295, 15, 15);
		frame3.getContentPane().add(B1TypeprevBtn);
		
		JLabel B1TypenextBtn = new JLabel("");
		B1TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (B1Type < 4) {
					B1Type += 1;
				}
				
				TypeSelector(B1TypeLbl, B1Type);
			}
		});
		B1TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		B1TypenextBtn.setBounds(816, 295, 15, 15);
		frame3.getContentPane().add(B1TypenextBtn);
		
		B1TypeLbl = new JLabel("");
		B1TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		B1TypeLbl.setBounds(703, 287, 115, 30);
		frame3.getContentPane().add(B1TypeLbl);
		
		
		// ========================= || B2 || ========================= \\
		
		JLabel B2DestprevBtn = new JLabel("");
		B2DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (B2Dest > 1) {
					B2Dest -= 1;
				}
				DestinationSelector(B2DestLbl, B2Dest);
			}
		});
		B2DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		B2DestprevBtn.setBounds(972, 295, 15, 15);
		frame3.getContentPane().add(B2DestprevBtn);
		
		JLabel B2DestnextBtn = new JLabel("");
		B2DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (B2Dest < 7) {
					B2Dest += 1;
				}
				DestinationSelector(B2DestLbl, B2Dest);
			}
		});
		B2DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		B2DestnextBtn.setBounds(1099, 295, 15, 15);
		frame3.getContentPane().add(B2DestnextBtn);
		
		B2DestLbl = new JLabel("");
		B2DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		B2DestLbl.setBounds(987, 287, 115, 30);
		frame3.getContentPane().add(B2DestLbl);
		
		JLabel B2TypeprevBtn = new JLabel("");
		B2TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (B2Type > 1) {
					B2Type -= 1;
				}
				
				TypeSelector(B2TypeLbl, B2Type);
			}
		});
		B2TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		B2TypeprevBtn.setBounds(1127, 295, 15, 15);
		frame3.getContentPane().add(B2TypeprevBtn);
		
		JLabel B2TypenextBtn = new JLabel("");
		B2TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (B2Type < 4) {
					B2Type += 1;
				}
				
				TypeSelector(B2TypeLbl, B2Type);
			}
		});
		B2TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		B2TypenextBtn.setBounds(1255, 295, 15, 15);
		frame3.getContentPane().add(B2TypenextBtn);
		
		B2TypeLbl = new JLabel("");
		B2TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		B2TypeLbl.setBounds(1143, 287, 115, 30);
		frame3.getContentPane().add(B2TypeLbl);
		
		
		// ========================= || C1 || ========================= \\
		
		JLabel C1DestprevBtn = new JLabel("");
		C1DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (C1Dest > 1) {
					C1Dest -= 1;
				}
				DestinationSelector(C1DestLbl, C1Dest);
			}
		});
		C1DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		C1DestprevBtn.setBounds(535, 377, 15, 15);
		frame3.getContentPane().add(C1DestprevBtn);
		
		JLabel C1DestnextBtn = new JLabel("");
		C1DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (C1Dest < 7) {
					C1Dest += 1;
				}
				DestinationSelector(C1DestLbl, C1Dest);
			}
		});
		C1DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		C1DestnextBtn.setBounds(660, 377, 15, 15);
		frame3.getContentPane().add(C1DestnextBtn);
		
		C1DestLbl = new JLabel("");
		C1DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		C1DestLbl.setBounds(549, 370, 115, 30);
		frame3.getContentPane().add(C1DestLbl);
		
		JLabel C1TypeprevBtn = new JLabel("");
		C1TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (C1Type > 1) {
					C1Type -= 1;
				}
				
				TypeSelector(C1TypeLbl, C1Type);
			}
		});
		C1TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		C1TypeprevBtn.setBounds(688, 377, 15, 15);
		frame3.getContentPane().add(C1TypeprevBtn);
		
		JLabel C1TypenextBtn = new JLabel("");
		C1TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (C1Type < 4) {
					C1Type += 1;
				}
				
				TypeSelector(C1TypeLbl, C1Type);
			}
		});
		C1TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		C1TypenextBtn.setBounds(816, 377, 15, 15);
		frame3.getContentPane().add(C1TypenextBtn);
		
		C1TypeLbl = new JLabel("");
		C1TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		C1TypeLbl.setBounds(703, 369, 115, 30);
		frame3.getContentPane().add(C1TypeLbl);
		
		
		// ========================= || C2 || ========================= \\
		
		JLabel C2DestprevBtn = new JLabel("");
		C2DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (C2Dest > 1) {
					C2Dest -= 1;
				}
				DestinationSelector(C2DestLbl, C2Dest);
			}
		});
		C2DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		C2DestprevBtn.setBounds(972, 377, 15, 15);
		frame3.getContentPane().add(C2DestprevBtn);
		
		JLabel C2DestnextBtn = new JLabel("");
		C2DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (C2Dest < 7) {
					C2Dest += 1;
				}
				DestinationSelector(C2DestLbl, C2Dest);
			}
		});
		C2DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		C2DestnextBtn.setBounds(1099, 377, 15, 15);
		frame3.getContentPane().add(C2DestnextBtn);
		
		C2DestLbl = new JLabel("");
		C2DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		C2DestLbl.setBounds(987, 369, 115, 30);
		frame3.getContentPane().add(C2DestLbl);
		
		JLabel C2TypeprevBtn = new JLabel("");
		C2TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (C2Type > 1) {
					C2Type -= 1;
				}
				
				TypeSelector(C2TypeLbl, C2Type);
			}
		});
		C2TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		C2TypeprevBtn.setBounds(1127, 377, 15, 15);
		frame3.getContentPane().add(C2TypeprevBtn);
		
		JLabel C2TypenextBtn = new JLabel("");
		C2TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (C2Type < 4) {
					C2Type += 1;
				}
				
				TypeSelector(C2TypeLbl, C2Type);
			}
		});
		C2TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		C2TypenextBtn.setBounds(1255, 377, 15, 15);
		frame3.getContentPane().add(C2TypenextBtn);
		
		C2TypeLbl = new JLabel("");
		C2TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		C2TypeLbl.setBounds(1142, 371, 115, 30);
		frame3.getContentPane().add(C2TypeLbl);
		
		
		// ========================= || D1 || ========================= \\
		
		JLabel D1DestprevBtn = new JLabel("");
		D1DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (D1Dest > 1) {
					D1Dest -= 1;
				}
				DestinationSelector(D1DestLbl, D1Dest);
			}
		});
		D1DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		D1DestprevBtn.setBounds(535, 460, 15, 15);
		frame3.getContentPane().add(D1DestprevBtn);
		
		JLabel D1DestnextBtn = new JLabel("");
		D1DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (D1Dest < 7) {
					D1Dest += 1;
				}
				DestinationSelector(D1DestLbl, D1Dest);
			}
		});
		D1DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		D1DestnextBtn.setBounds(660, 460, 15, 15);
		frame3.getContentPane().add(D1DestnextBtn);
		
		D1DestLbl = new JLabel("");
		D1DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		D1DestLbl.setBounds(548, 452, 115, 30);
		frame3.getContentPane().add(D1DestLbl);
		
		JLabel D1TypeprevBtn = new JLabel("");
		D1TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (D1Type > 1) {
					D1Type -= 1;
				}
				
				TypeSelector(D1TypeLbl, D1Type);
			}
		});
		D1TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		D1TypeprevBtn.setBounds(688, 460, 15, 15);
		frame3.getContentPane().add(D1TypeprevBtn);
		
		JLabel D1TypenextBtn = new JLabel("");
		D1TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (D1Type < 4) {
					D1Type += 1;
				}
				
				TypeSelector(D1TypeLbl, D1Type);
			}
		});
		D1TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		D1TypenextBtn.setBounds(816, 460, 15, 15);
		frame3.getContentPane().add(D1TypenextBtn);
		
		D1TypeLbl = new JLabel("");
		D1TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		D1TypeLbl.setBounds(703, 452, 115, 30);
		frame3.getContentPane().add(D1TypeLbl);
		
		
		// ========================= || D2 || ========================= \\
		
		JLabel D2DestprevBtn = new JLabel("");
		D2DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (D2Dest > 1) {
					D2Dest -= 1;
				}
				DestinationSelector(D2DestLbl, D2Dest);
			}
		});
		D2DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		D2DestprevBtn.setBounds(972, 460, 15, 15);
		frame3.getContentPane().add(D2DestprevBtn);
		
		JLabel D2DestnextBtn = new JLabel("");
		D2DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (D2Dest < 7) {
					D2Dest += 1;
				}
				DestinationSelector(D2DestLbl, D2Dest);
			}
		});
		D2DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		D2DestnextBtn.setBounds(1099, 460, 15, 15);
		frame3.getContentPane().add(D2DestnextBtn);
		
		D2DestLbl = new JLabel("");
		D2DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		D2DestLbl.setBounds(987, 452, 115, 30);
		frame3.getContentPane().add(D2DestLbl);
		
		JLabel D2TypeprevBtn = new JLabel("");
		D2TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (D2Type > 1) {
					D2Type -= 1;
				}
				
				TypeSelector(D2TypeLbl, D2Type);
			}
		});
		D2TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		D2TypeprevBtn.setBounds(1127, 460, 15, 15);
		frame3.getContentPane().add(D2TypeprevBtn);
		
		JLabel D2TypenextBtn = new JLabel("");
		D2TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (D2Type < 4) {
					D2Type += 1;
				}
				
				TypeSelector(D2TypeLbl, D2Type);
			}
		});
		D2TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		D2TypenextBtn.setBounds(1255, 460, 15, 15);
		frame3.getContentPane().add(D2TypenextBtn);
		
		D2TypeLbl = new JLabel("");
		D2TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		D2TypeLbl.setBounds(1142, 452, 115, 30);
		frame3.getContentPane().add(D2TypeLbl);
		
		
		// ========================= || E1 || ========================= \\
		
		JLabel E1DestprevBtn = new JLabel("");
		E1DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (E1Dest > 1) {
					E1Dest -= 1;
				}
				DestinationSelector(E1DestLbl, E1Dest);
			}
		});
		E1DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		E1DestprevBtn.setBounds(535, 542, 15, 15);
		frame3.getContentPane().add(E1DestprevBtn);
		
		JLabel E1DestnextBtn = new JLabel("");
		E1DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (E1Dest < 7) {
					E1Dest += 1;
				}
				DestinationSelector(E1DestLbl, E1Dest);
			}
		});
		E1DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		E1DestnextBtn.setBounds(660, 542, 15, 15);
		frame3.getContentPane().add(E1DestnextBtn);
		
		E1DestLbl = new JLabel("");
		E1DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		E1DestLbl.setBounds(548, 533, 115, 30);
		frame3.getContentPane().add(E1DestLbl);
		
		JLabel E1TypeprevBtn = new JLabel("");
		E1TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (E1Type > 1) {
					E1Type -= 1;
				}
				
				TypeSelector(E1TypeLbl, E1Type);
			}
		});
		E1TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		E1TypeprevBtn.setBounds(688, 542, 15, 15);
		frame3.getContentPane().add(E1TypeprevBtn);
		
		JLabel E1TypenextBtn = new JLabel("");
		E1TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (E1Type < 4) {
					E1Type += 1;
				}
				
				TypeSelector(E1TypeLbl, E1Type);
			}
		});
		E1TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		E1TypenextBtn.setBounds(816, 542, 15, 15);
		frame3.getContentPane().add(E1TypenextBtn);
		
		E1TypeLbl = new JLabel("");
		E1TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		E1TypeLbl.setBounds(703, 533, 115, 30);
		frame3.getContentPane().add(E1TypeLbl);
		
		
		// ========================= || E2 || ========================= \\
		
		JLabel E2DestprevBtn = new JLabel("");
		E2DestprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (E2Dest > 1) {
					E2Dest -= 1;
				}
				DestinationSelector(E2DestLbl, E2Dest);
			}
		});
		E2DestprevBtn.setIcon(new ImageIcon(prevBtnImg));
		E2DestprevBtn.setBounds(972, 542, 15, 15);
		frame3.getContentPane().add(E2DestprevBtn);
		
		JLabel E2DestnextBtn = new JLabel("");
		E2DestnextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (E2Dest < 7) {
					E2Dest += 1;
				}
				DestinationSelector(E2DestLbl, E2Dest);
			}
		});
		E2DestnextBtn.setIcon(new ImageIcon(nextBtnImg2));
		E2DestnextBtn.setBounds(1099, 542, 15, 15);
		frame3.getContentPane().add(E2DestnextBtn);
		
		E2DestLbl = new JLabel("");
		E2DestLbl.setHorizontalAlignment(SwingConstants.CENTER);
		E2DestLbl.setBounds(987, 533, 115, 30);
		frame3.getContentPane().add(E2DestLbl);
		
		JLabel E2TypeprevBtn = new JLabel("");
		E2TypeprevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (E2Type > 1) {
					E2Type -= 1;
				}
				
				TypeSelector(E2TypeLbl, E2Type);
			}
		});
		E2TypeprevBtn.setIcon(new ImageIcon(prevBtnImg));
		E2TypeprevBtn.setBounds(1127, 542, 15, 15);
		frame3.getContentPane().add(E2TypeprevBtn);
		
		JLabel E2TypenextBtn = new JLabel("");
		E2TypenextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (E2Type < 4) {
					E2Type += 1;
				}
				
				TypeSelector(E2TypeLbl, E2Type);
			}
		});
		E2TypenextBtn.setIcon(new ImageIcon(nextBtnImg2));
		E2TypenextBtn.setBounds(1255, 542, 15, 15);
		frame3.getContentPane().add(E2TypenextBtn);
		
		E2TypeLbl = new JLabel("");
		E2TypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		E2TypeLbl.setBounds(1142, 533, 115, 30);
		frame3.getContentPane().add(E2TypeLbl);
		
		
		passengerIcon1 = new JLabel("");
		passengerIcon1.setIcon(new ImageIcon(passengerImg));
		passengerIcon1.setBounds(77, 272, 45, 56);
		passengerIcon1.setVisible(false);
		frame3.getContentPane().add(passengerIcon1);
		
		passengerIcon2 = new JLabel("");
		passengerIcon2.setIcon(new ImageIcon(passengerImg));
		passengerIcon2.setBounds(122, 272, 45, 56);
		passengerIcon2.setVisible(false);
		frame3.getContentPane().add(passengerIcon2);
		
		passengerIcon3 = new JLabel("");
		passengerIcon3.setIcon(new ImageIcon(passengerImg));
		passengerIcon3.setBounds(167, 272, 45, 56);
		passengerIcon3.setVisible(false);
		frame3.getContentPane().add(passengerIcon3);
		
		passengerIcon4 = new JLabel("");
		passengerIcon4.setIcon(new ImageIcon(passengerImg));
		passengerIcon4.setBounds(212, 272, 45, 56);
		passengerIcon4.setVisible(false);
		frame3.getContentPane().add(passengerIcon4);
		
		passengerIcon5 = new JLabel("");
		passengerIcon5.setIcon(new ImageIcon(passengerImg));
		passengerIcon5.setBounds(257, 272, 45, 56);
		passengerIcon5.setVisible(false);
		frame3.getContentPane().add(passengerIcon5);
		
		passengerIcon6 = new JLabel("");
		passengerIcon6.setIcon(new ImageIcon(passengerImg));
		passengerIcon6.setBounds(77, 349, 45, 56);
		passengerIcon6.setVisible(false);
		frame3.getContentPane().add(passengerIcon6);
		
		passengerIcon7 = new JLabel("");
		passengerIcon7.setIcon(new ImageIcon(passengerImg));
		passengerIcon7.setBounds(122, 349, 45, 56);
		passengerIcon7.setVisible(false);
		frame3.getContentPane().add(passengerIcon7);
		
		passengerIcon8 = new JLabel("");
		passengerIcon8.setIcon(new ImageIcon(passengerImg));
		passengerIcon8.setBounds(167, 349, 45, 56);
		passengerIcon8.setVisible(false);
		frame3.getContentPane().add(passengerIcon8);
		
		passengerIcon9 = new JLabel("");
		passengerIcon9.setIcon(new ImageIcon(passengerImg));
		passengerIcon9.setBounds(212, 349, 45, 56);
		passengerIcon9.setVisible(false);
		frame3.getContentPane().add(passengerIcon9);
		
		passengerIcon10 = new JLabel("");
		passengerIcon10.setIcon(new ImageIcon(passengerImg));
		passengerIcon10.setBounds(257, 349, 45, 56);
		passengerIcon10.setVisible(false);
		frame3.getContentPane().add(passengerIcon10);
		
		
		// ========================= || BG || ========================= \\
		
		JLabel boardingBG = new JLabel("");
		boardingBG.setIcon(new ImageIcon(boardingImg));
		boardingBG.setBounds(0, 0, 1366, 768);
		frame3.getContentPane().add(boardingBG);
		
		
		
		// ============================================== || FRAME 4 || ============================================== \\
		
		frame4 = new JFrame();
		frame4.setBounds(100, 100, 1380, 805);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		Image fareCollectionBGSrc = new ImageIcon(this.getClass().getResource("/fareCollectionBG.png")).getImage();
		Image fareCollectionBGImg = fareCollectionBGSrc.getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
		
		Image collectFareBtnSrc = new ImageIcon(this.getClass().getResource("/collectFareButton.png")).getImage();
		Image collectFareBtnImg = collectFareBtnSrc.getScaledInstance(265, 265, Image.SCALE_DEFAULT);
		
		Image F4backBtnImg = backBtnSrc.getScaledInstance(265, 265, Image.SCALE_DEFAULT);
		
		Image passengerOnBoardPaidSrc = new ImageIcon(this.getClass().getResource("/paidPassenger.png")).getImage();
		Image passengerOnBoardPaidImg = passengerOnBoardPaidSrc.getScaledInstance(49, 49, Image.SCALE_DEFAULT);
		
		Image fareCollectorSrc = new ImageIcon(this.getClass().getResource("/fareCollector.png")).getImage();
		Image fareCollectorImg = fareCollectorSrc.getScaledInstance(49, 49, Image.SCALE_DEFAULT);
		
		Image departBtnSrc = new ImageIcon(this.getClass().getResource("/departButton.png")).getImage();
		Image departBtnImg = departBtnSrc.getScaledInstance(265, 265, Image.SCALE_DEFAULT);
		
		Image homeBtnSrc = new ImageIcon(this.getClass().getResource("/homeButton.png")).getImage();
		Image homeBtnImg = homeBtnSrc.getScaledInstance(283, 283, Image.SCALE_DEFAULT);
		
		Image saveBtnSrc = new ImageIcon(this.getClass().getResource("/saveButton.png")).getImage();
		Image saveBtnImg = saveBtnSrc.getScaledInstance(283, 283, Image.SCALE_DEFAULT);
		
		collectFareBtn = new JLabel("");
		collectFareBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Thread countdownThread = new Thread(new Runnable() {
					@Override
					public void run() {
						collectFareBtn.setVisible(false);
						F4backBtn.setVisible(false);
						
						if (passengerCount >= 1) {
							passengerOnBoardA1.setVisible(true);
						}
						if (passengerCount >= 2) {
							passengerOnBoardA2.setVisible(true);
						}
						if (passengerCount >= 3) {
							passengerOnBoardB1.setVisible(true);
						}
						if (passengerCount >= 4) {
							passengerOnBoardB2.setVisible(true);
						}
						if (passengerCount >= 5) {
							passengerOnBoardC1.setVisible(true);
						}
						if (passengerCount >= 6) {
							passengerOnBoardC2.setVisible(true);
						}
						if (passengerCount >= 7) {
							passengerOnBoardD1.setVisible(true);
						}
						if (passengerCount >= 8) {
							passengerOnBoardD2.setVisible(true);
						}
						if (passengerCount >= 9) {
							passengerOnBoardE1.setVisible(true);
						}
						if (passengerCount >= 10) {
							passengerOnBoardE2.setVisible(true);
						}
						
						try {
							Thread.sleep(2000);
							if (passengerCount >= 1) {
								seatNumberA1.setText(queue.peek());
								queue.remove();
								passengerOnBoardA1.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								DestinationSelector(destinationA1, A1Dest);
								TypeSelector(fareTypeA1, A1Type);
								FareCalculator(fareA1, A1Dest, A1Type);
								TypeCounter(A1Type);
								Thread.sleep(1000);
							}
							
							if (passengerCount >= 2) {
								seatNumberA2.setText(queue.peek());
								queue.remove();
								passengerOnBoardA2.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								DestinationSelector(destinationA2, A2Dest);
								TypeSelector(fareTypeA2, A2Type);
								FareCalculator(fareA2, A2Dest, A2Type);
								TypeCounter(A2Type);
								Thread.sleep(1000);
							}
							
							if (passengerCount >= 3) {
								seatNumberB1.setText(queue.peek());
								queue.remove();
								passengerOnBoardB1.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								fareCollector.setBounds(1034, 261, 39, 49);
								DestinationSelector(destinationB1, B1Dest);
								TypeSelector(fareTypeB1, B1Type);
								FareCalculator(fareB1, B1Dest, B1Type);
								TypeCounter(B1Type);
								Thread.sleep(1000);
							}
							
							if (passengerCount >= 4) {
								seatNumberB2.setText(queue.peek());
								queue.remove();
								passengerOnBoardB2.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								DestinationSelector(destinationB2, B2Dest);
								TypeSelector(fareTypeB2, B2Type);
								FareCalculator(fareB2, B2Dest, B2Type);
								TypeCounter(B2Type);
								Thread.sleep(1000);
							}
							
							if (passengerCount >= 5) {
								seatNumberC1.setText(queue.peek());
								queue.remove();
								passengerOnBoardC1.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								fareCollector.setBounds(1090, 261, 39, 49);
								DestinationSelector(destinationC1, C1Dest);
								TypeSelector(fareTypeC1, C1Type);
								FareCalculator(fareC1, C1Dest, C1Type);
								TypeCounter(C1Type);
								Thread.sleep(1000);
							}
							
							if (passengerCount >= 6) {
								seatNumberC2.setText(queue.peek());
								queue.remove();
								passengerOnBoardC2.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								DestinationSelector(destinationC2, C2Dest);
								TypeSelector(fareTypeC2, C2Type);
								FareCalculator(fareC2, C2Dest, C2Type);
								TypeCounter(C2Type);
								Thread.sleep(1000);
							}
							
							if (passengerCount >= 7) {
								seatNumberD1.setText(queue.peek());
								queue.remove();
								passengerOnBoardD1.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								fareCollector.setBounds(1145, 261, 39, 49);
								DestinationSelector(destinationD1, D1Dest);
								TypeSelector(fareTypeD1, D1Type);
								FareCalculator(fareD1, D1Dest, D1Type);
								TypeCounter(D1Type);
								Thread.sleep(1000);
							}
							
							if (passengerCount >= 8) {
								seatNumberD2.setText(queue.peek());
								queue.remove();
								passengerOnBoardD2.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								DestinationSelector(destinationD2, D2Dest);
								TypeSelector(fareTypeD2, D2Type);
								FareCalculator(fareD2, D2Dest, D2Type);
								TypeCounter(D2Type);
								Thread.sleep(1000);
							}
							
							if (passengerCount >= 9) {
								seatNumberE1.setText(queue.peek());
								queue.remove();
								passengerOnBoardE1.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								fareCollector.setBounds(1201, 261, 39, 49);
								DestinationSelector(destinationE1, E1Dest);
								TypeSelector(fareTypeE1, E1Type);
								FareCalculator(fareE1, E1Dest, E1Type);
								TypeCounter(E1Type);
								Thread.sleep(1000);
							}
							
							if (passengerCount >= 10) {
								seatNumberE2.setText(queue.peek());
								queue.remove();
								passengerOnBoardE2.setIcon(new ImageIcon(passengerOnBoardPaidImg));
								DestinationSelector(destinationE2, E2Dest);
								TypeSelector(fareTypeE2, E2Type);
								FareCalculator(fareE2, E2Dest, E2Type);
								TypeCounter(E2Type);
								Thread.sleep(1000);
							}
							
							departBtn.setVisible(true);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				});
				countdownThread.start();
			}
		});
		collectFareBtn.setIcon(new ImageIcon(collectFareBtnImg));
		collectFareBtn.setBounds(697, 652, 265, 59);
		frame4.getContentPane().add(collectFareBtn);
		
		F4backBtn = new JLabel("");
		F4backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame3.show();
				frame4.dispose();
			}
		});
		F4backBtn.setIcon(new ImageIcon(F4backBtnImg));
		F4backBtn.setBounds(1025, 652, 265, 59);
		frame4.getContentPane().add(F4backBtn);
		
		
		// ========================= || SEAT NUMBER || ========================= \\
		
		seatNumberA1 = new JLabel("");
		seatNumberA1.setForeground(Color.WHITE);
		seatNumberA1.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberA1.setBounds(96, 131, 40, 28);
		frame4.getContentPane().add(seatNumberA1);
		
		seatNumberA2 = new JLabel("");
		seatNumberA2.setForeground(Color.WHITE);
		seatNumberA2.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberA2.setBounds(96, 170, 40, 28);
		frame4.getContentPane().add(seatNumberA2);
		
		seatNumberB1 = new JLabel("");
		seatNumberB1.setForeground(Color.WHITE);
		seatNumberB1.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberB1.setBounds(96, 209, 40, 28);
		frame4.getContentPane().add(seatNumberB1);
		
		seatNumberB2 = new JLabel("");
		seatNumberB2.setForeground(Color.WHITE);
		seatNumberB2.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberB2.setBounds(96, 248, 40, 28);
		frame4.getContentPane().add(seatNumberB2);
		
		seatNumberC1 = new JLabel("");
		seatNumberC1.setForeground(Color.WHITE);
		seatNumberC1.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberC1.setBounds(96, 287, 40, 28);
		frame4.getContentPane().add(seatNumberC1);
		
		seatNumberC2 = new JLabel("");
		seatNumberC2.setForeground(Color.WHITE);
		seatNumberC2.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberC2.setBounds(96, 326, 40, 28);
		frame4.getContentPane().add(seatNumberC2);
		
		seatNumberD1 = new JLabel("");
		seatNumberD1.setForeground(Color.WHITE);
		seatNumberD1.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberD1.setBounds(96, 365, 40, 28);
		frame4.getContentPane().add(seatNumberD1);
		
		seatNumberD2 = new JLabel("");
		seatNumberD2.setForeground(Color.WHITE);
		seatNumberD2.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberD2.setBounds(96, 404, 40, 28);
		frame4.getContentPane().add(seatNumberD2);
		
		seatNumberE1 = new JLabel("");
		seatNumberE1.setForeground(Color.WHITE);
		seatNumberE1.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberE1.setBounds(96, 443, 40, 28);
		frame4.getContentPane().add(seatNumberE1);
		
		seatNumberE2 = new JLabel("");
		seatNumberE2.setForeground(Color.WHITE);
		seatNumberE2.setHorizontalAlignment(SwingConstants.CENTER);
		seatNumberE2.setBounds(96, 482, 40, 28);
		frame4.getContentPane().add(seatNumberE2);
		
		
		// ========================= || DESTINATION || ========================= \\
		
		destinationA1 = new JLabel("");
		destinationA1.setForeground(Color.WHITE);
		destinationA1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationA1.setBounds(146, 131, 166, 28);
		frame4.getContentPane().add(destinationA1);
		
		destinationA2 = new JLabel("");
		destinationA2.setForeground(Color.WHITE);
		destinationA2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationA2.setBounds(146, 170, 166, 28);
		frame4.getContentPane().add(destinationA2);
		
		destinationB1 = new JLabel("");
		destinationB1.setForeground(Color.WHITE);
		destinationB1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationB1.setBounds(146, 209, 166, 28);
		frame4.getContentPane().add(destinationB1);
		
		destinationB2 = new JLabel("");
		destinationB2.setForeground(Color.WHITE);
		destinationB2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationB2.setBounds(146, 248, 166, 28);
		frame4.getContentPane().add(destinationB2);
		
		destinationC1 = new JLabel("");
		destinationC1.setForeground(Color.WHITE);
		destinationC1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationC1.setBounds(146, 287, 166, 28);
		frame4.getContentPane().add(destinationC1);
		
		destinationC2 = new JLabel("");
		destinationC2.setForeground(Color.WHITE);
		destinationC2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationC2.setBounds(146, 326, 166, 28);
		frame4.getContentPane().add(destinationC2);
		
		destinationD1 = new JLabel("");
		destinationD1.setForeground(Color.WHITE);
		destinationD1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationD1.setBounds(146, 365, 166, 28);
		frame4.getContentPane().add(destinationD1);
		
		destinationD2 = new JLabel("");
		destinationD2.setForeground(Color.WHITE);
		destinationD2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationD2.setBounds(146, 404, 166, 28);
		frame4.getContentPane().add(destinationD2);
		
		destinationE1 = new JLabel("");
		destinationE1.setForeground(Color.WHITE);
		destinationE1.setHorizontalAlignment(SwingConstants.CENTER);
		destinationE1.setBounds(146, 443, 166, 28);
		frame4.getContentPane().add(destinationE1);
		
		destinationE2 = new JLabel("");
		destinationE2.setForeground(Color.WHITE);
		destinationE2.setHorizontalAlignment(SwingConstants.CENTER);
		destinationE2.setBounds(146, 482, 166, 28);
		frame4.getContentPane().add(destinationE2);
		
		
		// ========================= || FARE TYPE || ========================= \\
		
		fareTypeA1 = new JLabel("");
		fareTypeA1.setForeground(Color.WHITE);
		fareTypeA1.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeA1.setBounds(322, 131, 118, 28);
		frame4.getContentPane().add(fareTypeA1);
		
		fareTypeA2 = new JLabel("");
		fareTypeA2.setForeground(Color.WHITE);
		fareTypeA2.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeA2.setBounds(322, 170, 118, 28);
		frame4.getContentPane().add(fareTypeA2);
		
		fareTypeB1 = new JLabel("");
		fareTypeB1.setForeground(Color.WHITE);
		fareTypeB1.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeB1.setBounds(322, 209, 118, 28);
		frame4.getContentPane().add(fareTypeB1);
		
		fareTypeB2 = new JLabel("");
		fareTypeB2.setForeground(Color.WHITE);
		fareTypeB2.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeB2.setBounds(322, 248, 118, 28);
		frame4.getContentPane().add(fareTypeB2);
		
		fareTypeC1 = new JLabel("");
		fareTypeC1.setForeground(Color.WHITE);
		fareTypeC1.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeC1.setBounds(322, 287, 118, 28);
		frame4.getContentPane().add(fareTypeC1);
		
		fareTypeC2 = new JLabel("");
		fareTypeC2.setForeground(Color.WHITE);
		fareTypeC2.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeC2.setBounds(322, 326, 118, 28);
		frame4.getContentPane().add(fareTypeC2);
		
		fareTypeD1 = new JLabel("");
		fareTypeD1.setForeground(Color.WHITE);
		fareTypeD1.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeD1.setBounds(322, 365, 118, 28);
		frame4.getContentPane().add(fareTypeD1);
		
		fareTypeD2 = new JLabel("");
		fareTypeD2.setForeground(Color.WHITE);
		fareTypeD2.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeD2.setBounds(322, 404, 118, 28);
		frame4.getContentPane().add(fareTypeD2);
		
		fareTypeE1 = new JLabel("");
		fareTypeE1.setForeground(Color.WHITE);
		fareTypeE1.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeE1.setBounds(322, 443, 118, 28);
		frame4.getContentPane().add(fareTypeE1);
		
		fareTypeE2 = new JLabel("");
		fareTypeE2.setForeground(Color.WHITE);
		fareTypeE2.setHorizontalAlignment(SwingConstants.CENTER);
		fareTypeE2.setBounds(322, 482, 118, 28);
		frame4.getContentPane().add(fareTypeE2);
		
		// ========================= || FARE || ========================= \\

		fareA1 = new JLabel("");
		fareA1.setForeground(Color.WHITE);
		fareA1.setBounds(459, 131, 51, 28);
		frame4.getContentPane().add(fareA1);
		
		fareA2 = new JLabel("");
		fareA2.setForeground(Color.WHITE);
		fareA2.setBounds(459, 170, 51, 28);
		frame4.getContentPane().add(fareA2);
		
		fareB1 = new JLabel("");
		fareB1.setForeground(Color.WHITE);
		fareB1.setBounds(459, 209, 51, 28);
		frame4.getContentPane().add(fareB1);
		
		fareB2 = new JLabel("");
		fareB2.setForeground(Color.WHITE);
		fareB2.setBounds(459, 248, 51, 28);
		frame4.getContentPane().add(fareB2);
		
		fareC1 = new JLabel("");
		fareC1.setForeground(Color.WHITE);
		fareC1.setBounds(459, 287, 51, 28);
		frame4.getContentPane().add(fareC1);
		
		fareC2 = new JLabel("");
		fareC2.setForeground(Color.WHITE);
		fareC2.setBounds(459, 326, 51, 28);
		frame4.getContentPane().add(fareC2);
		
		fareD1 = new JLabel("");
		fareD1.setForeground(Color.WHITE);
		fareD1.setBounds(459, 365, 51, 28);
		frame4.getContentPane().add(fareD1);
		
		fareD2 = new JLabel("");
		fareD2.setForeground(Color.WHITE);
		fareD2.setBounds(459, 404, 51, 28);
		frame4.getContentPane().add(fareD2);
		
		fareE1 = new JLabel("");
		fareE1.setForeground(Color.WHITE);
		fareE1.setBounds(459, 443, 51, 28);
		frame4.getContentPane().add(fareE1);
		
		fareE2 = new JLabel("");
		fareE2.setForeground(Color.WHITE);
		fareE2.setBounds(459, 482, 51, 28);
		frame4.getContentPane().add(fareE2);
		
		passengerOnBoardA1 = new JLabel("");
		passengerOnBoardA1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardA1.setBounds(977, 320, 49, 39);
		passengerOnBoardA1.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardA1);
		
		passengerOnBoardA2 = new JLabel("");
		passengerOnBoardA2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardA2.setBounds(977, 216, 49, 39);
		passengerOnBoardA2.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardA2);
		
		passengerOnBoardB1 = new JLabel("");
		passengerOnBoardB1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardB1.setBounds(1034, 320, 49, 39);
		passengerOnBoardB1.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardB1);
		
		passengerOnBoardB2 = new JLabel("");
		passengerOnBoardB2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardB2.setBounds(1034, 216, 49, 39);
		passengerOnBoardB2.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardB2);
		
		passengerOnBoardC1 = new JLabel("");
		passengerOnBoardC1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardC1.setBounds(1090, 320, 49, 39);
		passengerOnBoardC1.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardC1);
		
		passengerOnBoardC2 = new JLabel("");
		passengerOnBoardC2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardC2.setBounds(1090, 216, 49, 39);
		passengerOnBoardC2.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardC2);
		
		passengerOnBoardD1 = new JLabel("");
		passengerOnBoardD1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardD1.setBounds(1145, 319, 49, 39);
		passengerOnBoardD1.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardD1);
		
		passengerOnBoardD2 = new JLabel("");
		passengerOnBoardD2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardD2.setBounds(1145, 215, 49, 39);
		passengerOnBoardD2.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardD2);
		
		passengerOnBoardE1 = new JLabel("");
		passengerOnBoardE1.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardE1.setBounds(1201, 319, 49, 39);
		passengerOnBoardE1.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardE1);
		
		passengerOnBoardE2 = new JLabel("");
		passengerOnBoardE2.setIcon(new ImageIcon(passengerOnBoardUnpaidImg));
		passengerOnBoardE2.setBounds(1201, 215, 49, 39);
		passengerOnBoardE2.setVisible(false);
		frame4.getContentPane().add(passengerOnBoardE2);
		
		fareCollector = new JLabel("");
		fareCollector.setIcon(new ImageIcon(fareCollectorImg));
		fareCollector.setBounds(977, 261, 39, 49);
		frame4.getContentPane().add(fareCollector);
		
		departBtn = new JLabel("");
		departBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passengerCountRecord.setText(passengerCount + " PASSENGERS");
				passengerCountDetails.setText("( " + Regular + "REGULAR - " + Discounted + " DISCOUNTED )");
				cumulativeFare.setText("P" + String.format("%.2f", FareStackCounter()));
				travelRoute.setText(routes.Current.stop1 + " - " + routes.Current.stop7);
				
				frame5.show();
				frame4.dispose();
			}
		});
		departBtn.setIcon(new ImageIcon(departBtnImg));
		departBtn.setBounds(865, 652, 265, 59);
		departBtn.setVisible(false);
		frame4.getContentPane().add(departBtn);
		
		JLabel fareCollectionBG =  new JLabel("");
		fareCollectionBG.setIcon(new ImageIcon(fareCollectionBGImg));
		fareCollectionBG.setBounds(0, 0, 1366, 768);
		frame4.getContentPane().add(fareCollectionBG);
		
		
		// ============================================== || FRAME 5 || ============================================== \\
		
		frame5 = new JFrame();
		frame5.setBounds(100, 100, 1380, 805);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		Image recordBGSrc = new ImageIcon(this.getClass().getResource("recordBG.png")).getImage();
		Image recordBGImg = recordBGSrc.getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
		
		passengerCountRecord = new JLabel("");
		passengerCountRecord.setFont(Norwester.deriveFont(30f));
		passengerCountRecord.setHorizontalAlignment(SwingConstants.CENTER);
		passengerCountRecord.setBounds(75, 115, 345, 43);
		frame5.getContentPane().add(passengerCountRecord);
		
		passengerCountDetails = new JLabel("");
		passengerCountDetails.setHorizontalAlignment(SwingConstants.CENTER);
		passengerCountDetails.setFont(Norwester.deriveFont(15f));
		passengerCountDetails.setForeground(Color.GRAY);
		passengerCountDetails.setBounds(117, 158, 261, 35);
		frame5.getContentPane().add(passengerCountDetails);
		
		passengerCountRecord_1 = new JLabel("7.0 KM");
		passengerCountRecord_1.setHorizontalAlignment(SwingConstants.CENTER);
		passengerCountRecord_1.setFont(Norwester.deriveFont(30f));
		passengerCountRecord_1.setBounds(499, 129, 345, 43);
		frame5.getContentPane().add(passengerCountRecord_1);
		
		cumulativeFare = new JLabel("");
		cumulativeFare.setHorizontalAlignment(SwingConstants.CENTER);
		cumulativeFare.setFont(Norwester.deriveFont(30f));
		cumulativeFare.setBounds(923, 129, 345, 43);
		frame5.getContentPane().add(cumulativeFare);
		
		travelRoute = new JLabel("");
		travelRoute.setHorizontalAlignment(SwingConstants.CENTER);
		travelRoute.setFont(Norwester.deriveFont(30f));
		travelRoute.setBounds(798, 381, 470, 43);
		frame5.getContentPane().add(travelRoute);
		
		JLabel homeBtn = new JLabel("");
		homeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Reset();
				
				frame.show();
				frame5.dispose();
			}
		});
		homeBtn.setIcon(new ImageIcon(homeBtnImg));
		homeBtn.setBounds(997, 607, 283, 69);
		frame5.getContentPane().add(homeBtn);
		
		saveBtn = new JLabel("");
		saveBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				DateTime.add(LocalDate.now() + " " + LocalTime.now());
				TravelRoute.add(routes.Current.stop1 + " - " + routes.Current.stop7);
				PassengerCount.add(passengerCount);
				DistanceTraveled.add((float) 7);
				CumulativeFare.add(historyTotalFare);
				
				if (historyCount <= 6) {
					historyCount += 1;
				}
				if (historyCount > 6) {
					DateTime.remove();
					TravelRoute.remove();
					PassengerCount.remove();
					DistanceTraveled.remove();
					CumulativeFare.remove();
				}
				
				Reset();
				
				frame.show();
				frame5.dispose();
			}
		});
		saveBtn.setIcon(new ImageIcon(saveBtnImg));
		saveBtn.setBounds(641, 607, 283, 69);
		frame5.getContentPane().add(saveBtn);
		
		JLabel recordBG =  new JLabel("");
		recordBG.setIcon(new ImageIcon(recordBGImg));
		recordBG.setBounds(0, 0, 1366, 768);
		frame5.getContentPane().add(recordBG);
		
		
		// ============================================== || HISTORY || ============================================== \\
		
		history = new JFrame();
		history.setBounds(100, 100, 462, 600);
		history.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		history.getContentPane().setLayout(null);
		history.setUndecorated(true);
		
		Image historyBGSrc = new ImageIcon(this.getClass().getResource("/historyBG.png")).getImage();
		Image historyBGImg = historyBGSrc.getScaledInstance(462, 600, Image.SCALE_DEFAULT);
		
		Image xBtnSrc = new ImageIcon(this.getClass().getResource("/xButton.png")).getImage();
		Image xBtnImg = xBtnSrc.getScaledInstance(46, 46, Image.SCALE_DEFAULT);
		
		JLabel xBtn = new JLabel("");
		xBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				history.dispose();
			}
		});
		xBtn.setIcon(new ImageIcon(xBtnImg));
		xBtn.setBounds(388, 27, 46, 46);
		history.getContentPane().add(xBtn);
		
		// ================ || GRID 1 || ================ \\
		
		grid1DateTime = new JLabel("");
		grid1DateTime.setHorizontalAlignment(SwingConstants.CENTER);
		grid1DateTime.setFont(Norwester.deriveFont(10f));
		grid1DateTime.setForeground(Color.GRAY);
		grid1DateTime.setBounds(57, 117, 160, 20);
		history.getContentPane().add(grid1DateTime);
		
		grid1TravelRouteLbl = new JLabel("TRAVEL ROUTE:");
		grid1TravelRouteLbl.setFont(Norwester.deriveFont(10f));
		grid1TravelRouteLbl.setForeground(Color.GRAY);
		grid1TravelRouteLbl.setBounds(55, 131, 94, 20);
		grid1TravelRouteLbl.setVisible(true);
		history.getContentPane().add(grid1TravelRouteLbl);
		
		grid1TravelRoute = new JLabel("");
		grid1TravelRoute.setFont(Norwester.deriveFont(13f));
		grid1TravelRoute.setBounds(55, 140, 160, 25);
		history.getContentPane().add(grid1TravelRoute);
		
		grid1PassengerCountLbl = new JLabel("PASSENGER COUNT:");
		grid1PassengerCountLbl.setForeground(Color.GRAY);
		grid1PassengerCountLbl.setFont(Norwester.deriveFont(10f));
		grid1PassengerCountLbl.setBounds(55, 158, 162, 20);
		grid1PassengerCountLbl.setVisible(false);
		history.getContentPane().add(grid1PassengerCountLbl);
		
		grid1PassengerCount = new JLabel("");
		grid1PassengerCount.setFont(Norwester.deriveFont(13f));
		grid1PassengerCount.setBounds(55, 167, 160, 25);
		history.getContentPane().add(grid1PassengerCount);
		
		grid1DistanceTraveledLbl = new JLabel("DISTANCE TRAVELED:");
		grid1DistanceTraveledLbl.setForeground(Color.GRAY);
		grid1DistanceTraveledLbl.setFont(Norwester.deriveFont(10f));
		grid1DistanceTraveledLbl.setBounds(55, 185, 162, 20);
		grid1DistanceTraveledLbl.setVisible(false);
		history.getContentPane().add(grid1DistanceTraveledLbl);
		
		grid1DistanceTraveled = new JLabel("");
		grid1DistanceTraveled.setFont(Norwester.deriveFont(13f));
		grid1DistanceTraveled.setBounds(55, 194, 160, 25);
		history.getContentPane().add(grid1DistanceTraveled);
		
		grid1CumulativeFareLbl = new JLabel("CUMULATIVE FARE:");
		grid1CumulativeFareLbl.setForeground(Color.GRAY);
		grid1CumulativeFareLbl.setFont(Norwester.deriveFont(10f));
		grid1CumulativeFareLbl.setBounds(55, 210, 162, 20);
		grid1CumulativeFareLbl.setVisible(false);
		history.getContentPane().add(grid1CumulativeFareLbl);
		
		grid1CumulativeFare = new JLabel("");
		grid1CumulativeFare.setFont(Norwester.deriveFont(13f));
		grid1CumulativeFare.setBounds(55, 219, 160, 25);
		history.getContentPane().add(grid1CumulativeFare);
		
		// ================ || GRID 2 || ================ \\
		
		grid2DateTime = new JLabel("");
		grid2DateTime.setHorizontalAlignment(SwingConstants.CENTER);
		grid2DateTime.setForeground(Color.GRAY);
		grid2DateTime.setFont(Norwester.deriveFont(13f));
		grid2DateTime.setBounds(247, 117, 160, 20);
		history.getContentPane().add(grid2DateTime);
		
		grid2TravelRouteLbl = new JLabel("TRAVEL ROUTE:");
		grid2TravelRouteLbl.setForeground(Color.GRAY);
		grid2TravelRouteLbl.setFont(Norwester.deriveFont(10f));
		grid2TravelRouteLbl.setBounds(245, 131, 94, 20);
		grid2TravelRouteLbl.setVisible(false);
		history.getContentPane().add(grid2TravelRouteLbl);
		
		grid2TravelRoute = new JLabel("");
		grid2TravelRoute.setFont(Norwester.deriveFont(13f));
		grid2TravelRoute.setBounds(245, 140, 160, 25);
		history.getContentPane().add(grid2TravelRoute);
		
		grid2PassengerCountLbl = new JLabel("PASSENGER COUNT:");
		grid2PassengerCountLbl.setForeground(Color.GRAY);
		grid2PassengerCountLbl.setFont(Norwester.deriveFont(10f));
		grid2PassengerCountLbl.setBounds(245, 158, 162, 20);
		grid2PassengerCountLbl.setVisible(false);
		history.getContentPane().add(grid2PassengerCountLbl);
		
		grid2PassengerCount = new JLabel("");
		grid2PassengerCount.setFont(Norwester.deriveFont(13f));
		grid2PassengerCount.setBounds(245, 167, 160, 25);
		history.getContentPane().add(grid2PassengerCount);
		
		grid2DistanceTraveledLbl = new JLabel("DISTANCE TRAVELED:");
		grid2DistanceTraveledLbl.setForeground(Color.GRAY);
		grid2DistanceTraveledLbl.setFont(Norwester.deriveFont(10f));
		grid2DistanceTraveledLbl.setBounds(245, 185, 162, 20);
		grid2DistanceTraveledLbl.setVisible(false);
		history.getContentPane().add(grid2DistanceTraveledLbl);
		
		grid2DistanceTraveled = new JLabel("");
		grid2DistanceTraveled.setFont(Norwester.deriveFont(13f));
		grid2DistanceTraveled.setBounds(245, 194, 160, 25);
		history.getContentPane().add(grid2DistanceTraveled);
		
		grid2CumulativeFareLbl = new JLabel("CUMULATIVE FARE:");
		grid2CumulativeFareLbl.setForeground(Color.GRAY);
		grid2CumulativeFareLbl.setFont(Norwester.deriveFont(10f));
		grid2CumulativeFareLbl.setBounds(245, 210, 162, 20);
		grid2CumulativeFareLbl.setVisible(false);
		history.getContentPane().add(grid2CumulativeFareLbl);
		
		grid2CumulativeFare = new JLabel("");
		grid2CumulativeFare.setFont(Norwester.deriveFont(13f));
		grid2CumulativeFare.setBounds(245, 219, 160, 25);
		history.getContentPane().add(grid2CumulativeFare);
		
		// ================ || GRID 3 || ================ \\
		
		grid3DateTime = new JLabel("");
		grid3DateTime.setHorizontalAlignment(SwingConstants.CENTER);
		grid3DateTime.setForeground(Color.GRAY);
		grid3DateTime.setFont(Norwester.deriveFont(13f));
		grid3DateTime.setBounds(59, 268, 160, 20);
		history.getContentPane().add(grid3DateTime);
		
		grid3TravelRouteLbl = new JLabel("TRAVEL ROUTE:");
		grid3TravelRouteLbl.setForeground(Color.GRAY);
		grid3TravelRouteLbl.setFont(Norwester.deriveFont(10f));
		grid3TravelRouteLbl.setBounds(57, 282, 94, 20);
		grid3TravelRouteLbl.setVisible(false);
		history.getContentPane().add(grid3TravelRouteLbl);
		
		grid3TravelRoute = new JLabel("");
		grid3TravelRoute.setFont(Norwester.deriveFont(13f));
		grid3TravelRoute.setBounds(57, 291, 160, 25);
		history.getContentPane().add(grid3TravelRoute);
		
		grid3PassengerCountLbl = new JLabel("PASSENGER COUNT:");
		grid3PassengerCountLbl.setForeground(Color.GRAY);
		grid3PassengerCountLbl.setFont(Norwester.deriveFont(10f));
		grid3PassengerCountLbl.setBounds(57, 309, 162, 20);
		grid3PassengerCountLbl.setVisible(false);
		history.getContentPane().add(grid3PassengerCountLbl);
		
		grid3PassengerCount = new JLabel("");
		grid3PassengerCount.setFont(Norwester.deriveFont(13f));
		grid3PassengerCount.setBounds(57, 318, 160, 25);
		history.getContentPane().add(grid3PassengerCount);
		
		grid3DistanceTraveledLbl = new JLabel("DISTANCE TRAVELED:");
		grid3DistanceTraveledLbl.setForeground(Color.GRAY);
		grid3DistanceTraveledLbl.setFont(Norwester.deriveFont(10f));
		grid3DistanceTraveledLbl.setBounds(57, 336, 162, 20);
		grid3DistanceTraveledLbl.setVisible(false);
		history.getContentPane().add(grid3DistanceTraveledLbl);
		
		grid3DistanceTraveled = new JLabel("");
		grid3DistanceTraveled.setFont(Norwester.deriveFont(13f));
		grid3DistanceTraveled.setBounds(57, 345, 160, 25);
		history.getContentPane().add(grid3DistanceTraveled);
		
		grid3CumulativeFareLbl = new JLabel("CUMULATIVE FARE:");
		grid3CumulativeFareLbl.setForeground(Color.GRAY);
		grid3CumulativeFareLbl.setFont(Norwester.deriveFont(10f));
		grid3CumulativeFareLbl.setBounds(57, 361, 162, 20);
		grid3CumulativeFareLbl.setVisible(false);
		history.getContentPane().add(grid3CumulativeFareLbl);
		
		grid3CumulativeFare = new JLabel("");
		grid3CumulativeFare.setFont(Norwester.deriveFont(13f));
		grid3CumulativeFare.setBounds(57, 370, 160, 25);
		history.getContentPane().add(grid3CumulativeFare);
		
		// ================ || GRID 4 || ================ \\
		
		grid4DateTime = new JLabel("");
		grid4DateTime.setHorizontalAlignment(SwingConstants.CENTER);
		grid4DateTime.setForeground(Color.GRAY);
		grid4DateTime.setFont(Norwester.deriveFont(13f));
		grid4DateTime.setBounds(247, 268, 160, 20);
		history.getContentPane().add(grid4DateTime);
		
		grid4TravelRouteLbl = new JLabel("TRAVEL ROUTE:");
		grid4TravelRouteLbl.setForeground(Color.GRAY);
		grid4TravelRouteLbl.setFont(Norwester.deriveFont(10f));
		grid4TravelRouteLbl.setBounds(245, 282, 94, 20);
		grid4TravelRouteLbl.setVisible(false);
		history.getContentPane().add(grid4TravelRouteLbl);
		
		grid4TravelRoute = new JLabel("");
		grid4TravelRoute.setFont(Norwester.deriveFont(13f));
		grid4TravelRoute.setBounds(245, 291, 160, 25);
		history.getContentPane().add(grid4TravelRoute);
		
		grid4PassengerCountLbl = new JLabel("PASSENGER COUNT:");
		grid4PassengerCountLbl.setForeground(Color.GRAY);
		grid4PassengerCountLbl.setFont(Norwester.deriveFont(10f));
		grid4PassengerCountLbl.setBounds(245, 309, 162, 20);
		grid4PassengerCountLbl.setVisible(false);
		history.getContentPane().add(grid4PassengerCountLbl);
		
		grid4PassengerCount = new JLabel("");
		grid4PassengerCount.setFont(Norwester.deriveFont(13f));
		grid4PassengerCount.setBounds(245, 318, 160, 25);
		history.getContentPane().add(grid4PassengerCount);
		
		grid4DistanceTraveledLbl = new JLabel("DISTANCE TRAVELED:");
		grid4DistanceTraveledLbl.setForeground(Color.GRAY);
		grid4DistanceTraveledLbl.setFont(Norwester.deriveFont(10f));
		grid4DistanceTraveledLbl.setBounds(245, 336, 162, 20);
		grid4DistanceTraveledLbl.setVisible(false);
		history.getContentPane().add(grid4DistanceTraveledLbl);
		
		grid4DistanceTraveled = new JLabel("");
		grid4DistanceTraveled.setFont(Norwester.deriveFont(13f));
		grid4DistanceTraveled.setBounds(245, 345, 160, 25);
		history.getContentPane().add(grid4DistanceTraveled);
		
		grid4CumulativeFareLbl = new JLabel("CUMULATIVE FARE:");
		grid4CumulativeFareLbl.setForeground(Color.GRAY);
		grid4CumulativeFareLbl.setFont(Norwester.deriveFont(10f));
		grid4CumulativeFareLbl.setBounds(245, 361, 162, 20);
		grid4CumulativeFareLbl.setVisible(false);
		history.getContentPane().add(grid4CumulativeFareLbl);
		
		grid4CumulativeFare = new JLabel("");
		grid4CumulativeFare.setFont(Norwester.deriveFont(13f));
		grid4CumulativeFare.setBounds(245, 370, 160, 25);
		history.getContentPane().add(grid4CumulativeFare);
		
		// ================ || GRID 5 || ================ \\
		
		grid5DateTime = new JLabel("");
		grid5DateTime.setHorizontalAlignment(SwingConstants.CENTER);
		grid5DateTime.setForeground(Color.GRAY);
		grid5DateTime.setFont(Norwester.deriveFont(13f));
		grid5DateTime.setBounds(59, 420, 160, 20);
		history.getContentPane().add(grid5DateTime);
		
		grid5TravelRouteLbl = new JLabel("TRAVEL ROUTE:");
		grid5TravelRouteLbl.setForeground(Color.GRAY);
		grid5TravelRouteLbl.setFont(Norwester.deriveFont(10f));
		grid5TravelRouteLbl.setBounds(57, 434, 94, 20);
		grid5TravelRouteLbl.setVisible(false);
		history.getContentPane().add(grid5TravelRouteLbl);
		
		grid5TravelRoute = new JLabel("");
		grid5TravelRoute.setFont(Norwester.deriveFont(13f));
		grid5TravelRoute.setBounds(57, 443, 160, 25);
		history.getContentPane().add(grid5TravelRoute);
		
		grid5PassengerCountLbl = new JLabel("PASSENGER COUNT:");
		grid5PassengerCountLbl.setForeground(Color.GRAY);
		grid5PassengerCountLbl.setFont(Norwester.deriveFont(10f));
		grid5PassengerCountLbl.setBounds(57, 461, 162, 20);
		grid5PassengerCountLbl.setVisible(false);
		history.getContentPane().add(grid5PassengerCountLbl);
		
		grid5PassengerCount = new JLabel("");
		grid5PassengerCount.setFont(Norwester.deriveFont(13f));
		grid5PassengerCount.setBounds(57, 470, 160, 25);
		history.getContentPane().add(grid5PassengerCount);
		
		grid5DistanceTraveledLbl = new JLabel("DISTANCE TRAVELED:");
		grid5DistanceTraveledLbl.setForeground(Color.GRAY);
		grid5DistanceTraveledLbl.setFont(Norwester.deriveFont(10f));
		grid5DistanceTraveledLbl.setBounds(57, 488, 162, 20);
		grid5DistanceTraveledLbl.setVisible(false);
		history.getContentPane().add(grid5DistanceTraveledLbl);
		
		grid5DistanceTraveled = new JLabel("");
		grid5DistanceTraveled.setFont(Norwester.deriveFont(13f));
		grid5DistanceTraveled.setBounds(57, 497, 160, 25);
		history.getContentPane().add(grid5DistanceTraveled);
		
		grid5CumulativeFareLbl = new JLabel("CUMULATIVE FARE:");
		grid5CumulativeFareLbl.setForeground(Color.GRAY);
		grid5CumulativeFareLbl.setFont(Norwester.deriveFont(10f));
		grid5CumulativeFareLbl.setBounds(57, 513, 162, 20);
		grid5CumulativeFareLbl.setVisible(false);
		history.getContentPane().add(grid5CumulativeFareLbl);
		
		grid5CumulativeFare = new JLabel("");
		grid5CumulativeFare.setFont(Norwester.deriveFont(13f));
		grid5CumulativeFare.setBounds(57, 522, 160, 25);
		history.getContentPane().add(grid5CumulativeFare);
		
		// ================ || GRID 6 || ================ \\
		
		grid6DateTime = new JLabel("");
		grid6DateTime.setHorizontalAlignment(SwingConstants.CENTER);
		grid6DateTime.setForeground(Color.GRAY);
		grid6DateTime.setFont(Norwester.deriveFont(13f));
		grid6DateTime.setBounds(249, 420, 160, 20);
		history.getContentPane().add(grid6DateTime);
		
		grid6TravelRouteLbl = new JLabel("TRAVEL ROUTE:");
		grid6TravelRouteLbl.setForeground(Color.GRAY);
		grid6TravelRouteLbl.setFont(Norwester.deriveFont(10f));
		grid6TravelRouteLbl.setBounds(247, 434, 94, 20);
		grid6TravelRouteLbl.setVisible(false);
		history.getContentPane().add(grid6TravelRouteLbl);
		
		grid6TravelRoute = new JLabel("");
		grid6TravelRoute.setFont(Norwester.deriveFont(13f));
		grid6TravelRoute.setBounds(247, 443, 160, 25);
		history.getContentPane().add(grid6TravelRoute);
		
		grid6PassengerCountLbl = new JLabel("PASSENGER COUNT:");
		grid6PassengerCountLbl.setForeground(Color.GRAY);
		grid6PassengerCountLbl.setFont(Norwester.deriveFont(10f));
		grid6PassengerCountLbl.setBounds(247, 461, 162, 20);
		grid6PassengerCountLbl.setVisible(false);
		history.getContentPane().add(grid6PassengerCountLbl);
		
		grid6PassengerCount = new JLabel("");
		grid6PassengerCount.setFont(Norwester.deriveFont(13f));
		grid6PassengerCount.setBounds(247, 470, 160, 25);
		history.getContentPane().add(grid6PassengerCount);
		
		grid6DistanceTraveledLbl = new JLabel("DISTANCE TRAVELED:");
		grid6DistanceTraveledLbl.setForeground(Color.GRAY);
		grid6DistanceTraveledLbl.setFont(Norwester.deriveFont(10f));
		grid6DistanceTraveledLbl.setBounds(247, 488, 162, 20);
		grid6DistanceTraveledLbl.setVisible(false);
		history.getContentPane().add(grid6DistanceTraveledLbl);
		
		grid6DistanceTraveled = new JLabel("");
		grid6DistanceTraveled.setFont(Norwester.deriveFont(13f));
		grid6DistanceTraveled.setBounds(247, 497, 160, 25);
		history.getContentPane().add(grid6DistanceTraveled);
		
		grid6CumulativeFareLbl = new JLabel("CUMULATIVE FARE:");
		grid6CumulativeFareLbl.setForeground(Color.GRAY);
		grid6CumulativeFareLbl.setFont(Norwester.deriveFont(10f));
		grid6CumulativeFareLbl.setBounds(247, 513, 162, 20);
		grid6CumulativeFareLbl.setVisible(false);
		history.getContentPane().add(grid6CumulativeFareLbl);
		
		grid6CumulativeFare = new JLabel("");
		grid6CumulativeFare.setFont(Norwester.deriveFont(13f));
		grid6CumulativeFare.setBounds(247, 522, 160, 25);
		history.getContentPane().add(grid6CumulativeFare);
		
		// ================ || BACKGROUND || ================ \\
		
		JLabel historyBG =  new JLabel("");
		historyBG.setIcon(new ImageIcon(historyBGImg));
		historyBG.setBounds(0, 0, 462, 600);
		history.getContentPane().add(historyBG);
	}
}
