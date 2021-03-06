/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    public Resturant resturant = new Resturant("jabri" , 5 , "100 $");
    @Test public void toStringResturant(){
        String outPut = resturant.toString();
        System.out.print(outPut);
        String expected = "Resturant{name='jabri', stars=5, price=100 $}";
        assertEquals(outPut,expected);




    }
    public  Review review = new Review("square" , "tamara", 5);

    @Test public void toStringReview () {
        String outPut = review.toString();
        System.out.println(outPut);
        String expected = "Review{body='square', auther='tamara', stars=5}";
        assertEquals(outPut,expected);
    }

    @Test
    public void addReview() {

        Resturant resturant=new Resturant("buffalo",5 , "50$");
        Review review = new Review("delesious","bayan",2);
        resturant.addReview(review);
     assertEquals("bayan",resturant.getAllReviews().get(0).getAuther());
     assertEquals("delesious",resturant.getAllReviews().get(0).getBody());
     assertEquals(2,resturant.getAllReviews().get(0).getStars());

    }
    @Test void basicShop(){
        Shops shop = new Shops("tamara","clothes shop",2);
        System.out.println(shop.toString());
    }
}
