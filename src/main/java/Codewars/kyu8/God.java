package Codewars.kyu8;

/**
 *  This class displays the basic use of subclasses and inheritance
 * */
public class God {

    /**
     *  This method created an Array of <code>Human</code> objects, <br>
     *      where the first element is always the instance of <code>Man</code> class <br>
     *      and the second one is an instance of <code>Woman</code> class.
     *
     *  All three classes (Human, Man and Woman) are inner classes and contain no methods so far. <br>
     *      Classes <code>Man</code> and <code>Woman</code> both extend the <code>Human</code> class.
     *
     *  @return Human[]
     * */
    public static Human[] create() {
        Human[] couple = new Human[2];
        couple[0] = new Man();
        couple[1] = new Woman();
        return couple;
    }
}

class Human{}
class Man extends Human{}
class Woman extends Human{}
