import java.util.*;
 class school{
private String school_name;
private String school_address;
private String school_phone;
String principal_name;
int nonteaching_stuff;
int total_teacher;
boolean admission_open;
String school_status;

 school(){
    school_name = null;
    school_address = null;
    school_phone = null;
    principal_name= null;
    nonteaching_stuff = 0;
    total_teacher = 0;
    admission_open = false;
    school_status = null;
}
 school(String n, String ad, String p, String pl, int ns, int t, boolean a, String s){
    school_name=n;
    school_address=ad;
    school_phone=p;
    principal_name= pl;
    nonteaching_stuff = ns;
    total_teacher = t;
    admission_open = a;
    school_status = s;
}
public String get_school_name(){
return this.school_name;
}
public void set_school_name(String school_name){
this.school_name=school_name;
}
public String get_school_address(){
return this.school_address;
}
public void set_school_address(String school_address){
this.school_address=school_address;
}
public String get_school_phone(){
return this.school_phone;
}
public void set_school_phone(String school_phone){
this.school_phone=school_phone;
}
public String get_principal_name(){
return this.principal_name;
}
public void set_principal_name(String principal_name){
this.principal_name=principal_name;
}
public int get_nonteaching_stuff(){
return this.nonteaching_stuff;
}
public void set_nonteaching_stuff(int nonteaching_stuff){
this.nonteaching_stuff = nonteaching_stuff;
}
public int get_total_teacher(){
return this.total_teacher;
}
public void set_total_teacher(int total_teacher){
this.total_teacher = total_teacher;
}
public boolean get_admission_open(){
return this.admission_open;
}
public void set_admission_open(boolean admission_open){
this.admission_open = admission_open;
}
public String get_school_status(){
return this.school_status;
}
public void set_school_status(String school_status){
this.school_status = school_status;
}
}
class student extends school{
    private String student_name,student_address,student_phone,cls;
    student(){
        student_name=null;
        student_address=null;
        student_phone=null;
        cls=null;
    }
    student(String sname , String saddress , String sphone , String scls){
        student_name=sname;
        student_address=saddress;
        student_phone=sphone;
        cls=scls;
    }
    public String get_student_name(){
        return this.student_name;
        }
    public void set_student_name(String student_name){
        this.student_name = student_name;
        }
    String get_student_address(){
        return this.student_address;
    }
    void set_student_address(String student_address){
        this.student_address=student_address;
    }

    String get_student_phone(){
        return this.student_phone;
    }
    void set_student_phone(String student_phone){
        this.student_phone=student_phone;
    }

    String get_cls(){
        return this.cls;
    }
    void set_cls(String cls){
        this.cls=cls;
    }
}
class teacher extends school {
    String teacher_name, teacher_phone, teacher_address;

    teacher() {
        teacher_name = null;
        teacher_phone = null;
        teacher_address = null;
    }

    teacher(String tName, String tPhone, String tAddress) {
        teacher_name = tName;
        teacher_phone = tPhone;
        teacher_address = tAddress;
    }

    String get_teacherName() {
        return this.teacher_name;
    }

    void set_teacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    String get_teacher__address() {
        return teacher_address;
    }

    void set_teacher_address(String teacher_address) {
        this.teacher_address = teacher_address;
    }

    String get_teacher_phone() {
        return teacher_phone;
    }

    void set_teacher_phone(String teacher_phone) {
        this.teacher_phone = teacher_phone;
    }
}

class parent extends student{
    private String parent_name,relation;
    parent(){
        parent_name=null;
        relation=null;
    }
    parent(String pName,String rel){
        parent_name=pName;
        relation=rel;

    }
    String get_parent_name(){
        return parent_name;
    }
    void set_parent_name(String parent_name){
        this.parent_name=parent_name;
    }

    String get_Relation(){
        return relation;
    }
    void set_relation(String relation){
        this.relation=relation;
    }
}

public class schooldetails{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String user="user";int pass=123;
        System.out.println("Enter user name : ");
        String uname=sc.next();
        System.out.println("Enter Password");
        int password=sc.nextInt();
        
        if(uname.equals(user) && password==pass){
            sc.nextLine();

            
            school obj = new school();
            System.out.println("Enter School name:");
            String school_name = sc.nextLine();
            System.out.println("Enter school address:");
            String school_address = sc.nextLine();
            System.out.println("Enter school phone number:");
            String school_phone = sc.nextLine();
            System.out.println("Enter Principal name:");
            String principal_name = sc.nextLine();
            System.out.println("Enter total no. of non-teaching stuff:");
            int nonteaching_stuff = sc.nextInt();
            System.out.println("Enter total no. of teachers:");
            int total_teacher = sc.nextInt();
            System.out.println("Enter true or false for admission open or close:");
            boolean admission_open = sc.nextBoolean();
            sc.nextLine();
            System.out.println("Enter school status:");
            String school_status = sc.nextLine();
            obj.set_school_name(school_name);
            obj.set_school_address(school_address);
            obj.set_school_phone(school_phone);
            obj.set_principal_name(principal_name);
            obj.set_nonteaching_stuff(nonteaching_stuff);
            obj.set_total_teacher(total_teacher);
            obj.set_admission_open(admission_open);
            obj.set_school_status(school_status);
            System.out.println(obj.get_school_name());
            System.out.println(obj.get_school_address());
            System.out.println(obj.get_school_phone());
            System.out.println(obj.get_principal_name());
            System.out.println(obj.get_nonteaching_stuff());
            System.out.println(obj.get_total_teacher());
            System.out.println(obj.get_admission_open());
            System.out.println(obj.get_school_status());
            System.out.println("press 1 for student / press 2 for teacher ");
            int val=sc.nextInt();
            switch (val){
                case 1:
                    student obj1 = new student();
                    sc.nextLine();
                    System.out.println("Enter your name:");
                    String student_name = sc.nextLine();
                    System.out.println("Enter your permanent adress:");
                    String student_address = sc.nextLine();
                    System.out.println("Enter your phone number:");
                    String student_phone = sc.nextLine();
                    System.out.println("Enetr your class:");
                    String cls = sc.nextLine();
                    obj1.set_student_name(student_name);
                    obj1.set_student_address(student_address);
                    obj1.set_student_phone(student_phone);
                    obj1.set_cls(cls);
                    System.out.println(obj1.get_student_name());
                    System.out.println(obj1.get_student_address());
                    System.out.println(obj1.get_student_phone());
                    System.out.println(obj1.get_cls());
                    break;
                case 2:
                    System.out.println("You are Teacher ");
                    break;
                default:
                    System.out.println("You chose Wrong option");
            }
            
        }
        else{
            System.out.println("Please Enter correct Username & Password");
        }
        
        }
}
