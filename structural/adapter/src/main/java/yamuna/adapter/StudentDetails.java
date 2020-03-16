package yamuna.adapter;

public class StudentDetails {

    private String studentname;  
    private int sID;  
    private String branch;
    private int year;
      
    public String getStudentName() {  
        return studentname;  
    }  
    public void setStudentName(String studentname) {  
        this.studentname = studentname;  
    }  
    public int getstudentID() {  
        return sID;  
    }  
    public void setStudentID(int sID) {  
        this.sID = sID;  
    }  
    public String getStudentBranch() {  
        return branch;  
    }  
    public void setStudentBranch(String branch) {  
        this.branch = branch;  
    }  
    public int getstudentYear() {  
        return year;  
    }  
    public void setStudentYear(int year) {  
        this.year = year;  
    }  
}
