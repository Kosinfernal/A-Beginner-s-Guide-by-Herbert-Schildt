package chapter5_Операторы;

// Find the minimum and maximum values in an array.
// Нахождение минимального и максимального значений в массиве
class MinMax {
    public static void main(String args[]) {
        int nums[] = new int[10];/*Сначала объявляется переменная nums,
        ссылающаяся на массив [], а затем выделяется память для массива (оператором new), и ссылка на
        нее (переменную) присваивается переменной массива.*/
        int min, max;//объявляются две переменные типа integer

        nums[0] = 99;//массив nums заполняется вручную в десяти операторах присваивания.
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 99;//в массиве могут содержаться одинаковые значения

        min = max = nums[0];//инициализируются переменными min и max
        // путём присваиваивания значениям переменной nums[0] равное 99
        for(int i=1; i < 10; i++) {
            if(nums[i] < min) min = nums[i];//начиная с первой позиции проверяется меньше ли значение массива величине 99
            //в случае истинности ([1] = -10 < 99 ->) значение массива (nums[1]=-10) присваивается переменной min
            //таким образом до конца цикла выбирается наименьшее значение
            //в случае если не одно из значений i не приведёт к true min задано выше перед оперетором for
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
