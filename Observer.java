package observerPattern;

// Import your custom Subject class from the same package
import observerPattern.Subject;

/**
 *
 * @author fa20-bse-021
 */
public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}
