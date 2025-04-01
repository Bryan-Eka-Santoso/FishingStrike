public class Alligator extends Fish {
    public Alligator(){
        nameFish = "Alligator";
        hargaJual = 80;
        strength = 30;
        durabilityCost = 4;
        normalSprite =
        "            .-._   _ _ _ _ _ _ _ _\r\n" + 
        " .-''-.__.-'00  '-' ' ' ' ' ' ' ' '-.\r\n" + 
        "'.___ '    .   .--_'-' '-' '-' _'-' '._\r\n" + 
        " V: V 'vv-'   '_   '.       .'  _..' '.'.\r\n" + 
        "   '=.____.=_.--'   :_.__.__:_   '.   : :\r\n" + 
        "           (((____.-'        '-.  /   : :\r\n" + 
        "                             (((-'\\ .' /\r\n" + 
        "                           _____..'  .'\r\n" + 
        "                          '-._____.-'"; 
        blinkingSprite = 
        "            .-._   _ _ _ _ _ _ _ _\r\n" + 
        " .-''-.__.-'--  '-' ' ' ' ' ' ' ' '-.\r\n" + 
        "'.___ '    .   .--_'-' '-' '-' _'-' '._\r\n" + 
        " V: V 'vv-'   '_   '.       .'  _..' '.'.\r\n" + 
        "   '=.____.=_.--'   :_.__.__:_   '.   : :\r\n" + 
        "           (((____.-'        '-.  /   : :\r\n" + 
        "                             (((-'\\ .' /\r\n" + 
        "                           _____..'  .'\r\n" + 
        "                          '-._____.-'\r\n";
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
