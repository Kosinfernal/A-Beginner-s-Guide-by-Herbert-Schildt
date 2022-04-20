package chapter6_Static.listing2;
/* В этом классе реализуется "отказоустойчивый" массив,
предотвращающий ошибки времени выполнения */
class FailSoftArray {
    private int a[]; // ссылка на массив
    private int errval; // значение, возвращаемое в случае возникновения ошибки при выполнении
                        // метода get ()
    public int length; // открытая переменная length
    /* Конструктору данного класса передается размер массива и
значение, которое должен возвращать метод get() при
возникновении ошибки. */
    public FailSoftArray(int size, int errv) { //конструктор
        //При создании объекта типа FailSoftArray следует указать размер массива и значение,
        //которое должно возвращаться в случае неудачного вызова get ()
        //После создания объекта
        //непосредственный доступ извне его к массиву, на который указывает ссылка, хранящаяся
        //в переменной а, а также к переменной errval, невозможен, что исключает их
        //некорректное использование. В частности, пользователь не сможет непосредственно
        //обратиться к массиву по ссылке в переменной а, задав индекс элемента, выходящий за
        //границы допустимого диапазона. Доступ к указанным элементам возможен только с помощью
        //методов get () и put ().
        a = new int[size]; //передача длинны массиву
        errval = errv;
        length = size;
    }
    // Вернуть логическое значение true, если индекс не выходит за границы массива.
    // Отслеживание попытки выхода за границы массива.
    private boolean indexOK(int index) { //метод
        //Метод indexOK () объявлен как закрытый главным образом для того, чтобы проиллюстрировать
        //управление доступом. Но даже если бы он был открытым, то это не создавало
        //бы никакого риска, поскольку он не видоизменяет объект. Однако, поскольку этот
        //метод используется только членами класса FailSoftArray, он объявлен закрытым.
        if(index >= 0 & index < length) return true;
        else return false;
    }
    // Возвратить значение элемента массива c заданным индексом.
    public int get(int index) { //метод
        if(indexOK(index)) return a[index];//Отслеживание попытки выхода за границы массива
        else return errval;
    }
    // Установить значение элемента с заданным индексом.
    // Если возникнет ошибка, возвратить логическое значение false.
    public int put(int index, int val) { //метод
        if(indexOK(index)) { //Отслеживание попытки выхода за границы массива
            return a[index] = val;}
            //return true;}
        //else return false;
            else return errval;
    }
}