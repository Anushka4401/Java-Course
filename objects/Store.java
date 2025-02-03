public class Store {

    private Movie[] movies;

    public Store() {
        // TODO
        this.movies=new Movie[10];
    }

    public Movie getMovie(int index) {
        // TODO 
        Movie copyMovie=new Movie(this.movies[index]);
        return copyMovie;
    }

    public void setMovie(int index, Movie movie) {
        // TODO 
        Movie copyMovie=new Movie(movie);
        this.movies[index]=copyMovie;
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
