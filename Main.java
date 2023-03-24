public class Main {
    public static class Reader {
        private String fullName;
        private int libraryCardNumber;
        private String faculty;
        private String dateOfBirth;
        private String phoneNumber;

        public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
            this.fullName = fullName;
            this.libraryCardNumber = libraryCardNumber;
            this.faculty = faculty;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
        }

        public void takeBook(int numBooks) {
            System.out.println(fullName + " took " + numBooks + " books.");
        }

        public void takeBook(String... books) {
            System.out.print(fullName + " took books: ");
            for (String book : books) {
                System.out.print(book + ", ");
            }
            System.out.println();
        }

        public void returnBook(int numBooks) {
            System.out.println(fullName + " returned " + numBooks + " books.");
        }

        public void returnBook(String... books) {
            System.out.print(fullName + " returned books: ");
            for (String book : books) {
                System.out.print(book + ", ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];

        readers[0] = new Reader("Petrov V. V.", 12345, "Faculty of Science", "01/01/1990", "123-456-7890");
        readers[1] = new Reader("Ivanov I. I.", 67890, "Faculty of Arts", "02/02/1995", "987-654-3210");
        readers[2] = new Reader("Sidorov S. S.", 54321, "Faculty of Engineering", "03/03/1992", "456-789-0123");
        readers[3] = new Reader("Kuznetsov K. K.", 98765, "Faculty of Medicine", "04/04/1991", "789-012-3456");
        readers[4] = new Reader("Fedorov F. F.", 13579, "Faculty of Law", "05/05/1994", "012-345-6789");

        readers[0].takeBook(3);
        readers[1].takeBook("Adventures", "Dictionary", "Encyclopedia");
        readers[2].returnBook(2);
        readers[3].returnBook("Harry Potter", "Lord of the Rings", "The Hobbit");
    }
}
