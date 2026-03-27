package org.iamskrai.BehaviouralPatterns.ChainOfResponsibilityPattern.Problem;

public class LeaveRequest {

    public static void main(String[] args) {
        //Problem:
        //1. All approval logic is centralized in one processor with nested if-else.
        //2. Adding new approval levels requires modifying existing code.
        //3. Hard to extend or change approval thresholds without touching the main logic.
        //4. Violates Open/Closed Principle.

        LeaveApprovalProcessor processor = new LeaveApprovalProcessor();

        System.out.println("Requesting leave for 2 days.");
        processor.processRequest(2);

        System.out.println("\nRequesting leave for 5 days.");
        processor.processRequest(5);

        System.out.println("\nRequesting leave for 10 days.");
        processor.processRequest(10);
    }

}
