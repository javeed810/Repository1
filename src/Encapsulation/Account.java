package Encapsulation;

public class Account {
	private long Acc_no;
	private String name, email;
	private float amount;
	
	public void setAcc_no(long Acc_no) {
		this.Acc_no=Acc_no;
	}
	public long getAcc_no() {
		return Acc_no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setAmoutn(float amount) {
		this.amount=amount;
	}
	public float getAmount() {
		return amount;
	}

}
