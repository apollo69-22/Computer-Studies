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
    }
}
