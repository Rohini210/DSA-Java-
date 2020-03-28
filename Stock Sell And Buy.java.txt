import java.util.*;

class Collection
{
    int buy;
    int sell;
}

class Main
{
    public static void solution(int arr[], int n)
    {
        if(n==1)
        {
            return;
        }

        int count = 0;
        int i=0;

        ArrayList<Collection> al = new ArrayList<Collection> ();        
        
        
        while(i<n-1)
        {
            while((i<n-1) && (arr[i+1] <= arr[i]))
            {
                i++;
            }        
                          
            if(i == n-1)
            {
                break;
            }
            
            Collection c = new Collection();
            c.buy = i;
            i++;

            while((i < n) && (arr[i] >= arr[i-1]))
            {
                i++;
            }                

            c.sell = i-1;
            al.add(c);

            count++;
            
        }

        if(count == 0)
        {
            System.out.println("-1");
        }
        else
        {
            for(int j=0; j<count; j++)
            {
                System.out.print(al.get(j).buy + " " + al.get(j).sell + " ");
                System.out.println();

            }
        }  
        System.out.println();     

        return;

    }
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t--!=0)
        {
            int n = scan.nextInt();
            int arr[] = new int[n];
            
            for(int i=0; i<n; i++)
            {
                arr[i] = scan.nextInt();
            }
            solution(arr,n);
        }


    }
}


/*
Inputs:
3
7
100 180 260 310 40 535 695
4
100 200 50 500
9
200 500 1000 700 30 400 900 400 50

Outputs:
0 3 
4 6 

0 1 
2 3 

0 2 
4 6 
*/
