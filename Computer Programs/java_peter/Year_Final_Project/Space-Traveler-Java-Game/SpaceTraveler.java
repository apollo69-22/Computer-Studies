//package Year_Final_Project.Space-Traveler-Java-Game;

import java.io.*;
import java.io.IOException;

import org.fusesource.jansi.AnsiColors;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

class SpaceTraveler {
    /******************whites********************/
    public static final int white = 255;
    public static final int almost_white = 238;
    public static final int light_white = 245;
    public static final int white_yellow = 229;
    /********************************************/

    /******************blacks********************/
    public static final int light_black = 240;
    public static final int almost_black = 233;
    /********************************************/
    
    /******************grays********************/
    public static final int gray = 8;
    /********************************************/

    /******************browns********************/
    public static final int brown = 58;
    /********************************************/

    /******************reds********************/
    public static final int flame_red = 9;
    /********************************************/
    
    /******************yellows********************/
    public static final int yellow = 11;
    public static final int green_yellow = 148;
    /********************************************/

    /******************oranges********************/
    public static final int orange = 220;
    public static final int dark_orange = 214;
    /********************************************/

    /******************blues********************/
    public static final int blue = 153;
    public static final int dark_blue = 30;
    /********************************************/

    /******************greens********************/    
    public static final int grn_skin = 10;
    /********************************************/


    public static void drawSun() {
        System.out.println(ansi().fg(yellow).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(yellow).a("                            ##########################################################"));
        System.out.println(ansi().fg(yellow).a("                        ##################################################################"));
        System.out.println(ansi().fg(yellow).a("                     ########################################################################"));
        System.out.println(ansi().fg(yellow).a("                   ############################################################################"));
        System.out.println(ansi().fg(yellow).a("                 ################################################################################"));
        System.out.println(ansi().fg(yellow).a("               ####################################################################################"));
        System.out.println(ansi().fg(yellow).a("             ########################################################################################"));
        System.out.println(ansi().fg(yellow).a("            ##########################################################################################"));
        System.out.println(ansi().fg(yellow).a("           ############################################################################################"));
        System.out.println(ansi().fg(yellow).a("          ##############################################################################################"));
        System.out.println(ansi().fg(yellow).a("         ################################################################################################"));
        System.out.println(ansi().fg(yellow).a("        ##################################################################################################"));
        System.out.println(ansi().fg(yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(yellow).a("        ##################################################################################################"));
        System.out.println(ansi().fg(yellow).a("         ################################################################################################"));
        System.out.println(ansi().fg(yellow).a("          ##############################################################################################"));
        System.out.println(ansi().fg(yellow).a("           ############################################################################################"));
        System.out.println(ansi().fg(yellow).a("            ##########################################################################################"));
        System.out.println(ansi().fg(yellow).a("             ########################################################################################"));
        System.out.println(ansi().fg(yellow).a("               ####################################################################################"));
        System.out.println(ansi().fg(yellow).a("                 ################################################################################"));
        System.out.println(ansi().fg(yellow).a("                   ############################################################################"));
        System.out.println(ansi().fg(yellow).a("                     ########################################################################"));
        System.out.println(ansi().fg(yellow).a("                        ##################################################################"));
        System.out.println(ansi().fg(yellow).a("                            ##########################################################"));
        System.out.println(ansi().fg(yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(yellow).a("**************************************************************************************************************"));
    }

    public static void drawMercury() {
        System.out.println(ansi().fg(white).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(gray).a("                                                      #######"));
        System.out.println(ansi().fg(gray).a("                                                    ###########"));
        System.out.println(ansi().fg(gray).a("                                                  ###############"));
        System.out.println(ansi().fg(gray).a("                                                  ###############"));
        System.out.println(ansi().fg(gray).a("                                                    ###########"));
        System.out.println(ansi().fg(gray).a("                                                      #######"));
        System.out.println(ansi().fg(white).a("**************************************************************************************************************"));
    }

    public static void drawVenus() {
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(yellow).a("                                                      ######"));
        System.out.println(ansi().fg(yellow).a("                                                   ############"));
        System.out.println(ansi().fg(yellow).a("                                                 ################"));
        System.out.println(ansi().fg(yellow).a("                                               ####################"));
        System.out.println(ansi().fg(yellow).a("                                               ####################"));
        System.out.println(ansi().fg(yellow).a("                                                 ################"));
        System.out.println(ansi().fg(yellow).a("                                                   ############"));
        System.out.println(ansi().fg(yellow).a("                                                      ######"));
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
    }

    public static void drawEarth() {
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(blue).a("                                                      ######"));
        System.out.println(ansi().fg(blue).a("                                                   ############"));
        System.out.println(ansi().fg(grn_skin).a("                                                 ################"));
        System.out.println(ansi().fg(grn_skin).a("                                               ####################"));
        System.out.println(ansi().fg(blue).a("                                               ####################"));
        System.out.println(ansi().fg(blue).a("                                                 ################"));
        System.out.println(ansi().fg(blue).a("                                                   ############"));
        System.out.println(ansi().fg(blue).a("                                                      ######"));
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
    }

    public static void drawMars() {
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(dark_orange).a("                                                      #######"));
        System.out.println(ansi().fg(dark_orange).a("                                                    ###########"));
        System.out.println(ansi().fg(dark_orange).a("                                                  ###############"));
        System.out.println(ansi().fg(dark_orange).a("                                                  ###############"));
        System.out.println(ansi().fg(dark_orange).a("                                                    ###########"));
        System.out.println(ansi().fg(dark_orange).a("                                                      #######"));
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
    }
    
    public static void drawJupiter() {
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(gray).a("                                                  ##############"));
        System.out.println(ansi().fg(gray).a("                                               ####################"));
        System.out.println(ansi().fg(green_yellow).a("                                          ##############################"));
        System.out.println(ansi().fg(white_yellow).a("                                      ######################################"));
        System.out.println(ansi().fg(white_yellow).a("                                    ##########################################"));
        System.out.println(ansi().fg(dark_orange).a("                                   ############################################"));        
        System.out.println(ansi().fg(orange).a("                                  ##############################################"));
        System.out.println(ansi().fg(white_yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(orange).a("                                 ################################################"));
        System.out.println(ansi().fg(dark_orange).a("                                 ################################################"));
        System.out.println(ansi().fg(yellow).a("                                  ##############################################"));
        System.out.println(ansi().fg(yellow).a("                                   ############################################"));
        System.out.println(ansi().fg(yellow).a("                                      ######################################"));
        System.out.println(ansi().fg(yellow).a("                                          ##############################"));
        System.out.println(ansi().fg(yellow).a("                                               ####################"));
        System.out.println(ansi().fg(yellow).a("                                                  ##############"));
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
    }

    public static void drawSaturn() {
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(white_yellow).a("                                                  ##############"));
        System.out.println(ansi().fg(white_yellow).a("                                               ####################"));
        System.out.println(ansi().fg(white_yellow).a("                                          ##############################"));
        System.out.println(ansi().fg(white_yellow).a("                                      ######################################"));
        System.out.println(ansi().fg(white_yellow).a("                                    ##########################################"));
        System.out.println(ansi().fg(white_yellow).a("                                   ############################################"));        
        System.out.println(ansi().fg(white_yellow).a("                                  ##############################################"));
        System.out.println(ansi().fg(white_yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(white_yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(white_yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(white_yellow).a("                                  ##############################################"));
        System.out.println(ansi().fg(white_yellow).a("                                   ############################################"));
        System.out.println(ansi().fg(white_yellow).a("                                      ######################################"));
        System.out.println(ansi().fg(white_yellow).a("                                          ##############################"));
        System.out.println(ansi().fg(white_yellow).a("                                               ####################"));
        System.out.println(ansi().fg(white_yellow).a("                                                  ##############"));
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
    }

    public static void drawUranus() {
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(blue).a("                                                    ##########"));
        System.out.println(ansi().fg(blue).a("                                                 ################"));
        System.out.println(ansi().fg(blue).a("                                               ####################"));
        System.out.println(ansi().fg(blue).a("                                             ########################"));
        System.out.println(ansi().fg(blue).a("                                             ########################"));
        System.out.println(ansi().fg(blue).a("                                             ########################"));
        System.out.println(ansi().fg(blue).a("                                               ####################"));
        System.out.println(ansi().fg(blue).a("                                                 ################"));
        System.out.println(ansi().fg(blue).a("                                                    ##########"));
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
    }

    public static void drawNeptune() {
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(dark_blue).a("                                                    ##########"));
        System.out.println(ansi().fg(dark_blue).a("                                                 ################"));
        System.out.println(ansi().fg(dark_blue).a("                                               ####################"));
        System.out.println(ansi().fg(dark_blue).a("                                             ########################"));
        System.out.println(ansi().fg(dark_blue).a("                                             ########################"));
        System.out.println(ansi().fg(dark_blue).a("                                             ########################"));
        System.out.println(ansi().fg(dark_blue).a("                                               ####################"));
        System.out.println(ansi().fg(dark_blue).a("                                                 ################"));
        System.out.println(ansi().fg(dark_blue).a("                                                    ##########"));
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(white).a(""));
    }

    public static void drawCaptain() {
        System.out.println(ansi().fg(brown).a("                                                      **"));
        System.out.println(ansi().fg(brown).a("                                                    ******"));
        System.out.println(ansi().fg(brown).a("                                                    ******"));
        System.out.println(ansi().fg(brown).a("                                                  ***********"));
        System.out.println(ansi().fg(brown).a("                                                  ***********"));
        System.out.println(ansi().fg(grn_skin).a("                                                    *     *"));
        System.out.println(ansi().fg(grn_skin).a("                                                   *       *"));
        System.out.println(ansi().fg(grn_skin).a("                                                  *  O   0  *"));
        System.out.println(ansi().fg(grn_skin).a("                                                  *    U    *"));
        System.out.println(ansi().fg(grn_skin).a("                                                  *  .   .  *"));
        System.out.println(ansi().fg(grn_skin).a("                                                  *   ...   *"));
        System.out.println(ansi().fg(grn_skin).a("                                                  **       **").fg(WHITE));
    }

    public static void drawSpaceship(String move_spcs, int flame) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.printf("\n%s" + ansi().fg(white).a("               *").fg(light_black).a("*************").fg(white).a("."), move_spcs);
        System.out.printf("\n%s" + ansi().fg(flame).a("    ''''.  ").fg(white).a("     `.`.          *"), move_spcs);
        System.out.printf("\n%s" + ansi().fg(flame).a("   . ' ' '.").fg(white).a("     *********************************************."), move_spcs);
        System.out.printf("\n%s" + ansi().fg(flame).a("' .        ").fg(light_black).a("*** ").fg(white).a("*    '         '        ").fg(yellow).a(".").fg(white).a("             *          '"), move_spcs);
        System.out.printf("\n%s" + ansi().fg(flame).a("   ' . . . ").fg(light_black).a("***").fg(white).a("*    ***********       ").fg(yellow).a("'   '").fg(white).a("          *               '"), move_spcs);
        System.out.printf("\n%s" + ansi().fg(flame).a("    ....'     ").fg(white).a("*").fg(light_black).a("  ...............    ").fg(yellow).a("'     '").fg(white).a("        *                  #").fg(light_black).a("==---"), move_spcs);
        System.out.printf("\n%s" + ansi().fg(flame).a("   . ' ' '.   ").fg(white).a("*                     ").fg(yellow).a("'     '").fg(white).a("        *                ."), move_spcs);
        System.out.printf("\n%s" + ansi().fg(flame).a("' .        ").fg(light_black).a("***").fg(white).a("*    ***********       ").fg(yellow).a("' . '").fg(white).a("          *            ."), move_spcs);
        System.out.printf("\n%s" + ansi().fg(flame).a("   ' . . . ").fg(light_black).a("*** ").fg(white).a("*    '         '                      *        ."), move_spcs);
        System.out.printf("\n%s" + ansi().fg(flame).a("    ....'  ").fg(white).a("     *********************************************"), move_spcs);
        System.out.printf("\n%s" + ansi().fg(white).a("               ").fg(white).a(" .'.'           .*"), move_spcs);
        System.out.printf("\n%s" + ansi().fg(white).a("                *").fg(light_black).a("************").fg(white).a("'"), move_spcs);
    } 
    
    public static void moveSpaceship(boolean engines_on) throws IOException, InterruptedException  {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        int flame = 0;
        String move_spcs = "";

        if (engines_on) {
            for (int i = 0; i < 100; i++) {
                if (i == 0) {
                    drawSpaceship(move_spcs, flame);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    flame = flame_red;

                    drawSpaceship(move_spcs, flame);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                else if (i > 0 && i < 100) {
                    flame = flame_red;
                    drawSpaceship(move_spcs, flame);
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                if (i == 99) {
                    flame = 0;
                    drawSpaceship(move_spcs, flame);
                }
                move_spcs += " ";
            }
        }
        else {
            drawSpaceship(move_spcs, flame);
        }

    }

    public static void drawWormhole() {
        System.out.println(ansi().fg(light_white).a("                                                      ,").fg(almost_white).a("-----").fg(light_white).a(","));
        System.out.println(ansi().fg(light_white).a("                                                    '").fg(almost_black).a("#########").fg(light_white).a("'"));
        System.out.println(ansi().fg(light_white).a("                                                  '").fg(almost_white).a("-").fg(almost_black).a("##")
                                                                                                                .fg(almost_white).a("-").fg(almost_black).a("##")
                                                                                                                .fg(almost_white).a("-").fg(almost_black).a("##")
                                                                                                                .fg(almost_white).a("-").fg(almost_black).a("##")
                                                                                                                .fg(almost_white).a("-'"));

        System.out.println(ansi().fg(light_white).a("                                                  '").fg(almost_white).a("-").fg(almost_black).a("##")
                                                                                                                .fg(almost_white).a("-").fg(almost_black).a("##")
                                                                                                                .fg(almost_white).a("-").fg(almost_black).a("##")
                                                                                                                .fg(almost_white).a("-").fg(almost_black).a("##")
                                                                                                                .fg(almost_white).a("-'"));
        System.out.println(ansi().fg(light_white).a("                                                    '").fg(almost_black).a("#########").fg(light_white).a("'"));
        System.out.println(ansi().fg(light_white).a("                                                      '").fg(almost_white).a("-----").fg(light_white).a("'"));
    }


    public static int mainMenu()throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println(" ___________________________________");
        System.out.println("|     WELCOME TO SPACE TRAVELER     |");
        System.out.println("|                                   |");
        System.out.println("| 1. Game Instructions              |");
        System.out.println("| 2. Play Game                      |");
        System.out.println("| 3. Exit                           |");
        System.out.println("|___________________________________|");
        System.out.println();
        
        System.out.print("Enter a choice: ");
        int choice = Keyboard.readInt();
        System.out.println();

        return choice;
    }

    public static char instructions() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        char choice;

        System.out.println(" __________________________________________________________________________________________________________________");
        System.out.println("|                                             Instructions:                                                        |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|You are a new Lieutenant in Starfleet.                                                                            |");
        System.out.println("|You're assigned to Company Alpha under Captain Muhammad Al Sajan. Assigned to the Orbiter IV!                     |");
        System.out.println("|You're heading to Europa, one of Jupiter's Moons to explore any Alien life you may find.                          |");
        System.out.println("|Unfortunately the Ships navigation system is a bit glitchy…                                                       |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|Mission:                                                                                                          |");
        System.out.println("|Help Captain Muhammad cross the Solar System safely.                                                              |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|Objective:                                                                                                        |");
        System.out.println("|There are multiple Satellites located within the Solar System which have backup Star charts and co-ordinates.     |");
        System.out.println("|You must locate the proper ones which will take you to Europa.                                                    |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|CAUTION:                                                                                                          |");
        System.out.println("|Space junk is dangerous!                                                                                          |");
        System.out.println("|Get hit by Asteroids, you lose lives.                                                                             |");
        System.out.println("|If you run out of money while your ship needs repairs you'll die!!                                                |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|Starting Stats:                                                                                                   |");
        System.out.println("|                  - 3 Lives                                                                                       |");
        System.out.println("|                  - $$55,000 (Starfleet Dollars)                                                                  |");
        System.out.println("|                  - Starting Location: Earth                                                                      |");
        System.out.println("|__________________________________________________________________________________________________________________|");

        System.out.println();
        System.out.print("Press B to continue: ");
        choice = Keyboard.readChar();
        System.out.println();

        boolean B;
        if (choice == 'B' || choice == 'b') {
            B = true;
        }
        else if (choice != 'B' || choice != 'b') {
            B = false;
            System.out.println("Error. Please press B to continue...");
            choice = Keyboard.readChar();
            System.out.println();
        }
            
        return choice;
    }

    public static void getEarth() {      
        System.out.println("Location: Planet Earth");
        System.out.println();
        System.out.println("Press T to travel to the next planet");
        char choice = Keyboard.readChar();

        boolean T;
        if (choice == 'T' || choice == 't') {
            T = true;


        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }
    }

    public static void getMars() {      
        System.out.println("Location: Planet Mars");
        System.out.println();
        System.out.println("Press T to travel to the next planet");
        char choice = Keyboard.readChar();

        boolean T;
        if (choice == 'T' || choice == 't') {
            T = true;
        }
        else if (choice != 'T' || choice != 't') {
            T = false;
            System.out.println("Error. Please press T to travel...");
            choice = Keyboard.readChar();
            System.out.println();
        }
    }

    public static void getEuropa() {      
        System.out.println("Location:  Jupiter's Moon; Europa ");
        System.out.println();
        System.out.println("    CONGRATULATIONS YOU HAVE WON THE GAME!!    ");
        System.out.println();
        System.out.println("Please press E to exit..");
        char choice = Keyboard.readChar();

        boolean E;
        if (choice == 'E' || choice == 'e') {
            E = true;
        }
        else if (choice != 'E' || choice != 'e') {
            E = false;
            System.out.println("Error. Please press E to exit...");
            choice = Keyboard.readChar();
            System.out.println();
        }
    }

    public static void getStats(String stats[]) {
        System.out.println("  ______________________________________");
        System.out.println(" |   Lives   |   Money   |   Location   |");
        System.out.printf(" |     %s     |   %s  |    %s     |\n", stats[0], stats[1], stats[2]);
        System.out.println(" |______________________________________|");
    } 

    public static void game() {
        String stats[] = {"3", "$$5500", "Jupiter"};

        getStats(stats);
        while(true){}
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        //System.out.println(ansi().bg(light_black));
        /*drawCaptain();
        System.out.println();
        drawSun();
        System.out.println();
        drawMercury();
        System.out.println();
        drawVenus();
        System.out.println();
        drawEarth();
        System.out.println();
        drawMars();
        System.out.println();
        drawJupiter();
        System.out.println();
        drawSaturn();
        System.out.println();
        drawUranus();
        System.out.println();
        drawNeptune();*/
        
        //moveSpaceship(true);

        //drawWormhole();

        int choice = 0;

        while (choice != 3) {
            choice = mainMenu();

            switch (choice) {
                case 1:
                    instructions();
                break;

                case 2:
                    game();
                break;

                case 3:
                break;

                default:
                    System.out.print("Error. Please enter a number from 1 to 3.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    break;
                    }
                    
                    mainMenu();
            }
        }
    }
}