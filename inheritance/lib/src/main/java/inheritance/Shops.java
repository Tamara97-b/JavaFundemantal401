package inheritance;

import java.util.ArrayList;

public class Shops implements Reviewable {
    private String name;
    private String description ;
    private int numOfDollarSign;
    private ArrayList<Review> allReviews = new ArrayList<>();

    public ArrayList<Review> getAllReviews() {
        return allReviews;
    }

    public void setAllReviews(ArrayList<Review> allReviews) {
        this.allReviews = allReviews;
    }

    public Shops(String name , String description , int numOfDollarSign){

        this.name=name;
        this.description=description;
        this.numOfDollarSign =numOfDollarSign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumOfDollarSign() {
        return numOfDollarSign;
    }

    public void setNumOfDollarSign(int numOfDollarSign) {
        this.numOfDollarSign = numOfDollarSign;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSign='" + numOfDollarSign + '\'' +
                '}';
    }
    public String addReview(Review updatedReview){
        if(updatedReview.getStars()>5|| updatedReview.getStars()<1){
            return("the rating must be between 1 to 5");
        }
        else{
            Review newReview = new Review(updatedReview.getBody(),updatedReview.getAuther(),updatedReview.getStars());

            allReviews.add(updatedReview);
            this.setNumOfDollarSign(allReviews.get(0).getStars());
            System.out.println(allReviews.get(0).getStars());
            System.out.println(allReviews);
            return ("its graded");
        }
    }
}
