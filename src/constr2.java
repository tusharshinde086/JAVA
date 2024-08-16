public class constr2 {
    int id;
    string name ;

    public void display(){
        System.out.println( id + ""+ name);
        }
     public static void main(String[] args) {
        constr2 s1 = new constr2();
        constr2 s2 = new constr2();   // creating a object

        s1.display();  
        s2.display();
    }
}
