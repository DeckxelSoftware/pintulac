package com.ec.pintulac.response;

public class TokenResponse {
	private String username;
	private String environment;
	private String role;
	private String jasserver;
	private UserInfo userInfo;
	private boolean userAuthorized;
	private String aisSessionCookie;
	private boolean adminAuthorized;
	private boolean passwordAboutToExpire;
	private String envColor;
	private String machineName;
	private String externalJASURL;
	
	
	
	public TokenResponse() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getJasserver() {
		return jasserver;
	}
	public void setJasserver(String jasserver) {
		this.jasserver = jasserver;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public boolean isUserAuthorized() {
		return userAuthorized;
	}
	public void setUserAuthorized(boolean userAuthorized) {
		this.userAuthorized = userAuthorized;
	}
	public String getAisSessionCookie() {
		return aisSessionCookie;
	}
	public void setAisSessionCookie(String aisSessionCookie) {
		this.aisSessionCookie = aisSessionCookie;
	}
	public boolean isAdminAuthorized() {
		return adminAuthorized;
	}
	public void setAdminAuthorized(boolean adminAuthorized) {
		this.adminAuthorized = adminAuthorized;
	}
	public boolean isPasswordAboutToExpire() {
		return passwordAboutToExpire;
	}
	public void setPasswordAboutToExpire(boolean passwordAboutToExpire) {
		this.passwordAboutToExpire = passwordAboutToExpire;
	}
	public String getEnvColor() {
		return envColor;
	}
	public void setEnvColor(String envColor) {
		this.envColor = envColor;
	}
	public String getMachineName() {
		return machineName;
	}
	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}
	public String getExternalJASURL() {
		return externalJASURL;
	}
	public void setExternalJASURL(String externalJASURL) {
		this.externalJASURL = externalJASURL;
	}

	
}



