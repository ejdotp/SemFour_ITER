; D.Balaji Patro      : 2241016307    
; Dipesh Kumar Patro  : 2241016308
; E. Jagadeeswar Patro: 2241016309
; Essa Rani Patro     : 2241016310

; Design a system that replace a character with a user input character in a given string using 8086 assembly language.

.data
    STR1 DB 10, 13, "Siksha 'A' Anusandhan, ITER$"         ;Source String Terminated by $
    STR2 DB 10, 13, 'Enter a character to be replaced: $'  ;ASCII 10 = Enter, 13 = Carriage Return
    STR3 DB 10, 13, 'Enter new character: $'               ;Used to print in a new Line
    LEN DB $-STR1                                          ;(offset address of $) - (starting address of STR1) = Length of STR1

.code
MAIN PROC
    MOV AX, data               ;Copy base address of .data
    MOV DS, AX                 ;into DS Register
    
                               ;Print STR1:                         
    LEA DX, STR1               ;Offset Address of 1st letter in STR1 stored into DX
    MOV AH, 09H                ;Instruction 09h -> Writes String to standard output(console) until '$' encountered
    INT 21H                    ;Calls the Instruction       
      
    MOV DI, (STR1 + LEN - 1)   ;DI points to last Character of STR1
    MOV CL, LEN                ;Initialize counter into CX = LEN 
    MOV CH, 00H                ;Make high bits of CX 0
      
    LEA DX, STR2
    MOV AH, 09H                ;Print STR2
    INT 21H   
    
    MOV AH, 01H                ;INT 21H/01H: Halts the program until user enters a character 
    INT 21H                    ;and stores character in ASCII in AL
    MOV BL, AL                 ;Copied into BL (Character to be replaced = target)         
    
    LEA DX, STR3
    MOV AH, 09H                ;Print STR3
    INT 21H  
    
    MOV AH, 01H                ;INT 21H/01H: Halts the program until user enters a character
    INT 21H                    ;and stores character in ASCII in AL                 
    MOV BH, AL                 ;Store copy in BH(Character to replace with) 
    MOV AL, BL                 ;Take back target into AL  
    
COMPARE:
    CMP [DI], AL               ;Compare DI(last character) with target in AL
    JZ XCHEG                   ;If equal go to 'XCHEG'
    JMP CONTINUE               ;Else go to 'CONTINUE'
    
XCHEG:                         ;Perform replace procedure
    MOV BYTE PTR [DI], BH      ;Copy byte size of BH into offset Address of DI 
    
CONTINUE:
    DEC DI                     ;Decrement DI [point to next letter(reading backwards)]
    LOOP COMPARE               ;Go back to 'COMPARE'
    
    LEA DX, STR1             
    MOV AH, 09H                ;Print modified STR1
    INT 21H    
       
END MAIN
