public class Arrays {

    public int[] nums;


    public static void main(String[] args){
        System.out.println("welcome to the awesome world of arrays");
        new Arrays();
    }

    public Arrays() {
        nums = new int[10];
        for (int y = 0; y < nums.length; y++){
            nums[y] = (int)(Math.random()*100)+1;
            }


        System.out.println(nums[0]);

        displayArrays();

        sumArray();
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
        
    }
