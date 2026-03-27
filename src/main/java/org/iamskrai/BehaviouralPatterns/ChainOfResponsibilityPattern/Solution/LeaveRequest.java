package org.iamskrai.BehaviouralPatterns.ChainOfResponsibilityPattern.Solution;

public class LeaveRequest {

    public static void main(String[] args) {
        //Solution:
        //1. Create a chain of approvers (Supervisor -> Manager -> Director).
        //2. Each approver will handle the request if it falls within their authority, otherwise they will pass it to the next approver in the chain.

        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();
        Director director = new Director();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);

        int numberOfDays = 2;
        System.out.println("Requesting leave for " + numberOfDays + " days.");
        supervisor.processRequest(numberOfDays);
        numberOfDays = 5;
        System.out.println("\nRequesting leave for " + numberOfDays + " days.");
        supervisor.processRequest(numberOfDays);
        numberOfDays = 10;
        System.out.println("\nRequesting leave for " + numberOfDays + " days.");
        supervisor.processRequest(numberOfDays);
    }

}
