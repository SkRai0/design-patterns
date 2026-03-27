package org.iamskrai.BehaviouralPatterns.ChainOfResponsibilityPattern.Problem;

public class LeaveApprovalProcessor {

    public void processRequest(int numberOfDays) {
        if (numberOfDays <= 3) {
            System.out.println("Supervisor approved the leave request for " + numberOfDays + " days.");
        } else if (numberOfDays <= 7) {
            System.out.println("Manager approved the leave request for " + numberOfDays + " days.");
        } else if (numberOfDays > 7) {
            System.out.println("Director approved the leave request for " + numberOfDays + " days.");
        } else {
            System.out.println("Leave request for " + numberOfDays + " days cannot be processed.");
        }
    }

}
