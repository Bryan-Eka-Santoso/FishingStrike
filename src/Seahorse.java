public class Seahorse extends Fish {
    public Seahorse(){
        nameFish = "Seahorse";
        hargaJual = 40;
        strength = 20;
        durabilityCost = 3;
        normalSprite =
        "	\\/)/)\r\n" +
        "	_' oo(_.-. \r\n" +
        " /'.	.---'\r\n" +
        "/'-./		(\r\n" +
        ")	;  \\\r\n" +
        "\\_.'\\ :  |\r\n" +
        "	) _/\r\n" +
        "	( (,.\r\n" +
        "	'-.-'\n";
        blinkingSprite = 
        "	\\/)/)\r\n" +
        "	_' --(_.-. \r\n" +
        " /'.	.---'\r\n" +
        "/'-./		(\r\n" +
        ")	;  \\\r\n" +
        "\\_.'\\ :  |\r\n" +
        "	) _/\r\n" +
        "	( (,.\r\n" +
        "	'-.-'\n";
    }

    @Override
    public void printSprite(int ctr){
        if(ctr % 2 == 0){
            System.out.print(normalSprite);
        } else {
            System.out.print(blinkingSprite);
        }
    }
}
