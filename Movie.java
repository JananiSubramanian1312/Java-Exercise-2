import java.io.*;
import java.util.Arrays;
public class Movie{
String title;
String studio;
String rating;
public Movie(String title,String studio,String rating){
this.title = title;
this.studio = studio;
this.rating = rating;
}
public Movie(String title,String studio){
this.title = title;
this.studio = studio;
this.rating = "PG";
}
public static Movie[] getPG(Movie[] movies){
int count=0;
for(int i=0;i<movies.length;i++){
if(movies[i].rating.equals("PG")){
count++;
}
}
Movie[] pgmovies = new Movie[count];
int index =0;
for(int i =0;i<movies.length;i++){
if(movies[i].rating.equals("PG")){
pgmovies[index] = movies[i];
index++;
}
}
return pgmovies;
}
public static void main(String[] args){
Movie casinoRoyale=new Movie("Casino Royale","Eon Productions","PG-13");
Movie[] pgmovies=new Movie[3];
pgmovies[0]=new Movie("PS1","Lyca Productions","VR");
pgmovies[1]=new Movie("PS2","Lyca Productions","PG");
pgmovies[2]=new Movie("PS3","Lyca Productions","PG");
Movie[] pgMoviesResult=getPG(pgmovies);
for(Movie mov:pgMoviesResult) {
System.out.println(mov.title+" "+mov.studio);
}
}
}
