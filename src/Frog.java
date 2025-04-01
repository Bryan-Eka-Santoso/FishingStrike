public class Frog {
    String normalSprite =
    "	o o  o o\r\n" +
    "	|\\/ \\^/ \\/|\r\n" +
    "	|,	--.|\r\n" +
    "	,-.(|)  (|),-.\r\n" +
    "	\\_*._ ' '_.* _/\r\n" +
    "		/`-.`--' .-'\\\r\n" +
    " ,--./	`---'		\\,--.\r\n" +
    " \\ |( )		( )| /\r\n" +
    "	\\ | ||		|| | /\r\n" +
    "	\\ | /|\\	/|\\ | /\r\n" +
    "	/ \\-._		_,-/ \\\r\n" +
    "  //| \\\\ `---' // |\\\\\r\n" +
    " /,-.,-.\\  /,-.,-.\\\r\n" +
    " o o o  o o  o\r\n";
    String blinkingSprite = 
    "	o o  o o\r\n" +
    "	|\\/ \\^/ \\/|\r\n" +
    "	|,	--.|\r\n" +
    "	,-. 	   ,-.\r\n" +
    "	\\_*._ ' '_.* _/\r\n" +
    "		/`-.`--' .-'\\\r\n" +
    " ,--./	`---'		\\,--.\r\n" +
    " \\ |( )		( )| /\r\n" +
    "	\\ | ||		|| | /\r\n" +
    "	\\ | /|\\	/|\\ | /\r\n" +
    "	/ \\-._		_,-/ \\\r\n" +
    "  //| \\\\ `---' // |\\\\\r\n" +
    " /,-.,-.\\  /,-.,-.\\\r\n" +
    " o o o  o o  o\r\n";


    public void printSprite(int ctr){
        if(ctr % 2 == 0){
            System.out.print(normalSprite);
        } else {
            System.out.print(blinkingSprite);
        }
    }

    public void dialog(int rand){
        if(rand == 0){
            System.out.println("Frog King: Need your rod upgraded?");
        } else if(rand == 1){
            System.out.println("Frog King: I can help you repair your rod.");
        } else {
            System.out.println("Frog King: Will you accept some new quest?");
        }
    }
}
