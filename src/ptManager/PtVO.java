package ptManager;

public class PtVO {

	private int idx;
	private String id;
	private String name;
	private String phone;
	private int age;
	private String gender;
	private String photo;
	private int regDate;
	private int ptCount;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getRegDate() {
		return regDate;
	}
	public void setRegDate(int regDate) {
		this.regDate = regDate;
	}
	public int getPtCount() {
		return ptCount;
	}
	public void setPtCount(int ptCount) {
		this.ptCount = ptCount;
	}
	@Override
	public String toString() {
		return "PtVO [idx=" + idx + ", id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + ", gender="
				+ gender + ", photo=" + photo + ", regDate=" + regDate + ", ptCount=" + ptCount + "]";
	}
		
}
