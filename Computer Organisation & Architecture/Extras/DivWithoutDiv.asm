mov ax, 0000h
mov ds, ax

mov ax, [2000h]
mov bx, [2002h]
xor cx, cx

loop1: cmp ax, bx
       jb loop2
       sub ax, bx
       inc ch  
       jmp loop1
       
loop2: mov [2010h], ch
       mov [2012h], ax   
       
hlt