package org.iamskrai.BehaviouralPatterns.ChainOfResponsibilityPattern.Solution;

public class Director extends Approver {

    @Override
    public void processRequest(int numberOfDays) {
        if (numberOfDays > 7) {
            System.out.println("Director approved the leave request for " + numberOfDays + " days.");
        } else if (nextApprover != null) {
            nextApprover.processRequest(numberOfDays);
        }
        else {
            System.out.println("Leave request for " + numberOfDays + " days cannot be processed.");
        }
    }

}
