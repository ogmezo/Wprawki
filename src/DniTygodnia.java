public class DniTygodnia {



    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,4,5,6,7,8,9,4,3,325,235};

        System.out.println(sumArray(numbers));

System.out.println('Guano dodane w domu do testu');



        }

        private static int sumArray(int[] numbers){
        int suma = 0;
            for (int number : numbers) {
                suma += number;

            }
            return suma;


        }





    }



