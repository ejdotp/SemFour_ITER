;E. Jagadeeswar Patro
;2241016309
;Find the largest/smallest number(8-bit) from a given array of size N.    

.data
    count db 04h                ; count = array size, offset value=[0000h], effective address=ds:0000
    value db 09h, 10h, 05h, 03h ; array elements, offset values = [0001h] to [0004h]
    res db 0                    ; store result in res 
    
.code
MAIN PROC
    mov ax, data  ; store data to ax
    mov ds, ax    ; store value of ax in ds
    mov cl, count ; cl = 04h
    dec cl        ; decrement once before loop cuz N-1 iteration required
    LEA SI, value ; address of 'value' set into 'SI'
    mov al, [SI]  ; move 1st value of array into al
    
up: inc si        ; Increment SI, Array index = 2nd
    cmp al, [si]  ; Compare 1st and 2nd element of array and update in al
    jnc nxt       ; jump if not carry, can also use jnl but dont
    mov al, [si]  ; if less, move value of si into al
    
nxt: dec cl       ; decrement count
     jnz up       ; jump is cl not equal to 0 
     LEA DI, res  ; address of 'res' set into DI
     mov [DI], al ; value of al is stored in address of res
     
END MAIN