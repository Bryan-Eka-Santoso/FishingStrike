public class Seahorse extends Fish {
    public Seahorse(){
        nameFish = "Seahorse";
        hargaJual = 40;
        strength = 20;
        durabilityCost = 3;
        normalSprite =
        "      \\/)/)\r\n" + 
        "    _'  oo(_.-. \r\n" + 
        "  /'.     .---'\r\n" + 
        "/'-./    (\r\n" + 
        ")     ; __\\\r\n" + 
        "\\_.'\\ : __|\r\n" + 
        "     )  _/\r\n" + 
        "    (  (,.\r\n" + 
        "     '-.-'"; 
        blinkingSprite = 
        "      \\/)/)\r\n" + 
        "    _'  --(_.-. \r\n" + 
        "  /'.     .---'\r\n" + 
        "/'-./    (\r\n" + 
        ")     ; __\\\r\n" + 
        "\\_.'\\ : __|\r\n" + 
        "     )  _/\r\n" + 
        "    (  (,.\r\n" + 
        "     '-.-'";
    }

    @Override
    public void printSprite(int ctr){
        if(ctr % 2 == 0){
            System.out.println(normalSprite);
        } else {
            System.out.println(blinkingSprite);
        }
    }
}
