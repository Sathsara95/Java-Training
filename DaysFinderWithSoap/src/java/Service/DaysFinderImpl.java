/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import javax.jws.WebMethod;

public class DaysFinderImpl {
     @WebMethod
    public int calculateDB(int year, int month, int date){
        if(DataValidation(year, month, date)){
         int findDays = findDate(year, month, date);
         return findDays;
        }else{
            return -1;
        }
    }
    
    
    
    //----Check is leap year or not
    private boolean isLeap(int year){
        if((year%4==0&&year%100!=0)||(year%400==0)){
            return true;
        }else{return false;}
    }
    
    //------Find the days from the year
    private int findDate(int year, int month, int day){
      
        int feb= isLeap(year)==true? 29:28;
        switch(month){
           
           case 1: return day;
           case 2: return (31+day);
           case 3: return(31+feb+day);
           case 4: return(31+feb+31+day);
           case 5: return(31+feb+31+31+day);
           case 6: return(31+feb+31+31+31+day);
           case 7: return(31+feb+31+31+31+31+day);
           case 8: return(31+feb+31+31+31+31+31+day);
           case 9: return(31+feb+31+31+31+31+31+31+day);
           case 10: return(31+feb+31+31+31+31+31+31+31+day);
           case 11: return(31+feb+31+31+31+31+31+31+31+31+31+day);
           case 12: return(31+feb+31+31+31+31+31+31+31+31+31+31+day); 
           default: return -1;
       } 
    }
    
    //-------data validation
    private boolean DataValidation(int year, int month, int day){
       return(year>0&&month>0&&day>0)?true:false;
    }
    
    
    
}
