; Statistical calculator for 8086 microprocessor
; Program to calculate the mean of a set of numbers

DATA SEGMENT
    NUMBERS DB 5, 10, 15, 20, 25  ; Array of numbers
    COUNT   DB 5                  ; Number of elements in the array
    SUM     DW 0                  ; Variable to store the sum
    MEAN    DW 0                  ; Variable to store the mean
DATA ENDS

CODE SEGMENT
START:
    MOV AX, DATA
    MOV DS, AX            ; Initialize data segment
    
    XOR CX, CX            ; Clear CX register (will use as counter)
    XOR AX, AX            ; Clear AX register
    XOR DX, DX            ; Clear DX register (DX:AX will store sum)

    MOV CL, COUNT         ; Load the number of elements into CL
    MOV SI, OFFSET NUMBERS ; Load offset of the NUMBERS array into SI

SUM_LOOP:
    ADD AX, [SI]          ; Add the current number to AX
    INC SI                ; Move to the next number in the array
    INC SI                ; Since each number is a byte, increment SI by 1
    LOOP SUM_LOOP         ; Repeat until all numbers are added

    MOV SUM, AX           ; Store the sum in the SUM variable

    MOV AX, SUM           ; Load sum into AX
    MOV CX, COUNT         ; Load the count into CX
    CWD                   ; Convert AX to DX:AX (for division)
    DIV CX                ; Divide sum by count to get the mean

    MOV MEAN, AX          ; Store the mean in the MEAN variable

    ; End of program - halt the execution
    MOV AX, 4C00H
    INT 21H

CODE ENDS
END START