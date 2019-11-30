/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

import java.util.Date;
import java.util.DateTime;



public class EmployeeAttendance {
    
   public int id ;

   public Date DayDate ;
   public DateTime CheckIn ;
   public DateTime CheckOut ;
   public int EmployeeId ;

    public EmployeeAttendance() {
    }

    public EmployeeAttendance(int id) {
        this.id = id;
    }

    public EmployeeAttendance(int id, Date DayDate) {
        this.id = id;
        this.DayDate = DayDate;
    }

    public EmployeeAttendance(int id, Date DayDate, DateTime CheckIn) {
        this.id = id;
        this.DayDate = DayDate;
        this.CheckIn = CheckIn;
    }

    public EmployeeAttendance(int id, Date DayDate, DateTime CheckIn, DateTime CheckOut) {
        this.id = id;
        this.DayDate = DayDate;
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
    }

    public EmployeeAttendance(int id, Date DayDate, DateTime CheckIn, DateTime CheckOut, int EmployeeId) {
        this.id = id;
        this.DayDate = DayDate;
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
        this.EmployeeId = EmployeeId;
    }
    
    public int Add(int EmployeeId , DateTime CheckIn , Date DayDate ){
    
    }
    public boolean CheckOut(Date DayDate,DateTime CheckOut,int EmployeeId ){
    
    }
     public list<EmployeeAttendance> GetEmployeeAttendanceList(Date StartDate , Date EndDate , int EmployeeId){
    
    }
}
