package inheritance;

public class Review  {

        private String body ;
        private String auther ;
        private int stars;


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuther() {
        return auther;
    }



    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }



    public Review(String body, String auther, int stars) {
        this.body = body;
        this.auther = auther;
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", auther='" + auther + '\'' +
                ", stars=" + stars +
                '}';
    }
}


