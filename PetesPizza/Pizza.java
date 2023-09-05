
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
        public Pizza(PizzaType type, PizzaSize.LARGE)
    {
        this(PizzaType.PEPPERONI, PizzaSize.LARGE, false, "");
    }


}
