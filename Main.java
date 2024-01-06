import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;
    boolean isAvailable;
    boolean isBorrowed;
    String borrowerName;
    String borrowerContact;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.isBorrowed = false;
        this.borrowerName = "";
        this.borrowerContact = "";
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author +
                ", Available: " + (isAvailable ? "Yes" : "No") +
                (isBorrowed ? ", Borrower: " + borrowerName + ", Contact: " + borrowerContact : "");
    }
}

class LibraryManagementGUI extends JFrame {
    private List<Book> books;

    public LibraryManagementGUI() {
        books = new ArrayList<>();

        setTitle("Library Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Title Panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Library Management");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titlePanel.add(titleLabel);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JButton addBookButton = new JButton("<html><b>Add Book</b></html>");
        JButton removeBookButton = new JButton("<html><b>Remove Book</b></html>");
        JButton viewBooksButton = new JButton("<html><b>View Books</b></html>");
        JButton borrowBookButton = new JButton("<html><b>Borrow Book</b></html>");
        JButton returnBookButton = new JButton("<html><b>Return Book</b></html>");

        // Set font and color for buttons
        Font buttonFont = new Font("Arial", Font.BOLD, 14);
        Color buttonColor = new Color(50, 100, 150);

        addBookButton.setFont(buttonFont);
        addBookButton.setForeground(buttonColor);
        removeBookButton.setFont(buttonFont);
        removeBookButton.setForeground(buttonColor);
        viewBooksButton.setFont(buttonFont);
        viewBooksButton.setForeground(buttonColor);
        borrowBookButton.setFont(buttonFont);
        borrowBookButton.setForeground(buttonColor);
        returnBookButton.setFont(buttonFont);
        returnBookButton.setForeground(buttonColor);

        // Add ActionListener for each button
        addBookButton.addActionListener(e -> addBook());
        removeBookButton.addActionListener(e -> removeBook());
        viewBooksButton.addActionListener(e -> viewBooks());
        borrowBookButton.addActionListener(e -> borrowBook());
        returnBookButton.addActionListener(e -> returnBook());

        buttonPanel.add(addBookButton);
        buttonPanel.add(removeBookButton);
        buttonPanel.add(viewBooksButton);
        buttonPanel.add(borrowBookButton);
        buttonPanel.add(returnBookButton);

        // Add panels to the main panel
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Set a border for the main panel
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(mainPanel);
    }
    private void addBook() {
        String title = JOptionPane.showInputDialog(this, "Enter book title:");
        String author = JOptionPane.showInputDialog(this, "Enter author:");

        if (title != null && author != null) {
            Book book = new Book(title, author);
            books.add(book);
            JOptionPane.showMessageDialog(this, "Book added successfully!");
        }
    }

    private void removeBook() {
        // ... (unchanged)
        if (books.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No books to remove!");
        } else {
            String[] bookTitles = books.stream().map(book -> book.title).toArray(String[]::new);

            String selectedTitle = (String) JOptionPane.showInputDialog(
                    this,
                    "Select a book to remove:",
                    "Remove Book",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    bookTitles,
                    bookTitles[0]
            );

            if (selectedTitle != null) {
                books.removeIf(book -> book.title.equals(selectedTitle));
                JOptionPane.showMessageDialog(this, "Book removed successfully!");
            }
        }
    }

    private void viewBooks() {
        // ... (unchanged)
         if (books.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No books available!");
        } else {
            Object[][] data = new Object[books.size()][6]; // 6 columns for title, author, available, borrowed, borrower name, borrower contact

            for (int i = 0; i < books.size(); i++) {
                data[i][0] = books.get(i).title;
                data[i][1] = books.get(i).author;
                data[i][2] = books.get(i).isAvailable ? "Yes" : "No";
                data[i][3] = books.get(i).isBorrowed ? "Yes" : "No";
                data[i][4] = books.get(i).borrowerName;
                data[i][5] = books.get(i).borrowerContact;
            }

            String[] columnNames = {"Title", "Author", "Available", "Borrowed", "Borrower Name", "Borrower Contact"};

            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(scrollPane, BorderLayout.CENTER);

            JFrame frame = new JFrame("Book List");
            frame.setSize(800, 400);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setLocationRelativeTo(this);
            frame.add(panel);
            frame.setVisible(true);
        }
    }

    private void borrowBook() {
        // ... (unchanged)
        if (books.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No books available!");
            return;
        }

        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable) {
                availableBooks.add(book);
            }
        }

        if (availableBooks.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No books currently available for borrowing!");
            return;
        }

        JComboBox<Book> bookComboBox = new JComboBox<>(availableBooks.toArray(new Book[0]));
        bookComboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Book) {
                    Book book = (Book) value;
                    setText(book.title + " by " + book.author);
                }
                return this;
            }
        });

        int result = JOptionPane.showConfirmDialog(
                this,
                bookComboBox,
                "Select a book to borrow:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            Book selectedBook = (Book) bookComboBox.getSelectedItem();

            if (selectedBook != null) {
                String borrowerName = JOptionPane.showInputDialog(this, "Enter borrower name:");
                String borrowerContact = JOptionPane.showInputDialog(this, "Enter borrower contact:");

                if (borrowerName != null && borrowerContact != null) {
                    selectedBook.isAvailable = false;
                    selectedBook.isBorrowed = true;
                    selectedBook.borrowerName = borrowerName;
                    selectedBook.borrowerContact = borrowerContact;

                    JOptionPane.showMessageDialog(this, "Book '" + selectedBook.title + "' borrowed successfully!");
                }
            }
        }
    }

    private void returnBook() {
        // ... (unchanged)
        if (books.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No books available!");
            return;
        }

        List<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isBorrowed) {
                borrowedBooks.add(book);
            }
        }

        if (borrowedBooks.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No books currently borrowed!");
            return;
        }

        JComboBox<Book> bookComboBox = new JComboBox<>(borrowedBooks.toArray(new Book[0]));
        bookComboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Book) {
                    Book book = (Book) value;
                    setText(book.title + " by " + book.author);
                }
                return this;
            }
        });

        int result = JOptionPane.showConfirmDialog(
                this,
                bookComboBox,
                "Select a borrowed book to return:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            Book selectedBook = (Book) bookComboBox.getSelectedItem();

            if (selectedBook != null) {
                String enteredName = JOptionPane.showInputDialog(this, "Enter borrower name:");
                String enteredContact = JOptionPane.showInputDialog(this, "Enter borrower contact:");

                if (enteredName != null && enteredContact != null &&
                    enteredName.equals(selectedBook.borrowerName) && enteredContact.equals(selectedBook.borrowerContact)) {
                    selectedBook.isAvailable = true;
                    selectedBook.isBorrowed = false;
                    selectedBook.borrowerName = "";
                    selectedBook.borrowerContact = "";

                    JOptionPane.showMessageDialog(this, "Book '" + selectedBook.title + "' returned successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid borrower details. Book not returned.");
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LibraryManagementGUI().setVisible(true));
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryManagementGUI.main(args);
    }
}
