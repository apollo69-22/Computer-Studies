//package Year_Final_Project.Space-Traveler-Java-Game;

import java.io.*;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
//import java.util.Hashtable;

//import org.fusesource.jansi.AnsiColors;
//import org.fusesource.jansi.AnsiConsole;

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

    public static void drawMoon() {
        System.out.println(ansi().fg(white).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(gray).a("                                                      #####"));
        System.out.println(ansi().fg(gray).a("                                                    #########"));
        System.out.println(ansi().fg(gray).a("                                                    #########"));
        System.out.println(ansi().fg(gray).a("                                                      #####"));
        System.out.println(ansi().fg(white).a("**************************************************************************************************************"));
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
        System.out.println(ansi().fg(yellow).a("                                  ############################").fg(flame_red).a("****").fg(yellow).a("##############"));
        System.out.println(ansi().fg(yellow).a("                                   ##########################").fg(flame_red).a("******").fg(yellow).a("############"));
        System.out.println(ansi().fg(yellow).a("                                      #######################").fg(flame_red).a("******").fg(yellow).a("#########"));
        System.out.println(ansi().fg(yellow).a("                                          ####################").fg(flame_red).a("****").fg(yellow).a("######"));
        System.out.println(ansi().fg(yellow).a("                                               ####################"));
        System.out.println(ansi().fg(yellow).a("                                                  ##############"));
        System.out.println(ansi().fg(gray).a("**************************************************************************************************************"));
    }

    public static void drawEuropa() {
        System.out.println(ansi().fg(white).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(white_yellow).a("                                                    #####"));
        System.out.println(ansi().fg(white_yellow).a("                                                  #########"));
        System.out.println(ansi().fg(white_yellow).a("                                                  #########"));
        System.out.println(ansi().fg(white_yellow).a("                                                    #####"));
        System.out.println(ansi().fg(white).a("**************************************************************************************************************"));
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

    public static void drawBubble() {
        System.out.println(" ______________________________________ ");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        System.out.println("|_____________________________       __|");
        System.out.println("                              \\     / ");
        System.out.println("                               \\   /  ");
        System.out.println("                                \\ /   ");
        System.out.println("                                 '");

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

        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(/*\t\t\t\t\t\t\t\t\t\t\t\t*/" ___________________________________");
        System.out.println(/*\t\t\t\t\t\t\t\t\t\t\t\t*/"|     WELCOME TO SPACE TRAVELER     |");
        System.out.println(/*\t\t\t\t\t\t\t\t\t\t\t\t*/"|                                   |");
        System.out.println(/*\t\t\t\t\t\t\t\t\t\t\t\t*/"| 1. Game Instructions              |");
        System.out.println(/*\t\t\t\t\t\t\t\t\t\t\t\t*/"| 2. Play Game                      |");
        System.out.println(/*\t\t\t\t\t\t\t\t\t\t\t\t*/"| 3. Exit                           |");
        System.out.println(/*\t\t\t\t\t\t\t\t\t\t\t\t*/"|___________________________________|");
        System.out.println();
        
        System.out.print(/*\t\t\t\t\t\t\t\t\t\t\t\t*/"Enter a choice: ");
        int choice = Keyboard.readInt();
        System.out.println();

        return choice;
    }

    public static char instructions() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        char choice;

        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(/*\t\t\t\t\t\t\t*/" __________________________________________________________________________________________________________________");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                                             Instructions:                                                        |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                                                                                                                  |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|You are a new Lieutenant in Starfleet.                                                                            |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|You're assigned to Company Alpha under Captain Muhammad Al Sajan. Assigned to the Orbiter IV!                     |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|You're heading to Europa, one of Jupiter's Moons to explore any Alien life you may find.                          |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|Unfortunately the Ships navigation system is a bit glitchy…                                                       |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                                                                                                                  |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|Mission:                                                                                                          |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|Help Captain Muhammad cross the Solar System safely.                                                              |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                                                                                                                  |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|Objective:                                                                                                        |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|There are multiple Satellites located within the Solar System which have backup Star charts and co-ordinates.     |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|You must locate the proper ones which will take you to Europa.                                                    |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                                                                                                                  |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|CAUTION:                                                                                                          |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|Space junk is dangerous!                                                                                          |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|Get hit by Asteroids, you lose lives.                                                                             |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|If you run out of money while your ship needs repairs you'll die!!                                                |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                                                                                                                  |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|Starting Stats:                                                                                                   |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                  - 3 Lives                                                                                       |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                  - S-$55,000 (Starfleet Dollars)                                                                 |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                  - Starting Location: Earth                                                                      |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|                                                                                                                  |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|Tips:                                                                                                             |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|      Try: 'help' for a list of commands!                                                                         |");
        System.out.println(/*\t\t\t\t\t\t\t*/"|__________________________________________________________________________________________________________________|");

        System.out.println();
        System.out.print(/*\t\t\t\t\t\t\t*/"Press B to continue: ");
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
        System.out.printf(" |     %s     |   %s |    %s     |\n", stats[0], stats[1], stats[2]);
        System.out.println(" |______________________________________|");
    }

    public static void getMap(Map<String, String> star_map) {
        System.out.println();
        System.out.println(star_map);
    }

    public static void check_location(String location, Map<String, String> star_map) {
        String output = "not found";

        for(Map.Entry<String, String> loc: star_map.entrySet()) {
            if (loc.getKey().equals(location)) {
                output = location + ": " + loc.getValue();
                break;
            }
            else if (loc.getValue().equals(location)) {
                output = location + ": " + loc.getKey();
                break;
            }
        }
        System.out.printf("\n%s\n", output);
    }

    public static void getStore() {
        System.out.println(" ___________________________________________________________________________________________________________________");
        System.out.println("|                                                       STORE                                                       |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|                                                                                                                   |");
        System.out.println("|___________________________________________________________________________________________________________________|");
    }

    public static void game() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        String locations[] = {
            "SUN", "MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN", "URANUS", "NEPTUNE", "PLUTO"
        };

        Map<String, String> star_map = new HashMap<>();
        star_map.put("EARTH", "-0.992:-0.1:0");
        star_map.put("SUN", "0:0:0");

        String stats[] = {"3", "S-$5500", locations[3]};
        String command_lst[] = {
            "exit", "help", "stats", "store", "find: ", "starmap"
        };

        String command = "";
        while(!command.equals(command_lst[0])) {
            
            System.out.print("\nCommand: ");
            command = Keyboard.readString();

            if (command.equals(command_lst[1])) {
                System.out.print("\n| ");
                for (int i = 0; i < command_lst.length; i++) {
                    System.out.print(command_lst[i] + " : ");
                }
                System.out.print("|\n");
            }
            else if (command.equals(command_lst[2])) {
                getStats(stats);
            }
            else if (command.contains(command_lst[4])) {
                String x[] = command.split(" ");
                check_location(x[1], star_map);
            }
            else if (command.contains(command_lst[5])) {
                getMap(star_map);
            }
        }
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
        drawMoon();
        System.out.println();
        drawMars();
        System.out.println();
        drawJupiter();
        System.out.println();
        drawEuropa();
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