public class arrays {
    public void print(int []array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public void printalternative(int []array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i+1]);
        }
    }
    public void printeven(int []array){
        for (int i=0;i<array.length;i++){
            if(i%2==0)
            System.out.println(array[i]);
        }
    }
    public void printodd(int []array){
        for (int i=0;i<array.length;i++){
            if(i%2!=0)
                System.out.println(array[i]);
        }
    }
    public void sumandaverge(int []array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
           sum+= array[i+1];
        }
        System.out.println("sum of Array is"+sum);
        System.out.println("arverage of Array is"+sum/array.length);
    }
}
