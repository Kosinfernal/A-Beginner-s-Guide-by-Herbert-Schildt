package chapter5_Операторы;

//Преобразование прописных букв английского алфавита в строчные.
class LowCase {
    public static void main(String args[]) {
        char ch;

        for(int i=0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

//В результате установки в единицу шестого бита значения
//переменной ch она всегда будет содержать прописную букву
            ch = (char) ((int) ch | 32); // ch is now lowercase

            System.out.print(ch + " ");
//В приведенном выше примере операндами поразрядной операции ИЛИ являются
//код символа и значение 32 (двоичное представление - 0000000000100000). Как видите,
//в двоичном представлении значения 32 установлен только шестой бит. Используя это
//значение в качестве одного операнда в поразрядной операции ИЛИ с любым другим
//значением в качестве другого операнда, получим результат, в котором устанавливается
//шестой бит, а состояние всех остальных битов остается без изменения. Таким образом,
//любая прописная буква будет преобразована в строчную.
        }
    }
}
