; E. Jagadeeswar Patro
; 2241016309
; Alternative to Lab 2 Objective 4
; Multiplication without using MUL

mov ax, 0000h
mov ds,ax; ds=0000h 

mov al,[2000h]; multiplicant
mov cl,[2001h]; multiplier
sal al,cl
mov [2002h],al   

hlt