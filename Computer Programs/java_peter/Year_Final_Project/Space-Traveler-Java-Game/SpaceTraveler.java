//package Year_Final_Project.Space-Traveler-Java-Game;

import java.io.*;
import java.io.IOException;

import org.fusesource.jansi.AnsiColors;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

class SpaceTraveler {
    public static final int gray = 8;
    public static final int yellow = 11;
    public static final int green_yellow = 148;
    public static final int white_yellow = 229;
    public static final int orange = 220;
    public static final int dark_orange = 214;
    public static final int brown = 58;
    public static final int grn_skin = 10;
    public static final int blue = 153;
    public static final int dark_blue = 30;
    public static final int white = 255;

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
        System.out.println(ansi().fg(yellow).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(gray).a("                                                      #######"));
        System.out.println(ansi().fg(gray).a("                                                    ###########"));
        System.out.println(ansi().fg(gray).a("                                                  ###############"));
        System.out.println(ansi().fg(gray).a("                                                  ###############"));
        System.out.println(ansi().fg(gray).a("                                                    ###########"));
        System.out.println(ansi().fg(gray).a("                                                      #######"));
        System.out.println(ansi().fg(yellow).a("**************************************************************************************************************"));
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
        System.out.println(ansi().fg(blue).a("                                                        ######"));
        System.out.println(ansi().fg(blue).a("                                                     ############"));
        System.out.println(ansi().fg(grn_skin).a("                                                   ################"));
        System.out.println(ansi().fg(grn_skin).a("                                                 ####################"));
        System.out.println(ansi().fg(blue).a("                                                 ####################"));
        System.out.println(ansi().fg(blue).a("                                                   ################"));
        System.out.println(ansi().fg(blue).a("                                                     ############"));
        System.out.println(ansi().fg(blue).a("                                                        ######"));
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


    public static int mainMenu() {
        System.out.println("    WELCOME TO SPACE TRAVELER  ");
        System.out.println("1. Game Instructions");
        System.out.println("2. Play Game");
        System.out.println("3. Exit");
        System.out.println();
        
        System.out.print("Enter a choice: ");
        int choice = Keyboard.readInt();
        System.out.println();

        return choice;
    }

    public static char instructions() {
        char choice;

        System.out.println("                                Game Instructions                                ");
        System.out.println("You are a traveler through space and your mission is to make it to Europa, Jupiter's Moon!");
        System.out.println("Your goal is to make it to Europa, to study if there's life!");
        System.out.println("You start on Earth and then you move on to Mars, through the asteroid belt until..");
        System.out.println("You finally reach Jupiter and its moon Europa");
        System.out.println("Each planet gives you a set of points..");
        System.out.println("BUT....");
        System.out.println("If you get hit by asteroids on your way you lose points");
        System.out.println("Some of the challenges on the way are asteroids and our solar system's ASTEROID BELT");
        System.out.println("The goal is to try to make it to the end and get as many points as possible..");
        System.out.println("You start with 500 points..");
        System.out.println("If you lose all of your points, YOU LOSE THE GAME!");
        System.out.println("TRY NOT TO LOSE!");
        System.out.println("Enjoy! :D");

        System.out.println();
        System.out.println("Press B to continue...");
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

    public static void game() {

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        //System.out.println(ansi().bg(BLACK));
        drawCaptain();
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
        drawNeptune();


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
                    System.out.println("Error. Please enter a number from 1 to 3");
                    System.out.println();
                    mainMenu();
                break;
            }
        }
    }
}
