package org.iamskrai.BehaviouralPatterns.ChainOfResponsibilityPattern.Solution;

public class Supervisor extends Approver {

    @Override
    public void processRequest(int numberOfDays) {
        if (numberOfDays <= 3) {
            System.out.println("Supervisor approved the leave request for " + numberOfDays + " days.");
        } else if (nextApprover != null) {
            nextApprover.processRequest(numberOfDays);
        }
    }

}
