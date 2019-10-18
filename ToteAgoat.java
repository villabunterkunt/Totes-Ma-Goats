import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;

public class ToteAgoat{

    public static void main(String[] args) throws Exception{
        String[] goats = new String(Files.readAllBytes(Paths.get("./goat_pics"))).split("image:");
        int numOfGoats = Integer.valueOf(goats[0].trim());
        int choosen_billy = ThreadLocalRandom.current().nextInt(1, numOfGoats+1);
        System.out.println((goats[choosen_billy]));

    }

    }

