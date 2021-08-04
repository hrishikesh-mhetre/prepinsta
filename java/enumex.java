

public class enumex {
    enum season{
        WINTER(11), SPRING(13),SUMMER(12),FALL(10); 
        private int value;
        private season(int value){
            this.value=value;
        }
        
        }
public static void main(String[] args) {
    for(season s:season.values())
    System.out.println(s+" "+s.value);
}
    
}
