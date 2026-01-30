package ptManager;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings({ "serial", "unused" })
public class PtMain extends JFrame {
	
	PtDAO dao = new PtDAO();
	PtVO vo = null;
	
	public PtMain() {
		super("메인화면");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 64);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PT Master Pro");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(117, 5, 550, 55);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setLayout(null);
		pn2.setBounds(0, 64, 784, 424);
		getContentPane().add(pn2);
		
		JPanel pn3 = new JPanel();
		pn3.setLayout(null);
		pn3.setBounds(0, 490, 784, 70);
		getContentPane().add(pn3);
		
		JButton btnLogIn = new JButton("로그인");
		btnLogIn.setFont(new Font("굴림", Font.PLAIN, 18));
		btnLogIn.setBounds(22, 15, 100, 45);
		pn3.add(btnLogIn);
		
		JButton btnJoin = new JButton("회원가입");
		btnJoin.setFont(new Font("굴림", Font.PLAIN, 18));
		btnJoin.setBounds(134, 15, 126, 45);
		pn3.add(btnJoin);
		
		JButton btnList = new JButton("회원목록");
		btnList.setFont(new Font("굴림", Font.PLAIN, 18));
		btnList.setBounds(272, 15, 126, 45);
		pn3.add(btnList);
		
		JButton btnExit = new JButton("종료");

		btnExit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnExit.setBounds(672, 15, 100, 45);
		pn3.add(btnExit);
		
		JButton btnEdu = new JButton("수업일지");
		btnEdu.setFont(new Font("굴림", Font.PLAIN, 18));
		btnEdu.setBounds(410, 15, 126, 45);
		pn3.add(btnEdu);
		
		setVisible(true);

		// -------------------------------------------------------------------
		
		// 버튼 : 로그인
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { dao.connClose(); } catch (Exception e1) {}
				dispose();
				new PtLogIn();
			}
		});
		
		// 버튼 : 회원가입
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { dao.connClose(); } catch (Exception e1) {}
				dispose();
				new PtJoin();
			}
		});
		
		// 버튼 : 회원목록
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// 버튼 : 수업 기록
		btnEdu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// 버튼 : 종료(클릭으로 종료처리)
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { dao.connClose(); } catch (Exception e1) {}
				System.exit(0);
			}
		});
		
		// 버튼 : 종료(엔터키로 종료처리)
		btnExit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try { dao.connClose(); } catch (Exception e1) {}
					System.exit(0);
				}
			}
		});		
		
	}
	
	public static void main(String[] args) {
		new PtMain();
	}
}
