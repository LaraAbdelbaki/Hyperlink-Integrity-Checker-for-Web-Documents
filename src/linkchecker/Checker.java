package linkchecker;

import java.io.IOException;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Checker {
	
	public boolean checkSingleLink(String link) {
        boolean flag = false;
        try {
            Document mainPage = Jsoup.connect(link).get();
            flag = true;
        } catch (HttpStatusException e) {
            flag = false;
        } catch (IOException ex) {
            flag = false;
        } catch(IllegalArgumentException e)
        {
            flag=false;
        }
        return flag;
    }

}