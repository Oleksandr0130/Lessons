package lessons_24.printers;

public class PrintApp {
    public static void main(String[] args) {
    Book book = new Book("Java", "Eckel");
        book.print();
        book.bookSayHello();

        Printable printableBook = new Book("Test", "someone");
        printableBook.print();
        // printableBook.book.bookSayHello(); такой метод по типу ссылки Printable не доступен


        Printable presentationWB = new Presentation("Title", 24, "world");

        presentationWB.print();
        System.out.println("\n================== \n");
        ColorPrintable presentationColor = new Presentation("Color", 12 , "Color World");

        presentationColor.print();
        presentationColor.colorPrint();

        System.out.println("========================" +
                "");
        Printable[] printables = new Printable[2];
        printables[0] = book;
        printables[1] = presentationColor;

        for (Printable printable : printables){
            printable.print();

            printable.sayHello("World");
        }

        // вызов статического метода интерфейса
        Printable.staticMethod();

        System.out.println("============================");

        Printer printer = new Printer();
        printer.makeCopy(book);
        printer.makeCopy(presentationWB);
        printer.makeCopy(presentationColor);
    }


}
