package lessons_24.printers;

import lessons_24.printers.ColorPrintable;

public class Presentation implements ColorPrintable {

    private String tiile;
    private int countPages;

    private String theme;

    public Presentation(String tiile, int countPages, String theme) {
        this.tiile = tiile;
        this.countPages = countPages;
        this.theme = theme;
    }

    @Override
    public void print(int number) {

    }

    @Override
    public void sayHello(String string) {
        ColorPrintable.super.sayHello(string);
    }

    @Override
    public void colorPrint() {
        System.out.printf(" презентация %s в  цвете (тема: %s). Всего страниц %d\n", tiile, theme, countPages);

    }

    @Override
    public void print() {
        System.out.printf("Распечатывается презентация %s (тема: %s)в ч/б. Всего страниц %d\n", tiile, theme, countPages);
    }
}
