package Railway;
import java.util.*;
import java.io.*;
public class ReservationSystem {

	    Node head=null;
	    Stack<Node> undoStack=new Stack<>();
	    Queue<Node> waitingList=new LinkedList<>();

	    int pnrCounter=1000;

	    void writeFile(String data)
	    {
	        try
	        {
	            FileWriter fw=new FileWriter("D:\\project\\data.txt",true);
	            fw.write(data+"\n");
	            fw.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println("File error");
	        }
	    }

	    void bookTicket(String name,int trainNo,int seatNo)
	    {
	        int pnr=pnrCounter++;

	        Node t=new Node(name,trainNo,seatNo,pnr);

	        if(head==null)
	        head=t;
	        else
	        {
	            Node temp=head;

	            while(temp.link!=null)
	            temp=temp.link;

	            temp.link=t;
	        }

	        undoStack.push(t);

	        System.out.println("Ticket Booked. PNR: "+pnr);

	        writeFile("BOOKING");
	        writeFile("Name: "+name);
	        writeFile("Train No: "+trainNo);
	        writeFile("Seat No: "+seatNo);
	        writeFile("PNR: "+pnr);
	        writeFile("--------------------");
	    }

	    void cancelTicket(int pnr)
	    {
	        Node temp=head;
	        Node prev=null;

	        while(temp!=null)
	        {
	            if(temp.pnr==pnr)
	            {
	                if(prev==null)
	                head=temp.link;
	                else
	                prev.link=temp.link;

	                undoStack.push(temp);

	                System.out.println("Ticket Cancelled");

	                writeFile("CANCELLED PNR: "+pnr);
	                writeFile("--------------------");

	                return;
	            }

	            prev=temp;
	            temp=temp.link;
	        }

	        System.out.println("PNR not found");
	    }

	    void addWaiting(String name,int trainNo)
	    {
	        Node t=new Node(name,trainNo,0,0);

	        waitingList.add(t);

	        System.out.println("Added to waiting list");

	        writeFile("WAITING LIST: "+name+" Train:"+trainNo);
	        writeFile("--------------------");
	    }

	    void undo()
	    {
	        if(undoStack.isEmpty())
	        {
	            System.out.println("Nothing to undo");
	            return;
	        }

	        Node t=undoStack.pop();

	        System.out.println("Undo operation for PNR: "+t.pnr);

	        writeFile("UNDO OPERATION PNR: "+t.pnr);
	        writeFile("--------------------");
	    }

	    void displayReservation()
	    {
	        Node temp=head;

	        if(temp==null)
	        {
	            System.out.println("No reservations");
	            return;
	        }

	        while(temp!=null)
	        {
	            System.out.println("Name: "+temp.name);
	            System.out.println("Train: "+temp.trainNo);
	            System.out.println("Seat: "+temp.seatNo);
	            System.out.println("PNR: "+temp.pnr);
	            System.out.println("----------------");

	            temp=temp.link;
	        }
	    }

	    void displayWaiting()
	    {
	        for(Node t:waitingList)
	        {
	            System.out.println("Waiting Passenger: "+t.name);
	            System.out.println("Train: "+t.trainNo);
	        }
	    }

	    void searchPNR(int pnr)
	    {
	        Node temp=head;

	        while(temp!=null)
	        {
	            if(temp.pnr==pnr)
	            {
	                System.out.println("Ticket Found");
	                System.out.println("Name: "+temp.name);
	                System.out.println("Train: "+temp.trainNo);
	                System.out.println("Seat: "+temp.seatNo);
	                return;
	            }

	            temp=temp.link;
	        }

	        System.out.println("PNR not found");
	    }
	    void sortReservations()
	    {
	        if(head == null)
	        {
	            System.out.println("No reservations to sort");
	            return;
	        }

	        for(Node i = head; i != null; i = i.link)
	        {
	            for(Node j = i.link; j != null; j = j.link)
	            {
	                if(i.seatNo > j.seatNo)
	                {
	                    String name = i.name;
	                    int train = i.trainNo;
	                    int seat = i.seatNo;
	                    int pnr = i.pnr;

	                    i.name = j.name;
	                    i.trainNo = j.trainNo;
	                    i.seatNo = j.seatNo;
	                    i.pnr = j.pnr;

	                    j.name = name;
	                    j.trainNo = train;
	                    j.seatNo = seat;
	                    j.pnr = pnr;
	                }
	            }
	        }

	        System.out.println("Reservations Sorted by Seat Number");

	        storeSortedData();
	    }
	    void storeSortedData()
	    {
	        try
	        {
	            FileWriter fw = new FileWriter("D:\\project\\data.txt");

	            Node temp = head;

	            while(temp != null)
	            {
	                fw.write("Name: " + temp.name + "\n");
	                fw.write("Train: " + temp.trainNo + "\n");
	                fw.write("Seat: " + temp.seatNo + "\n");
	                fw.write("PNR: " + temp.pnr + "\n");
	                fw.write("--------------------\n");

	                temp = temp.link;
	            }

	            fw.close();

	            System.out.println("Sorted data stored in file");

	        }
	        catch(Exception e)
	        {
	            System.out.println("File writing error");
	        }
	    }
	    void readSortedFile()
	    {
	        try
	        {
	            FileReader fr = new FileReader("D:\\project\\data.txt");
	            BufferedReader br = new BufferedReader(fr);

	            String line;

	            while((line = br.readLine()) != null)
	            {
	                System.out.println(line);
	            }

	            br.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println("File reading error");
	        }
	    }
	    
	}

