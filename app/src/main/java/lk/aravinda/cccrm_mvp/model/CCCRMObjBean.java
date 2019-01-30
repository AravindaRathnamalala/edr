package lk.aravinda.cccrm_mvp.model;

import android.os.Parcel;

/**
 * Created by aravinda_r on 9/20/2018.
 */

public class CCCRMObjBean {

    private String areaofficecode;
    private String employeecategorydesc;
    private String  areaofficedesc;
    private String  userrolecode;
    private String  employeeid;
    private String  employeecategorycode;
    private String  userroledesc;
    private String  employeedesignationcode;
    private String  userstatusdesc;
    private String  userstatuscode;
    private String  employeedesignationdesc;
    private String  employeename;
    private String  username;

    public CCCRMObjBean(Parcel in) {
        areaofficecode = in.readString();
        employeecategorydesc = in.readString();
        areaofficedesc = in.readString();
        userrolecode = in.readString();
        employeeid = in.readString();
        employeecategorycode = in.readString();
        userroledesc = in.readString();
        employeedesignationcode = in.readString();
        userstatusdesc = in.readString();
        userstatuscode = in.readString();
        employeedesignationdesc = in.readString();
        employeename = in.readString();
        username = in.readString();
    }

    public String getAreaofficecode(){
        return areaofficecode;
    }

    public void setAreaofficecode(String areaofficecode) {
        this.areaofficecode = areaofficecode;
    }

    public String getEmployeecategorydesc() {
        return employeecategorydesc;
    }

    public void setEmployeecategorydesc(String employeecategorydesc) {
        this.employeecategorydesc = employeecategorydesc;
    }

    public String getAreaofficedesc() {
        return areaofficedesc;
    }

    public void setAreaofficedesc(String areaofficedesc) {
        this.areaofficedesc = areaofficedesc;
    }

    public String getUserrolecode() {
        return userrolecode;
    }

    public void setUserrolecode(String userrolecode) {
        this.userrolecode = userrolecode;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeecategorycode() {
        return employeecategorycode;
    }

    public void setEmployeecategorycode(String employeecategorycode) {
        this.employeecategorycode = employeecategorycode;
    }

    public String getUserroledesc() {
        return userroledesc;
    }

    public void setUserroledesc(String userroledesc) {
        this.userroledesc = userroledesc;
    }

    public String getEmployeedesignationcode() {
        return employeedesignationcode;
    }

    public void setEmployeedesignationcode(String employeedesignationcode) {
        this.employeedesignationcode = employeedesignationcode;
    }

    public String getUserstatusdesc() {
        return userstatusdesc;
    }

    public void setUserstatusdesc(String userstatusdesc) {
        this.userstatusdesc = userstatusdesc;
    }

    public String getUserstatuscode() {
        return userstatuscode;
    }

    public void setUserstatuscode(String userstatuscode) {
        this.userstatuscode = userstatuscode;
    }

    public String getEmployeedesignationdesc() {
        return employeedesignationdesc;
    }

    public void setEmployeedesignationdesc(String employeedesignationdesc) {
        this.employeedesignationdesc = employeedesignationdesc;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
