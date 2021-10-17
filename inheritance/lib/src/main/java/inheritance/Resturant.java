package inheritance;

import java.util.ArrayList;

public class Resturant  {

    private String  name ;
    private double stars ;
    private String  price ;
   private  ArrayList<Review> allReviews = new ArrayList<>();
    public double getStars() {
        return stars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Resturant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public ArrayList<Review> getAllReviews() {
        return allReviews;
    }

    public void setAllReviews(ArrayList<Review> allReviews) {
        this.allReviews = allReviews;
    }

    public String addReview(Review updatedReview) {
        if(updatedReview.getStars()>5|| updatedReview.getStars()<1){
            return("the rating must be between 1 to 5");
        }
        else{
            Review newReview = new Review(updatedReview.getBody(),updatedReview.getAuther(),updatedReview.getStars());

            allReviews.add(updatedReview);
            this.setStars(allReviews.get(0).getStars());
            System.out.println(allReviews.get(0).getStars());
            System.out.println(allReviews);
            return ("its graded");
        }


    }

    @Override
    public String toString() {
        return "Resturant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}';
    }


}
