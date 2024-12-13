# Next-Fit
Requirements:

Input:
Number of processes and number of memory blocks.
Sizes of memory blocks.
Memory requirements for each process.
Output:
Allocation of memory blocks to processes using the Next Fit algorithm.
A message indicating whether a process was allocated or not.
Assumptions:

Memory blocks are of fixed size, and the allocation is performed by checking each block starting from the last allocated position (Next Fit).
The system assumes that all input data is provided correctly (i.e., no invalid or negative values are input).
The program doesn't handle memory fragmentation issues beyond the scope of the Next Fit algorithm.
Justifications:

Next Fit memory allocation aims to reduce fragmentation compared to First Fit but can lead to unbalanced memory utilization.
The system does not include dynamic resizing or reallocating of memory blocks, which simplifies the implementation.

Testing Results
Testing was performed by inputting sample data for processes and memory blocks to verify the correctness of the memory allocation. Sample test cases could include:

A scenario where all processes fit into memory blocks.
A scenario where some processes cannot be allocated memory due to insufficient space.
A scenario with a small number of processes and large memory blocks.
Edge cases such as 0 processes or memory blocks.
Example test case:

yaml
Copy code
Enter number of processes: 4
Enter number of memory blocks: 3
Enter size of memory block #1: 100
Enter size of memory block #2: 150
Enter size of memory block #3: 200
Memory required for process #1: 120
Memory required for process #2: 70
Memory required for process #3: 250
Memory required for process #4: 90
Output:

mathematica
Copy code
Process No.   Memory Block Allocated in Next Fit
1             100
2             150
3             Memory not allocated
4             200
