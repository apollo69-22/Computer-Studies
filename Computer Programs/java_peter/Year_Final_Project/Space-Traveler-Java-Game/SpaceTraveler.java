//package Year_Final_Project.Space-Traveler-Java-Game;

import java.io.IOException;

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
        System.out.println("**************************************************************************************************************");
        System.out.println("*******************************************                        *******************************************");
        System.out.println("**************************************                                  **************************************");
        System.out.println("**********************************                                          **********************************");
        System.out.println("*******************************                                                *******************************");
        System.out.println("*****************************                                                    *****************************");
        System.out.println("***************************                                                        ***************************");
        System.out.println("*************************                                                            *************************");
        System.out.println("***********************                                                                ***********************");
        System.out.println("**********************                                                                  **********************");
        System.out.println("*********************                                                                    *********************");
        System.out.println("********************                                                                      ********************");
        System.out.println("*******************                                                                        *******************");
        System.out.println("******************                                                                          ******************");
        System.out.println("*****************                                                                            *****************");
        System.out.println("*****************													                     *********************");
        System.out.println("*****************													                     *********************");
        System.out.println("*****************													                     *********************");
        System.out.println("*****************													                     *********************");
        System.out.println("*****************													                     *********************");
        System.out.println("*****************													                     *********************");
        System.out.println("*****************													                     *********************");
        System.out.println("*****************												  	                     *********************");
        System.out.println("******************												                        **********************");
        System.out.println("*******************												                       ***********************");
        System.out.println("********************												                  ************************");
        System.out.println("*********************											                     *************************");
        System.out.println("**********************											                   ***************************");
        System.out.println("************************										                  ****************************");
        System.out.println("**************************										                ******************************");
        System.out.println("****************************									              ********************************");
        System.out.println("******************************								                **********************************");
        System.out.println("*********************************							             *************************************");
        System.out.println("************************************						         *****************************************");
        System.out.println("******************************************				        **********************************************");
        System.out.println("**************************************************************************************************************");

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        drawCaptain();
        drawSun();
    }
}
