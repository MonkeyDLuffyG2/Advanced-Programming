package edu.pupr.TestScores;

import java.util.Scanner;

/**
 * FileName: TestScores.java
 * Author: Luis E. Telemaco, #126779
 * Description: TestScores class that accepts the grades of three tests and calculates their average so that it is displayed.
 * Also includes a main that will allow us to test the TestScores class.
 * History:
 *          11/15/2022 - File created. LETM
 */
public class TestScores {
    private final int NUMBER_OF_TESTS = 3;
    private double[] testScores;

    /**
     * TestScores() - default constructor
     */
    public TestScores(){
        testScores = new double[NUMBER_OF_TESTS];
    }

    /**
     * TestScores() - parameterized constructor
     *
     * @param testScores
     */
    public TestScores(double[] testScores) {
        setTestScores(testScores);
    }

    /**
     * getTestScores() - test scores getter function
     * @return testScores
     */
    public double[] getTestScores() {
        return testScores;
    }

    /**
     * setTestScores() - test scores setter function
     * @param testScores
     */
    public void setTestScores(double[] testScores) {
        this.testScores = testScores;
    }

    /**
     * calculateAverage() - function that calculates the average of a group of scores
     * @return
     */
    public double calculateAverage(){
        double totalScores = 0;

        for (int i = 0; i < NUMBER_OF_TESTS; i++)
        {
            totalScores += testScores[i];
        }

        return totalScores / NUMBER_OF_TESTS;
    }

    /**
     * askScores() - function that accepts user input for the test scores
     */
    public void askScores(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score for each test");

        for (int i = 0; i < NUMBER_OF_TESTS; i++)
        {
                System.out.printf("Score %d: ", i + 1);
                testScores[i] = input.nextDouble();
                while(testScores[i] < 0 || testScores[i] > 100)
                {
                    System.out.println("ERROR!!! The score must be between the range 0 to 100. Try again.");
                    System.out.printf("Score %d: ", i + 1);
                    testScores[i] = input.nextDouble();
                }
        }
    }

    /**
     * showScores() - function that displays the test scores along with the average score
     */
    public void showScores(){
        for (int i = 0; i < NUMBER_OF_TESTS; i++)
        {
            System.out.printf("Test Score #%d = %.2f\n", i + 1, testScores[i]);
        }

        System.out.printf("The average score of the tests is: %.2f\n", calculateAverage());
    }

    /**
     * main() - main program that will be used to test our TestScores class
     * @param args
     */
    public static void main(String[] args){
        TestScores testScores = new TestScores();

        testScores.askScores();
        testScores.showScores();
    }
}
