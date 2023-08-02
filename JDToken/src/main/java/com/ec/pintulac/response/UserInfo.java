package com.ec.pintulac.response;

public class UserInfo {
	private String token;
    private String langPref;
    private String locale;
    private String dateFormat;
    private String dateSeperator;
    private String simpleDateFormat;
    private String timeFormat;
    private String decimalFormat;
    private int addressNumber;
    private String alphaName;
    private String appsRelease;
    private String country;
    private String username;
    private String longUserId;
    private String timeZoneOffset;
    private String dstRuleKey;
    private DstRule dstRule;
    
	public UserInfo() {
		super();
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getLangPref() {
		return langPref;
	}
	public void setLangPref(String langPref) {
		this.langPref = langPref;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public String getDateSeperator() {
		return dateSeperator;
	}
	public void setDateSeperator(String dateSeperator) {
		this.dateSeperator = dateSeperator;
	}
	public String getSimpleDateFormat() {
		return simpleDateFormat;
	}
	public void setSimpleDateFormat(String simpleDateFormat) {
		this.simpleDateFormat = simpleDateFormat;
	}
	public String getTimeFormat() {
		return timeFormat;
	}
	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}
	public String getDecimalFormat() {
		return decimalFormat;
	}
	public void setDecimalFormat(String decimalFormat) {
		this.decimalFormat = decimalFormat;
	}
	public int getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getAlphaName() {
		return alphaName;
	}
	public void setAlphaName(String alphaName) {
		this.alphaName = alphaName;
	}
	public String getAppsRelease() {
		return appsRelease;
	}
	public void setAppsRelease(String appsRelease) {
		this.appsRelease = appsRelease;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLongUserId() {
		return longUserId;
	}
	public void setLongUserId(String longUserId) {
		this.longUserId = longUserId;
	}
	public String getTimeZoneOffset() {
		return timeZoneOffset;
	}
	public void setTimeZoneOffset(String timeZoneOffset) {
		this.timeZoneOffset = timeZoneOffset;
	}
	public String getDstRuleKey() {
		return dstRuleKey;
	}
	public void setDstRuleKey(String dstRuleKey) {
		this.dstRuleKey = dstRuleKey;
	}
	public DstRule getDstRule() {
		return dstRule;
	}
	public void setDstRule(DstRule dstRule) {
		this.dstRule = dstRule;
	}
    
    
}
