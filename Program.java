import java.util.Scanner;
public class Program
{
static int arr[]=new int[3];
static int time_unit[]={4,5,10};
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Time unit: ");
        int n=sc.nextInt();
        System.out.println("Earnings : $"+find(n));
        System.out.println("Solution: \n"+ solString());
        
        
    }
    static int find(int n){
    int pr=0;
    int prof[]=new int[3];
        if(n<4)
        {
            return 0;
        }
        else {
            int temp=n-4;
            prof[0]=temp*1000;
            if(n>=5){
                temp=n-5;
                prof[1]=temp*1500;
                if(n>=10){
                    temp=n-10;
                  prof[2] =temp*3000;
                }
            }
        }
        int max_index=getMax(prof);
        pr+=prof[max_index];
        arr[max_index ]++;
               return pr+find(n-time_unit[max_index]);
    }
    static int getMax(int prof[]){
        if(prof[0]>=prof[1]){
            if(prof[0]>= prof[2]){
                return 0;
            }
            else{
                return 2;
            }
            
        }
        else if(prof[1] >= prof[2]){
            return 1;
        }
        else{
            return 2;
        }
        
    }
    
    static String solString(){
        return "T: "+arr[1]+", P: "+arr[0]+", C: "+arr[2];
    }
}