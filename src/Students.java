public class Students {
    public String name;
    //public String Name;
    public String classes;
    //public String Classes;

    public Students(){

    }
//    public Students(String name, String classes){
//        this.name = name;
//        this.classes = classes;
//    }
    private Students(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String getStudent1(){
        this.name = getName();
        this.classes = getClasses();
        return this.name + this.classes;
    }

}
class Test{
    public static void main(String[] args) {
        Students students = new Students("Mai", "C06");
        System.out.println("Tên SV: " + students.getName()+"\n"+
        " Tên lớp: "+ students.getClasses());
        Students students1 = new Students();
        System.out.println();
    }
}
