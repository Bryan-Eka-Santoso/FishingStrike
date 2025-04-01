public class Discus extends Fish {
    public Discus(){
        nameFish = "Discus";
        hargaJual = 20;
        strength = 10;
        durabilityCost = 2;
        normalSprite =
        "   ,-----.\n" + 
        "  /____  /\n" + 
        " /     \\/ _\n" + 
        "/ O     \\/ |\n" + 
        ">          |\n" + 
        "\\ <)    /\\_|\n" + 
        " \\_____\\/    \n" + 
        "  \\      \\\n" + 
        "   `-----'\n"; 
        blinkingSprite = 
        "   ,-----.\n" + 
        "  /____  /\n" + 
        " /     \\/ _\n" + 
        "/ _     \\/ |\n" + 
        ">          |\n" + 
        "\\ <)    /\\_|\n" + 
        " \\_____\\/    \n" + 
        "  \\      \\\n" + 
        "   `-----'\n";
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
