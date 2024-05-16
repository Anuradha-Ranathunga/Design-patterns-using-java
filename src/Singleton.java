public class Singleton {
    private int data;
    private static Singleton obj;

    private Singleton(int data){
        this.data= data;

    }

    public static Singleton getInstace(int data){
        if(obj == null){
            obj = new Singleton(data);
        }
        return obj;
    }
}
