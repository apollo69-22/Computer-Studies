//package Year_Final_Project.Space-Traveler-Java-Game;

import java.io.*;
import java.io.IOException;
import java.util.Map;

//import org.fusesource.jansi.Ansi;
//import org.fusesource.jansi.AnsiMain;
//import org.fusesource.jansi.AnsiType;

import java.util.HashMap;
//import java.util.Hashtable;

//import org.fusesource.jansi.AnsiColors;
//import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

class Colors {
    /******************whites********************/
    static final int white = 255;
    static final int almost_white = 238;
    static final int light_white = 245;
    static final int white_yellow = 229;
    /********************************************/

    /******************blacks********************/
    static final int light_black = 240;
    static final int almost_black = 233;
    /********************************************/
    
    /******************grays********************/
    static final int gray = 8;
    /********************************************/

    /******************browns********************/
    static final int brown = 58;
    /********************************************/

    /******************reds********************/
    static final int flame_red = 9;
    /********************************************/
    
    /******************yellows********************/
    static final int yellow = 11;
    static final int green_yellow = 148;
    /********************************************/

    /******************oranges********************/
    static final int orange = 220;
    static final int dark_orange = 214;
    /********************************************/

    /******************blues********************/
    static final int blue = 153;
    static final int dark_blue = 30;
    /********************************************/

    /******************greens********************/    
    static final int grn_skin = 10;
    /********************************************/
}

class SpaceTraveler {

    public static void drawSun() {
        System.out.println(ansi().fg(Colors.yellow).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                            ##########################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                        ##################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                     ########################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                   ############################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                 ################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("               ####################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("             ########################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("            ##########################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("           ############################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("          ##############################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("         ################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("        ##################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("       ####################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("        ##################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("         ################################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("          ##############################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("           ############################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("            ##########################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("             ########################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("               ####################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                 ################################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                   ############################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                     ########################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                        ##################################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                            ##########################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("**************************************************************************************************************"));
        System.out.print(ansi().fg(Colors.white));
    }

    public static void drawMercury() {
        System.out.println(ansi().fg(Colors.white).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.gray).a("                                                      #######"));
        System.out.println(ansi().fg(Colors.gray).a("                                                    ###########"));
        System.out.println(ansi().fg(Colors.gray).a("                                                  ###############"));
        System.out.println(ansi().fg(Colors.gray).a("                                                  ###############"));
        System.out.println(ansi().fg(Colors.gray).a("                                                    ###########"));
        System.out.println(ansi().fg(Colors.gray).a("                                                      #######"));
        System.out.println(ansi().fg(Colors.white).a("**************************************************************************************************************"));
    }

    public static void drawVenus() {
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.yellow).a("                                                      ######"));
        System.out.println(ansi().fg(Colors.yellow).a("                                                   ############"));
        System.out.println(ansi().fg(Colors.yellow).a("                                                 ################"));
        System.out.println(ansi().fg(Colors.yellow).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.yellow).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.yellow).a("                                                 ################"));
        System.out.println(ansi().fg(Colors.yellow).a("                                                   ############"));
        System.out.println(ansi().fg(Colors.yellow).a("                                                      ######"));
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.print(ansi().fg(Colors.white));
    }

    public static void drawEarth() {
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.blue).a("                                                      ######"));
        System.out.println(ansi().fg(Colors.blue).a("                                                   ############"));
        System.out.println(ansi().fg(Colors.grn_skin).a("                                                 ################"));
        System.out.println(ansi().fg(Colors.grn_skin).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.blue).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.blue).a("                                                 ################"));
        System.out.println(ansi().fg(Colors.blue).a("                                                   ############"));
        System.out.println(ansi().fg(Colors.blue).a("                                                      ######"));
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.print(ansi().fg(Colors.white));
    }

    public static void drawMoon() {
        System.out.println(ansi().fg(Colors.white).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.gray).a("                                                      #####"));
        System.out.println(ansi().fg(Colors.gray).a("                                                    #########"));
        System.out.println(ansi().fg(Colors.gray).a("                                                    #########"));
        System.out.println(ansi().fg(Colors.gray).a("                                                      #####"));
        System.out.println(ansi().fg(Colors.white).a("**************************************************************************************************************"));
    }

    public static void drawMars() {
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.dark_orange).a("                                                      #######"));
        System.out.println(ansi().fg(Colors.dark_orange).a("                                                    ###########"));
        System.out.println(ansi().fg(Colors.dark_orange).a("                                                  ###############"));
        System.out.println(ansi().fg(Colors.dark_orange).a("                                                  ###############"));
        System.out.println(ansi().fg(Colors.dark_orange).a("                                                    ###########"));
        System.out.println(ansi().fg(Colors.dark_orange).a("                                                      #######"));
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.print(ansi().fg(Colors.white));
    }
    
    public static void drawJupiter() {
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.gray).a("                                                  ##############"));
        System.out.println(ansi().fg(Colors.gray).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.green_yellow).a("                                          ##############################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                      ######################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                    ##########################################"));
        System.out.println(ansi().fg(Colors.dark_orange).a("                                   ############################################"));        
        System.out.println(ansi().fg(Colors.orange).a("                                  ##############################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(Colors.orange).a("                                 ################################################"));
        System.out.println(ansi().fg(Colors.dark_orange).a("                                 ################################################"));
        System.out.println(ansi().fg(Colors.yellow).a("                                  ############################").fg(Colors.flame_red).a("****").fg(Colors.yellow).a("##############"));
        System.out.println(ansi().fg(Colors.yellow).a("                                   ##########################").fg(Colors.flame_red).a("******").fg(Colors.yellow).a("############"));
        System.out.println(ansi().fg(Colors.yellow).a("                                      #######################").fg(Colors.flame_red).a("******").fg(Colors.yellow).a("#########"));
        System.out.println(ansi().fg(Colors.yellow).a("                                          ####################").fg(Colors.flame_red).a("****").fg(Colors.yellow).a("######"));
        System.out.println(ansi().fg(Colors.yellow).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.yellow).a("                                                  ##############"));
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.print(ansi().fg(Colors.white));
    }

    public static void drawEuropa() {
        System.out.println(ansi().fg(Colors.white).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                                    #####"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                                  #########"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                                  #########"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                                    #####"));
        System.out.println(ansi().fg(Colors.white).a("**************************************************************************************************************"));
    }

    public static void drawSaturn() {
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                                  ##############"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                          ##############################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                      ######################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                    ##########################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                   ############################################"));        
        System.out.println(ansi().fg(Colors.white_yellow).a("                                  ##############################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                 ################################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                  ##############################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                   ############################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                      ######################################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                          ##############################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.white_yellow).a("                                                  ##############"));
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.print(ansi().fg(Colors.white));
    }

    public static void drawUranus() {
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.blue).a("                                                    ##########"));
        System.out.println(ansi().fg(Colors.blue).a("                                                 ################"));
        System.out.println(ansi().fg(Colors.blue).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.blue).a("                                             ########################"));
        System.out.println(ansi().fg(Colors.blue).a("                                             ########################"));
        System.out.println(ansi().fg(Colors.blue).a("                                             ########################"));
        System.out.println(ansi().fg(Colors.blue).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.blue).a("                                                 ################"));
        System.out.println(ansi().fg(Colors.blue).a("                                                    ##########"));
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.print(ansi().fg(Colors.white));
    }

    public static void drawNeptune() {
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.dark_blue).a("                                                    ##########"));
        System.out.println(ansi().fg(Colors.dark_blue).a("                                                 ################"));
        System.out.println(ansi().fg(Colors.dark_blue).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.dark_blue).a("                                             ########################"));
        System.out.println(ansi().fg(Colors.dark_blue).a("                                             ########################"));
        System.out.println(ansi().fg(Colors.dark_blue).a("                                             ########################"));
        System.out.println(ansi().fg(Colors.dark_blue).a("                                               ####################"));
        System.out.println(ansi().fg(Colors.dark_blue).a("                                                 ################"));
        System.out.println(ansi().fg(Colors.dark_blue).a("                                                    ##########"));
        System.out.println(ansi().fg(Colors.gray).a("**************************************************************************************************************"));
        System.out.println(ansi().fg(Colors.white));
    }

    public static void drawSpaceRock() {
        System.out.println(ansi().fg(Colors.gray).a("                                                        # #                                                   "));
        System.out.println(ansi().fg(Colors.gray).a("                                                       # # #                                                   "));
        System.out.println(ansi().fg(Colors.gray).a("                                                        # #                                                 "));
        System.out.print(ansi().fg(Colors.white));
    }

    public static void moveSpaceRock() throws IOException, InterruptedException  {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        //St

        
        //int fire = 0;
        //String ship_pos = "";
        /*
        if (hit) {
            for (int i = 0; i < 176; i++) {
                if (i == 0) {
                    drawSpaceRock(ship_pos, fire);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    fire = flame_red;

                    drawSpaceRock(ship_pos, fire);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                else if (i > 0 && i < 176) {
                    fire = flame_red;
                    drawSpaceRock(ship_pos, fire);
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                if (i == 99) {
                    fire = 0;
                    drawSpaceRock(ship_pos, fire);
                }
                ship_pos += " ";
            }
        }
        else {
            drawSpaceRock(ship_pos, fire);
        }
        */
    }

    public static void drawCaptain() {
        System.out.println(ansi().fg(Colors.brown).a("                                                      **"));
        System.out.println(ansi().fg(Colors.brown).a("                                                    ******"));
        System.out.println(ansi().fg(Colors.brown).a("                                                    ******"));
        System.out.println(ansi().fg(Colors.brown).a("                                                  ***********"));
        System.out.println(ansi().fg(Colors.brown).a("                                                  ***********"));
        System.out.println(ansi().fg(Colors.grn_skin).a("                                                    *     *"));
        System.out.println(ansi().fg(Colors.grn_skin).a("                                                   *       *"));
        System.out.println(ansi().fg(Colors.grn_skin).a("                                                  *  O   0  *"));
        System.out.println(ansi().fg(Colors.grn_skin).a("                                                  *    U    *"));
        System.out.println(ansi().fg(Colors.grn_skin).a("                                                  *  .   .  *"));
        System.out.println(ansi().fg(Colors.grn_skin).a("                                                  *   ...   *"));
        System.out.println(ansi().fg(Colors.grn_skin).a("                                                  **       **").fg(WHITE));
    }

    public static void drawBubble(String sentence) {
        int sent_length = sentence.length(), loop_cnt = sent_length / 50, i_limit = 0;
        float loop_cnt_remainder = sent_length % 50;

        if (loop_cnt == 0)
            i_limit = 1;
        else if (loop_cnt > 0 && loop_cnt <= 50) {
            if (loop_cnt_remainder == 0)
                i_limit = loop_cnt;
            else if (loop_cnt_remainder > 0) {
                i_limit = loop_cnt + 1;

                String sub_sentence[]; 
                //sentence.split(sub_sentence, 50);
            }
        }
        
        System.out.println("__________________________________________________");

        for (int i = 0; i < i_limit; i++) {
            System.out.printf("\n|%s|", sentence);
        }

        System.out.println("|_____________________________       __|");
        System.out.println("                              \\     / ");
        System.out.println("                               \\   /  ");
        System.out.println("                                \\ /   ");
        System.out.println("                                 '");

        System.out.println(" ______________________________________");
        System.out.printf("|                                                  |");
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

    public static void drawSpaceship(String ship_pos, String wormhole_pos, boolean wormhole_present, int flame) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        int wormhole_outlineI = 0;
        int wormhole_outlineII = 0;
        int wormhole_outlineIII = 0;

        if (wormhole_present) {
            wormhole_outlineI = Colors.light_white;
            wormhole_outlineII = Colors.almost_white;
            wormhole_outlineIII = Colors.almost_black;
        }

        System.out.printf("\n%s" + ansi().fg(Colors.white).a("               *").fg(Colors.light_black).a("*************").fg(Colors.white).a(".                                                 ") + "%s", ship_pos, wormhole_pos);
        System.out.printf("\n%s" + ansi().fg(flame).a("    ''''.  ").fg(Colors.white).a("     `.`.          *                                                ") + "%s", ship_pos, wormhole_pos);
        System.out.printf("\n%s" + ansi().fg(flame).a("   . ' ' '.").fg(Colors.white).a("     *********************************************.                ") + "%s", ship_pos, wormhole_pos);
        System.out.printf("\n%s" + ansi().fg(flame).a("' .        ").fg(Colors.light_black).a("*** ").fg(Colors.white).a("*    '         '        ").fg(Colors.yellow).a(".").fg(Colors.white).a("             *          '") + "%s" + ansi()
                                         .fg(wormhole_outlineI).a("               ,").fg(wormhole_outlineII).a("-----").fg(wormhole_outlineI).a(","), ship_pos, wormhole_pos);

        System.out.printf("\n%s" + ansi().fg(flame).a("   ' . . . ").fg(Colors.light_black).a("***").fg(Colors.white).a("*    ***********       ").fg(Colors.yellow).a("'   '").fg(Colors.white).a("          *               '") + "%s" + ansi()
                                         .fg(wormhole_outlineI).a("         '").fg(wormhole_outlineIII).a("#########").fg(wormhole_outlineI).a("'"), ship_pos, wormhole_pos);

        System.out.printf("\n%s" + ansi().fg(flame).a("    ....'     ").fg(Colors.white).a("*").fg(Colors.light_black).a("  ...............    ").fg(Colors.yellow).a("'     '").fg(Colors.white).a("        *                  #").fg(Colors.light_black).a("==---") + "%s" + ansi()
                                         .fg(wormhole_outlineI).a("'").fg(wormhole_outlineII).a("-").fg(wormhole_outlineIII).a("##").fg(wormhole_outlineII).a("-").fg(wormhole_outlineIII).a("##").fg(wormhole_outlineII).a("-").fg(wormhole_outlineIII).a("##")
                                         .fg(wormhole_outlineII).a("-").fg(wormhole_outlineIII).a("##").fg(wormhole_outlineII).a("-'"), ship_pos, wormhole_pos);


        System.out.printf("\n%s" + ansi().fg(flame).a("   . ' ' '.   ").fg(Colors.white).a("*                     ").fg(Colors.yellow).a("'     '").fg(Colors.white).a("        *                .") + "%s" + ansi()
                                         .fg(wormhole_outlineI).a("       '").fg(wormhole_outlineII).a("-").fg(wormhole_outlineIII).a("##").fg(wormhole_outlineII).a("-").fg(wormhole_outlineIII).a("##").fg(wormhole_outlineII).a("-").fg(wormhole_outlineIII).a("##")
                                         .fg(wormhole_outlineII).a("-").fg(wormhole_outlineIII).a("##").fg(wormhole_outlineII).a("-'"), ship_pos, wormhole_pos);

        System.out.printf("\n%s" + ansi().fg(flame).a("' .        ").fg(Colors.light_black).a("***").fg(Colors.white).a("*    ***********       ").fg(Colors.yellow).a("' . '").fg(Colors.white).a("          *            .") + "%s" + ansi()
                                         .fg(wormhole_outlineI).a("            '").fg(wormhole_outlineIII).a("#########").fg(wormhole_outlineI).a("'"), ship_pos, wormhole_pos);

        System.out.printf("\n%s" + ansi().fg(flame).a("   ' . . . ").fg(Colors.light_black).a("*** ").fg(Colors.white).a("*    '         '                      *        .") + "%s" + ansi()
                                         .fg(wormhole_outlineI).a("                 '").fg(wormhole_outlineII).a("-----").fg(wormhole_outlineI).a("'"), ship_pos, wormhole_pos);

        System.out.printf("\n%s" + ansi().fg(flame).a("    ....'  ").fg(Colors.white).a("     *********************************************                 ") + "%s", ship_pos, wormhole_pos);

        System.out.printf("\n%s" + ansi().fg(Colors.white).a("               ").fg(Colors.white).a(" .'.'           .*                                                ") + "%s", ship_pos, wormhole_pos);
        System.out.printf("\n%s" + ansi().fg(Colors.white).a("                *").fg(Colors.light_black).a("************").fg(Colors.white).a("'                                                 ") + "%s", ship_pos, wormhole_pos);
    }

    public static String wormhole_loc(int pos) {
        String space = "";

        if (pos >= 0) {
            for (int i = 0; i < pos; i++)
                space += " ";
        }
        else if (pos < 0) {
            for (int i = 0; i < Math.abs(pos); i++)
                space += "\b";
            for (int i = 0; i < Math.abs(pos); i++)
                space += " ";
            for (int i = 0; i < Math.abs(pos); i++)
                space += "\b";
        }
        return space;
    }
    
    public static void moveSpaceship(boolean engines_on, boolean wormhole_present) throws IOException, InterruptedException  {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        int flame = 0, space = 100;
        String ship_pos = "";
        String wormhole_pos = wormhole_loc(space);

        if (engines_on) {
            for (int i = 0; i < 176; i++) {
                if (i == 0) {
                    drawSpaceship(ship_pos, wormhole_pos, wormhole_present, flame);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    flame = Colors.flame_red;

                    drawSpaceship(ship_pos, wormhole_pos, wormhole_present, flame);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                else if (i > 0 && i < 176) {
                    flame = Colors.flame_red;
                    drawSpaceship(ship_pos, wormhole_pos, wormhole_present, flame);
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                if (i == 99) {
                    flame = 0;
                    drawSpaceship(ship_pos, wormhole_pos, wormhole_present, flame);
                }
                ship_pos += " ";
                space--;
                wormhole_pos = wormhole_loc(space);
            }
        }
        else {
            drawSpaceship(ship_pos, wormhole_pos, wormhole_present, flame);
        }

    }

    public static void drawWormhole() {
        System.out.println(ansi().fg(Colors.light_white).a("                                                      ,").fg(Colors.almost_white).a("-----").fg(Colors.light_white).a(","));
        System.out.println(ansi().fg(Colors.light_white).a("                                                    '").fg(Colors.almost_black).a("#########").fg(Colors.light_white).a("'"));
        System.out.println(ansi().fg(Colors.light_white).a("                                                  '").fg(Colors.almost_white).a("-").fg(Colors.almost_black).a("##")
                                                                                                                .fg(Colors.almost_white).a("-").fg(Colors.almost_black).a("##")
                                                                                                                .fg(Colors.almost_white).a("-").fg(Colors.almost_black).a("##")
                                                                                                                .fg(Colors.almost_white).a("-").fg(Colors.almost_black).a("##")
                                                                                                                .fg(Colors.almost_white).a("-'"));

        System.out.println(ansi().fg(Colors.light_white).a("                                                  '").fg(Colors.almost_white).a("-").fg(Colors.almost_black).a("##")
                                                                                                                .fg(Colors.almost_white).a("-").fg(Colors.almost_black).a("##")
                                                                                                                .fg(Colors.almost_white).a("-").fg(Colors.almost_black).a("##")
                                                                                                                .fg(Colors.almost_white).a("-").fg(Colors.almost_black).a("##")
                                                                                                                .fg(Colors.almost_white).a("-'"));
        System.out.println(ansi().fg(Colors.light_white).a("                                                    '").fg(Colors.almost_black).a("#########").fg(Colors.light_white).a("'"));
        System.out.println(ansi().fg(Colors.light_white).a("                                                      '").fg(Colors.almost_white).a("-----").fg(Colors.light_white).a("'"));
    }
    
    public static void spaghettifySpaceship() throws IOException, InterruptedException {
        //AnsiMain test = ansi().fg(light_white).a("howdy").fg(almost_white).a("---").fg(light_white).a(",");

        //drawSpaceship("", wormhole_loc(), 0);

        moveSpaceship(true, true);
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

    public static void instructions() throws IOException, InterruptedException {        
        char choice = ' ';
        while (choice != 'B' && choice != 'b') {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

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

            if (choice != 'B' && choice != 'b') {
                System.out.print("\nError. Press B to continue.");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
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
        System.out.printf(" |     %s     | %s |    %s     |\n", stats[0], stats[1], stats[2]);
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

    public static void getStore(Map<String, String> inventory) {
        System.out.println(" ___________________________________________________________________________________________________________________");
        System.out.println("|                                                       STORE                                                       |");
        System.out.println("|...................................................................................................................|");
        System.out.println("|......................................1. Navigational System:       S-$15,000......................................|");
        System.out.println("|......................................2. Heat Shielding V2.0:       S-$10,000......................................|");
        System.out.println("|......................................3. Fuel Tank:                 S-$9,000.......................................|");
        System.out.println("|......................................4. Spacesuit:                 S-$8,000.......................................|");
        System.out.println("|......................................5. Oxygen Tank:               S-$5,000.......................................|");
        System.out.println("|......................................6. Smith & Wesson Laser Gun:  S-$1,000.......................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|...................................................................................................................|");
        System.out.println("|___________________________________________________________________________________________________________________|");

        //System.out.println();
        //System.out.println(inventory);
    }

    public static void game_init_(Map<String, String> star_map, Map<String, String> inventory) {
        star_map.put("EARTH", "-0.992:-0.1:0");
        star_map.put("SUN", "0:0:0");
        
        inventory.put("Navigational System ", " S-$15,000");
        inventory.put("Heat Shielding V2.0 ", " S-$10,000");
        inventory.put("Fuel Tank ", " S-$9,000");
        inventory.put("Spacesuit ", " S-$8,000");
        inventory.put("Oxygen Tank ", " S-$5,000");
        inventory.put("Smith & Wesson Laser Gun ", " S-$1,000");
    }

    public static void game() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        drawCaptain();


        Map<String, String> star_map = new HashMap<>();
        Map<String, String> inventory = new HashMap<>();

        game_init_(star_map, inventory); //intialization

        String locations[] = {
            "SUN", "MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN", "URANUS", "NEPTUNE", "PLUTO"
        };

        String stats[] = {"3", "S-$55,000", locations[3]};

        String command_lst[] = {
            "exit", "help", "stats", "store", "find: ", "starmap", "asshole",
            "rock destroy"
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
            else if (command.equals(command_lst[3])) {
                getStore(inventory);
            }
            else if (command.contains(command_lst[4])) {
                String x[] = command.split(" ");
                check_location(x[1], star_map);
            }
            else if (command.contains(command_lst[5])) {
                getMap(star_map);
            }
            else if (command.equals(command_lst[6])) {
                spaghettifySpaceship();
            }
            else if (command.equals(command_lst[7])) {
                drawSpaceRock();
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        //System.out.println(ansi().bg(light_black));
        //drawCaptain();
        /*System.out.println();
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
                    }
                break;
            }
        }
    }
}