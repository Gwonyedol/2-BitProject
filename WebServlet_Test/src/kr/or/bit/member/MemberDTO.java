package kr.or.bit.member;

import java.sql.Date;

public class MemberDTO {
	private String Mid;
	private String Mpwd;
	private String etc;
	public String getMid() {
		return Mid;
	}
	public void setMid(String mid) {
		Mid = mid;
	}
	public String getMpwd() {
		return Mpwd;
	}
	public void setMpwd(String mpwd) {
		Mpwd = mpwd;
	}

	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	
	
	

}
