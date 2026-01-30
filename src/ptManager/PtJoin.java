package ptManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

@SuppressWarnings({"serial", "rawtypes", "unused"})
public class PtJoin extends JFrame {
	private JTextField txtId, txtPw, txtName, txtAge, txtPhone;
	private JComboBox comboYear, comboMonth, comboDay;
	private PtDAO dao = new PtDAO();
	private boolean isIdChecked = false;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	public PtJoin() {
		super("회원관리 입력화면");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 70);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel.setBounds(164, 10, 408, 50);
		pn1.add(lblNewLabel);
		
		JButton btnBack = new JButton("이전");
		btnBack.setFont(new Font("굴림", Font.PLAIN, 18));
		btnBack.setBounds(702, 10, 70, 45);
		pn1.add(btnBack);
		
		JButton btnHome = new JButton("홈");
		btnHome.setFont(new Font("굴림", Font.PLAIN, 18));
		btnHome.setBounds(12, 10, 50, 45);
		pn1.add(btnHome);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 80, 784, 409);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblName = new JLabel("성      명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.PLAIN, 18));
		lblName.setBounds(87, 24, 125, 30);
		pn2.add(lblName);
		
		JLabel lblAge = new JLabel("나      이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림", Font.PLAIN, 18));
		lblAge.setBounds(87, 74, 125, 30);
		pn2.add(lblAge);
		
		JLabel lblGender = new JLabel("성      별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("굴림", Font.PLAIN, 18));
		lblGender.setBounds(87, 129, 125, 30);
		pn2.add(lblGender);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("굴림", Font.PLAIN, 18));
		lblPhone.setBounds(87, 198, 125, 30);
		pn2.add(lblPhone);
		
		txtName = new JTextField();
		txtName.setBounds(265, 24, 174, 30);
		pn2.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(265, 74, 174, 30);
		pn2.add(txtAge);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(265, 200, 174, 30);
		pn2.add(txtPhone);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("가 입 일");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_3_1.setBounds(87, 261, 125, 30);
		pn2.add(lblNewLabel_1_3_1);
		
		JRadioButton rdGenderMale = new JRadioButton("남  자");
		buttonGroup.add(rdGenderMale);
		rdGenderMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdGenderMale.setBounds(265, 136, 83, 23);
		pn2.add(rdGenderMale);
		
		JRadioButton rdGenderFeMale = new JRadioButton("여  자");
		buttonGroup.add(rdGenderFeMale);
		rdGenderFeMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdGenderFeMale.setBounds(372, 136, 83, 23);
		pn2.add(rdGenderFeMale);
		
		comboYear = new JComboBox();
		comboYear.setFont(new Font("굴림", Font.PLAIN, 16));
		comboYear.setBounds(265, 261, 101, 37);
		pn2.add(comboYear);
		
		JLabel lblNewLabel_2 = new JLabel("년");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(368, 261, 29, 37);
		pn2.add(lblNewLabel_2);
		
		comboMonth = new JComboBox();
		comboMonth.setFont(new Font("굴림", Font.PLAIN, 16));
		comboMonth.setBounds(402, 261, 59, 37);
		pn2.add(comboMonth);
		
		comboDay = new JComboBox();
		comboDay.setFont(new Font("굴림", Font.PLAIN, 16));
		comboDay.setBounds(505, 261, 59, 37);
		pn2.add(comboDay);
		
		JLabel lblNewLabel_2_1 = new JLabel("월");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(463, 261, 29, 37);
		pn2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("일");
		lblNewLabel_2_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(566, 261, 29, 37);
		pn2.add(lblNewLabel_2_2);
		
		JLabel lblAim = new JLabel("운동목적");
		lblAim.setHorizontalAlignment(SwingConstants.CENTER);
		lblAim.setFont(new Font("굴림", Font.PLAIN, 18));
		lblAim.setBounds(87, 318, 125, 30);
		pn2.add(lblAim);
		
		JLabel lblAimDesc = new JLabel("◁ 목적을 선택하면 상세 내용이 표시됩니다.");
		lblAimDesc.setBounds(451, 319, 321, 30);
		pn2.add(lblAimDesc);
		
		JComboBox comboAim = new JComboBox();
		comboAim.setFont(new Font("굴림", Font.PLAIN, 14));
		comboAim.setModel(new DefaultComboBoxModel(new String[] {"선택하세요.", "체격 및 외형 개선", "건강 및 기능 회복", "특수 목적"}));
		comboAim.setBounds(265, 323, 158, 30);
		pn2.add(comboAim);
		
		JButton btnCheck = new JButton("중복확인");
		btnCheck.setFont(new Font("굴림", Font.PLAIN, 13));
		btnCheck.setBounds(482, 24, 85, 30);
		pn2.add(btnCheck);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 497, 784, 70);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnJoin = new JButton("가입하기");
		btnJoin.setFont(new Font("굴림", Font.PLAIN, 18));
		btnJoin.setBounds(221, 10, 110, 45);
		pn3.add(btnJoin);
		
		JButton btnCancle = new JButton("취소");
		btnCancle.setFont(new Font("굴림", Font.PLAIN, 18));
		btnCancle.setBounds(392, 10, 110, 45);
		pn3.add(btnCancle);
		
		
		
		
		setVisible(true);
		
		// -------------------------------------------------------------------

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
		
		// 드롭박스 : 선택시 상세 설명
		comboAim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = comboAim.getSelectedItem().toString();
				if(selected.equals("체격 및 외형 개선")) {
					lblAimDesc.setText("<html><font face = '굴림' size='14' color='blue'>다이어트, 근육 증가, 바디프로필 준비");
				} else if(selected.equals("건강 및 기능 회복")) {
					lblAimDesc.setText("거북목/라운드숄더 교정, 통증 완화, 재활");
				} else if(selected.equals("특수 목적")) {
					lblAimDesc.setText("웨딩 케어, 산전/산후, 입시 및 체력 시험");
				} else {lblAimDesc.setText("◁ 목적을 선택하면 상세 내용이 표시됩니다.");
				}
			}
		});
		
		// 버튼 : 가입_클릭시 로그인 창으로 돌아가기
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { dao.connClose(); } catch (Exception e1) {}
				dispose();
				new PtLogIn();
			}
		});
		
		// 버튼 : 가입_포커스가 있을때 엔터키로 로그인 창으로 돌아가기
		btnJoin.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try { dao.connClose(); } catch (Exception e1) {}
					dispose();
					new PtLogIn();
				}
			}
		});
	
		// 버튼 : 취소_클릭시 로그인 창으로 돌아가기
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { dao.connClose(); } catch (Exception e1) {}
				dispose();
				new PtLogIn();
			}
		});
		
		// 버튼 : 취소_포커스가 있을때 엔터키로 로그인 창으로 돌아가기
		btnCancle.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try { dao.connClose(); } catch (Exception e1) {}
					dispose();
					new PtLogIn();
				}
			}
		});

	

// 드롭다운 클릭시 하부에 설명
//1. 체격 및 외형 개선 (Body Transformation)
//	다이어트, 근력/근비대, 바디프로필, 대회 준비
//	"다이어트, 근육 증가, 바디프로필 준비"
//
//2. 건강 및 기능 회복 (Health & Rehab)
//	통증 관리, 체형 교정, 재활 운동, 기초 체력
//	"거북목/라운드숄더 교정, 통증 완화, 재활"
//
//3. 특수 목적 (Special Events)
//	웨딩 케어, 산전/산후, 입시/취업, 시니어 운동
//	"웨딩 케어, 산전/산후, 입시 및 체력 시험"


// 체크박스
//	관심 분야: [ ] 식단 관리 [ ] 개인 운동 [ ] 바디프로필 [ ] 스트레칭
//	주의 사항 (병력): [ ] 고혈압 [ ] 허리디스크 [ ] 무릎통증 [ ] 당뇨
//	개인정보 동의: [V] 개인정보 수집 및 마케팅 활용 동의

		
		
		
		// 버튼 : 중복확인
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkIdLogic();
			}
		});
		
		
	// 로직부
	
	
	}
	
	
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
		new PtJoin();
	}
}
