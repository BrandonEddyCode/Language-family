// Brandon Eddy learning java 2021

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    
    Language(String langName, int speakers, String regions, String wrdOrder){
      this.name = langName;
      this.numSpeakers = speakers;
      this.regionsSpoken = regions;
      this.wordOrder = wrdOrder;
    }
    
    public void getInfo(){
      System.out.println(this.name + " is spoken by " + this.numSpeakers + "people mainly in" + this.regionsSpoken + ".");
      System.out.println("The language follows the word order: " + this.wordOrder);
    }
    
    
    public static void main(String[] args){
    
    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    spanish.getInfo();
    
    Mayan chol = new Mayan("Ch'ol'", 212117);
    chol.getInfo();
    
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
    mandarin.getInfo();
    
    
      }
    
    
    }