package ptManager;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings({ "serial", "unused" })
public class PtMain2 extends JFrame {
	
	PtDAO dao = new PtDAO();
	PtVO vo = null;
	
	public PtMain2() {
		super("회원관리 메인화면");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 10, 784, 475);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원관리 프로그램(v1.0)");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 760, 54);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 476, 784, 74);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JButton btnInput = new JButton("회원등록");
		btnInput.setBounds(12, 10, 126, 54);
		pn2.add(btnInput);
		btnInput.setFont(new Font("굴림", Font.PLAIN, 18));
		
		JButton btnSearch = new JButton("개별조회");
		btnSearch.setBounds(137, 10, 126, 54);
		pn2.add(btnSearch);
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 18));
		
		JButton btnList = new JButton("전체조회");
		btnList.setBounds(261, 10, 126, 54);
		pn2.add(btnList);
		btnList.setFont(new Font("굴림", Font.PLAIN, 18));
		
		JButton btnExit = new JButton("작업종료");
		btnExit.setBounds(646, 10, 126, 54);
		pn2.add(btnExit);
		btnExit.setFont(new Font("굴림", Font.PLAIN, 18));
		
		// -------------------------------------------------------------------
		
		// 회원가입처리버튼
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { dao.connClose(); } catch (SQLException e1) {}
				dispose();
				new PtLogIn();
			}
		});
		
		setVisible(true);
		
//		// 개별조회
//		btnSearch.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String name = JOptionPane.showInputDialog("검색할 성명을 입력하세요");
//				vo = dao.getNameSearch(name);
//				
//				if(vo.getName() == null) JOptionPane.showMessageDialog(null, "검색한 회원이 없습니다.");
//				else {
//					try { dao.connClose(); } catch (SQLException e1) {}
//					dispose();
//					new PtSearch(vo);
//				}
//				//dao.connClose();
//			}
//		});
//		
//		// 전체조회
//		btnList.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//				new PtList();
//			}
//		});
//		
//		// 작업종료(버튼 클릭시 종료)
//		btnExit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try { dao.connClose(); } catch (SQLException e1) {}
//				System.exit(0);
//			}
//		});
//		
//		// 작업종료(엔터키로 종료처리)
//		btnExit.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//					try { dao.connClose(); } catch (SQLException e1) {}
//					System.exit(0);
//				}
//			}
//		});
	}
	
	public static void main(String[] args) {
		new PtMain2();
	}
}
