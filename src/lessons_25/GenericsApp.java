package lessons_25;

import lessons_22.Cat;

public class GenericsApp {
    public static void main(String[] args) {
        GenericsBox<String> boxStr = new GenericsBox<>("Hello");

        System.out.println(boxStr);

        String strValue = boxStr.getValue();
        //boxStr.setValue(150); - ошибка компиляции. Проверка на несовподение типов

        GenericsBox<Cat> catBoxes = new GenericsBox<>(new Cat());

        System.out.println(catBoxes);
        //catBoxes.setValue("Cat"); - тоже щшибка компиляции. String не являеться типом Cat


        // Generics  не работает с примитивными типами данных
        // работает только со ссылочными типами
       // GenericsBox<int> genericsBox = new GenericsBox<>(100)

        GenericsBox<Integer> integerBox = new GenericsBox<>(100);

        GenericsBox<Integer>[] boxes = new GenericsBox[3];
        boxes[0] = new GenericsBox<>(150);
        boxes[1] = new GenericsBox<>(170);
        boxes[2] = new GenericsBox<>(-150);

        int sum = 0;
        for (GenericsBox <Integer> val : boxes){
            sum += val.getValue();

        }
        System.out.println(sum);

        GenericMethods.printBoxes(boxes);
    }
}
