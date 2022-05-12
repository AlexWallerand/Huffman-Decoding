# PROJ631_Huffman : Data  decompression by Huffman Coding

## Semi adaptive algorithm

In this second project, the Huffman algorithm is used to decompress data, like in gzip files. It is based on a binary tree, build with the frequencies of every character in a file. The tree is traversed to calculate the codes for each character. Every branch of the Tree as a value, 0 if it is a left child, 1 if it is a right child.

At the end of the program, the results are generated in a text file where the decompressed text can be read.
The compress rate and the average number of bits per character are also displayed in the terminal during the execution.

<p align = center>
<img width = 500 src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Huffman_tree_2.svg/1280px-Huffman_tree_2.svg.png" alt=""><br>
<i>Example of a Huffman Tree</i>
</p>

## Instructions for use

Drop in the input folder all the files you want to decompress.<br>
Then, the program can be executed with the *main.java* file, by giving args to the main method. Some information about the status of the compression and results are printed in the console. The resulted files can be found in the output folder.<br>

## Analysis of the results

The results printed in the terminal are the same that the ones in the compression project.
The program works perfectly for bot the *textesimple.txt* and the *extraitalice.txt*.
Nevertheless, for the *alice.txt*, there are problems for few characters on the two first lines, but the rest of the text is correctly written.