package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HangmanFrame {

	public static JFrame frame;
	protected static JLabel answer;
	protected static JLabel pandichka;

	protected JButton start_button;
	protected JButton exit_button;

	protected static ImageIcon[] images = {
			new ImageIcon(HangmanFrame.class.getResource("/panda-1.png")),
			new ImageIcon(HangmanFrame.class.getResource("/panda-2.png")),
			new ImageIcon(HangmanFrame.class.getResource("/panda-3.png")),
			new ImageIcon(HangmanFrame.class.getResource("/panda-4.png")),
			new ImageIcon(HangmanFrame.class.getResource("/panda-5.png")),
			new ImageIcon(HangmanFrame.class.getResource("/panda-6.png")),
			new ImageIcon(HangmanFrame.class.getResource("/panda-7.png")),
			new ImageIcon(HangmanFrame.class.getResource("/panda-8.png")),
			new ImageIcon(HangmanFrame.class.getResource("/panda-9.png")),
			new ImageIcon(HangmanFrame.class.getResource("/panda-10.png"))};
	
	protected static ImageIcon partyPanda = new ImageIcon(HangmanFrame.class.getResource("/panda-happy.png"));
	//protected static ImageIcon cryPanda = new ImageIcon(HangmanFrame.class.getResource("/panda-cry.png"));

	public HangmanFrame() {
		initialize();

	}

	public void initialize() {

		// frame

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 240));
		frame.getContentPane().setLayout(null);

		frame.setBackground(new Color(255, 192, 203));
		frame.setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"D:\\Documents\\HackBulgaria\\Test\\Img\\ef282c4872e55b328a5535cdca0786eb.jpg"));
		frame.setAlwaysOnTop(true);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setBounds(new Rectangle(0, 0, 1200, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Hangman");
		frame.setLocationRelativeTo(null);

		// pandichka-images

		pandichka = new JLabel("");
		pandichka.setHorizontalAlignment(SwingConstants.CENTER);
		pandichka.doLayout();
		pandichka.setBounds(649, 137, 377, 358);
		frame.getContentPane().add(pandichka);

		// keyboard

		JButton Q = new JButton("Q");
		Q.addMouseListener(new Mouse(Q));
		Q.setEnabled(false);
		Q.setForeground(new Color(128, 0, 128));
		Q.setBackground(new Color(255, 228, 225));
		Q.setFont(new Font("Tahoma", Font.BOLD, 13));
		Q.setBounds(34, 365, 45, 34);
		frame.getContentPane().add(Q);

		JButton W = new JButton("W");
		W.addMouseListener(new Mouse(W));
		W.setEnabled(false);
		W.setForeground(new Color(128, 0, 128));
		W.setBackground(new Color(255, 228, 225));
		W.setFont(new Font("Tahoma", Font.BOLD, 13));
		W.setBounds(88, 365, 47, 34);
		frame.getContentPane().add(W);

		JButton E = new JButton("E");
		E.addMouseListener(new Mouse(E));
		E.setEnabled(false);
		E.setForeground(new Color(128, 0, 128));
		E.setBackground(new Color(255, 228, 225));
		E.setFont(new Font("Tahoma", Font.BOLD, 13));
		E.setBounds(144, 365, 45, 34);
		frame.getContentPane().add(E);

		JButton R = new JButton("R");
		R.addMouseListener(new Mouse(R));
		R.setEnabled(false);
		R.setForeground(new Color(128, 0, 128));
		R.setBackground(new Color(255, 228, 225));
		R.setFont(new Font("Tahoma", Font.BOLD, 13));
		R.setBounds(198, 365, 45, 34);
		frame.getContentPane().add(R);

		JButton T = new JButton("T");
		T.addMouseListener(new Mouse(T));
		T.setEnabled(false);
		T.setForeground(new Color(128, 0, 128));
		T.setBackground(new Color(255, 228, 225));
		T.setFont(new Font("Tahoma", Font.BOLD, 13));
		T.setBounds(254, 365, 45, 34);
		frame.getContentPane().add(T);

		JButton Y = new JButton("Y");
		Y.addMouseListener(new Mouse(Y));
		Y.setEnabled(false);
		Y.setForeground(new Color(128, 0, 128));
		Y.setBackground(new Color(255, 228, 225));
		Y.setFont(new Font("Tahoma", Font.BOLD, 13));
		Y.setBounds(310, 365, 45, 34);
		frame.getContentPane().add(Y);

		JButton U = new JButton("U");
		U.addMouseListener(new Mouse(U));
		U.setEnabled(false);
		U.setForeground(new Color(128, 0, 128));
		U.setBackground(new Color(255, 228, 225));
		U.setFont(new Font("Tahoma", Font.BOLD, 13));
		U.setBounds(366, 365, 45, 34);
		frame.getContentPane().add(U);

		JButton I = new JButton("I");
		I.addMouseListener(new Mouse(I));
		I.setEnabled(false);
		I.setForeground(new Color(128, 0, 128));
		I.setBackground(new Color(255, 228, 225));
		I.setFont(new Font("Tahoma", Font.BOLD, 13));
		I.setBounds(422, 365, 45, 34);
		frame.getContentPane().add(I);

		JButton O = new JButton("O");
		O.addMouseListener(new Mouse(O));
		O.setEnabled(false);
		O.setForeground(new Color(128, 0, 128));
		O.setBackground(new Color(255, 228, 225));
		O.setFont(new Font("Tahoma", Font.BOLD, 13));
		O.setBounds(478, 365, 45, 34);
		frame.getContentPane().add(O);

		JButton P = new JButton("P");
		P.addMouseListener(new Mouse(P));
		P.setEnabled(false);
		P.setForeground(new Color(128, 0, 128));
		P.setBackground(new Color(255, 228, 225));
		P.setFont(new Font("Tahoma", Font.BOLD, 13));
		P.setBounds(534, 365, 45, 34);
		frame.getContentPane().add(P);

		JButton A = new JButton("A");
		A.addMouseListener(new Mouse(A));
		A.setEnabled(false);
		A.setForeground(new Color(128, 0, 128));
		A.setBackground(new Color(255, 228, 225));
		A.setFont(new Font("Tahoma", Font.BOLD, 13));
		A.setBounds(66, 408, 45, 34);
		frame.getContentPane().add(A);

		JButton S = new JButton("S");
		S.addMouseListener(new Mouse(S));
		S.setEnabled(false);
		S.setForeground(new Color(128, 0, 128));
		S.setBackground(new Color(255, 228, 225));
		S.setFont(new Font("Tahoma", Font.BOLD, 13));
		S.setBounds(122, 408, 45, 34);
		frame.getContentPane().add(S);

		JButton D = new JButton("D");
		D.addMouseListener(new Mouse(D));
		D.setEnabled(false);
		D.setForeground(new Color(128, 0, 128));
		D.setBackground(new Color(255, 228, 225));
		D.setFont(new Font("Tahoma", Font.BOLD, 13));
		D.setBounds(178, 408, 45, 34);
		frame.getContentPane().add(D);

		JButton F = new JButton("F");
		F.addMouseListener(new Mouse(F));
		F.setEnabled(false);
		F.setForeground(new Color(128, 0, 128));
		F.setBackground(new Color(255, 228, 225));
		F.setFont(new Font("Tahoma", Font.BOLD, 13));
		F.setBounds(234, 408, 45, 34);
		frame.getContentPane().add(F);

		JButton G = new JButton("G");
		G.addMouseListener(new Mouse(G));
		G.setEnabled(false);
		G.setForeground(new Color(128, 0, 128));
		G.setBackground(new Color(255, 228, 225));
		G.setFont(new Font("Tahoma", Font.BOLD, 13));
		G.setBounds(290, 408, 45, 34);
		frame.getContentPane().add(G);

		JButton H = new JButton("H");
		H.addMouseListener(new Mouse(H));
		H.setEnabled(false);
		H.setForeground(new Color(128, 0, 128));
		H.setBackground(new Color(255, 228, 225));
		H.setFont(new Font("Tahoma", Font.BOLD, 13));
		H.setBounds(346, 408, 45, 34);
		frame.getContentPane().add(H);

		JButton J = new JButton("J");
		J.addMouseListener(new Mouse(J));
		J.setEnabled(false);
		J.setForeground(new Color(128, 0, 128));
		J.setBackground(new Color(255, 228, 225));
		J.setFont(new Font("Tahoma", Font.BOLD, 13));
		J.setBounds(402, 408, 45, 34);
		frame.getContentPane().add(J);

		JButton K = new JButton("K");
		K.addMouseListener(new Mouse(K));
		K.setEnabled(false);
		K.setForeground(new Color(128, 0, 128));
		K.setBackground(new Color(255, 228, 225));
		K.setFont(new Font("Tahoma", Font.BOLD, 13));
		K.setBounds(458, 408, 45, 34);
		frame.getContentPane().add(K);

		JButton L = new JButton("L");
		L.addMouseListener(new Mouse(L));
		L.setEnabled(false);
		L.setForeground(new Color(128, 0, 128));
		L.setBackground(new Color(255, 228, 225));
		L.setFont(new Font("Tahoma", Font.BOLD, 13));
		L.setBounds(514, 408, 45, 34);
		frame.getContentPane().add(L);

		JButton Z = new JButton("Z");
		Z.addMouseListener(new Mouse(Z));
		Z.setEnabled(false);
		Z.setForeground(new Color(128, 0, 128));
		Z.setBackground(new Color(255, 228, 225));
		Z.setFont(new Font("Tahoma", Font.BOLD, 13));
		Z.setBounds(88, 451, 45, 34);
		frame.getContentPane().add(Z);

		JButton X = new JButton("X");
		Z.addMouseListener(new Mouse(Z));
		X.setEnabled(false);
		X.setForeground(new Color(128, 0, 128));
		X.setBackground(new Color(255, 228, 225));
		X.setFont(new Font("Tahoma", Font.BOLD, 13));
		X.setBounds(144, 451, 45, 34);
		frame.getContentPane().add(X);

		JButton C = new JButton("C");
		C.addMouseListener(new Mouse(C));
		C.setEnabled(false);
		C.setForeground(new Color(128, 0, 128));
		C.setBackground(new Color(255, 228, 225));
		C.setFont(new Font("Tahoma", Font.BOLD, 13));
		C.setBounds(200, 451, 45, 34);
		frame.getContentPane().add(C);

		JButton V = new JButton("V");
		V.addMouseListener(new Mouse(V));
		V.setEnabled(false);
		V.setForeground(new Color(128, 0, 128));
		V.setBackground(new Color(255, 228, 225));
		V.setFont(new Font("Tahoma", Font.BOLD, 13));
		V.setBounds(256, 451, 45, 34);
		frame.getContentPane().add(V);

		JButton B = new JButton("B");
		B.addMouseListener(new Mouse(B));
		B.setEnabled(false);
		B.setForeground(new Color(128, 0, 128));
		B.setBackground(new Color(255, 228, 225));
		B.setFont(new Font("Tahoma", Font.BOLD, 13));
		B.setBounds(312, 451, 45, 34);
		frame.getContentPane().add(B);

		JButton N = new JButton("N");
		N.addMouseListener(new Mouse(N));
		N.setEnabled(false);
		N.setForeground(new Color(128, 0, 128));
		N.setBackground(new Color(255, 228, 225));
		N.setFont(new Font("Tahoma", Font.BOLD, 13));
		N.setBounds(368, 451, 45, 34);
		frame.getContentPane().add(N);

		JButton M = new JButton("M");
		M.addMouseListener(new Mouse(M));
		M.setEnabled(false);
		M.setForeground(new Color(128, 0, 128));
		M.setBackground(new Color(255, 228, 225));
		M.setFont(new Font("Tahoma", Font.BOLD, 13));
		M.setBounds(424, 451, 45, 34);
		frame.getContentPane().add(M);

		// start-button

		start_button = new JButton("START");
		start_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HangmanMethods.choiseNewWord();
		
				pandichka.setIcon(images[0]);
	
				start_button.setEnabled(false);
				Q.setEnabled(true);
				W.setEnabled(true);
				E.setEnabled(true);
				R.setEnabled(true);
				T.setEnabled(true);
				Y.setEnabled(true);
				U.setEnabled(true);
				I.setEnabled(true);
				O.setEnabled(true);
				P.setEnabled(true);
				A.setEnabled(true);
				S.setEnabled(true);
				D.setEnabled(true);
				F.setEnabled(true);
				G.setEnabled(true);
				H.setEnabled(true);
				J.setEnabled(true);
				K.setEnabled(true);
				L.setEnabled(true);
				Z.setEnabled(true);
				X.setEnabled(true);
				C.setEnabled(true);
				V.setEnabled(true);
				B.setEnabled(true);
				N.setEnabled(true);
				M.setEnabled(true);
			}
		});
		start_button.setBackground(new Color(255, 240, 245));
		start_button.setForeground(new Color(128, 0, 128));
		start_button.setFont(new Font("Tahoma", Font.BOLD, 14));
		start_button.setBounds(1002, 39, 159, 85);
		frame.getContentPane().add(start_button);

		// exit-button

		exit_button = new JButton("EXIT");
		exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit_button.setBackground(new Color(255, 240, 245));
		exit_button.setForeground(new Color(128, 0, 128));
		exit_button.setFont(new Font("Tahoma", Font.BOLD, 14));
		exit_button.setBounds(1064, 496, 97, 42);
		frame.getContentPane().add(exit_button);

		// answer-label

		answer = new JLabel("");
		answer.setForeground(new Color(75, 0, 130));
		answer.setFont(new Font("SimSun", Font.PLAIN, 30));
		answer.setBackground(new Color(255, 255, 255));
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setBounds(95, 71, 428, 85);
		frame.getContentPane().add(answer);

	}
}
