package testing;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class Stest1 {
    SinglClass X;


    @BeforeClass
    public void setUp(){
        X= SinglClass.getInstance();
        X.populate();
    }

    @Test()
    public void Testt() {
//        assert(X.get().contains("ass"));
        assertTrue(X.get().contains("ass"));
        System.out.println(X.get());
    }
}

