package testing;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;
//import testing.testing.SinglClass;

public class Stest2 {
    SinglClass X;


    @BeforeClass
    public void setUp(){
        X=SinglClass.getInstance();
        X.populate();
    }

    @Test(dataProvider = "getData")
    public void Test2(int ind,String znach){
        X.change(ind,znach);
        System.out.println(ind +" "+znach);

    }
    @DataProvider
    public Object[][] getData(){
        Random random=new Random();
        return new Object[][]{{random.nextInt(99),"test"}};
    }
}

