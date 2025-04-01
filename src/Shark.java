public class Shark extends Fish {
    public Shark(){
        nameFish = "Shark";
        hargaJual = 100;
        strength = 40;
        durabilityCost = 5;
        normalSprite =
        " _________         .    .\r\n" + 
        "(..       \\_    ,  |\\  /|\r\n" + 
        " \\       O  \\  /|  \\ \\/ /\r\n" + 
        "  \\______    \\/ |   \\  / \r\n" + 
        "     vvvv\\    \\ |   /  |\r\n" + 
        "     \\^^^^  ==   \\_/   |\r\n" + 
        "      `\\_   ===    \\.  |\r\n" + 
        "      / /\\_   \\ /      |\r\n" + 
        "      |/   \\_  \\|      /\r\n" + 
        "             \\________/"; 
        blinkingSprite = 
        " _________         .    .\r\n" + 
        "(..       \\_    ,  |\\  /|\r\n" + 
        " \\       _  \\  /|  \\ \\/ /\r\n" + 
        "  \\______    \\/ |   \\  / \r\n" + 
        "     vvvv\\    \\ |   /  |\r\n" + 
        "     \\^^^^  ==   \\_/   |\r\n" + 
        "      `\\_   ===    \\.  |\r\n" + 
        "      / /\\_   \\ /      |\r\n" + 
        "      |/   \\_  \\|      /\r\n" + 
        "             \\________/"; 
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
