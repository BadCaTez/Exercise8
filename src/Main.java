import java.util.Scanner;

public class Main {
    static String[] arrayList;
    static String[] changeArray;
    static int selectPage = 0;

    public static void main(String[] args) {
        String line = "Amogus sus abobus bus";
        arrayList = line.split(" ");
        selectMenu();
    }
    public static void selectMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите действия:" +
                "\n1.Показать строку" +
                "\n2.Добавить элемент" +
                "\n3.Удалить элемент" +
                "\n4.Отчистить строку" +
                "\n/");
        selectPage = scan.nextInt();
        switch (selectPage){
            case 1:
                showLine();
                break;
            case 2:
                addElement();
                break;
            case 3:
                deleteElement();
                break;
            case 4:
                clearArray();
                break;
        }
    }

    public static void showLine(){
        for(String word: arrayList){
            System.out.print(word + " ");
        }
        System.out.println("");
        selectMenu();
    }

    public static void deleteElement(){
        Scanner scan = new Scanner(System.in);
        int j = 0;

        System.out.print("Введите номер слова: ");
        int selectIdElement = scan.nextInt() - 1;
        System.out.println("");

        changeArray = new String[arrayList.length];
        changeArray = arrayList;
        arrayList = new String[changeArray.length - 1];

        for(int i = 0; i < arrayList.length; i++){
            if(!changeArray[selectIdElement].equals(changeArray[i])){
                arrayList[i] = changeArray[i + j];
            } else {j++;}
        }
        selectMenu();
    }

    public static void addElement(){
        Scanner scan = new Scanner(System.in);

        changeArray = new String[arrayList.length];
        changeArray = arrayList;

        arrayList = new String[arrayList.length + 1];
        arrayList = changeArray;

        System.out.print("Введите слово для добавления: ");
        arrayList[arrayList.length - 1] = scan.nextLine();
        System.out.println("");
        selectMenu();
    }

    public static void clearArray(){
        arrayList = new String[1];
        System.out.println("Список отчищен");
        selectMenu();
    }
}
