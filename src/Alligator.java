public class Alligator extends Fish {
    public Alligator(){
        nameFish = "Alligator";
        hargaJual = 80;
        strength = 30;
        durabilityCost = 4;
        normalSprite =
        "	.-._	\r\n" +
        " .-''-.  .-'00 '-' ' ' ' ' ' ' ' '-.\r\n" +
        "'.	'	.  .--_'-' '-' '-' _'-' '._\r\n" +
        " V: V 'vv-'  '_  '.	.' _..' '.'.\r\n" +
        "  '=.	.=_.--'  :_.  .  :_  '.  : :\r\n" +
        "	(((	.-'		'-. / : :\r\n" +
        "			(((-'\\ .' /\r\n" +
        "		..' .'\r\n" +
        "	'-.	.-'\n";
        blinkingSprite = 
        "	.-._	\r\n" +
        " .-''-.  .-'-- '-' ' ' ' ' ' ' ' '-.\r\n" +
        "'.	'	.  .--_'-' '-' '-' _'-' '._\r\n" +
        " V: V 'vv-'  '_  '.	.' _..' '.'.\r\n" +
        "  '=.	.=_.--'  :_.  .  :_  '.  ::\r\n" +
        "	(((	.-'		'-. / : :\r\n" +
        "			(((-'\\ .' /\r\n" +
        "		..' .'\r\n" +
        "	'-.	.-'\r\n";
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
