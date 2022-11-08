 import java.util.Random;
import java.util.ArrayList;
 /**
 * Décrivez votre classe Creeper ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Bumblebee extends Robot
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    Random random = new Random();
    int alea;
    private boolean test;
    ArrayList<String> choice= new ArrayList<String>();
    /**
     * Constructeur d'objets de classe Creeper
     */
    public Bumblebee(int x, int y,Monde monde)
    {
        super("creeper",x,y,"creeper",monde);
    }
    private void choix(){
        choice.add("N");
        choice.add("NE");
        choice.add("NO");
        choice.add("E");
        choice.add("O");
        choice.add("S");
        choice.add("SE");
        choice.add("SO");
    }
    private void moveChe(String ori){
        choix();
        if(movetest(ori)==false){
            super.move(ori);
        }
        else{
        test=true;
        while(test==true){
            alea = random.nextInt(choice.size());
            if (movetest(choice.get(alea))==false){
                super.move(choice.get(alea));
                test=false;
            }
            else{test=true;}
        }
        }
    }
    public void move(){
        
        moveChe("N");
        delay();
        moveChe("E");
        delay();
        moveChe("S");
        delay();
        moveChe("O");
        
        for(int i=0;i<2;i++){
        alea = random.nextInt(choice.size());
        delay();
        moveChe(choice.get(alea));
        delay();
    }
    }
    public void movelignedroite(){
        for(int i=0;i<11;i++){
            move("E");
        }
    }
    public void movelignegauche(){
        for(int i=0;i<11;i++){
            if(movetest("O")==false){
            move("O");}
        }
    }
    // public void testcoli(){
        
    // }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    //public int sampleMethod(int y)
    // {
        // // Insérez votre code ici
        // return x + y;
    // }
}
