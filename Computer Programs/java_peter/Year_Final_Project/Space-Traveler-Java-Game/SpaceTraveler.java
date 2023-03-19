//package Year_Final_Project.Space-Traveler-Java-Game;

import java.io.*;
import java.io.IOException;

import org.fusesource.jansi.AnsiColors;
import org.fusesource.jansi.AnsiConsole;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

class SpaceTraveler {
    public static void drawCaptain() {
        System.out.println("                                                      **");
        System.out.println("                                                    ******");
        System.out.println("                                                    ******");
        System.out.println("                                                  ***********");
        System.out.println("                                                  ***********");
        System.out.println("                                                    *     *");
        System.out.println("                                                   *       *");
        System.out.println("                                                  *  O   0  *");
        System.out.println("                                                  *    U    *");
        System.out.println("                                                  *  .   .  *");
        System.out.println("                                                  *   ...   *");
        System.out.println("                                                  **       **");
    }

    public static void drawSun() {
        System.out.println(ansi().fg(WHITE).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(YELLOW).a("                                           ########################"));
        System.out.println(ansi().fg(YELLOW).a("                                      ##################################"));
        System.out.println(ansi().fg(YELLOW).a("                                  ##########################################"));
        System.out.println(ansi().fg(YELLOW).a("                               ################################################"));
        System.out.println(ansi().fg(YELLOW).a("                             ####################################################"));
        System.out.println(ansi().fg(YELLOW).a("                           ########################################################"));
        System.out.println(ansi().fg(YELLOW).a("                         ############################################################"));
        System.out.println(ansi().fg(YELLOW).a("                       ################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                      ##################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                     ####################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                    ######################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                   ########################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                  ##########################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                 ############################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                 ############################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                 ############################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                 ############################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                 ############################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                 ############################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                 ############################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                 ############################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                 ############################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                  ##########################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                   ########################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                    ######################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                     ####################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                      ##################################################################"));
        System.out.println(ansi().fg(YELLOW).a("                        ##############################################################"));
        System.out.println(ansi().fg(YELLOW).a("                          ##########################################################"));
        System.out.println(ansi().fg(YELLOW).a("                            ######################################################"));
        System.out.println(ansi().fg(YELLOW).a("                              ##################################################"));
        System.out.println(ansi().fg(YELLOW).a("                                 ############################################"));
        System.out.println(ansi().fg(YELLOW).a("                                          ##########################"));
        System.out.println(ansi().fg(WHITE).a("**************************************************************************************************************"));
    }

    public static void drawMercury() {}

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println(ansi().fg(DEFAULT).a("hello"));
    }
}
