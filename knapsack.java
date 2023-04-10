import java.util.*;
public class knapsack
{
    public static void main(String[] args) {
        System.out.print("enter no of objects: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("enter the size of knapsack: ");
        int c=sc.nextInt();
        int value[]=new int[n];
        int weight[]=new int[n];
        double v_w_ratio[]=new double[n];
        double x[]=new double[n];
        System.out.print("enter the values of objects: ");
        for(int i=0;i<n;i++){
            value[i]=sc.nextInt();
        }
        System.out.print("enter the weights of objects: ");
        for(int i=0;i<n;i++){
            weight[i]=sc.nextInt();
        }
        System.out.print("v_w_ratio of objects: ");
        for(int i=0;i<n;i++){
            v_w_ratio[i]=(double)(value[i])/(double)(weight[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(+Math.round(v_w_ratio[i]*100.0)/100.0+"  ");
        }
        System.out.println();
        for(int i=0;i<v_w_ratio.length-1;i++){
            for(int j=0;j<v_w_ratio.length-1;j++){
                if (v_w_ratio[j]<v_w_ratio[j+1]){

                    double temp=v_w_ratio[j];
                    v_w_ratio[j]=v_w_ratio[j+1];
                    v_w_ratio[j+1]=temp;

                    int temp1=weight[j];
                    weight[j]=weight[j+1];
                    weight[j+1]=temp1;

                    int temp2=value[j];
                    value[j]=value[j+1];
                    value[j+1]=temp2;

                }
            }
        }
        System.out.print("Ordering paradigm of v_w_ratio: ");
        for(int i=0;i<n;i++){
            System.out.print(Math.round(v_w_ratio[i]*100.0)/100.0+"  ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            x[i]=0;
        }
        int u=c;
        for(int i=0;i<n;i++){
            if(weight[i]<u){
                x[i]=1.0;
            }
            else{
                if(u<=0){
                    break;
                }
                x[i]=(double)(u)/(double)(weight[i]);
            }
            u=u-weight[i];
        }
        System.out.print("The solution vector: ");
        for(int i=0;i<n;i++){
            System.out.print(Math.round(x[i]*100.0)/100.0+"  ");
        }
        System.out.println();
        System.out.print("The Maximum value of the package is ");
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=x[i]*value[i];
        }
        System.out.print(Math.round(sum*100.0)/100.0);
    }
}
