#!/bin/sh
awk '
{
for (i = 1; i <= NF; i++)
    vector[i, NR] = $i
}

END {
    for (x = 1; x <= NF; x++)
        for (y = 1; y <= NR; y++)
            if (y < NR)
                printf("%s ", vector[x, y])
            else
                printf("%s\n", vector[x, NR])
}
' file.txt
