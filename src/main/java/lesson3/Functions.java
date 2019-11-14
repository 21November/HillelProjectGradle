package lesson3;

public class Functions {

    private void print (TimetableOfClasses[] arr){
        if (arr == null){
            return;
        }

        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%n", "День недели", "Время", "Предмет", "Преподаватель", "Группа", "№ аудитории");

        for (TimetableOfClasses field : arr) {
            System.out.printf("%-20s", field.getDayOfTheWeek());
            System.out.printf("%-20s", field.getTime());
            System.out.printf("%-20s", field.getThing());
            System.out.printf("%-20s", field.getTeacher().getName());
            System.out.printf("%-20s", field.getGroup().getGroupName());
            System.out.printf("%-20s", field.getAudience().getNumberRoom());
            System.out.println();
        }
    }

    public void printTimetableOfClasses (TimetableOfClasses[] arr){
        print(arrayCreate(arr));
    }


    private TimetableOfClasses[] arrayCreate (TimetableOfClasses[] arr){
        int nMonday = 0;
        int nTuesday = 0;
        int nWednesday =0;
        int nThursday = 0;
        int nFriday = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null && arr[i].getDayOfTheWeek().equals("Monday")){
                nMonday++;
            }if (arr[i] != null && arr[i].getDayOfTheWeek().equals("Tuesday")){
                nTuesday++;
            }if (arr[i] != null && arr[i].getDayOfTheWeek().equals("Wednesday")){
                nWednesday++;
            }if (arr[i] != null && arr[i].getDayOfTheWeek().equals("Thursday")){
                nThursday++;
            }if (arr[i] != null && arr[i].getDayOfTheWeek().equals("Friday")){
                nFriday++;
            }
        }

        TimetableOfClasses[] monday = new TimetableOfClasses[nMonday];
        TimetableOfClasses[] tuesday = new TimetableOfClasses[nTuesday];
        TimetableOfClasses[] wednesday = new TimetableOfClasses[nWednesday];
        TimetableOfClasses[] thursday = new TimetableOfClasses[nThursday];
        TimetableOfClasses[] friday = new TimetableOfClasses[nFriday];

        int countMonday = 0;
        int countTuesday = 0;
        int countWednesday = 0;
        int countThursday = 0;
        int countFriday = 0;
        for (int j = 0; j < arr.length; j++){
            if (arr[j] != null && arr[j].getDayOfTheWeek().equals("Monday")) {
                monday[countMonday] = arr[j];
                countMonday++;
            }if (arr[j] != null && arr[j].getDayOfTheWeek().equals("Tuesday")) {
                tuesday[countTuesday] = arr[j];
                countTuesday++;
            }if (arr[j] != null && arr[j].getDayOfTheWeek().equals("Wednesday")) {
                wednesday[countWednesday] = arr[j];
                countWednesday++;
            }if (arr[j] != null && arr[j].getDayOfTheWeek().equals("Thursday")) {
                thursday[countThursday] = arr[j];
                countThursday++;
            }if (arr[j] != null && arr[j].getDayOfTheWeek().equals("Friday")) {
                friday[countFriday] = arr[j];
                countFriday++;
            }

        }
        bubbleSorterTime(monday);
        bubbleSorterTime(tuesday);
        bubbleSorterTime(wednesday);
        bubbleSorterTime(thursday);
        bubbleSorterTime(friday);

        TimetableOfClasses[] timetableOfClasses = new TimetableOfClasses[monday.length + tuesday.length + wednesday.length + thursday.length + friday.length];
        System.arraycopy(monday, 0, timetableOfClasses, 0, monday.length);
        System.arraycopy(tuesday, 0, timetableOfClasses, monday.length, tuesday.length);
        System.arraycopy(wednesday, 0, timetableOfClasses, monday.length + tuesday.length, wednesday.length);
        System.arraycopy(thursday, 0, timetableOfClasses, monday.length + tuesday.length + wednesday.length, thursday.length);
        System.arraycopy(friday, 0, timetableOfClasses, monday.length + tuesday.length + wednesday.length + thursday.length, friday.length);

        return timetableOfClasses;
    }

    private void bubbleSorterTime (TimetableOfClasses[] arr) {
        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(arr[j].getTime().compareTo(arr[j + 1].getTime()) >= 1)  {
                    toSwap(arr, j, j + 1);
                } if (arr[j].getTime().compareTo(arr[j + 1].getTime()) == 0);

            }
        }
    }

    private void toSwap(TimetableOfClasses[] arr, int first, int second){

        TimetableOfClasses dummy = arr[first];
        arr[first] = arr[second];
        arr[second] = dummy;
    }
}
