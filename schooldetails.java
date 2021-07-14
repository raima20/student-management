import java.util.*;
 class school{
private String name;
private String address;
private String phone;
String principal_name;
int nonteaching_stuff;
int total_teacher;
boolean admission_open;
String school_status;

 school(){
    name = null;
    address = null;
    phone = null;
    principal_name= null;
    nonteaching_stuff = 0;
    total_teacher = 0;
    admission_open = false;
    school_status = null;
}
 school(String n, String ad, String p, String pl, int ns, int t, boolean a, String s){
    name=n;
    address=ad;
    phone=p;
    principal_name= pl;
    nonteaching_stuff = ns;
    total_teacher = t;
    admission_open = a;
    school_status = s;
}
public String get_name(){
return this.name;
}
public void set_name(String name){
this.name=name;
}
public String get_address(){
return this.address;
}
public void set_address(String address){
this.address=address;
}
public String get_phone(){
return this.phone;
}
public void set_phone(String phone){
this.phone=phone;
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

public class schooldetails{
    public static void main (String[] args){
        school obj = new school();
        obj.set_name("Raima");
        obj.set_address("kolkata");
        obj.set_phone("65432180");
        obj.set_principal_name("Sumita Roy");
        obj.set_nonteaching_stuff(20);
        obj.set_total_teacher(15);
        obj.set_admission_open(true);
        obj.set_school_status("Higher Secondary");
        }
}
