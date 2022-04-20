package chapter6_Static.listing14;

// Класс, реализующий очередь для хранения символов.
class Queue2 {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и
    // извлечения элементов очереди

    // Сконструировать пустую очередь заданного размера.
    Queue2(int size) {
        System.out.println("Queue2 до перезагрузки. Выделяется память для очереди. " +
                "Начальные значения позиций сбрасываются до 0.");
        q = new char[size]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Конструктор, создающий один объект типа Queue на основе другого.
    Queue2(Queue2 ob) {
        System.out.println("Перезагрузка раз");
        putloc = ob.putloc;
        getloc = ob.getloc;
//Сначала переменные putloc и getloc инициализируются значениями,
//содержащимися в объекте оЬ, который передается в качестве параметра.
        q = new char[ob.q.length];
//Затем организуется новый массив для хранения элементов очереди,
//которые далее копируются из объекта оb в этот массив.

// Вновь созданная копия очереди будет идентична оригиналу,
// хотя они и являются совершенно отдельными объектами.

        // Копировать элементы очереди
        for(int i=getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Конструирование и инициализация объекта типа.
    Queue2(char a[]) {
        System.out.println("Перезагрузка два");
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++) put(a[i]);
//В этом конструкторе создается достаточно большая очередь для хранения
// символов из массива а. В силу особенностей алгоритма,
// реализующего очередь, длина очереди должна быть на один элемент больше,
// чем длина исходного массива.
    }

    // Поместить символ в очередь.
    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" -- Очередь заполнена.");
            return;
        }

        q[putloc++] = ch;
    }

    // Извлечь символ из очереди.
    char get() {
        if(getloc == putloc) {
            System.out.println(" -- Очередь пуста.");
            return (char) 0;
        }

        return q[getloc++];
    }
}
