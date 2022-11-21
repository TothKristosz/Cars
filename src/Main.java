import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Vehicle ujvehicle = new Vehicle();
        Owner ujowner = new Owner();
        ujvehicle.task1();
        ujowner.task1();     
 
        Pattern pattern = Pattern.compile("^[a-z] {3,4} [0-9] {3}$");
        Matcher matcher = pattern.matcher(rend);
            boolean matchFound = matcher.find();
    if(matchFound) {
        return true;
        System.out.println("Match found");
    }
     else {
         return false;
        System.out.println("Match not found");
    }
  }
}
    }
}
