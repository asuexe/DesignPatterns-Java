package com.MVCDP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addCalculationListener(new CalculateListener());	
	}
	
	class CalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			int fnum, snum = 0;
			
			try {
				fnum=theView.getFirstNumber();
				snum=theView.getSecondNumber();
				
				theModel.addTwoNumbers(fnum, snum);
				
				theView.setCalcSolution(theModel.getCalculationValue());
				}
			catch(NumberFormatException e1) {
				theView.displayErrorMessage("You need to enter 2 Integers");
			}
		}
	}

}