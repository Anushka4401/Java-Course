public class Movie {
    private String name;
    private String format;
    private double rating;
    public Movie(String name,String format,double rating){
        this.name=name;
        this.format=format;
        this.rating=rating;
    }
    public Movie(Movie src){
        this.name=src.name;
        this.format=src.format;
        this.rating=src.rating;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

     public String getFormat(){
        return format;
    }
    public void setFormat(String format){
        this.format=format;
    }

     public double getRating(){
        return rating;
    }
    public void setRating(double rating){
        this.rating=rating;
    }

    public String toString(){
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";

    }

    
}
