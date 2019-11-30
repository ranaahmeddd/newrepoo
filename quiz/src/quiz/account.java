/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;


public class account {
    private int id;
    public String name;
    private int type;
    protected boolean status;
    private String password;

    public account() {
    }

    public account(int id, String name, int type, boolean status, String password) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public boolean get1Status() {
        return status;
    }

    public String getPassword() {
        return password;
    }
    
    
    public void deactiveAccount(boolean status){
     this.status=status;
    }
    public void setpasswordd(String password){
    if (password.length()>=8){
    this.password=password;
    System.out.println(password);
    }
    else{
    System.out.println("ERROR! password is less than 8 char");
    }
    }
}
