package lesson2;

public class StudentFunctions {

    private void toSwap(Student[] arr, int first, int second){   //метод меняет местами пару чисел массива
        Student dummy = arr[first];
        arr[first] = arr[second];
        arr[second] = dummy;
    }

    public void bubbleSorterAge(Student[] arr){                     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(arr[j].age > arr[j + 1].age)  {
                    toSwap(arr, j, j + 1);
                } if (arr[j].age == arr[j + 1].age);

            }
        }
    }

    public void bubbleSorterName (Student[] arr) {
        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(arr[j].name.compareTo(arr[j + 1].name) > 0)  {
                    toSwap(arr, j, j + 1);
                } if (arr[j].name.compareTo(arr[j + 1].name) == 0);

            }
        }
    }



    public Student getUserByName(String name, Student[] arr){

        if (name == null || arr == null){
            return null;
        }

        for (int index = 0; index < arr.length; index++){
            if (arr[index] != null && arr[index].getName().contains(name)) {
                return arr[index];
            }
        }
        return null;
    }


    public Student[] getUserByNameArr(String name, Student[] arr){
        if (name == null || arr == null){
            return null;
        }

        int n = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != null && arr[index].getName().contains(name)) {
                n++;
            }
        }

        Student[] students = new Student[n];

            int count = 0;
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != null && arr[index].getName().contains(name)) {
                students[count] = arr[index];
                count++;
            }
        }
        return students;
    }
}
