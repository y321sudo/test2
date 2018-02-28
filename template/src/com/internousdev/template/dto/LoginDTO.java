package com.internousdev.template.dto;

public class LoginDTO {

	private String loginId;
	private String loginPassword;
	private boolean loginFlg = false;
	private boolean loginMaster = false;

	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}
	public boolean getLoginMaster(){
		return loginMaster;
	}
	public void setLoginMaster(boolean loginMaster){
		this.loginMaster=loginMaster;
	}
}
