class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean booked;

    MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.booked = false;
    }

    void bookTicket(String seatNumber) {
        if (!booked) {
            this.seatNumber = seatNumber;
            booked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked!");
        }
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        if (booked) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception", 250);
        ticket1.displayDetails();
        ticket1.bookTicket("A12");
        ticket1.displayDetails();
    }
}
