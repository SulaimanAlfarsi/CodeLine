//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Pathfinder: The Windows File Trail
        System.out.println("C:\\Users\\Student\\Documents\\Java\\Main.java\n");

        // Welcome, Wagon: The Three-Line Greeting

        System.out.println("Welcome to Java Programming\nLearn, Practice, Succeed\nHappy Coding! \n");


        // Code in Quotes: cc

        System.out.println("Path: \"C:\\Program Files\\Java\"");

        // Boxed Brilliance: The Asterisk Frame

        int width = 5;

        System.out.println("*".repeat(width));
        System.out.println("*" + " ".repeat(width - 2) + "*");
        System.out.println("*" + " ".repeat(width - 2) + "*");
        System.out.println("*".repeat(width));

        // Directory Detective: The Tree Reveal

        System.out.println("Root\\");
        System.out.println("\tDocuments\\");
        System.out.println("\t\tresume.pdf");
        System.out.println("\t\tletter.doc");
        System.out.println("\tPhotos\\");
        System.out.println("\t\tvacation.jpg");

        // Talk the Talk: Quoted Dialogues

        System.out.println("Teacher: \"What is your name?\"");
        System.out.println("Student: \"My name is Alex.\"");
        System.out.println("Teacher: \"Welcome, Alex!\"");


        // Pyramid Power: The Star Mountain

        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");

        // Calendar Commander: The Weekly Header

        // Days of the week
        String days = "Mon\tTue\tWed\tThu\tFri\tSat\tSun";

        String frame = "=".repeat(days.length()+ 5);

        // Print the calendar header
        System.out.println(frame);
        System.out.println("  " + days);
        System.out.println(frame);

        // Starry Right: The Aligned Triangle

        int rows = 5;


        System.out.println(" ".repeat(4) + "*");
        System.out.println(" ".repeat(3) + "*".repeat(2));
        System.out.println(" ".repeat(2) + "*".repeat(3));
        System.out.println(" ".repeat(1) + "*".repeat(4));
        System.out.println(" ".repeat(0) + "*".repeat(5));

        // Receipt Ready: c

        String headerLine = "=".repeat(40);
        String dividerLine = "-".repeat(40);

        System.out.println(headerLine);
        System.out.println("\tSTORE RECEIPT");
        System.out.println(headerLine);

        // Column titles
        System.out.printf("%-10s\t%-10s%n", "Item", "Price");
        System.out.println(dividerLine);

        // Items
        System.out.printf("%-10s\t$%-10.2f%n", "Apple", 1.50);
        System.out.printf("%-10s\t$%-10.2f%n", "Banana", 0.75);
        System.out.printf("%-10s\t$%-10.2f%n", "Orange", 2.00);

        System.out.println(dividerLine);

        // Total
        System.out.printf("%-10s\t$%-10.2f%n", "Total:", 4.25);
        System.out.println(headerLine);

        // Step Up: The Staircase Challenge

        int steps = 5;

        System.out.println("#".repeat(1));
        System.out.println("#".repeat(2));
        System.out.println("#".repeat(3));
        System.out.println("#".repeat(4));
        System.out.println("#".repeat(5));

        // Framed Focus: Message in a Star Frame

        System.out.println("*".repeat(20));
        System.out.println("*                  *");
        System.out.println("*  \"Keep Learning\" *");
        System.out.println("*                  *");
        System.out.println("*".repeat(20));

        // Grid Guru: The 5x5 Star Matrix

        int size = 5;

        String row = ("* ".repeat(size)).trim();

        System.out.println(row);
        System.out.println(row);
        System.out.println(row);
        System.out.println(row);
        System.out.println(row);

        // Equals Express: The Long Separator

        System.out.println("=".repeat(50));

        // : Section Separator

        String separator = "-".repeat(20);

        System.out.println("Section 1: Introduction");
        System.out.println(separator);

        System.out.println("Section 2: Methods");
        System.out.println(separator);

        System.out.println("Section 3: Conclusion");
        System.out.println(separator);

        // Multiplication Marvel: Table Header

        String topBottomLine = "=".repeat(40);
        String separatorLine = "-".repeat(40);

        String numbers = String.join("\t", "1","2","3","4","5","6","7","8","9","10");

        System.out.println(topBottomLine);
        System.out.println("\tMULTIPLICATION TABLE");
        System.out.println(topBottomLine);
        System.out.println(numbers);
        System.out.println(separatorLine);


        // Number Ladder: The Climbing Count

        System.out.println("1");
        System.out.println("1\t2");
        System.out.println("1\t2\t3");
        System.out.println("1\t2\t3\t4");
        System.out.println("1\t2\t3\t4\t5");

        // Quoteception: The Nested Quotation

        System.out.println("The article states: \"The programmer said, \\\"Code is poetry,\\\" and smiled.\"");

        // Echoes of Wisdom: The Quoted Message

        System.out.println("He said, \"Practice makes perfect!\"");

        // Tabular Talents: Student Info Showcase

        System.out.println("Name\tAge\tGrade");
        System.out.println("John\t20\tA");
        System.out.println("Sarah\t22\tB");



        // 1 Step Up – Staircase (#) (for loop)

        for (int i = 1; i <= 5; i++) {
            System.out.println("#".repeat(i));
        }




        // Grid Guru – 5×5 Star Matrix (while loop)

        int row1 = 1;

        while (row1 <= 5) {
            int col = 1;

            while (col <= 5) {
                System.out.print("# ");
                col++;
            }

            System.out.println();
            row1++;
        }

        // Pyramid Power – The Star Mountain (for loop)






    }
}