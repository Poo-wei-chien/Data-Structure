package L07_queues.Queue.Question3;

import L07_queues.Queue.Question3.ListBasedQueue;

import java.util.Scanner;

public class TestListBasedQueue_Lab {
    public static void main(String[] args) {
        // Declare scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        ListBasedQueue<String> queueShare = new ListBasedQueue<>();
        //Queue to keep track of share available
        ListBasedQueue<String> queuePrice = new ListBasedQueue<>();
        //Queue to record to buying price
        //Instead of creating 2 separate queues, students can opt to create single queue using subclass or struct which consists of share and price
        //CapitalGainLoss to keep track of Capital Gain or Loss
        int CapitalGainLoss = 0;
        do{
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String query = scanner.nextLine();
            if (query.isEmpty()) { // check if we need to exit out
                // break only if 0 or nothing is entered, this means we don't want to run the loop anymore
                break;
            } else {
                // Based on the formatting, divide the information to several parts
                String[] parts = query.split(" ");
                String BuySell = parts[0];
                String NoOfShare = parts[1];
                String Price = parts[4].replace("$", "");
                // If the first word of the input is sell...
                if ("Sell".equals(BuySell)) {
                    System.out.println("Selling the shares now...");
                    int ShareForSell = Integer.parseInt(NoOfShare);
                    //Quantity of Shares to be sold
                    int RemainingShareInQueue = 0;
                    //Remaining Share in the queue after being sold
                    do {
                        if (queueShare.isEmpty() == false) { //if the shares are available...
                            int share = Integer.parseInt(queueShare.dequeue()); //Get the first available share to be sold from queue
                            int price = Integer.parseInt(queuePrice.dequeue()); //Get the price of the first available share to be sold from queue
                            if (share >= ShareForSell) { //if there is sufficient share-to-be-sold in the dequeued value
                                //Calculate the capital gain or loss
                                CapitalGainLoss = CapitalGainLoss + ShareForSell * (Integer.parseInt(Price) - price);
                                //Calculate the remaining share after being sold
                                //Then put it back into the queue by using ReplaceQueue function
                                RemainingShareInQueue = share - ShareForSell;
                                if (RemainingShareInQueue > 0) {
                                    queueShare = ReplaceQueue(queueShare, RemainingShareInQueue);
                                    queuePrice = ReplaceQueue(queuePrice, price);
                                }
                                //display for checking purposes
                                //System.out.println(queueShare);
                                //System.out.println(queuePrice);
                            } else {
                                //insufficient shares in the dequeued value
                                //Calculate capital gain or loss
                                CapitalGainLoss = CapitalGainLoss + share*(Integer.parseInt(Price)-price);
                            }
                            System.out.println("Total Capital Gain / Loss: "+ CapitalGainLoss);
                            //LeftOverShare = LeftOverShare - share;
                            ShareForSell = ShareForSell - share; //System.out.println(LeftOverShare);
                        } else {
                            System.out.println("No shares to sell!");
                            ShareForSell = 0;
                        }
                    }while(ShareForSell>0);
                } else {
                    System.out.println("Buying now...");
                    queueShare.enqueue(NoOfShare);
                    queuePrice.enqueue(Price);
                }
            }
            //display for checking purposes
            System.out.println("Queue for Share: " + queueShare);
            System.out.println("Queue for Price: " + queuePrice);
        } while(true);
        System.out.println("Final Capital Gain / Loss: " + CapitalGainLoss);
    }

    public static ListBasedQueue ReplaceQueue(ListBasedQueue queue, int Remains) {
        ListBasedQueue<String> queueTemp = new ListBasedQueue<>();
        queueTemp.enqueue(Integer.toString(Remains));
        while(queue.isEmpty()== false) {
            queueTemp.enqueue((String) queue.dequeue());
        }
        while(queueTemp.isEmpty() == false) {
            queue.enqueue(queueTemp.dequeue());
        }

        return queue;
    }
}
