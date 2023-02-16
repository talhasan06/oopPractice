public class Student {
    String name;
    int id;
    String department;

    public Student(){
        System.out.println("hello");
    }

    public Student(String name,int id,String department){
        this.name=name;
        this.id=id;
        this.department=department;
    }

    public void display(){
        System.out.println(name+" "+id+" "+department);
    }
    public void display(String section){
        System.out.println(name+" "+id+" "+department+" "+section);
    }

    public void display(String section,int roll){
        System.out.println(name+" "+id+" "+department+" "+section+" "+roll);
    }

}
