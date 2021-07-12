package s8.ce45;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch b = findBranch(branchName);
        if (b != null) {
            return b.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch b = findBranch(branchName);
        if (b != null) {
            return b.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name))
                return branch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTrasactions) {
        Branch b = findBranch(branchName);
        if (b != null) {
            System.out.println("Customer details for branch " + b.getName());
            ArrayList<Customer> customers = b.getCustomers();
            for (Customer customer : customers) {
                System.out.println("Customer: " + customer.getName() + "[" + (customers.indexOf(customer) + 1) + "]");

                if (printTrasactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (Double transaction : transactions) {
                        System.out.println(
                                "[" + (transactions.indexOf(transaction) + 1) + "]" + "  Amount " + transaction);
                    }
                }
            }
            return true;
        }
        return false;
    }
}