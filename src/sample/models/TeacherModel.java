package sample.models;

public class TeacherModel {
  String name,photo,summary,userName,password,address,phoneNumber,speciality;

  public TeacherModel(){

  }
  public TeacherModel(String name, String photo, String summary, String userName, String password, String address, String phoneNumber, String speciality) {
    this.name = name;
    this.photo = photo;
    this.summary = summary;
    this.userName = userName;
    this.password = password;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.speciality = speciality;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }
}
