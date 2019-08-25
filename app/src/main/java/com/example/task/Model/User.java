package com.example.task.Model;

import com.google.gson.annotations.SerializedName;


public class User{

	@SerializedName("upload_id")
	private Object uploadId;

	@SerializedName("role")
	private Object role;

	@SerializedName("city")
	private City city;

	@SerializedName("user_lastname")
	private String userLastname;

	@SerializedName("price_id")
	private Object priceId;

	@SerializedName("user_lat")
	private String userLat;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("user_lng")
	private String userLng;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("role_id")
	private String roleId;

	@SerializedName("user_mobile")
	private String userMobile;

	@SerializedName("lang")
	private String lang;

	@SerializedName("my_followers")
	private String myFollowers;

	@SerializedName("user_email")
	private String userEmail;

	@SerializedName("is_accepted")
	private String isAccepted;

	@SerializedName("is_active")
	private String isActive;

	@SerializedName("recover")
	private Object recover;

	@SerializedName("user_firstname")
	private String userFirstname;

	@SerializedName("extra_mobile")
	private Object extraMobile;

	@SerializedName("is_confirmed")
	private String isConfirmed;

	@SerializedName("sub_proff")
	private Object subProff;

	@SerializedName("email_verified_at")
	private Object emailVerifiedAt;

	@SerializedName("user_img")
	private String userImg;

	@SerializedName("is_verified")
	private String isVerified;

	@SerializedName("user_rate")
	private String userRate;

	@SerializedName("user_header")
	private Object userHeader;

	@SerializedName("proff")
	private Object proff;

	@SerializedName("user_credit")
	private String userCredit;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("user_bio")
	private Object userBio;

	@SerializedName("confirm_code")
	private Object confirmCode;

	@SerializedName("following")
	private String following;

	@SerializedName("user_rate_count")
	private String userRateCount;

	@SerializedName("city_id")
	private String cityId;

	public void setUploadId(Object uploadId){
		this.uploadId = uploadId;
	}

	public Object getUploadId(){
		return uploadId;
	}

	public void setRole(Object role){
		this.role = role;
	}

	public Object getRole(){
		return role;
	}

	public void setCity(City city){
		this.city = city;
	}

	public City getCity(){
		return city;
	}

	public void setUserLastname(String userLastname){
		this.userLastname = userLastname;
	}

	public String getUserLastname(){
		return userLastname;
	}

	public void setPriceId(Object priceId){
		this.priceId = priceId;
	}

	public Object getPriceId(){
		return priceId;
	}

	public void setUserLat(String userLat){
		this.userLat = userLat;
	}

	public String getUserLat(){
		return userLat;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setUserLng(String userLng){
		this.userLng = userLng;
	}

	public String getUserLng(){
		return userLng;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setRoleId(String roleId){
		this.roleId = roleId;
	}

	public String getRoleId(){
		return roleId;
	}

	public void setUserMobile(String userMobile){
		this.userMobile = userMobile;
	}

	public String getUserMobile(){
		return userMobile;
	}

	public void setLang(String lang){
		this.lang = lang;
	}

	public String getLang(){
		return lang;
	}

	public void setMyFollowers(String myFollowers){
		this.myFollowers = myFollowers;
	}

	public String getMyFollowers(){
		return myFollowers;
	}

	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}

	public String getUserEmail(){
		return userEmail;
	}

	public void setIsAccepted(String isAccepted){
		this.isAccepted = isAccepted;
	}

	public String getIsAccepted(){
		return isAccepted;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setRecover(Object recover){
		this.recover = recover;
	}

	public Object getRecover(){
		return recover;
	}

	public void setUserFirstname(String userFirstname){
		this.userFirstname = userFirstname;
	}

	public String getUserFirstname(){
		return userFirstname;
	}

	public void setExtraMobile(Object extraMobile){
		this.extraMobile = extraMobile;
	}

	public Object getExtraMobile(){
		return extraMobile;
	}

	public void setIsConfirmed(String isConfirmed){
		this.isConfirmed = isConfirmed;
	}

	public String getIsConfirmed(){
		return isConfirmed;
	}

	public void setSubProff(Object subProff){
		this.subProff = subProff;
	}

	public Object getSubProff(){
		return subProff;
	}

	public void setEmailVerifiedAt(Object emailVerifiedAt){
		this.emailVerifiedAt = emailVerifiedAt;
	}

	public Object getEmailVerifiedAt(){
		return emailVerifiedAt;
	}

	public void setUserImg(String userImg){
		this.userImg = userImg;
	}

	public String getUserImg(){
		return userImg;
	}

	public void setIsVerified(String isVerified){
		this.isVerified = isVerified;
	}

	public String getIsVerified(){
		return isVerified;
	}

	public void setUserRate(String userRate){
		this.userRate = userRate;
	}

	public String getUserRate(){
		return userRate;
	}

	public void setUserHeader(Object userHeader){
		this.userHeader = userHeader;
	}

	public Object getUserHeader(){
		return userHeader;
	}

	public void setProff(Object proff){
		this.proff = proff;
	}

	public Object getProff(){
		return proff;
	}

	public void setUserCredit(String userCredit){
		this.userCredit = userCredit;
	}

	public String getUserCredit(){
		return userCredit;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setUserBio(Object userBio){
		this.userBio = userBio;
	}

	public Object getUserBio(){
		return userBio;
	}

	public void setConfirmCode(Object confirmCode){
		this.confirmCode = confirmCode;
	}

	public Object getConfirmCode(){
		return confirmCode;
	}

	public void setFollowing(String following){
		this.following = following;
	}

	public String getFollowing(){
		return following;
	}

	public void setUserRateCount(String userRateCount){
		this.userRateCount = userRateCount;
	}

	public String getUserRateCount(){
		return userRateCount;
	}

	public void setCityId(String cityId){
		this.cityId = cityId;
	}

	public String getCityId(){
		return cityId;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"upload_id = '" + uploadId + '\'' + 
			",role = '" + role + '\'' + 
			",city = '" + city + '\'' + 
			",user_lastname = '" + userLastname + '\'' + 
			",price_id = '" + priceId + '\'' + 
			",user_lat = '" + userLat + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",user_lng = '" + userLng + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",role_id = '" + roleId + '\'' + 
			",user_mobile = '" + userMobile + '\'' + 
			",lang = '" + lang + '\'' + 
			",my_followers = '" + myFollowers + '\'' + 
			",user_email = '" + userEmail + '\'' + 
			",is_accepted = '" + isAccepted + '\'' + 
			",is_active = '" + isActive + '\'' + 
			",recover = '" + recover + '\'' + 
			",user_firstname = '" + userFirstname + '\'' + 
			",extra_mobile = '" + extraMobile + '\'' + 
			",is_confirmed = '" + isConfirmed + '\'' + 
			",sub_proff = '" + subProff + '\'' + 
			",email_verified_at = '" + emailVerifiedAt + '\'' + 
			",user_img = '" + userImg + '\'' + 
			",is_verified = '" + isVerified + '\'' + 
			",user_rate = '" + userRate + '\'' + 
			",user_header = '" + userHeader + '\'' + 
			",proff = '" + proff + '\'' + 
			",user_credit = '" + userCredit + '\'' + 
			",user_id = '" + userId + '\'' + 
			",user_bio = '" + userBio + '\'' + 
			",confirm_code = '" + confirmCode + '\'' + 
			",following = '" + following + '\'' + 
			",user_rate_count = '" + userRateCount + '\'' + 
			",city_id = '" + cityId + '\'' + 
			"}";
		}
}