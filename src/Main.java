import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Vehicle ujvehicle = new Vehicle();
        Owner ujowner = new Owner();
        ujvehicle.task1();
        ujowner.task1();     
 
        Pattern pattern = Pattern.compile("https://www.startr.hu/tudta-e/Amit-a--magyar-forgalmi-rendszamokrol-tudni-erdemes", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit https://www.startr.hu/tudta-e/Amit-a--magyar-forgalmi-rendszamokrol-tudni-erdemes!");
            boolean matchFound = matcher.find();
    if(matchFound) {
        System.out.println("Match found");
    }
     else {
        System.out.println("Match not found");
    }
  }
}
    }
}
