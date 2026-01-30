package ptManager;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class PtLogIn extends JFrame {
	private JTextField txtId;
	PtDAO dao = new PtDAO();
	private JPasswordField txtPw;
	
	public PtLogIn() {
		super("PT Master Pro_LogIn");
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 384, 461);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
//		UI 컴포넌트 배치
		JLabel lblNewLabel = new JLabel("회 원 로 그 인");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel.setBounds(72, 10, 230, 55);
		pn1.add(lblNewLabel);
		
		JButton btnHome = new JButton("홈");
		btnHome.setFont(new Font("굴림", Font.PLAIN, 18));
		btnHome.setBounds(12, 10, 50, 45);
		pn1.add(btnHome);
		
		JButton btnBack = new JButton("이전");
		btnBack.setFont(new Font("굴림", Font.PLAIN, 18));
		btnBack.setBounds(300, 10, 70, 45);
		pn1.add(btnBack);
		
		JLabel lblId = new JLabel("아이디");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("굴림", Font.PLAIN, 18));
		lblId.setBounds(30, 137, 122, 33);
		pn1.add(lblId);
		
		txtId = new JTextField();
		txtId.setFont(new Font("굴림", Font.PLAIN, 16));
		txtId.setBounds(178, 137, 116, 33);
		pn1.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblPw = new JLabel("패스워드");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("굴림", Font.PLAIN, 18));
		lblPw.setBounds(30, 197, 122, 33);
		pn1.add(lblPw);
		
		txtPw = new JPasswordField();
		txtPw.setBounds(178, 197, 116, 33);
		pn1.add(txtPw);
		
		JButton btnLogIn = new JButton("로그인");
		btnLogIn.setFont(new Font("굴림", Font.PLAIN, 18));
		btnLogIn.setBounds(132, 273, 100, 45);
		pn1.add(btnLogIn);
		
		JButton btnIdPw = new JButton("ID / PW 찾기");
		btnIdPw.setFont(new Font("굴림", Font.PLAIN, 18));
		btnIdPw.setBounds(97, 361, 170, 30);
		pn1.add(btnIdPw);
		
		JButton btnJoin = new JButton("회원가입");
		btnJoin.setFont(new Font("굴림", Font.PLAIN, 18));
		btnJoin.setBounds(97, 409, 170, 30);
		pn1.add(btnJoin);
		
		setVisible(true);
		
		txtId.requestFocus();
		
// -------------- 위는 디자인 / 아래는 실행코드 -----------------------------------------------------
		// 현재 창닫기(이전)버튼과 홈화면버튼의 기능이 같음
		
		// 버튼 : 홈1_클릭시 메인으로 돌아가기
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { dao.connClose(); } catch (Exception e1) {}
				dispose();
				new PtMain();
			}
		});
		
		// 버튼 : 홈2_포커스가 있을때 엔터키로 메인으로 돌아가기
		btnHome.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try { dao.connClose(); } catch (Exception e1) {}
					dispose();
					new PtMain();
				}
			}
		});

		// 버튼 : 이전1_클릭으로 이전페이지
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { dao.connClose(); } catch (Exception e1) {}
				dispose();
				new PtMain();
			}
		});
		
		// 버튼 : 이전2_포커스가 있을때 엔터키로 이전페이지
		btnBack.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try { dao.connClose(); } catch (Exception e1) {}
					dispose();
					new PtMain();
				}
			}
		});
		
		// 버튼 : 로그인2_로그인 버튼을 포커스가 있을때 엔터키
		btnLogIn.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					setLogIn();
				}
			}
		});
		
		// 버튼 : 로그인3_로그인 버튼을 마우스로 클릭
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLogIn();
			}
		});
		
		// 버튼 : ID / PW 찾기
		btnIdPw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String[] options = {"아이디 찾기", "패스워드 찾기", "취소"};
//				int choice = JOptionPane.showOptionDialog(null, "", "");
				dispose();
				new PtFindIdPw();
			}
		});
		
		
		
		
		// 버튼 : 회원가입1_클릭으로 들어가기 
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new PtInput();
			}
		});
		
		// 버튼 : 회원가입2_포커스가 있을때 엔터키 
		btnJoin.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					dispose();
					new PtInput();
				}
			}
		});
		
	}
	
//	 로그인 로직 구현(입력값을 DB와 매칭 확인)
	protected void setLogIn() {
		String mem_id = txtId.getText();
		String mem_pw = txtPw.getText();
		
		// 입력확인 : 미입력시_(DB 매칭전에 종료) 
		if (mem_id.trim().equals("") || mem_pw.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "아이디와 패스워드를 모두 입력하세요!");
			txtId.requestFocus();
			return;
		}
		
		// 입력확인 : 입력시_로그인 성공
		int res = (dao.loginCheck(mem_id, mem_pw));

		if (res == 1) {
			JOptionPane.showMessageDialog(this, "로그인 성공!");
			dispose();
			new PtMain();
		}
		// 입력확인 : 입력시_로그인 실패
		else { JOptionPane.showMessageDialog(this, "로그인 실패! 아이디나 패스워드를 확인하세요!");
				txtId.setText("");
				txtPw.setText("");
				txtId.requestFocus();
		}
	}

	public static void main(String[] args) {
		new PtLogIn();
	}
}
