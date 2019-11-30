/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;



public class vipAccount extends account {
    private String email;
    private String mobile;
    private String address;

    public vipAccount() {
    }

    public vipAccount(String email, String mobile, String address) {
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public vipAccount(String email, String mobile, String address, int id, String name, int type, boolean status, String password) {
        super(id, name, type, status, password);
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }
    
    
    public void updateDate(){
    System.out.println(email);
    }
    
    public void displayMessage(){
    System.out.println(email);
    }
    
}
   

