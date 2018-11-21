package Codewars.kyu8;
/**
 *  This is the solution for following puzzle: https://www.codewars.com/kata/thinkful-logic-drills-traffic-light/train/java
 * */
public class TrafficLights {
    /**
     *  <p>This method simply uses the <code>switch</code> case statement to determine what the result should be:</p>
     *  <p>i.e., if the input is "green", the result should be "yellow"</p>
     *  <p>and if the input is "yellow", the result should be "red"</p>
     *
     *  @param current represents the input
     *  @return the orresponding value
     * */
    public static String updateLights(String current) {
        switch (current){
            case "red":
                return "green";
            case "yellow":
                return  "red";
            case "green":
                return  "yellow";
            default:
                throw new IllegalArgumentException();
        }

    }
}
