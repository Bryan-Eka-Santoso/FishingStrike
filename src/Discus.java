public class Discus extends Fish {
    public Discus(){
        nameFish = "Discus";
        hargaJual = 20;
        strength = 10;
        durabilityCost = 2;
        normalSprite =
        "  ,-----.\n" +
        " /		 /\n" +
        " /	\\/ _\n" +
        "/ O	\\/ |\n" +
        ">		|\n" +
        "\\ <)	/\\_|\n" +
        " \\		\\/	\n" +
        " \\	\\\n" +
        "  `	'\n";
        blinkingSprite = 
        "  ,-----.\n" +
        " /		 /\n" +
        " /	\\/ _\n" +
        "/ _	\\/ |\n" +
        ">		|\n" +
        "\\ <)	/\\_|\n" +
        " \\		\\/	\n"+
        " \\	\\\n" +
        "  `	'\n";
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
