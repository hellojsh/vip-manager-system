package cn.vip.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AuUser {
    private Long id;

    private String loginCode;

    private String password;

    private String password2;

    private String userName;

    private String sex;

    @Override
    public String toString() {
        return "AuUser{" +
                "id=" + id +
                ", loginCode='" + loginCode + '\'' +
                ", password='" + password + '\'' +
                ", password2='" + password2 + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", cardType='" + cardType + '\'' +
                ", cardTypeName='" + cardTypeName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", country='" + country + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", postCode='" + postCode + '\'' +
                ", createTime=" + createTime +
                ", referId=" + referId +
                ", referCode='" + referCode + '\'' +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", userType='" + userType + '\'' +
                ", userTypeName='" + userTypeName + '\'' +
                ", isStart=" + isStart +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lastLoginTime=" + lastLoginTime +
                ", bankAccount='" + bankAccount + '\'' +
                ", bankName='" + bankName + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", idCardPicPath='" + idCardPicPath + '\'' +
                ", bankPicPath='" + bankPicPath + '\'' +
                '}';
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String cardType;

    private String cardTypeName;

    private String idCard;

    private String country;

    private String mobile;

    private String email;

    private String userAddress;

    private String postCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    private Long referId;

    private String referCode;

    private Long roleId;

    private String roleName;

    private String userType;

    private String userTypeName;

    private Integer isStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date lastUpdateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date lastLoginTime;

    private String bankAccount;

    private String bankName;

    private String accountHolder;

    private String idCardPicPath;

    private String bankPicPath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode == null ? null : loginCode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2 == null ? null : password2.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName == null ? null : cardTypeName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getReferId() {
        return referId;
    }

    public void setReferId(Long referId) {
        this.referId = referId;
    }

    public String getReferCode() {
        return referCode;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode == null ? null : referCode.trim();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName == null ? null : userTypeName.trim();
    }

    public Integer getIsStart() {
        return isStart;
    }

    public void setIsStart(Integer isStart) {
        this.isStart = isStart;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder == null ? null : accountHolder.trim();
    }

    public String getIdCardPicPath() {
        return idCardPicPath;
    }

    public void setIdCardPicPath(String idCardPicPath) {
        this.idCardPicPath = idCardPicPath == null ? null : idCardPicPath.trim();
    }

    public String getBankPicPath() {
        return bankPicPath;
    }

    public void setBankPicPath(String bankPicPath) {
        this.bankPicPath = bankPicPath == null ? null : bankPicPath.trim();
    }
}