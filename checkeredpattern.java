import java.util.*;
class checkeredpattern
{
    Scanner ob=new Scanner(System.in);  
    void space()//printing spaces
    {
        int j;
        for(j=1;j<=4;j++)
            {
                System.out.print(" ");
            }
    }
    void hash()//printing #
    {
        int j;
        for(j=1;j<=4;j++)
            {
               System.out.print("#"); 
            }
    }  
    
    void hash_space()//printing a block of # and then a block of spaces
    {
        int i;
        int j;
        for(i=1;i<=4;i++)
        {
            hash();
            space();
            hash();
            System.out.println();
            
    }
}
    
    void space_hash()//printing a block of spaces and then a block of #
    {
        int i;
        int j;
        for(i=1;i<=4;i++)
        {
            space();
            hash();
            space();
            hash();
            System.out.println();
        }
    }
    void main()
    {//to print the final checkered pattern
        int ctr=1;//to alternate between space_hash() and hash_space()
        while(ctr<=4)
        {
            if(ctr%2==1)
            hash_space();
            else
            space_hash();
            ctr++;
        }
    }
}

        