import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanI = new Scanner(System.in);        
        Scanner scanS = new Scanner(System.in);  
        Random rand = new Random();  
        
        String inputPlayer;
        int menu1, menuFrog;
        int x = 15, y = 3;
        int gold = 50;
        int strength = 20;
        int rod = 0;
        String questString = "";
        int quest = 0;
        int inProgress = 0;
        int questProgress = 10;
        int questJenisFish = 10;

        String[] jenisRod = {"Basic", "Advanced", "Premium"};
        int[] priceUpgradeRod = {0, 50, 100};
        int[] priceRepairRod = {10, 20, 50};
        int[] durabilityAwal = {10, 15, 20};
        int[] durability = {10, 15, 20};

        ArrayList discusInventory = new ArrayList<>();
        ArrayList seahorseInventory = new ArrayList<>();
        ArrayList alligatorInventory = new ArrayList<>();
        ArrayList sharkInventory = new ArrayList<>();

        // 30 X 7
        char[][] worldMap = {
            {'+', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '+'},
            {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
            {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
            {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
            {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
            {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
            {'+', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '+'}          
        };

        Discus discusFish = new Discus();
        Seahorse seahorseFish = new Seahorse();
        Alligator alligatorFish = new Alligator();
        Shark sharkFish = new Shark();
        Frog frog = new Frog();

        do {
            System.out.println("==================================");
            System.out.println("          FISHING STRIKE          ");
            System.out.println("==================================");
            System.out.println("Coins: " + gold + " G");
            System.out.println("Current Rod: " + jenisRod[rod]);
            System.out.println("Durability: " + durability[rod]);
            System.out.println("Strength: " + strength);
            System.out.println("==================================");
            System.out.println("[1] Go Fishing");
            System.out.println("[2] Inventory");
            System.out.println("[3] Visit Frog King");
            System.out.println("[0] Exit");
            System.out.println("==================================");
            do {
                System.out.print(">> ");
                menu1 = scanI.nextInt();
            } while(menu1 != 0 && menu1 != 1 && menu1 != 2 && menu1 != 3 && menu1 != 99);

            switch (menu1) {
                case 1:
                if(durability[rod] > 0){
                    char[][] mapFishing = new char[7][30];
                    for(int i = 0; i < worldMap.length; i++){
                        for(int j = 0; j < worldMap[0].length; j++){
                            mapFishing[i][j] = worldMap[i][j];
                        }
                    }
                    Boolean isEmptyMap = false;
                    int ctrRandFishMap = 0;
                    do {
                        do {
                            int randFish = rand.nextInt(4);
                            int randY = rand.nextInt(5) + 1;
                            int randX = rand.nextInt(28) + 1;
                            if(mapFishing[randY][randX] == ' '){
                                if(randFish == 0){
                                    mapFishing[randY][randX] = 'D';
                                } else if(randFish == 1){
                                    mapFishing[randY][randX] = 'H';
                                } else if(randFish == 2){
                                    mapFishing[randY][randX] = 'A';
                                } else if(randFish == 3){
                                    mapFishing[randY][randX] = 'S';
                                }
                                isEmptyMap = true;
                                ctrRandFishMap++;
                            } else {
                                isEmptyMap = false;
                            }
                        } while(!isEmptyMap);
                    } while(ctrRandFishMap != 5);
                    do {
                        mapFishing[y][x] = 'P';
                        System.out.println("==============================");
                        System.out.println("Rod      : " + jenisRod[rod] + " (Dur:" + durability[rod] + ")");
                        System.out.println("Strength : " + strength);
                        System.out.println("==============================");
                        for(int i = 0; i < mapFishing.length; i++){
                            for(int j = 0; j < mapFishing[0].length; j++){
                                System.out.print(mapFishing[i][j]); 
                            }
                            System.out.println();
                        }
                        System.out.println("==============================");
                        System.out.println("[q] Quest Menu");
                        System.out.println("[e] Exit");
                        System.out.println("[wasd] Move Player");
                        System.out.print(">> ");
                        inputPlayer = scanS.nextLine();

                        if(inputPlayer.equals("w") && (mapFishing[y-1][x] == ' ' || mapFishing[y-1][x] == 'D' || mapFishing[y-1][x] == 'H' || mapFishing[y-1][x] == 'A' || mapFishing[y-1][x] == 'S')){
                            mapFishing[y][x] = ' ';
                            y--;
                        } else if(inputPlayer.equals("a") && (mapFishing[y][x-1] == ' ' || mapFishing[y][x-1] == 'D' || mapFishing[y][x-1] == 'H' || mapFishing[y][x-1] == 'A' || mapFishing[y][x-1] == 'S')){
                            mapFishing[y][x] = ' ';
                            x--;
                        } else if(inputPlayer.equals("s") && (mapFishing[y+1][x] == ' ' || mapFishing[y+1][x] == 'D' || mapFishing[y+1][x] == 'H' || mapFishing[y+1][x] == 'A' || mapFishing[y+1][x] == 'S')){
                            mapFishing[y][x] = ' ';
                            y++;
                        } else if(inputPlayer.equals("d") && (mapFishing[y][x+1] == ' ' || mapFishing[y][x+1] == 'D' || mapFishing[y][x+1] == 'H' || mapFishing[y][x+1] == 'A' || mapFishing[y][x+1] == 'S')){
                            mapFishing[y][x] = ' ';
                            x++;
                        } else if(inputPlayer.equals("q")){
                            if(quest == 0){
                                System.out.println("No active quest. Visit the Frog King to accept one.");
                            } else {
                                System.out.println("================================");
                                System.out.println("Activate Quest: " + questString);
                                System.out.println("Progress: " + inProgress + "/" + questProgress);
                                System.out.println("================================");
                            }
                        }

                        if(mapFishing[y][x] == 'D'){
                            int ctr = 0;
                            int gauge = 50;
                            String pullFish;
                            String bar = "#####     ";
                            Boolean getFish = false;
                            Boolean noGetFish = false;

                            do {
                                if(gauge / 10 % 10 == 1){
                                    bar = "#         ";
                                } else if(gauge / 10 % 10 == 2){
                                    bar = "##        ";
                                } else if(gauge / 10 % 10 == 3){
                                    bar = "###       ";
                                } else if(gauge / 10 % 10 == 4){
                                    bar = "####      ";
                                } else if(gauge / 10 % 10 == 5){
                                    bar = "#####     ";
                                } else if(gauge / 10 % 10 == 6){
                                    bar = "######    ";
                                } else if(gauge / 10 % 10 == 7){
                                    bar = "#######   ";
                                } else if(gauge / 10 % 10 == 8){
                                    bar = "########  ";
                                } else if(gauge / 10 % 10 == 9){
                                    bar = "######### ";
                                }
                                System.out.println("You encounted a " + discusFish.nameFish + "!");
                                discusFish.printSprite(ctr);
                                System.out.println("=========================");
                                System.out.println("Fishing Bar: [" + bar + "]");
                                System.out.println("Gauge : " + gauge + " %");
                                System.out.println("=========================");
                                System.out.println("Press ENTER to pull or type 'exit' to stop!");
                                System.out.print(">> ");
                                pullFish = scanS.nextLine();
                                if(pullFish.isEmpty()){
                                    int fishRandomStrength = rand.nextInt(discusFish.strength) + (discusFish.strength / 2);
                                    int playerRandomStrength = rand.nextInt(strength) + (strength / 2);
                                    gauge -= fishRandomStrength;
                                    gauge += playerRandomStrength;
                                    if(gauge >= 100){
                                        getFish = true;
                                        durability[rod] -= discusFish.durabilityCost;
                                        discusInventory.add(discusFish);
                                    } else if(gauge <= 0){
                                        noGetFish = true;
                                        durability[rod] -= discusFish.durabilityCost;
                                    }
                                }
                                ctr++;
                            } while(!pullFish.equals("exit") && !getFish && !noGetFish);
                            if(getFish){
                                if(questJenisFish == 0){
                                    inProgress++;
                                }
                                System.out.println("You succesfully caught the Discus!");
                            } else if(noGetFish){
                                System.out.println("Discus run away!");
                            }
                        } else if(mapFishing[y][x] == 'H'){
                            int ctr = 0;
                            int gauge = 50;
                            String pullFish;
                            String bar = "#####     ";
                            Boolean getFish = false;
                            Boolean noGetFish = false;

                            do {
                                if(gauge / 10 % 10 == 1){
                                    bar = "#         ";
                                } else if(gauge / 10 % 10 == 2){
                                    bar = "##        ";
                                } else if(gauge / 10 % 10 == 3){
                                    bar = "###       ";
                                } else if(gauge / 10 % 10 == 4){
                                    bar = "####      ";
                                } else if(gauge / 10 % 10 == 5){
                                    bar = "#####     ";
                                } else if(gauge / 10 % 10 == 6){
                                    bar = "######    ";
                                } else if(gauge / 10 % 10 == 7){
                                    bar = "#######   ";
                                } else if(gauge / 10 % 10 == 8){
                                    bar = "########  ";
                                } else if(gauge / 10 % 10 == 9){
                                    bar = "######### ";
                                }
                                System.out.println("You encounted a " + seahorseFish.nameFish + "!");
                                seahorseFish.printSprite(ctr);
                                System.out.println("=========================");
                                System.out.println("Fishing Bar: [" + bar + "]");
                                System.out.println("Gauge : " + gauge + " %");
                                System.out.println("=========================");
                                System.out.println("Press ENTER to pull or type 'exit' to stop!");
                                System.out.print(">> ");
                                pullFish = scanS.nextLine();
                                if(pullFish.isEmpty()){
                                    int fishRandomStrength = rand.nextInt(seahorseFish.strength) + (seahorseFish.strength / 2);
                                    int playerRandomStrength = rand.nextInt(strength) + (strength / 2);
                                    gauge -= fishRandomStrength;
                                    gauge += playerRandomStrength;
                                    if(gauge >= 100){
                                        getFish = true;
                                        durability[rod] -= seahorseFish.durabilityCost;
                                        seahorseInventory.add(seahorseFish);
                                    } else if(gauge <= 0){
                                        noGetFish = true;
                                        durability[rod] -= seahorseFish.durabilityCost;
                                    }
                                }
                                ctr++;
                            } while(!pullFish.equals("exit") && !getFish && !noGetFish);
                            if(getFish){
                                if(questJenisFish == 1){
                                    inProgress++;
                                }
                                System.out.println("You succesfully caught the Seahorse!");
                            } else if(noGetFish){
                                System.out.println("Seahorse run away!");
                            }
                        } else if(mapFishing[y][x] == 'A'){
                            int ctr = 0;
                            int gauge = 50;
                            String pullFish;
                            String bar = "#####     ";
                            Boolean getFish = false;
                            Boolean noGetFish = false;

                            do {
                                if(gauge / 10 % 10 == 1){
                                    bar = "#         ";
                                } else if(gauge / 10 % 10 == 2){
                                    bar = "##        ";
                                } else if(gauge / 10 % 10 == 3){
                                    bar = "###       ";
                                } else if(gauge / 10 % 10 == 4){
                                    bar = "####      ";
                                } else if(gauge / 10 % 10 == 5){
                                    bar = "#####     ";
                                } else if(gauge / 10 % 10 == 6){
                                    bar = "######    ";
                                } else if(gauge / 10 % 10 == 7){
                                    bar = "#######   ";
                                } else if(gauge / 10 % 10 == 8){
                                    bar = "########  ";
                                } else if(gauge / 10 % 10 == 9){
                                    bar = "######### ";
                                }
                                System.out.println("You encounted a " + alligatorFish.nameFish + "!");
                                alligatorFish.printSprite(ctr);
                                System.out.println("=========================");
                                System.out.println("Fishing Bar: [" + bar + "]");
                                System.out.println("Gauge : " + gauge + " %");
                                System.out.println("=========================");
                                System.out.println("Press ENTER to pull or type 'exit' to stop!");
                                System.out.print(">> ");
                                pullFish = scanS.nextLine();
                                if(pullFish.isEmpty()){
                                    int fishRandomStrength = rand.nextInt(alligatorFish.strength) + (alligatorFish.strength / 2);
                                    int playerRandomStrength = rand.nextInt(strength) + (strength / 2);
                                    gauge -= fishRandomStrength;
                                    gauge += playerRandomStrength;
                                    if(gauge >= 100){
                                        getFish = true;
                                        durability[rod] -= alligatorFish.durabilityCost;
                                        alligatorInventory.add(alligatorFish);
                                    } else if(gauge <= 0){
                                        noGetFish = true;
                                        durability[rod] -= alligatorFish.durabilityCost;
                                    }
                                }
                                ctr++;
                            } while(!pullFish.equals("exit") && !getFish && !noGetFish);
                            if(getFish){
                                if(questJenisFish == 2){
                                    inProgress++;
                                }
                                System.out.println("You succesfully caught the Alligator!");
                            } else if(noGetFish){
                                System.out.println("Alligator run away!");
                            }
                        } else if(mapFishing[y][x] == 'S'){
                            int ctr = 0;
                            int gauge = 50;
                            String pullFish;
                            String bar = "#####     ";
                            Boolean getFish = false;
                            Boolean noGetFish = false;

                            do {
                                if(gauge / 10 % 10 == 1){
                                    bar = "#         ";
                                } else if(gauge / 10 % 10 == 2){
                                    bar = "##        ";
                                } else if(gauge / 10 % 10 == 3){
                                    bar = "###       ";
                                } else if(gauge / 10 % 10 == 4){
                                    bar = "####      ";
                                } else if(gauge / 10 % 10 == 5){
                                    bar = "#####     ";
                                } else if(gauge / 10 % 10 == 6){
                                    bar = "######    ";
                                } else if(gauge / 10 % 10 == 7){
                                    bar = "#######   ";
                                } else if(gauge / 10 % 10 == 8){
                                    bar = "########  ";
                                } else if(gauge / 10 % 10 == 9){
                                    bar = "######### ";
                                }
                                System.out.println("You encounted a " + sharkFish.nameFish + "!");
                                sharkFish.printSprite(ctr);
                                System.out.println("=========================");
                                System.out.println("Fishing Bar: [" + bar + "]");
                                System.out.println("Gauge : " + gauge + " %");
                                System.out.println("=========================");
                                System.out.println("Press ENTER to pull or type 'exit' to stop!");
                                System.out.print(">> ");
                                pullFish = scanS.nextLine();
                                if(pullFish.isEmpty()){
                                    int fishRandomStrength = rand.nextInt(sharkFish.strength) + (sharkFish.strength / 2);
                                    int playerRandomStrength = rand.nextInt(strength) + (strength / 2);
                                    gauge -= fishRandomStrength;
                                    gauge += playerRandomStrength;
                                    if(gauge >= 100){
                                        getFish = true;
                                        durability[rod] -= sharkFish.durabilityCost;
                                        sharkInventory.add(sharkFish);
                                    } else if(gauge <= 0){
                                        noGetFish = true;
                                        durability[rod] -= sharkFish.durabilityCost;
                                    }
                                }
                                ctr++;
                            } while(!pullFish.equals("exit") && !getFish && !noGetFish);
                            if(getFish){
                                if(questJenisFish == 0){
                                    inProgress++;
                                }
                                System.out.println("You succesfully caught the Shark!");
                            } else if(noGetFish){
                                System.out.println("Shark run away!");
                            }
                        }
                        if(durability[rod] < 0){
                            durability[rod] = 0;
                            break;
                        }
                        if(inProgress == questProgress){
                            if(questJenisFish == 0){
                                int hadiah = discusFish.hargaJual * questProgress;
                                gold += hadiah;
                            } else if(questJenisFish == 1){
                                int hadiah = seahorseFish.hargaJual * questProgress;
                                gold += hadiah;
                            } else if(questJenisFish == 2){
                                int hadiah = alligatorFish.hargaJual * questProgress;
                                gold += hadiah;  
                            } else if(questJenisFish == 3){
                                int hadiah = sharkFish.hargaJual * questProgress;
                                gold += hadiah;
                            }
                            questString = "";
                            quest = 0;
                            inProgress = 0;
                            questProgress = 10;
                            questJenisFish = 10;
                        }
                    } while(!inputPlayer.equals("e"));
                } else {
                    System.out.println("You fishing rod is broken. Go fix or upgrade it");
                }
                    break;
                case 2:
                    System.out.println("====================");
                    System.out.println("      Inventory     ");
                    System.out.println("====================");
                    System.out.println("Discus: " + discusInventory.size());
                    System.out.println("Seahorse: " + seahorseInventory.size());
                    System.out.println("Alligator: " + alligatorInventory.size());
                    System.out.println("Shark: " + sharkInventory.size());
                    break;
                case 3:
                    int ctr = 0;
                    do {
                        int randDialog = rand.nextInt(3);
                        frog.printSprite(ctr);
                        System.out.println("==============================");
                        frog.dialog(randDialog);
                        System.out.println("Coins: " + gold + " G");
                        System.out.println("==============================");
                        System.out.println("1. Upgrade Rod");
                        System.out.println("2. Repair Rod");
                        System.out.println("3. Upgrade Strength");
                        System.out.println("4. Accept Quest");
                        System.out.println("5. Sell Fish");
                        System.out.println("0. Exit");
                        do {
                            System.out.print(">> ");
                            menuFrog = scanI.nextInt();
                        } while(menuFrog < 0 || menuFrog > 5);
                        switch (menuFrog) {
                            case 1:
                                String selectionUp;
                                if(rod < 2){
                                    System.out.println("Upgraded to " + jenisRod[rod+1] + " Rod? (Cost: " + priceUpgradeRod[rod+1] + " G)");
                                    System.out.print("(y/n) ");
                                    selectionUp = scanS.nextLine();
                                    if(selectionUp.equals("y") && gold >= priceUpgradeRod[rod+1]){
                                        System.out.println("Upgraded to " + jenisRod[rod+1] + " rod!");
                                        gold -= priceUpgradeRod[rod+1];
                                        rod++;
                                        if(rod == 1){
                                            strength += strength * 0.2;
                                        } else if(rod == 2){
                                            strength += strength * 0.5;
                                        }
                                    } else if(gold < priceUpgradeRod[rod+1]){
                                        System.out.println("Your gold is not enough!");
                                    }
                                } else {
                                    System.out.println("You've already upgraded your rod to max!");
                                }
                                ctr++;
                                break;
                            case 2:
                                String selectionRep;
                                System.out.println("Repair your " + jenisRod[rod] + " Rod? (Cost: " + priceRepairRod[rod] + " G)");
                                System.out.print("(y/n) ");
                                selectionRep = scanS.nextLine();
                                if(selectionRep.equals("y") && gold >= priceRepairRod[rod]){
                                    durability[rod] = durabilityAwal[rod];
                                    gold -= priceRepairRod[rod];
                                    System.out.println(jenisRod[rod] + " rod repaired");
                                } else if(gold < priceRepairRod[rod]){
                                    System.out.println("Your gold is not enough!");
                                }
                                ctr++;
                                break;
                            case 3:
                                String selectionStr;
                                System.out.println("Upgrade strength by +5? (Cost: 30 G)");
                                System.out.print("(y/n) ");
                                selectionStr = scanS.nextLine();
                                if(selectionStr.equals("y") && gold >= 30){
                                    strength += 5;
                                    gold -= 30;
                                    System.out.println("You feel stronger now");
                                } else if(gold < 30){
                                    System.out.println("Your gold is not enough!");
                                }
                                ctr++;
                                break;
                            case 4:
                                if(quest == 0){
                                    int randEkor = rand.nextInt(3) + 1;
                                    int randIkan = rand.nextInt(4);
                                    if(randIkan == 0){
                                        System.out.println("New Quest Accepted: Catch " + randEkor + " Discus(s)");
                                        quest++;
                                        questJenisFish = 0;
                                        questProgress = randEkor;
                                        questString = "Catch " + randEkor + " Discus(s)";
                                    } else if(randIkan == 1){
                                        System.out.println("New Quest Accepted: Catch " + randEkor + " Seahorse(s)");
                                        quest++;
                                        questJenisFish = 1;
                                        questProgress = randEkor;
                                        questString = "Catch " + randEkor + " Seahorse(s)";
                                    } else if(randIkan == 2){
                                        System.out.println("New Quest Accepted: Catch " + randEkor + " Alligator(s)");
                                        quest++;
                                        questJenisFish = 2;
                                        questProgress = randEkor;
                                        questString = "Catch " + randEkor + " Alligator(s)";
                                    } else if(randIkan == 3){
                                        System.out.println("New Quest Accepted: Catch " + randEkor + " Shark(s)");
                                        quest++;
                                        questJenisFish = 3;
                                        questProgress = randEkor;
                                        questString = "Catch " + randEkor + " Shark(s)";
                                    }
                                } else {
                                    System.out.println("There are still missions in progress");
                                }
                                ctr++;
                                break;
                            case 5:
                                int totalDiscus = discusInventory.size() * discusFish.hargaJual;
                                int totalSeahorse = seahorseInventory.size() * seahorseFish.hargaJual;
                                int totalAlligator = alligatorInventory.size() * alligatorFish.hargaJual;
                                int totalShark = sharkInventory.size() * sharkFish.hargaJual;
                                int total = totalDiscus + totalSeahorse + totalAlligator + totalShark;
                                System.out.println("============================");
                                System.out.println("Selling Fish...");
                                System.out.println("Discus: " + discusInventory.size() + " x " + discusFish.hargaJual + " = " + totalDiscus + " G");
                                System.out.println("Seahorse: " + seahorseInventory.size() + " x " + seahorseFish.hargaJual + " = " + totalSeahorse + " G");
                                System.out.println("Alligator: " + alligatorInventory.size() + " x " + alligatorFish.hargaJual + " = " + totalAlligator + " G");
                                System.out.println("Shark: " + sharkInventory.size() + " x " + sharkFish.hargaJual + " = " + totalShark + " G");
                                System.out.println("Total: " + total + " G");
                                System.out.println("============================");
                                discusInventory.clear();
                                seahorseInventory.clear();
                                alligatorInventory.clear();
                                sharkInventory.clear();
                                gold += total;
                                ctr++;
                                break;
                            default:
                                break;
                        }
                    } while(menuFrog != 0);
                    break;
                case 99:
                    gold += 200;
                    System.out.println("You get 200 gold");
                    break;
                default:
                    break;
            }
        } while(menu1 != 0);
    }
}
