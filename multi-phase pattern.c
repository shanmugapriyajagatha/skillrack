#include <stdio.h>
#define R 3
#define C 4
void cell_changes(int array[R][C]);
void display_array(int array[R][C]);

// Main function
int main()
{
   // Store the array elements in 2D array
   int arr[R][C];
   int i, j;
   
   for(i=0; i<R; i++)
   {
       for(j=0; j<C; j++)
       {
           scanf("%d", &arr[i][j]);
       }
   }
 
    // Function call to modify the given matrix
    cell_changes(arr);
    
    // Function to display the modified matrix
    display_array(arr);
    
    return 0;
}   // End of the main function


void cell_changes(int array[R][C])
{
    int row[R], col[C];
    int i, j;
 
    /* Initialize all values of row[] as 0 */
    for (i = 0; i < R; i++)
    {
       row[i] = 1;
    }
 
    /* Initialize all values of col[] as 0 */
    for (i = 0; i < C; i++)
    {
       col[i] = 1;
    }
 
    /* Store the rows and columns to be marked as 1 in row[] and col[] arrays respectively */
    for (i = 0; i < R; i++)
    {
        for (j = 0; j < C; j++)
        {
            if (array[i][j] == 0)
            {
                row[i] = 0;
                col[j] = 0;
            }
        }
    }
 
    /* Modify the input matrix mat[] using the above constructed row[] and col[] arrays */
    for (i = 0; i < R; i++)
    {
        for (j = 0; j < C; j++)
        {
            if ( row[i] == 0 || col[j] == 0 )
            {
                array[i][j] = 0;
            }
        }
    }
}  // end of the function cell_changes()
 

void display_array(int array[R][C])
{
    int i, j;
    for (i = 0; i < R; i++)
    {
        for (j = 0; j < C; j++)
        {
            printf("%d ", array[i][j]);
        }
        printf("\n");
    }
}    // end of the function display_array()
