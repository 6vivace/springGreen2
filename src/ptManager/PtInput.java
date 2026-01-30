package ptManager;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

@SuppressWarnings({"serial", "unused"})
public class PtInput extends JFrame{
	private JTextField txtId, txtPw;
	private PtDAO dao = new PtDAO();
	private boolean isIdChecked = false;
	
	public PtInput() {
		super("PT Master Pro_Join");
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel.setBounds(72, 10, 230, 55);
		getContentPane().add(lblNewLabel);
		
		JButton btnHome = new JButton("홈");
		btnHome.setFont(new Font("굴림", Font.PLAIN, 18));
		btnHome.setBounds(12, 10, 50, 45);
		getContentPane().add(btnHome);
		
		JButton btnBack = new JButton("이전");
		btnBack.setFont(new Font("굴림", Font.PLAIN, 18));
		btnBack.setBounds(300, 10, 70, 45);
		getContentPane().add(btnBack);
		
		JLabel lblId = new JLabel("아이디");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("굴림", Font.PLAIN, 18));
		lblId.setBounds(12, 121, 116, 33);
		getContentPane().add(lblId);
		
		JLabel lblPw = new JLabel("패스워드");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("굴림", Font.PLAIN, 18));
		lblPw.setBounds(12, 173, 122, 33);
		getContentPane().add(lblPw);
		
		txtId = new JTextField();
		txtId.setFont(new Font("굴림", Font.PLAIN, 16));
		txtId.setColumns(10);
		txtId.setBounds(138, 121, 116, 33);
		getContentPane().add(txtId);
		
		txtPw = new JTextField();
		txtPw.setFont(new Font("굴림", Font.PLAIN, 16));
		txtPw.setColumns(10);
		txtPw.setBounds(138, 173, 116, 33);
		getContentPane().add(txtPw);
		
		JButton btnCheck = new JButton("중복확인");
		btnCheck.setFont(new Font("굴림", Font.PLAIN, 13));
		btnCheck.setBounds(266, 123, 85, 30);
		getContentPane().add(btnCheck);
	
		setVisible(true);
		
		txtId.requestFocus();
		
	// -------------- 위는 디자인 / 아래는 실행코드 -----------------------------------------------------
	
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
				new PtLogIn();
			}
		});
		
		// 버튼 : 이전2_포커스가 있을때 엔터키로 이전페이지
		btnBack.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try { dao.connClose(); } catch (Exception e1) {}
					dispose();
					new PtLogIn();
				}
			}
		});	
			
		// 버튼 : 중복확인
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkIdLogic();
			}
		});
	}	
		
// 로직부
		protected void checkIdLogic() {
			String id = txtId.getText().trim();
			
			if(id.equals("")) {
					JOptionPane.showMessageDialog(this, "아이디를 입력하세요!");
					txtId.requestFocus();
					return;
				}
			
			int res = (dao.idCheck(id));
			
			// 
			if (res == 1) {		// 아이디 중복아님.
				JOptionPane.showMessageDialog(this, "사용 가능한 아이디입니다.");
				txtPw.requestFocus();
				isIdChecked = true;
				
			}
			else {		//아이디 중복
				JOptionPane.showMessageDialog(this, "이미 사용중인 아이디입니다.");
				txtId.setText("");
				txtId.requestFocus();
				isIdChecked = false;
			}
		}
	
	public static void main(String[] args) {
		new PtInput();
	}
}
