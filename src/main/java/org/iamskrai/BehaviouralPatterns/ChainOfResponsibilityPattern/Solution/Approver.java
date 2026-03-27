package org.iamskrai.BehaviouralPatterns.ChainOfResponsibilityPattern.Solution;

public abstract class Approver {

    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(int numberOfDays);

}
