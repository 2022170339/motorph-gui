/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mmdc.motorph;

/**
 *
 * @author redenval
 */
public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String sss;
    private String philhealth;
    private String tin;
    private String pagibig;
    private String status;
    private String position;
    private String immediateSupervisor;
    private String basicSalary;
    private String riceSubsidy;
    private String phoneAllowance;
    private String clothingAllowance;
    private String grossSemiMonthlyRate;
    private String hourlyRate;

    // Create constructor for the properties
    public Employee(String id, String firstName, String lastName, String birthday, String address, String phoneNumber, String sss, String philhealth, String tin, String pagibig,
                String status, String position, String immediateSupervisor, String basicSalary, String riceSubsidy, String phoneAllowance, String clothingAllowance, String grossSemiMonthlyRate, String hourlyRate) {    
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sss = sss;
        this.philhealth = philhealth;
        this.tin = tin;
        this.pagibig = pagibig;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
    }
    
    public Employee(String[] data) {    
        if(data.length != 19) return;
        
        this.id = data[0];
        this.firstName = data[1];
        this.lastName = data[2];
        this.birthday = data[3];
        this.address = data[4];
        this.phoneNumber = data[5];
        this.sss = data[6];
        this.philhealth = data[7];
        this.tin = data[8];
        this.pagibig = data[9];
        this.status = data[10];
        this.position = data[11];
        this.immediateSupervisor = data[12];
        this.basicSalary = data[13];
        this.riceSubsidy = data[14];
        this.phoneAllowance = data[15];
        this.clothingAllowance = data[16];
        this.grossSemiMonthlyRate = data[17];
        this.hourlyRate = data[18];
    }

    public String getId() {
        return id;
    } 

    public String getFirstName() {
        return firstName;
    }   

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSss() {
        return sss;
    }

    public String getPhilhealth() {
        return philhealth;
    }

    public String getTin() {
        return tin;
    }   

    public String getPagibig() {
        return pagibig;
    }   

    public String getStatus() {
        return status;
    }

    public String getPosition() {
        return position;
    }

    public String getImmediateSupervisor() {
        return immediateSupervisor;
    }

    public String getBasicSalary() {
        return basicSalary;
    }

    public String getRiceSubsidy() {
        return riceSubsidy;
    }

    public String getPhoneAllowance() {
        return phoneAllowance;
    }

    public String getClothingAllowance() {
        return clothingAllowance;
    }

    public String getGrossSemiMonthlyRate() {
        return grossSemiMonthlyRate;
    }

    public String getHourlyRate() {
        return hourlyRate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() > 0){
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if(lastName.length() > 0){
            this.lastName = lastName;
        }
    }

    public void setBirthday(String birthday) {
        if(birthday.length() > 0){
            this.birthday = birthday;
        }
    }

    public void setAddress(String address) {
        if(address.length() > 0){
            this.address = address;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 0){
            this.phoneNumber = phoneNumber;
        }
    }

    public void setSss(String sss) {
        if(sss.length() > 0){
            this.sss = sss;
        }
    }

    public void setPhilhealth(String philhealth) {
        if(philhealth.length() > 0){
            this.philhealth = philhealth;
        }
    }

    public void setTin(String tin) {
        if(tin.length() > 0){
            this.tin = tin;
        }
    }

    public void setPagibig(String pagibig) {
        if(pagibig.length() > 0){
            this.pagibig = pagibig;
        }
    }

    public void setStatus(String status) {
        if(status.length() > 0){
            this.status = status;
        }
    }

    public void setPosition(String position) {
        if(position.length() > 0){
            this.position = position;
        }
    }

    public void setImmediateSupervisor(String immediateSupervisor) {
        if(immediateSupervisor.length() > 0){
            this.immediateSupervisor = immediateSupervisor;
        }
    }

    public void setBasicSalary(String basicSalary) {
        if(basicSalary.length() > 0){
            this.basicSalary = basicSalary;
        }
    }

    public void setRiceSubsidy(String riceSubsidy) {
        if(riceSubsidy.length() > 0){
            this.riceSubsidy = riceSubsidy;
        }
    }

    public void setPhoneAllowance(String phoneAllowance) {
        if(phoneAllowance.length() > 0){
            this.phoneAllowance = phoneAllowance;
        }
    }

    public void setClothingAllowance(String clothingAllowance) {
        if(clothingAllowance.length() > 0){
            this.clothingAllowance = clothingAllowance;
        }
    }

    public void setGrossSemiMonthlyRate(String grossSemiMonthlyRate) {
        if(grossSemiMonthlyRate.length() > 0){
            this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        }
    }

    public void setHourlyRate(String hourlyRate) {
        if(hourlyRate.length() > 0){
            this.hourlyRate = hourlyRate;
        }
    }
}
