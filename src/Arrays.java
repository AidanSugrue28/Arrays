public class Arrays {

    public int[] nums;
    public Star[] stars;

    public static void main(String[] args){
        System.out.println("welcome to the awesome world of arrays");
        new Arrays();
    }

    public Arrays() {
        nums = new int[10];
        stars = new Star[7];

        stars[0] = new Star();
        Star s1 = new Star();
        s1.printInfo();
        stars[0].printInfo();

        s1.color = "red";
        s1.points = 7;
        s1.printInfo();

        stars[0].color = "blue";
        stars[0].points = 9;
        stars[0].printInfo();

        for(int x = 0; x < stars.length; x++){
            stars[x] = new Star();
            stars[x].points =(int)(Math.random() * 11);
        }

        System.out.println("experiment " + stars[3].points);




        for (int y = 0; y < nums.length; y++){
            nums[y] = (int)(Math.random()*100)+1;
        }

        System.out.println(nums[0]);

        displayArrays();
        sumArray();
        averageNum();
        maxNum();
        minNum();
        maxIndex();
        greaterThan50();
        displayStars();

    }

    public void displayArrays(){
        for(int x = 0; x < nums.length; x++){
            System.out.println(nums[x]);
        }
    }

    public void sumArray(){
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        System.out.println("Sum of array: " + sum);
    }

    // 1. Average method
    public void averageNum(){
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        double average = (double) sum / nums.length;
        System.out.println("Average of array: " + average);
    }

    // 2. Max number method
    public void maxNum(){
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("Largest number in array: " + max);
    }

    // 3. Min number method
    public void minNum(){
        int min = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }

        System.out.println("Smallest number in array: " + min);
    }
    public void maxIndex() {
        int max = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        System.out.println("Max value is " + max + " at index: " + index);
    }

    public void greaterThan50() {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 50) {
                count++;
            }
        }
        System.out.println("Numbers greater than or equal to 50: " + count);
    }

    public void displayStars(){
        for (int y=0; y < stars.length; y++){
            stars[y].printInfo();

        }
    }
}