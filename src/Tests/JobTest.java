package Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

 Job fire_force;
 Job Titan;
 Job knight;
 Job king;
 Job sun_Shine;
@Before
public void createJob(){
    fire_force = new Job();
    Titan = new Job();
    knight = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    king = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    sun_Shine = new Job("",new Employer("SDS"), new Location("Britania"), new PositionType("Bar keep"), new CoreCompetency("The Strongest"));
}

    @Test
   public void testSettingJobId(){
int shinra = fire_force.getId();
int eren = Titan.getId();

assertEquals(shinra,eren,1);
    }

@Test
    public void testJobConstructorSetsAllFields(){

  assertTrue(knight.equals(knight));

}
@Test
    public void testJobsForEquality(){

   assertFalse(king.equals(knight));
}

@Test
    public void testToString(){

assertEquals( '\n',knight.toString().charAt(0));
}
@Test
    public void testIfEmpty(){
   String escanor = sun_Shine.toString();
    assertEquals("\nID: 5\n" +
            "Name: Data not available\n" +
            "Employer: SDS\n" +
            "Location: Britania\n" +
            "Position Type: Bar keep\n" +
            "Core Competency: The Strongest",escanor);
}

}
