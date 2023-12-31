
/**
 * Write a description of class Pizza here.
 *
 * @author Chris Prabhu
 * @version 2023-09-04
 */
public class Pizza
{
    // -----------------------------------
    //           ENUMERATED TYPES
    // -----------------------------------

    public enum PizzaType {CHEESE, PEPPERONI, VEGGIE};
    public enum PizzaSize {SMALL, MEDIUM, LARGE, XL};

    // -----------------------------------
    //           CONSTANTS
    // -----------------------------------

    public static final int SMALL_DIAM = 0;
    public static final int MEDIUM_DIAM = 12; 
    public static final int LARGE_DIAM = 16;
    public static final int XL_DIAM = 18; 

    // -----------------------------------
    //           PRIVATE DATA
    // -----------------------------------

    private PizzaType type;
    private PizzaSize size;
    private boolean thinCrust;
    private String specInstruct;

    // -----------------------------------
    //           CONSTRUCTORS
    // -----------------------------------

    /**
     * Full constructor for objects of class Pizza
     */

    public Pizza(PizzaType type, PizzaSize size, boolean thinCurst, String specInstruct)
    {
        this.type = type;
        this.size = size;
        this.thinCrust = thinCrust;
        this.specInstruct = specInstruct;
    }

    /**
     * Type and Size constructor for objects of class Pizza
     */

    public Pizza(PizzaType type, PizzaSize size)
    {
        this(type, size, false, "");
    }

    /**
     * Empty Constructor for objects of class Pizza
     */
    public Pizza()
    {
        this(PizzaType.PEPPERONI, PizzaSize.LARGE, false, "");
    }

    // -----------------------------------
    //           ACCESSORS
    // -----------------------------------

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the type of pizza
     */
    public PizzaType getType()
    {
        // put your code here
        return type;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the size of pizza
     */
    public PizzaSize getSize()
    {
        // put your code here
        return size;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the thin of pizza
     */
    public boolean getThinCrust()
    {
        // put your code here
        return thinCrust;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the special instructions
     */
    public String getSpecInstruct()
    {
        // put your code here
        return specInstruct;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    get the area of the pizza, in square inches
     */
    public double getArea()
    {
        // put your code here
        double diameter, area;
        if (size == PizzaSize.SMALL)        diameter = SMALL_DIAM;
        else if (size == PizzaSize.MEDIUM)  diameter = MEDIUM_DIAM;
        else if (size == PizzaSize.LARGE)   diameter = LARGE_DIAM;
        else                                diameter = XL_DIAM;

        return Math.pow(diameter / 2.0, 2) * 3.14;

    }

    // -----------------------------------
    //           MUTATORS
    // -----------------------------------
    /**
     * Sets the pizza's type
     *
     * @param  type  the type of the pizza
     */
    public void setType(PizzaType type)
    {
        this.type = type; 
    }

    /**
     * Sets the pizza's type
     *
     * @param  size  the size of the pizza
     */
    public void setSize(PizzaSize size)
    {
        this.size = size; 
    }

    /**
     * Sets the pizza's type
     *
     * @param  boolean  sets if pizza is thinCrust or not
     */
    public void setThinCrust(boolean thinCrust)
    {
        this.thinCrust = thinCrust; 
    }

    /**
     * Sets the pizza's type
     *
     * @param  String  sets the type of the pizza
     */
    public void setSpecCrust(String specInstruct)
    {
        this.specInstruct = specInstruct; 
    }

    public String toString() {
        String descrip = "";
        descrip += "Type: " + type + "\n";
        descrip += "Size: " + size + "\n";
        descrip += "Thin: " + ((thinCrust) ? "Yes" : "No") + "\n";
        descrip += "SpecInstruct: " + specInstruct + "\n";
        return descrip;
    }

    public static void test() {
        System.out.println("\n\nUnit tests on Pizza class started. Failures will be shown here:");

        // Test the constructors
        Pizza testPizza = new Pizza();
        if (testPizza.getType() != PizzaType.PEPPERONI) System.out.println("getType failed; expected PEPPERONI, got " + testPizza.getType());
        if (testPizza.getSize() != PizzaSize.LARGE) System.out.println("getSize failed; expected LARGE; got " + testPizza.getSize());
        if (testPizza.getThinCrust()) System.out.println("getThinCrust failed; expected false; got " + testPizza.getThinCrust());
        if (!testPizza.getSpecInstruct().isEmpty()) System.out.println("getSpecInstruct failed; expected \"\"; got " + testPizza.getSpecInstruct().isEmpty());
    
    }

}
