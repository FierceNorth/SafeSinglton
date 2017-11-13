package testing;

import java.util.ArrayList;
import java.util.Random;

class SinglClass {
    private static SinglClass instance;
    private ArrayList<String> list =new ArrayList<String>();
    public int flag;

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    private SinglClass(){

    }
public static SinglClass getInstance(){
        if (instance==null)
            synchronized (SinglClass.class){
            if(instance==null)
                instance=new SinglClass();
            }
            return instance;

}
public void populate(){
    if(flag!=1){
        String [] m={"Fail","Pass"};
        Random random=new Random();
        int i=0;
        while(i<100){
            list.add(m[random.nextInt(2)]);
       // list.add(str.format("Pass","Fail"));
        i++;}
//        for (int ii=0;ii<10;ii++)
//            System.out.println(list.get(ii));
    }
}

public String get(){
    Random random=new Random();
    return list.get(random.nextInt(99));
}

public void change(int ind,String znach){
    list.set(ind,znach);
}
}

