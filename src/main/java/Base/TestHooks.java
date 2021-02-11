package Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class TestHooks {

    @Before
    public void intTest(){
        setTheStage(new OnlineCast());
    }

    @After
   public void closeTest(){
        System.out.println("Execution Completed");
   }


}
