/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;

/**
 *
 * @author m304user
 */
public class Studentinfo2 {
        
        private String fidNumber, ffirstName, flastName;
        public String college , track , term , academic_program;
        
        
       public  void studentid(){
       System.out.println(college);
       System.out.println(track);
       System.out.println(term);
       System.out.println("Student Info");
       System.out.println("ID NUMBER: "+ getidNumber());
       System.out.println("NAME: "+ getlastName()+ getlastName());
       System.out.println("ACADEMIC PROGRAM:"+ academic_program);
       }
        
       public Studentinfo2(String College, String Track, String Term, String academicProgram){
           this.college= College;
           this.track = Track;
           this.term=Term;
           this.academic_program=academicProgram;
         
}
        
        
        
        
        
        
        
        
        
        public String getidNumber(){
            return fidNumber;
        }
        public void setidNumber(String idnumber){
            this.fidNumber =idnumber;
        }
        public String getfirstName(){
            return ffirstName;
        }
        public void  setfirstName(String firstName){
            this.ffirstName = firstName;
        }
        public String getlastName(){
            return flastName;
        }
        public void setlastName(String lastName){
            this.flastName = lastName;
        }
        /***************************/
        
       
        
        
         
                  
        
        
        
    
    
    
    
    
    
    
}
