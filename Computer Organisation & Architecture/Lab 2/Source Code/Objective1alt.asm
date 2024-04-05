; E. Jagadeeswar Patro
; 2241016309

; Write a program to calculate sum & average of N 16-bit numbers

mov ax, 0000h
mov ds, ax
mov si, 2000h      ; total number of elements = 07
mov di, 2010h      ; address value to store the output = average of the elements
mov ax, 0000h                                 
mov cl, [si]       ; move the value at 2000 to cl
mov bl, cl         ; move the value of cl to bl
inc si             ; increment the value of si by 1

loop: add al, [si] ; add and store the sum of elements in al   

adc ah, 00          
inc si             ; move to the next element in the array i.e. 2001
dec cl             ; decrease the count of cl by 1                         
jnz loop           ; repeat the loop until cl becomes 0
                                        
mov [di], ax       ; store sum at 2010 = 1Ch
div bl             ; avg = (sum of elements) / (total no. of elements)
mov [di+2], ax     ; store avg at 2012 = 04h

hlt
