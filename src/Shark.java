public class Shark extends Fish {
    public Shark(){
        nameFish = "Shark";
        hargaJual = 100;
        strength = 40;
        durabilityCost = 5;
        normalSprite =
        " 				.	.\r\n" + "(..	\\_	, |\\ /|\r\n" +
        " \\	O \\ /| \\ \\/ /\r\n" +
        " \\		 \\/ | \\ / \r\n" +
        "	vvvv\\		\\ | / |\r\n" +
        "	\\^^^^ == \\_/ |\r\n" +
        "		`\\_ ===	\\. |\r\n" +
        "		/ /\\_ \\ /		|\r\n" +
        "	|/ \\_ \\|	/\r\n"
        + "		\\		/\n";
        blinkingSprite = 
        " 				.	.\r\n" +
        "(..	\\_	, |\\ /|\r\n" +
        " \\	_ \\ /| \\ \\/ /\r\n" +
        " \\		 \\/ | \\ / \r\n" +
        "	vvvv\\		\\ | / |\r\n" +
        "	\\^^^^ == \\_/ |\r\n" +
        "		`\\_ ===	\\. |\r\n" +
        "		/ /\\_ \\ /		|\r\n" +
        "	|/ \\_ \\|	/\r\n" +
        "		\\		/\n";
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
