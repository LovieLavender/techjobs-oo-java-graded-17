package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1, testJob2);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job testSetsAllFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(true);
        assertEquals("Product tester", testSetsAllFields.getName());
        assertEquals("ACME", testSetsAllFields.getEmployer().getValue());
        assertEquals("Desert", testSetsAllFields.getLocation().getValue());
        assertEquals("Quality control", testSetsAllFields.getPositionType().getValue());
        assertEquals("Persistence", testSetsAllFields.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
        Job testJobForEquality1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobForEquality2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(testJobForEquality1, testJobForEquality2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String myTestJob = testJob.toString();

        assertTrue(myTestJob.startsWith(lineSeparator()));
        assertTrue(myTestJob.endsWith(lineSeparator()));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String results = testJob.toString();

       assertTrue(results.contains("Name: " + testJob.getName()));
       assertTrue(results.contains("Employer: " + testJob.getEmployer()));
       assertTrue(results.contains("Location: " + testJob.getLocation()));
       assertTrue(results.contains("Position Type: " + testJob.getPositionType()));
       assertTrue(results.contains("Core Competency: " + testJob.getCoreCompetency()));

    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job testForEmptyFields = new Job("", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = testForEmptyFields.toString();
        String newLine = System.lineSeparator();
        String test = newLine +
                "ID: " + testForEmptyFields.getId() + newLine +
                "Name: " + "Data not available" + newLine +
                "Employer: " + "Data not available" + newLine +
                "Location: " + "Desert" + newLine +
                "Position Type: " + "Quality control" + newLine +
                "Core Competency: " + "Persistence" + newLine;
        assertSame(jobString, test);

//        assertEquals("Data not available", testForEmptyFields.getName());
//        assertEquals("Data not available", testForEmptyFields.getEmployer().getValue());
//        assertEquals("Desert", testForEmptyFields.getLocation().getValue());
//        assertEquals("Quality control", testForEmptyFields.getPositionType().getValue());
//        assertEquals("Persistence", testForEmptyFields.getCoreCompetency().getValue());




    }
}
