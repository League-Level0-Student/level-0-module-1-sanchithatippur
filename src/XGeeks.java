
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

	// 1. Save the superpower for each person in a variable.
	String SanchithaPower = "mind-reading";
	String JacobpPower = "making people salty";
	String JacobjPower = "teleportation";
	String KellerPower = "Telekinesis";
	String DerekPower = "making people salty";

	// 2. Ask the user to enter a name. Store their answer in a variable.
String name=JOptionPane.showInputDialog("enter your name");
	// 3. Show the superpower in a pop-up, depending on the name entered.
	if(name.equals("Sanchitha")){
		System.out.println("Sanchithas power is " + SanchithaPower);
		JOptionPane.showMessageDialog(null, "SanchithaPower is mind reading");
	}
	if(name.equals("JabobpPower")){
		System.out.println("Jacobp power is " + JacobpPower);
		JOptionPane.showMessageDialog(null, "JacobpPower is making people salty");
	}
	if(name.equals("Derek")){
		System.out.println("Derek power is " + DerekPower);
		JOptionPane.showMessageDialog(null, "DerekPower is making people salty");
	}
	if(name.equals("Keller")){
		System.out.println("Keller power is " + KellerPower);
		JOptionPane.showMessageDialog(null, "KellerPower is Telekinesis");
		
		}
	if(name.equals("JacobjPower")){
		System.out.println("Jacobj power is "+JacobjPower);
		JOptionPane.showMessageDialog(null, "JacobjPower is teleportation");
		
			}
		}
}
