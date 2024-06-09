; E. Jagadeeswar Patro
; 2241016309
; 2's compliment  

mov ax, 0000h
mov ds, ax  

mov al, [2000h] ; direct addressing
not al
inc al
mov [2001h], al
hlt
