import java.util.ArrayList;

public class Song {
    //properties
    private String artist;
    private String title;
    private ArrayList<String> allStudents;

    //constructor
    public Song(String title, String artist){
        this.artist = artist;
        this.title = title;
        this.allStudents = new ArrayList<>();
    }

    //methods

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int howMany(ArrayList<String> todayStudents){
        int todayNewAmount = 0;

        for (String student : todayStudents){
            String lowerCaseStudent = student.toLowerCase();
            if (!this.allStudents.contains(lowerCaseStudent)){
                this.allStudents.add(lowerCaseStudent);
                todayNewAmount++;
            }
        }

        return todayNewAmount;
    }
}
