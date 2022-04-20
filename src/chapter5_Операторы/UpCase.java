package chapter5_Операторы;

// Преобразование строчных букв английского алфавита в прописные.
class UpCase {
    public static void main(String args[]) {
        char ch;

        for(int i=0; i < 10; i++) {
            ch = (char) ('a' + i);
//a - HTML-code: &#97
//A - HTML-code: &#65
//Коды строчных букв английского алфавита в кодировках ASCII
//и Unicode отличаются от кодов соответствующих прописных букв
//на величину 32. Для преобразования строчных букв в прописные
//достаточно сбросить в нуль шестой бит в кодах их символов
            System.out.print(ch);

// В следующем операторе сбрасывается шестой бит.
// После этого в переменной ch будет храниться код
// символа прописной буквы.
            ch = (char) ((int) ch & 65503); // ch is now uppercase - верхний регистр
//Значение 65503, используемое в поразрядной операции И, является десятичным
//представлением двоичного числа 1111111111011111
//шестая позиция равна 0 - следовательно с подразрядной операцией &
//в шестой позиции будет 0
//Таким образом, при выполнении данной операции все биты кода символа
//в переменой ch, за исключением шестого, остаются прежними,
//тогда как шестой бит сбрасывается в нуль.
//символу а соответствует число 97 в десятичной = 0110 0001 в двоичной
//& 65503 в десятичной = 1111 1111 1101 1111 в двоичной
//в результате получается 0000 0000 0100 0001 в двоичной
//что соответствует 65 в десятичной в кодировке Unicode символ A
            System.out.print(ch + " ");
        }
    }
}
