import java.io.IOException;
import java.sql.*;
/*
Use the chinook database to write the SQL statements to produce the info asked (using chinookDBdiagram.jpg to decide which tables contain the required info and their relationships)

Problem 1:
List the first 20 album titles with the name of the artist who produced the album.

Problem 2:
List the first 20 song(track) names that are of the following genres: Blues, Latin, Pop, Classical.

Problem 3:
List the first 20 song(track) names that are in the playlist 'Grunge'. 

*/
  
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    String sql = "";
    String result ="";     
    Database db = new Database("jdbc:sqlite:chinook.db");	

    sql = "SELECT albums.title, artists.name FROM albums Inner Join artists On albums.artistid = artists.artistid LIMIT 20";
    result = db.runSQL(sql,"table-auto");
    print(result);

    sql = "SELECT tracks.name FROM tracks Inner Join genres On tracks.genreID = genres.genreID WHERE genres.name IN ('Blues', 'Latin', 'Pop', 'Classical') LIMIT 20";
    result = db.runSQL(sql,"table-auto");
    print(result);
    
    sql = "SELECT tracks.name FROM tracks Inner Join playlist_track On playlist_tracks.genreID = tracks.trackID INNER JOIN playlists On playlist_tracks.playlistId  = playlists.playlistId  WHERE playlists.name = 'Grunge' LIMIT 20";
    result = db.runSQL(sql,"table-auto");
    print(result);
  }    
}