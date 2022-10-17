package 싱글턴패턴;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    //기타 인스턴스 변수

     private Singleton(){}

    public static synchronized Singleton getInstance(){
         if(uniqueInstance == null){
             synchronized (Singleton.class){
                 if (uniqueInstance == null){
                     uniqueInstance = new Singleton();
                 }
             }
         }
         return uniqueInstance;

    }

    //기타 메소드
}



//public enum Singleton{
//    UNIQUE_INSTANCE;
//    //기타 필요한 필드
//}
//public class SingletonClient{
//    public static void main(String[] args) {
//        Singleton singleton =Singleton.UNIQUE_INSTANCE;
//        //여기서 싱글턴 사용
//    }
//}
