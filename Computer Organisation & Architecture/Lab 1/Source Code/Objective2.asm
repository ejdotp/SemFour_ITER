; E. Jagadeeswar Patro
; 2241016309
; SWAP AND LOGICAL OPERATION
mov ax, 0000h
mov ds, ax
                ; part 1
mov si, 2000h   ; input data at 2000 memory location   si = 2000h   
mov al, [si]    ; give that data to al                 mov al, [2000h]     indexed adressing

;mov ax, 2000h   ; ax = 2000h                            immediate addressing

;mov ax, [2000h]                                         ;direct addressing

ror al, 04h     ; 4 times rotate right
inc si          ; si=2001
mov [si+1], al    ; al = data 1   

                ; part 2
mov di, 2010h     
mov bl, [di]    ; bl = data 2
mov cl, al      ; cl = temp
and cl, bl      ; cl = data1 and data2
xor al, bl      ; al = data1 xor data2
or al, cl       ; al = al or cl
inc di          ; di = 2011
mov [di], al    ; result stored in 2011

hlt


