package ptManager;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PtFindIdPw extends JFrame {
    private JTextField txtName, txtTel, txtIdForPw, txtTelForPw;
    private PtDAO dao = new PtDAO();

    public PtFindIdPw() {
        super("ID/PW 찾기");
        setSize(400, 500);
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setLocationRelativeTo(null);
    		setResizable(false);
    		getContentPane().setLayout(null);

        JLabel lblTitle = new JLabel("ID / PW 찾기");
        lblTitle.setFont(new Font("굴림", Font.BOLD, 22));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setBounds(100, 20, 200, 30);
        getContentPane().add(lblTitle);

        // --- 아이디 찾기 영역 ---
        JSeparator sep = new JSeparator();
        sep.setBounds(20, 60, 340, 2);
        getContentPane().add(sep);

        JLabel lblFindId = new JLabel("● 아이디 찾기 (이름/전화번호)");
        lblFindId.setBounds(20, 70, 250, 20);
        getContentPane().add(lblFindId);

        txtName = new JTextField();
        txtName.setBounds(30, 100, 100, 30);
        getContentPane().add(txtName);

        txtTel = new JTextField();
        txtTel.setBounds(140, 100, 120, 30);
        getContentPane().add(txtTel);

        JButton btnFindId = new JButton("찾기");
        btnFindId.setBounds(270, 100, 80, 30);
        getContentPane().add(btnFindId);

        // --- 비밀번호 찾기 영역 ---
        JLabel lblFindPw = new JLabel("● 비밀번호 찾기 (아이디/전화번호)");
        lblFindPw.setBounds(20, 160, 250, 20);
        getContentPane().add(lblFindPw);

        txtIdForPw = new JTextField();
        txtIdForPw.setBounds(30, 190, 100, 30);
        getContentPane().add(txtIdForPw);

        txtTelForPw = new JTextField();
        txtTelForPw.setBounds(140, 190, 120, 30);
        getContentPane().add(txtTelForPw);

        JButton btnFindPw = new JButton("찾기");
        btnFindPw.setBounds(270, 190, 80, 30);
        getContentPane().add(btnFindPw);

        JButton btnClose = new JButton("닫기");
        btnClose.setBounds(150, 350, 100, 40);
        getContentPane().add(btnClose);

        setVisible(true);

// -------------- 위는 디자인 / 아래는 실행코드 -----------------------------------------------------
        
        

        // 버튼 : 아이디 찾기
        btnFindId.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        	}
        });








//package ptManager;
//
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import java.awt.Font;
//import javax.swing.JLabel;
//import javax.swing.SwingConstants;
//
//@SuppressWarnings("serial")
//public class PtFindIdPw extends JFrame{
//	
//	public PtFindIdPw() {
//		super("PT Master Pro_FindIdPw");
//		setSize(400, 500);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
//		setResizable(false);
//		getContentPane().setLayout(null);
//		
//		JButton btnHome = new JButton("홈");
//		btnHome.setFont(new Font("굴림", Font.PLAIN, 18));
//		btnHome.setBounds(12, 10, 50, 45);
//		getContentPane().add(btnHome);
//		
//		JLabel lblNewLabel = new JLabel("ID / PW 찾기");
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 26));
//		lblNewLabel.setBounds(72, 10, 230, 55);
//		getContentPane().add(lblNewLabel);
//		
//		JButton btnBack = new JButton("이전");
//		btnBack.setFont(new Font("굴림", Font.PLAIN, 18));
//		btnBack.setBounds(300, 10, 70, 45);
//		getContentPane().add(btnBack);
//		
//		JButton btnJoin = new JButton("회원가입");
//		btnJoin.setFont(new Font("굴림", Font.PLAIN, 18));
//		btnJoin.setBounds(12, 204, 170, 30);
//		getContentPane().add(btnJoin);
//		
//		JLabel lblNewLabel_1 = new JLabel("▷ 회원 아이디를 입력하세요.");
//		lblNewLabel_1.setBounds(72, 97, 170, 23);
//		getContentPane().add(lblNewLabel_1);
//		
//		
//		
//		setVisible(true);
//		
//	// -------------- 위는 디자인 / 아래는 실행코드 -----------------------------------------------------
//
//		
//		
//		
//		
//	}
	
		
    }
	
	public static void main(String[] args) {
		new PtFindIdPw();
	}
}
