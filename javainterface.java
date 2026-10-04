//abstract and public
//Variable are final and static by default


interface Computer {
    void code();
    void compile();
    void execute();
}

class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("Coding on Laptop");
    }

    @Override
    public void compile() {
        System.out.println("Compiling on Laptop");
    }

    @Override
    public void execute() {
        System.out.println("Executing on Laptop");
    }
}

class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("Coding on Desktop");
    }

    @Override
    public void compile() {
        System.out.println("Compiling on Desktop");
    }

    @Override
    public void execute() {
        System.out.println("Executing on Desktop");
    }
}

class Developer {
    public void develop(Computer computer) {
        computer.code();
        computer.compile();
        computer.execute();
    }
}



public class javainterface {

    public static void main(String a[]) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer developer = new Developer();
        developer.develop(laptop);
        developer.develop(desktop);
    }
    
}
