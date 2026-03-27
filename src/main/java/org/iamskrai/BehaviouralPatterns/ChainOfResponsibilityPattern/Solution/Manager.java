package org.iamskrai.BehaviouralPatterns.ChainOfResponsibilityPattern.Solution;

public class Manager extends Approver {

    @Override
    public void processRequest(int numberOfDays) {
        if (numberOfDays <= 7) {
            System.out.println("Manager approved the leave request for " + numberOfDays + " days.");
        } else if (nextApprover != null) {
            nextApprover.processRequest(numberOfDays);
        }
    }

}
