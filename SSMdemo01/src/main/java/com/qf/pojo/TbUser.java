package com.qf.pojo;


public class TbUser {

  private Long id;
  private String username;
  private String password;
  private String email;
  private String gender;
  private Long flag;
  private Long role;
  private String code;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public Long getFlag() {
    return flag;
  }

  public void setFlag(Long flag) {
    this.flag = flag;
  }


  public Long getRole() {
    return role;
  }

  public void setRole(Long role) {
    this.role = role;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TbUser(Long id, String username, String password, String email, String gender, Long flag, Long role, String code) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.gender = gender;
    this.flag = flag;
    this.role = role;
    this.code = code;
  }

  public TbUser() {
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", email='" + email + '\'' +
            ", gender='" + gender + '\'' +
            ", flag=" + flag +
            ", role=" + role +
            ", code='" + code + '\'' +
            '}';
  }
}
