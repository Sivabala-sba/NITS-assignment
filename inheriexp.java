package nitsass;

class parent{
    public void parentmeth(){
        System.out.println("This is parent class");
    }
}

class child extends parent{
    public void childmeth(){
        System.out.println("This is child class");
    }
}

public class inheriexp {
    public static void main(String[] args){
        child chi = new child();
        parent par = new parent();

        chi.parentmeth();
        chi.childmeth();
        //par.parentmeth();
    }
}
