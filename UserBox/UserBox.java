
/**
 * Write a description of class UserBox here.
 *
 * @author Chris Prabhu
 * @version 2023-08-2023
 */

import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class UserBox
{
    public static void main(String[] args) {
        // Get user name
        Scanner conIn = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = conIn.next();
        conIn.nextLine();
        System.out.print("Your name is : " + userName);
        
        // Get box dimensions
        System.out.print("Specify box width (1 to 100): ");
        int boxWidth = conIn.nextInt();
        System.out.print("Specify box height (1 to 100): ");
        int boxHeight = conIn.nextInt();
        System.out.print(userName + " " + boxWidth + " " + boxHeight);
        // Set up our drawing panel
        DrawingPanel dp = new DrawingPanel(200, 200);
        dp.setBackground(Color.WHITE);
        Graphics dpg = dp.getGraphics();
        DrawingPanel testDP = dp;
        testDp.setBackground(Color.LIGHT_GRAY);
        // Draw the salutation and the box 
        dpg.setColor(Color.BLUE);
        dpg.fillRect(50,50,boxWidth,boxHeight);
        dpg.setFont(new Font("Arial Bold", Font.PLAIN,12));
        userName = userName.toUpperCase();
        dpg.drawString("HELLO " + userName, 0, 14);
    }
}
